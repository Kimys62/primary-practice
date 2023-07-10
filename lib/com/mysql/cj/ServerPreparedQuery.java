/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.AbstractPreparedQuery;
import com.mysql.cj.CancelQueryTask;
import com.mysql.cj.Messages;
import com.mysql.cj.NativeSession;
import com.mysql.cj.QueryAttributesBindValue;
import com.mysql.cj.QueryBindings;
import com.mysql.cj.ServerPreparedQueryBindValue;
import com.mysql.cj.ServerPreparedQueryBindings;
import com.mysql.cj.ServerPreparedQueryTestcaseGenerator;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.conf.RuntimeProperty;
import com.mysql.cj.exceptions.CJException;
import com.mysql.cj.exceptions.ExceptionFactory;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.protocol.Message;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.a.ColumnDefinitionFactory;
import com.mysql.cj.protocol.a.NativeConstants;
import com.mysql.cj.protocol.a.NativeMessageBuilder;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.protocol.a.ValueEncoder;
import com.mysql.cj.result.Field;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;

public class ServerPreparedQuery
extends AbstractPreparedQuery<ServerPreparedQueryBindings> {
    public static final int BLOB_STREAM_READ_BUF_SIZE = 8192;
    public static final byte OPEN_CURSOR_FLAG = 1;
    public static final byte PARAMETER_COUNT_AVAILABLE = 8;
    private long serverStatementId;
    private Field[] parameterFields;
    private ColumnDefinition resultFields;
    protected boolean profileSQL = false;
    protected boolean gatherPerfMetrics;
    protected boolean logSlowQueries = false;
    private boolean useAutoSlowLog;
    protected RuntimeProperty<Integer> slowQueryThresholdMillis;
    protected RuntimeProperty<Boolean> explainSlowQueries;
    protected boolean useCursorFetch = false;
    protected boolean queryWasSlow = false;
    protected NativeMessageBuilder commandBuilder = null;

    public static ServerPreparedQuery getInstance(NativeSession sess) {
        if (sess.getPropertySet().getBooleanProperty(PropertyKey.autoGenerateTestcaseScript).getValue().booleanValue()) {
            return new ServerPreparedQueryTestcaseGenerator(sess);
        }
        return new ServerPreparedQuery(sess);
    }

    protected ServerPreparedQuery(NativeSession sess) {
        super(sess);
        this.profileSQL = sess.getPropertySet().getBooleanProperty(PropertyKey.profileSQL).getValue();
        this.gatherPerfMetrics = sess.getPropertySet().getBooleanProperty(PropertyKey.gatherPerfMetrics).getValue();
        this.logSlowQueries = sess.getPropertySet().getBooleanProperty(PropertyKey.logSlowQueries).getValue();
        this.useAutoSlowLog = sess.getPropertySet().getBooleanProperty(PropertyKey.autoSlowLog).getValue();
        this.slowQueryThresholdMillis = sess.getPropertySet().getIntegerProperty(PropertyKey.slowQueryThresholdMillis);
        this.explainSlowQueries = sess.getPropertySet().getBooleanProperty(PropertyKey.explainSlowQueries);
        this.useCursorFetch = sess.getPropertySet().getBooleanProperty(PropertyKey.useCursorFetch).getValue();
        this.commandBuilder = new NativeMessageBuilder(this.session.getServerSession().supportsQueryAttributes());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void serverPrepare(String sql) throws IOException {
        this.session.checkClosed();
        NativeSession nativeSession = this.session;
        synchronized (nativeSession) {
            boolean checkEOF;
            long begin = this.profileSQL ? System.currentTimeMillis() : 0L;
            boolean loadDataQuery = StringUtils.startsWithIgnoreCaseAndWs(sql, "LOAD DATA");
            String characterEncoding = null;
            String connectionEncoding = this.session.getPropertySet().getStringProperty(PropertyKey.characterEncoding).getValue();
            if (!loadDataQuery && connectionEncoding != null) {
                characterEncoding = connectionEncoding;
            }
            NativePacketPayload prepareResultPacket = this.session.sendCommand(this.commandBuilder.buildComStmtPrepare(this.session.getSharedSendPacket(), sql, characterEncoding), false, 0);
            prepareResultPacket.setPosition(1);
            this.serverStatementId = prepareResultPacket.readInteger(NativeConstants.IntegerDataType.INT4);
            int fieldCount = (int)prepareResultPacket.readInteger(NativeConstants.IntegerDataType.INT2);
            this.setParameterCount((int)prepareResultPacket.readInteger(NativeConstants.IntegerDataType.INT2));
            this.queryBindings = new ServerPreparedQueryBindings(this.parameterCount, this.session);
            ((ServerPreparedQueryBindings)this.queryBindings).setLoadDataQuery(loadDataQuery);
            if (this.gatherPerfMetrics) {
                this.session.getProtocol().getMetricsHolder().incrementNumberOfPrepares();
            }
            if (this.profileSQL) {
                this.session.getProfilerEventHandler().processEvent((byte)2, this.session, this, null, this.session.getCurrentTimeNanosOrMillis() - begin, new Throwable(), this.truncateQueryToLog(sql));
            }
            boolean bl = checkEOF = !this.session.getServerSession().isEOFDeprecated();
            if (this.parameterCount > 0) {
                if (checkEOF) {
                    this.session.getProtocol().skipPacket();
                }
                this.parameterFields = this.session.getProtocol().read(ColumnDefinition.class, new ColumnDefinitionFactory(this.parameterCount, null)).getFields();
            }
            if (fieldCount > 0) {
                this.resultFields = this.session.getProtocol().read(ColumnDefinition.class, new ColumnDefinitionFactory(fieldCount, null));
            }
        }
    }

    @Override
    public void statementBegins() {
        super.statementBegins();
        this.queryWasSlow = false;
    }

    public <T extends Resultset> T serverExecute(int maxRowsToRetrieve, boolean createStreamingResultSet, ColumnDefinition metadata, ProtocolEntityFactory<T, NativePacketPayload> resultSetFactory) {
        Object interceptedResults;
        if (this.session.shouldIntercept() && (interceptedResults = this.session.invokeQueryInterceptorsPre(() -> this.getOriginalSql(), this, true)) != null) {
            return interceptedResults;
        }
        String queryAsString = this.profileSQL || this.logSlowQueries || this.gatherPerfMetrics ? this.asSql(true) : "";
        NativePacketPayload packet = this.prepareExecutePacket();
        NativePacketPayload resPacket = this.sendExecutePacket(packet, queryAsString);
        T rs = this.readExecuteResult(resPacket, maxRowsToRetrieve, createStreamingResultSet, metadata, resultSetFactory, queryAsString);
        return rs;
    }

    public NativePacketPayload prepareExecutePacket() {
        ServerPreparedQueryBindValue[] parameterBindings = (ServerPreparedQueryBindValue[])((ServerPreparedQueryBindings)this.queryBindings).getBindValues();
        if (((ServerPreparedQueryBindings)this.queryBindings).isLongParameterSwitchDetected()) {
            boolean firstFound = false;
            long boundTimeToCheck = 0L;
            for (int i = 0; i < this.parameterCount - 1; ++i) {
                if (!parameterBindings[i].isStream()) continue;
                if (firstFound && boundTimeToCheck != parameterBindings[i].boundBeforeExecutionNum) {
                    throw ExceptionFactory.createException(Messages.getString("ServerPreparedStatement.11") + Messages.getString("ServerPreparedStatement.12"), "S1C00", 0, true, null, this.session.getExceptionInterceptor());
                }
                firstFound = true;
                boundTimeToCheck = parameterBindings[i].boundBeforeExecutionNum;
            }
            this.serverResetStatement();
        }
        ((ServerPreparedQueryBindings)this.queryBindings).checkAllParametersSet();
        for (int i = 0; i < this.parameterCount; ++i) {
            if (!parameterBindings[i].isStream()) continue;
            this.serverLongData(i, parameterBindings[i]);
        }
        NativePacketPayload packet = this.session.getSharedSendPacket();
        packet.writeInteger(NativeConstants.IntegerDataType.INT1, 23L);
        packet.writeInteger(NativeConstants.IntegerDataType.INT4, this.serverStatementId);
        boolean supportsQueryAttributes = this.session.getServerSession().supportsQueryAttributes();
        boolean sendQueryAttributes = false;
        if (supportsQueryAttributes) {
            sendQueryAttributes = this.session.getServerSession().getServerVersion().meetsMinimum(new ServerVersion(8, 0, 26));
        } else if (this.queryAttributesBindings.getCount() > 0) {
            this.session.getLog().logWarn(Messages.getString("QueryAttributes.SetButNotSupported"));
        }
        int flags = 0;
        if (this.resultFields != null && this.resultFields.getFields() != null && this.useCursorFetch && this.resultSetType == Resultset.Type.FORWARD_ONLY && this.fetchSize > 0) {
            flags = (byte)(flags | 1);
        }
        if (sendQueryAttributes) {
            flags = (byte)(flags | 8);
        }
        packet.writeInteger(NativeConstants.IntegerDataType.INT1, flags);
        packet.writeInteger(NativeConstants.IntegerDataType.INT4, 1L);
        int parametersAndAttributesCount = this.parameterCount;
        if (supportsQueryAttributes) {
            if (sendQueryAttributes) {
                parametersAndAttributesCount += this.queryAttributesBindings.getCount();
            }
            if (sendQueryAttributes || parametersAndAttributesCount > 0) {
                packet.writeInteger(NativeConstants.IntegerDataType.INT_LENENC, parametersAndAttributesCount);
            }
        }
        if (parametersAndAttributesCount > 0) {
            int i;
            int nullCount = (parametersAndAttributesCount + 7) / 8;
            int nullBitsPosition = packet.getPosition();
            for (int i2 = 0; i2 < nullCount; ++i2) {
                packet.writeInteger(NativeConstants.IntegerDataType.INT1, 0L);
            }
            byte[] nullBitsBuffer = new byte[nullCount];
            if (((ServerPreparedQueryBindings)this.queryBindings).getSendTypesToServer().get() || sendQueryAttributes && this.queryAttributesBindings.getCount() > 0) {
                packet.writeInteger(NativeConstants.IntegerDataType.INT1, 1L);
                for (i = 0; i < this.parameterCount; ++i) {
                    packet.writeInteger(NativeConstants.IntegerDataType.INT2, parameterBindings[i].bufferType);
                    if (!supportsQueryAttributes) continue;
                    packet.writeBytes(NativeConstants.StringSelfDataType.STRING_LENENC, "".getBytes());
                }
                if (sendQueryAttributes) {
                    this.queryAttributesBindings.runThroughAll(a -> {
                        packet.writeInteger(NativeConstants.IntegerDataType.INT2, a.getType());
                        packet.writeBytes(NativeConstants.StringSelfDataType.STRING_LENENC, a.getName().getBytes());
                    });
                }
            } else {
                packet.writeInteger(NativeConstants.IntegerDataType.INT1, 0L);
            }
            for (i = 0; i < this.parameterCount; ++i) {
                if (parameterBindings[i].isStream()) continue;
                if (!parameterBindings[i].isNull()) {
                    parameterBindings[i].storeBinding(packet, ((ServerPreparedQueryBindings)this.queryBindings).isLoadDataQuery(), this.charEncoding, this.session.getExceptionInterceptor());
                    continue;
                }
                int n = i >>> 3;
                nullBitsBuffer[n] = (byte)(nullBitsBuffer[n] | 1 << (i & 7));
            }
            if (sendQueryAttributes) {
                for (i = 0; i < this.queryAttributesBindings.getCount(); ++i) {
                    if (!this.queryAttributesBindings.getAttributeValue(i).isNull()) continue;
                    int b = i + this.parameterCount;
                    int n = b >>> 3;
                    nullBitsBuffer[n] = (byte)(nullBitsBuffer[n] | 1 << (b & 7));
                }
                ValueEncoder valueEncoder = new ValueEncoder(packet, this.charEncoding, this.session.getServerSession().getDefaultTimeZone());
                this.queryAttributesBindings.runThroughAll(a -> valueEncoder.encodeValue(a.getValue(), a.getType()));
            }
            int endPosition = packet.getPosition();
            packet.setPosition(nullBitsPosition);
            packet.writeBytes(NativeConstants.StringLengthDataType.STRING_FIXED, nullBitsBuffer);
            packet.setPosition(endPosition);
        }
        return packet;
    }

    public NativePacketPayload sendExecutePacket(NativePacketPayload packet, String queryAsString) {
        long begin = this.session.getCurrentTimeNanosOrMillis();
        this.resetCancelledState();
        CancelQueryTask timeoutTask = null;
        try {
            timeoutTask = this.startQueryTimer(this, this.timeoutInMillis);
            this.statementBegins();
            NativePacketPayload resultPacket = this.session.sendCommand(packet, false, 0);
            long queryEndTime = this.session.getCurrentTimeNanosOrMillis();
            if (timeoutTask != null) {
                this.stopQueryTimer(timeoutTask, true, true);
                timeoutTask = null;
            }
            long executeTime = queryEndTime - begin;
            this.setExecuteTime(executeTime);
            if (this.logSlowQueries) {
                boolean bl = this.useAutoSlowLog ? this.session.getProtocol().getMetricsHolder().checkAbonormallyLongQuery(executeTime) : (this.queryWasSlow = executeTime > (long)this.slowQueryThresholdMillis.getValue().intValue());
                if (this.queryWasSlow) {
                    this.session.getProfilerEventHandler().processEvent((byte)6, this.session, this, null, executeTime, new Throwable(), Messages.getString("ServerPreparedStatement.15", new String[]{String.valueOf(this.session.getSlowQueryThreshold()), String.valueOf(executeTime), this.originalSql, queryAsString}));
                }
            }
            if (this.gatherPerfMetrics) {
                this.session.getProtocol().getMetricsHolder().registerQueryExecutionTime(executeTime);
                this.session.getProtocol().getMetricsHolder().incrementNumberOfPreparedExecutes();
            }
            if (this.profileSQL) {
                this.session.getProfilerEventHandler().processEvent((byte)4, this.session, this, null, executeTime, new Throwable(), this.truncateQueryToLog(queryAsString));
            }
            NativePacketPayload nativePacketPayload = resultPacket;
            return nativePacketPayload;
        }
        catch (CJException sqlEx) {
            if (this.session.shouldIntercept()) {
                this.session.invokeQueryInterceptorsPost(() -> this.getOriginalSql(), this, null, true);
            }
            throw sqlEx;
        }
        finally {
            this.statementExecuting.set(false);
            this.stopQueryTimer(timeoutTask, false, false);
        }
    }

    public <T extends Resultset> T readExecuteResult(NativePacketPayload resultPacket, int maxRowsToRetrieve, boolean createStreamingResultSet, ColumnDefinition metadata, ProtocolEntityFactory<T, NativePacketPayload> resultSetFactory, String queryAsString) {
        try {
            T interceptedResults;
            long fetchStartTime = this.profileSQL ? this.session.getCurrentTimeNanosOrMillis() : 0L;
            T rs = this.session.getProtocol().readAllResults(maxRowsToRetrieve, createStreamingResultSet, resultPacket, true, metadata != null ? metadata : this.resultFields, resultSetFactory);
            if (this.session.shouldIntercept() && (interceptedResults = this.session.invokeQueryInterceptorsPost(() -> this.getOriginalSql(), this, rs, true)) != null) {
                rs = interceptedResults;
            }
            if (this.profileSQL) {
                this.session.getProfilerEventHandler().processEvent((byte)5, this.session, this, (Resultset)rs, this.session.getCurrentTimeNanosOrMillis() - fetchStartTime, new Throwable(), null);
            }
            if (this.queryWasSlow && this.explainSlowQueries.getValue().booleanValue()) {
                this.session.getProtocol().explainSlowQuery(queryAsString, queryAsString);
            }
            ((ServerPreparedQueryBindings)this.queryBindings).getSendTypesToServer().set(false);
            if (this.session.hadWarnings()) {
                this.session.getProtocol().scanForAndThrowDataTruncation();
            }
            return rs;
        }
        catch (IOException ioEx) {
            throw ExceptionFactory.createCommunicationsException(this.session.getPropertySet(), this.session.getServerSession(), this.session.getProtocol().getPacketSentTimeHolder(), this.session.getProtocol().getPacketReceivedTimeHolder(), ioEx, this.session.getExceptionInterceptor());
        }
        catch (CJException sqlEx) {
            if (this.session.shouldIntercept()) {
                this.session.invokeQueryInterceptorsPost(() -> this.getOriginalSql(), this, null, true);
            }
            throw sqlEx;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void serverLongData(int parameterIndex, ServerPreparedQueryBindValue longData) {
        ServerPreparedQuery serverPreparedQuery = this;
        synchronized (serverPreparedQuery) {
            NativePacketPayload packet = this.session.getSharedSendPacket();
            Object value = longData.value;
            if (value instanceof byte[]) {
                this.session.sendCommand(this.commandBuilder.buildComStmtSendLongData(packet, this.serverStatementId, parameterIndex, (byte[])value), true, 0);
            } else if (value instanceof InputStream) {
                this.storeStream(parameterIndex, packet, (InputStream)value);
            } else if (value instanceof Blob) {
                try {
                    this.storeStream(parameterIndex, packet, ((Blob)value).getBinaryStream());
                }
                catch (Throwable t) {
                    throw ExceptionFactory.createException(t.getMessage(), this.session.getExceptionInterceptor());
                }
            } else if (value instanceof Reader) {
                this.storeReader(parameterIndex, packet, (Reader)value);
            } else {
                throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ServerPreparedStatement.18") + value.getClass().getName() + "'", this.session.getExceptionInterceptor());
            }
        }
    }

    @Override
    public void closeQuery() {
        this.queryBindings = null;
        this.parameterFields = null;
        this.resultFields = null;
        super.closeQuery();
    }

    public long getServerStatementId() {
        return this.serverStatementId;
    }

    public void setServerStatementId(long serverStatementId) {
        this.serverStatementId = serverStatementId;
    }

    public Field[] getParameterFields() {
        return this.parameterFields;
    }

    public void setParameterFields(Field[] parameterFields) {
        this.parameterFields = parameterFields;
    }

    public ColumnDefinition getResultFields() {
        return this.resultFields;
    }

    public void setResultFields(ColumnDefinition resultFields) {
        this.resultFields = resultFields;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void storeStream(int parameterIndex, NativePacketPayload packet, InputStream inStream) {
        this.session.checkClosed();
        NativeSession nativeSession = this.session;
        synchronized (nativeSession) {
            byte[] buf = new byte[8192];
            int numRead = 0;
            try {
                int bytesInPacket = 0;
                int totalBytesRead = 0;
                int bytesReadAtLastSend = 0;
                int packetIsFullAt = this.session.getPropertySet().getMemorySizeProperty(PropertyKey.blobSendChunkSize).getValue();
                packet.setPosition(0);
                packet.writeInteger(NativeConstants.IntegerDataType.INT1, 24L);
                packet.writeInteger(NativeConstants.IntegerDataType.INT4, this.serverStatementId);
                packet.writeInteger(NativeConstants.IntegerDataType.INT2, parameterIndex);
                boolean readAny = false;
                while ((numRead = inStream.read(buf)) != -1) {
                    readAny = true;
                    packet.writeBytes(NativeConstants.StringLengthDataType.STRING_FIXED, buf, 0, numRead);
                    totalBytesRead += numRead;
                    if ((bytesInPacket += numRead) < packetIsFullAt) continue;
                    bytesReadAtLastSend = totalBytesRead;
                    this.session.sendCommand(packet, true, 0);
                    bytesInPacket = 0;
                    packet.setPosition(0);
                    packet.writeInteger(NativeConstants.IntegerDataType.INT1, 24L);
                    packet.writeInteger(NativeConstants.IntegerDataType.INT4, this.serverStatementId);
                    packet.writeInteger(NativeConstants.IntegerDataType.INT2, parameterIndex);
                }
                if (totalBytesRead != bytesReadAtLastSend) {
                    this.session.sendCommand(packet, true, 0);
                }
                if (!readAny) {
                    this.session.sendCommand(packet, true, 0);
                }
            }
            catch (IOException ioEx) {
                throw ExceptionFactory.createException(Messages.getString("ServerPreparedStatement.25") + ioEx.toString(), ioEx, this.session.getExceptionInterceptor());
            }
            finally {
                if (((Boolean)this.autoClosePStmtStreams.getValue()).booleanValue() && inStream != null) {
                    try {
                        inStream.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void storeReader(int parameterIndex, NativePacketPayload packet, Reader inStream) {
        this.session.checkClosed();
        NativeSession nativeSession = this.session;
        synchronized (nativeSession) {
            String forcedEncoding = this.session.getPropertySet().getStringProperty(PropertyKey.clobCharacterEncoding).getStringValue();
            String clobEncoding = forcedEncoding == null ? this.session.getPropertySet().getStringProperty(PropertyKey.characterEncoding).getValue() : forcedEncoding;
            int maxBytesChar = 2;
            if (clobEncoding != null) {
                if (!clobEncoding.equals("UTF-16")) {
                    maxBytesChar = this.session.getServerSession().getCharsetSettings().getMaxBytesPerChar(clobEncoding);
                    if (maxBytesChar == 1) {
                        maxBytesChar = 2;
                    }
                } else {
                    maxBytesChar = 4;
                }
            }
            char[] buf = new char[8192 / maxBytesChar];
            int numRead = 0;
            int bytesInPacket = 0;
            int totalBytesRead = 0;
            int bytesReadAtLastSend = 0;
            int packetIsFullAt = this.session.getPropertySet().getMemorySizeProperty(PropertyKey.blobSendChunkSize).getValue();
            try {
                packet.setPosition(0);
                packet.writeInteger(NativeConstants.IntegerDataType.INT1, 24L);
                packet.writeInteger(NativeConstants.IntegerDataType.INT4, this.serverStatementId);
                packet.writeInteger(NativeConstants.IntegerDataType.INT2, parameterIndex);
                boolean readAny = false;
                while ((numRead = inStream.read(buf)) != -1) {
                    readAny = true;
                    byte[] valueAsBytes = StringUtils.getBytes(buf, 0, numRead, clobEncoding);
                    packet.writeBytes(NativeConstants.StringSelfDataType.STRING_EOF, valueAsBytes);
                    totalBytesRead += valueAsBytes.length;
                    if ((bytesInPacket += valueAsBytes.length) < packetIsFullAt) continue;
                    bytesReadAtLastSend = totalBytesRead;
                    this.session.sendCommand(packet, true, 0);
                    bytesInPacket = 0;
                    packet.setPosition(0);
                    packet.writeInteger(NativeConstants.IntegerDataType.INT1, 24L);
                    packet.writeInteger(NativeConstants.IntegerDataType.INT4, this.serverStatementId);
                    packet.writeInteger(NativeConstants.IntegerDataType.INT2, parameterIndex);
                }
                if (totalBytesRead != bytesReadAtLastSend) {
                    this.session.sendCommand(packet, true, 0);
                }
                if (!readAny) {
                    this.session.sendCommand(packet, true, 0);
                }
            }
            catch (IOException ioEx) {
                throw ExceptionFactory.createException(Messages.getString("ServerPreparedStatement.24") + ioEx.toString(), ioEx, this.session.getExceptionInterceptor());
            }
            finally {
                if (((Boolean)this.autoClosePStmtStreams.getValue()).booleanValue() && inStream != null) {
                    try {
                        inStream.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
    }

    public void clearParameters(boolean clearServerParameters) {
        boolean hadLongData = false;
        if (this.queryBindings != null) {
            hadLongData = ((ServerPreparedQueryBindings)this.queryBindings).clearBindValues();
            ((ServerPreparedQueryBindings)this.queryBindings).setLongParameterSwitchDetected(!clearServerParameters || !hadLongData);
        }
        if (clearServerParameters && hadLongData) {
            this.serverResetStatement();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void serverResetStatement() {
        this.session.checkClosed();
        NativeSession nativeSession = this.session;
        synchronized (nativeSession) {
            try {
                this.session.sendCommand(this.commandBuilder.buildComStmtReset(this.session.getSharedSendPacket(), this.serverStatementId), false, 0);
            }
            finally {
                this.session.clearInputStream();
            }
        }
    }

    @Override
    protected long[] computeMaxParameterSetSizeAndBatchSize(int numBatchedArgs) {
        int i;
        boolean supportsQueryAttributes = this.session.getServerSession().supportsQueryAttributes();
        long maxSizeOfParameterSet = 0L;
        long sizeOfEntireBatch = 11L;
        if (supportsQueryAttributes) {
            sizeOfEntireBatch += 9L;
            sizeOfEntireBatch += (long)((this.queryAttributesBindings.getCount() + 7) / 8);
            for (i = 0; i < this.queryAttributesBindings.getCount(); ++i) {
                QueryAttributesBindValue queryAttribute = this.queryAttributesBindings.getAttributeValue(i);
                sizeOfEntireBatch += (long)(2 + queryAttribute.getName().length()) + queryAttribute.getBoundLength();
            }
        }
        for (i = 0; i < numBatchedArgs; ++i) {
            ServerPreparedQueryBindValue[] paramArg = (ServerPreparedQueryBindValue[])((ServerPreparedQueryBindings)this.batchedArgs.get(i)).getBindValues();
            long sizeOfParameterSet = (this.parameterCount + 7) / 8 + this.parameterCount * 2;
            if (supportsQueryAttributes) {
                sizeOfParameterSet += (long)this.parameterCount;
            }
            ServerPreparedQueryBindValue[] parameterBindings = (ServerPreparedQueryBindValue[])((ServerPreparedQueryBindings)this.queryBindings).getBindValues();
            for (int j = 0; j < parameterBindings.length; ++j) {
                if (paramArg[j].isNull()) continue;
                long size = paramArg[j].getBoundLength();
                if (paramArg[j].isStream()) {
                    if (size == -1L) continue;
                    sizeOfParameterSet += size;
                    continue;
                }
                sizeOfParameterSet += size;
            }
            sizeOfEntireBatch += sizeOfParameterSet;
            if (sizeOfParameterSet <= maxSizeOfParameterSet) continue;
            maxSizeOfParameterSet = sizeOfParameterSet;
        }
        return new long[]{maxSizeOfParameterSet, sizeOfEntireBatch};
    }

    private String truncateQueryToLog(String sql) {
        String queryStr = null;
        int maxQuerySizeToLog = this.session.getPropertySet().getIntegerProperty(PropertyKey.maxQuerySizeToLog).getValue();
        if (sql.length() > maxQuerySizeToLog) {
            StringBuilder queryBuf = new StringBuilder(maxQuerySizeToLog + 12);
            queryBuf.append(sql.substring(0, maxQuerySizeToLog));
            queryBuf.append(Messages.getString("MysqlIO.25"));
            queryStr = queryBuf.toString();
        } else {
            queryStr = sql;
        }
        return queryStr;
    }

    @Override
    public <M extends Message> M fillSendPacket() {
        return null;
    }

    @Override
    public <M extends Message> M fillSendPacket(QueryBindings<?> bindings) {
        return null;
    }
}
