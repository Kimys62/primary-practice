/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a;

import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.protocol.ProtocolEntityReader;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.ResultsetRow;
import com.mysql.cj.protocol.a.BinaryRowFactory;
import com.mysql.cj.protocol.a.MergingColumnDefinitionFactory;
import com.mysql.cj.protocol.a.NativeConstants;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.protocol.a.NativeProtocol;
import com.mysql.cj.protocol.a.result.AbstractResultsetRows;
import com.mysql.cj.protocol.a.result.OkPacket;
import com.mysql.cj.protocol.a.result.ResultsetRowsCursor;
import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;
import com.mysql.cj.protocol.a.result.ResultsetRowsStreaming;
import java.io.IOException;
import java.util.ArrayList;

public class BinaryResultsetReader
implements ProtocolEntityReader<Resultset, NativePacketPayload> {
    protected NativeProtocol protocol;

    public BinaryResultsetReader(NativeProtocol prot) {
        this.protocol = prot;
    }

    @Override
    public Resultset read(int maxRows, boolean streamResults, NativePacketPayload resultPacket, ColumnDefinition metadata, ProtocolEntityFactory<Resultset, NativePacketPayload> resultSetFactory) throws IOException {
        Resultset rs = null;
        long columnCount = resultPacket.readInteger(NativeConstants.IntegerDataType.INT_LENENC);
        if (columnCount > 0L) {
            boolean isCursorPossible;
            ColumnDefinition cdef = this.protocol.read(ColumnDefinition.class, new MergingColumnDefinitionFactory(columnCount, metadata));
            boolean bl = isCursorPossible = this.protocol.getPropertySet().getBooleanProperty(PropertyKey.useCursorFetch).getValue() != false && resultSetFactory.getResultSetType() == Resultset.Type.FORWARD_ONLY && resultSetFactory.getFetchSize() > 0;
            if (isCursorPossible || !this.protocol.getServerSession().isEOFDeprecated()) {
                NativePacketPayload rowPacket = this.protocol.probeMessage(this.protocol.getReusablePacket());
                this.protocol.checkErrorMessage(rowPacket);
                if (rowPacket.isResultSetOKPacket() || rowPacket.isEOFPacket()) {
                    rowPacket = this.protocol.readMessage(this.protocol.getReusablePacket());
                    this.protocol.readServerStatusForResultSets(rowPacket, true);
                } else {
                    isCursorPossible = false;
                }
            }
            AbstractResultsetRows rows = null;
            if (isCursorPossible && this.protocol.getServerSession().cursorExists()) {
                rows = new ResultsetRowsCursor(this.protocol, cdef);
            } else if (!streamResults) {
                BinaryRowFactory brf = new BinaryRowFactory(this.protocol, cdef, resultSetFactory.getResultSetConcurrency(), false);
                ArrayList<ResultsetRow> rowList = new ArrayList<ResultsetRow>();
                ResultsetRow row = this.protocol.read(ResultsetRow.class, brf);
                while (row != null) {
                    if (maxRows == -1 || rowList.size() < maxRows) {
                        rowList.add(row);
                    }
                    row = this.protocol.read(ResultsetRow.class, brf);
                }
                rows = new ResultsetRowsStatic(rowList, cdef);
            } else {
                rows = new ResultsetRowsStreaming<Resultset>(this.protocol, cdef, true, resultSetFactory);
                this.protocol.setStreamingData(rows);
            }
            rs = resultSetFactory.createFromProtocolEntity(rows);
        } else {
            if (columnCount == -1L) {
                String charEncoding = this.protocol.getPropertySet().getStringProperty(PropertyKey.characterEncoding).getValue();
                String fileName = resultPacket.readString(NativeConstants.StringSelfDataType.STRING_TERM, this.protocol.getServerSession().getCharsetSettings().doesPlatformDbCharsetMatches() ? null : charEncoding);
                resultPacket = this.protocol.sendFileToServer(fileName);
            }
            OkPacket ok = (OkPacket)this.protocol.readServerStatusForResultSets(resultPacket, false);
            rs = resultSetFactory.createFromProtocolEntity(ok);
        }
        return rs;
    }
}
