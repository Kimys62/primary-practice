/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.AppendingBatchVisitor;
import com.mysql.cj.BatchVisitor;
import com.mysql.cj.Messages;
import com.mysql.cj.QueryReturnType;
import com.mysql.cj.Session;
import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.exceptions.ExceptionFactory;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.util.SearchMode;
import com.mysql.cj.util.StringInspector;
import com.mysql.cj.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class ParseInfo {
    private static final String OPENING_MARKERS = "`'\"";
    private static final String CLOSING_MARKERS = "`'\"";
    private static final String OVERRIDING_MARKERS = "";
    private static final String[] ON_DUPLICATE_KEY_UPDATE_CLAUSE = new String[]{"ON", "DUPLICATE", "KEY", "UPDATE"};
    private static final String[] LOAD_DATA_CLAUSE = new String[]{"LOAD", "DATA"};
    private String charEncoding;
    private int statementLength = 0;
    private int statementStartPos = 0;
    private char firstStmtChar = '\u0000';
    private QueryReturnType queryReturnType = null;
    private boolean hasParameters = false;
    private boolean parametersInDuplicateKeyClause = false;
    private boolean isLoadData = false;
    private boolean isOnDuplicateKeyUpdate = false;
    private int locationOfOnDuplicateKeyUpdate = -1;
    private int numberOfQueries = 1;
    private boolean canRewriteAsMultiValueInsert = false;
    private String valuesClause;
    private ParseInfo batchHead;
    private ParseInfo batchValues;
    private ParseInfo batchODKUClause;
    private byte[][] staticSql = null;

    private ParseInfo(byte[][] staticSql, char firstStmtChar, QueryReturnType queryReturnType, boolean isLoadData, boolean isOnDuplicateKeyUpdate, int locationOfOnDuplicateKeyUpdate, int statementLength, int statementStartPos) {
        this.firstStmtChar = firstStmtChar;
        this.queryReturnType = queryReturnType;
        this.isLoadData = isLoadData;
        this.isOnDuplicateKeyUpdate = isOnDuplicateKeyUpdate;
        this.locationOfOnDuplicateKeyUpdate = locationOfOnDuplicateKeyUpdate;
        this.statementLength = statementLength;
        this.statementStartPos = statementStartPos;
        this.staticSql = staticSql;
    }

    public ParseInfo(String sql, Session session, String encoding) {
        this(sql, session, encoding, true);
    }

    public ParseInfo(String sql, Session session, String encoding, boolean buildRewriteInfo) {
        try {
            int statementKeywordPos;
            if (sql == null) {
                throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("PreparedStatement.61"), session.getExceptionInterceptor());
            }
            this.charEncoding = encoding;
            this.statementLength = sql.length();
            boolean noBackslashEscapes = session.getServerSession().isNoBackslashEscapesSet();
            this.queryReturnType = ParseInfo.getQueryReturnType(sql, noBackslashEscapes);
            this.statementStartPos = ParseInfo.indexOfStartOfStatement(sql, session.getServerSession().isNoBackslashEscapesSet());
            if (this.statementStartPos == -1) {
                this.statementStartPos = this.statementLength;
            }
            if ((statementKeywordPos = StringUtils.indexOfNextAlphanumericChar(this.statementStartPos, sql, "`'\"", "`'\"", OVERRIDING_MARKERS, noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__BSE_MRK_COM_MYM_HNT_WS)) >= 0) {
                this.firstStmtChar = Character.toUpperCase(sql.charAt(statementKeywordPos));
            }
            boolean bl = this.firstStmtChar == 'L' && StringUtils.indexOfIgnoreCase(this.statementStartPos, sql, LOAD_DATA_CLAUSE, "`'\"", "`'\"", noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__FULL) == this.statementStartPos ? true : (this.isLoadData = false);
            if (this.firstStmtChar == 'I' && StringUtils.startsWithIgnoreCaseAndWs(sql, "INSERT", this.statementStartPos)) {
                this.locationOfOnDuplicateKeyUpdate = ParseInfo.getOnDuplicateKeyLocation(sql, session.getPropertySet().getBooleanProperty(PropertyKey.dontCheckOnDuplicateKeyUpdateInSQL).getValue(), session.getPropertySet().getBooleanProperty(PropertyKey.rewriteBatchedStatements).getValue(), session.getServerSession().isNoBackslashEscapesSet());
                this.isOnDuplicateKeyUpdate = this.locationOfOnDuplicateKeyUpdate != -1;
            }
            StringInspector strInspector = new StringInspector(sql, this.statementStartPos, "`'\"", "`'\"", OVERRIDING_MARKERS, noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__FULL);
            int pos = this.statementStartPos;
            int prevParamEnd = 0;
            ArrayList<int[]> endpointList = new ArrayList<int[]>();
            while ((pos = strInspector.indexOfNextNonWsChar()) >= 0) {
                if (strInspector.getChar() == '?') {
                    endpointList.add(new int[]{prevParamEnd, pos});
                    prevParamEnd = pos + 1;
                    if (this.isOnDuplicateKeyUpdate && pos > this.locationOfOnDuplicateKeyUpdate) {
                        this.parametersInDuplicateKeyClause = true;
                    }
                    strInspector.incrementPosition();
                    continue;
                }
                if (strInspector.getChar() == ';') {
                    strInspector.incrementPosition();
                    pos = strInspector.indexOfNextNonWsChar();
                    if (pos <= 0) continue;
                    ++this.numberOfQueries;
                    continue;
                }
                strInspector.incrementPosition();
            }
            endpointList.add(new int[]{prevParamEnd, this.statementLength});
            this.staticSql = new byte[endpointList.size()][];
            this.hasParameters = this.staticSql.length > 1;
            for (int i = 0; i < this.staticSql.length; ++i) {
                int[] ep = (int[])endpointList.get(i);
                int end = ep[1];
                int begin = ep[0];
                int len = end - begin;
                if (this.isLoadData) {
                    this.staticSql[i] = StringUtils.getBytes(sql, begin, len);
                    continue;
                }
                if (encoding == null) {
                    byte[] buf = new byte[len];
                    for (int j = 0; j < len; ++j) {
                        buf[j] = (byte)sql.charAt(begin + j);
                    }
                    this.staticSql[i] = buf;
                    continue;
                }
                this.staticSql[i] = StringUtils.getBytes(sql, begin, len, encoding);
            }
        }
        catch (Exception oobEx) {
            throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("PreparedStatement.62", new Object[]{sql}), oobEx, session.getExceptionInterceptor());
        }
        if (buildRewriteInfo) {
            boolean bl = this.canRewriteAsMultiValueInsert = this.numberOfQueries == 1 && !this.parametersInDuplicateKeyClause && ParseInfo.canRewrite(sql, this.isOnDuplicateKeyUpdate, this.locationOfOnDuplicateKeyUpdate, this.statementStartPos);
            if (this.canRewriteAsMultiValueInsert && session.getPropertySet().getBooleanProperty(PropertyKey.rewriteBatchedStatements).getValue().booleanValue()) {
                this.buildRewriteBatchedParams(sql, session, encoding);
            }
        }
    }

    public int getNumberOfQueries() {
        return this.numberOfQueries;
    }

    public byte[][] getStaticSql() {
        return this.staticSql;
    }

    public String getValuesClause() {
        return this.valuesClause;
    }

    public int getLocationOfOnDuplicateKeyUpdate() {
        return this.locationOfOnDuplicateKeyUpdate;
    }

    public QueryReturnType getQueryReturnType() {
        return this.queryReturnType;
    }

    public boolean canRewriteAsMultiValueInsertAtSqlLevel() {
        return this.canRewriteAsMultiValueInsert;
    }

    public boolean containsOnDuplicateKeyUpdateInSQL() {
        return this.isOnDuplicateKeyUpdate;
    }

    private void buildRewriteBatchedParams(String sql, Session session, String encoding) {
        this.valuesClause = this.extractValuesClause(sql, session.getIdentifierQuoteString());
        String odkuClause = this.isOnDuplicateKeyUpdate ? sql.substring(this.locationOfOnDuplicateKeyUpdate) : null;
        String headSql = null;
        headSql = this.isOnDuplicateKeyUpdate ? sql.substring(0, this.locationOfOnDuplicateKeyUpdate) : sql;
        this.batchHead = new ParseInfo(headSql, session, encoding, false);
        this.batchValues = new ParseInfo("," + this.valuesClause, session, encoding, false);
        this.batchODKUClause = null;
        if (odkuClause != null && odkuClause.length() > 0) {
            this.batchODKUClause = new ParseInfo("," + this.valuesClause + " " + odkuClause, session, encoding, false);
        }
    }

    private String extractValuesClause(String sql, String quoteCharStr) {
        int indexOfValues = -1;
        int valuesSearchStart = this.statementStartPos;
        int indexOfFirstEqualsChar = StringUtils.indexOfIgnoreCase(valuesSearchStart, sql, "=", quoteCharStr, quoteCharStr, SearchMode.__MRK_COM_MYM_HNT_WS);
        while (indexOfValues == -1) {
            indexOfValues = quoteCharStr.length() > 0 ? StringUtils.indexOfIgnoreCase(valuesSearchStart, sql, "VALUE", quoteCharStr, quoteCharStr, SearchMode.__MRK_COM_MYM_HNT_WS) : StringUtils.indexOfIgnoreCase(valuesSearchStart, sql, "VALUE");
            if (indexOfFirstEqualsChar > 0 && indexOfValues > indexOfFirstEqualsChar) {
                indexOfValues = -1;
            }
            if (indexOfValues <= 0) break;
            char c = sql.charAt(indexOfValues - 1);
            if (!Character.isWhitespace(c) && c != ')' && c != '`') {
                valuesSearchStart = indexOfValues + 6;
                indexOfValues = -1;
                continue;
            }
            c = sql.charAt(indexOfValues + 6);
            if (Character.isWhitespace(c) || c == '(') continue;
            valuesSearchStart = indexOfValues + 6;
            indexOfValues = -1;
        }
        if (indexOfValues == -1) {
            return null;
        }
        int indexOfFirstParen = sql.indexOf(40, indexOfValues + 6);
        if (indexOfFirstParen == -1) {
            return null;
        }
        int endOfValuesClause = this.isOnDuplicateKeyUpdate ? this.locationOfOnDuplicateKeyUpdate : sql.length();
        return sql.substring(indexOfFirstParen, endOfValuesClause);
    }

    public synchronized ParseInfo getParseInfoForBatch(int numBatch) {
        AppendingBatchVisitor apv = new AppendingBatchVisitor();
        this.buildInfoForBatch(numBatch, apv);
        ParseInfo batchParseInfo = new ParseInfo(apv.getStaticSqlStrings(), this.firstStmtChar, this.queryReturnType, this.isLoadData, this.isOnDuplicateKeyUpdate, this.locationOfOnDuplicateKeyUpdate, this.statementLength, this.statementStartPos);
        return batchParseInfo;
    }

    public String getSqlForBatch(int numBatch) throws UnsupportedEncodingException {
        ParseInfo batchInfo = this.getParseInfoForBatch(numBatch);
        return batchInfo.getSqlForBatch();
    }

    public String getSqlForBatch() throws UnsupportedEncodingException {
        int size = 0;
        byte[][] sqlStrings = this.staticSql;
        int sqlStringsLength = sqlStrings.length;
        for (int i = 0; i < sqlStringsLength; ++i) {
            size += sqlStrings[i].length;
            ++size;
        }
        StringBuilder buf = new StringBuilder(size);
        for (int i = 0; i < sqlStringsLength - 1; ++i) {
            buf.append(StringUtils.toString(sqlStrings[i], this.charEncoding));
            buf.append("?");
        }
        buf.append(StringUtils.toString(sqlStrings[sqlStringsLength - 1]));
        return buf.toString();
    }

    private void buildInfoForBatch(int numBatch, BatchVisitor visitor) {
        if (!this.hasParameters) {
            if (numBatch == 1) {
                visitor.append(this.staticSql[0]);
                return;
            }
            byte[] headStaticSql = this.batchHead.staticSql[0];
            visitor.append(headStaticSql).increment();
            int numValueRepeats = numBatch - 1;
            if (this.batchODKUClause != null) {
                --numValueRepeats;
            }
            byte[] valuesStaticSql = this.batchValues.staticSql[0];
            for (int i = 0; i < numValueRepeats; ++i) {
                visitor.mergeWithLast(valuesStaticSql).increment();
            }
            if (this.batchODKUClause != null) {
                byte[] batchOdkuStaticSql = this.batchODKUClause.staticSql[0];
                visitor.mergeWithLast(batchOdkuStaticSql).increment();
            }
            return;
        }
        byte[][] headStaticSql = this.batchHead.staticSql;
        int headStaticSqlLength = headStaticSql.length;
        byte[] endOfHead = headStaticSql[headStaticSqlLength - 1];
        for (int i = 0; i < headStaticSqlLength - 1; ++i) {
            visitor.append(headStaticSql[i]).increment();
        }
        int numValueRepeats = numBatch - 1;
        if (this.batchODKUClause != null) {
            --numValueRepeats;
        }
        byte[][] valuesStaticSql = this.batchValues.staticSql;
        int valuesStaticSqlLength = valuesStaticSql.length;
        byte[] beginOfValues = valuesStaticSql[0];
        byte[] endOfValues = valuesStaticSql[valuesStaticSqlLength - 1];
        for (int i = 0; i < numValueRepeats; ++i) {
            visitor.merge(endOfValues, beginOfValues).increment();
            for (int j = 1; j < valuesStaticSqlLength - 1; ++j) {
                visitor.append(valuesStaticSql[j]).increment();
            }
        }
        if (this.batchODKUClause != null) {
            byte[][] batchOdkuStaticSql = this.batchODKUClause.staticSql;
            int batchOdkuStaticSqlLength = batchOdkuStaticSql.length;
            byte[] beginOfOdku = batchOdkuStaticSql[0];
            byte[] endOfOdku = batchOdkuStaticSql[batchOdkuStaticSqlLength - 1];
            if (numBatch > 1) {
                visitor.merge(numValueRepeats > 0 ? endOfValues : endOfHead, beginOfOdku).increment();
                for (int i = 1; i < batchOdkuStaticSqlLength; ++i) {
                    visitor.append(batchOdkuStaticSql[i]).increment();
                }
            } else {
                visitor.append(endOfOdku).increment();
            }
        } else {
            visitor.append(endOfHead);
        }
    }

    public boolean isLoadData() {
        return this.isLoadData;
    }

    public char getFirstStmtChar() {
        return this.firstStmtChar;
    }

    public static int indexOfStartOfStatement(String sql, boolean noBackslashEscapes) {
        return StringUtils.indexOfNextNonWsChar(0, sql, "`'\"", "`'\"", OVERRIDING_MARKERS, noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__BSE_MRK_COM_MYM_HNT_WS);
    }

    public static int indexOfStatementKeyword(String sql, boolean noBackslashEscapes) {
        return StringUtils.indexOfNextAlphanumericChar(0, sql, "`'\"", "`'\"", OVERRIDING_MARKERS, noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__BSE_MRK_COM_MYM_HNT_WS);
    }

    public static char firstCharOfStatementUc(String sql, boolean noBackslashEscapes) {
        int statementKeywordPos = ParseInfo.indexOfStatementKeyword(sql, noBackslashEscapes);
        if (statementKeywordPos == -1) {
            return '\u0000';
        }
        return Character.toUpperCase(sql.charAt(statementKeywordPos));
    }

    public static boolean isReadOnlySafeQuery(String sql, boolean noBackslashEscapes) {
        int statementKeywordPos = ParseInfo.indexOfStatementKeyword(sql, noBackslashEscapes);
        if (statementKeywordPos == -1) {
            return true;
        }
        char firstStatementChar = Character.toUpperCase(sql.charAt(statementKeywordPos));
        if (firstStatementChar == 'A' && StringUtils.startsWithIgnoreCaseAndWs(sql, "ALTER", statementKeywordPos)) {
            return false;
        }
        if (firstStatementChar == 'C' && (StringUtils.startsWithIgnoreCaseAndWs(sql, "CHANGE", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "CREATE", statementKeywordPos))) {
            return false;
        }
        if (firstStatementChar == 'D' && (StringUtils.startsWithIgnoreCaseAndWs(sql, "DELETE", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "DROP", statementKeywordPos))) {
            return false;
        }
        if (firstStatementChar == 'G' && StringUtils.startsWithIgnoreCaseAndWs(sql, "GRANT", statementKeywordPos)) {
            return false;
        }
        if (firstStatementChar == 'I' && (StringUtils.startsWithIgnoreCaseAndWs(sql, "IMPORT", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "INSERT", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "INSTALL", statementKeywordPos))) {
            return false;
        }
        if (firstStatementChar == 'L' && StringUtils.startsWithIgnoreCaseAndWs(sql, "LOAD", statementKeywordPos)) {
            return false;
        }
        if (firstStatementChar == 'O' && StringUtils.startsWithIgnoreCaseAndWs(sql, "OPTIMIZE", statementKeywordPos)) {
            return false;
        }
        if (firstStatementChar == 'R' && (StringUtils.startsWithIgnoreCaseAndWs(sql, "RENAME", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "REPAIR", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "REPLACE", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "RESET", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "REVOKE", statementKeywordPos))) {
            return false;
        }
        if (firstStatementChar == 'T' && StringUtils.startsWithIgnoreCaseAndWs(sql, "TRUNCATE", statementKeywordPos)) {
            return false;
        }
        if (firstStatementChar == 'U' && (StringUtils.startsWithIgnoreCaseAndWs(sql, "UNINSTALL", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "UPDATE", statementKeywordPos))) {
            return false;
        }
        if (firstStatementChar == 'W' && StringUtils.startsWithIgnoreCaseAndWs(sql, "WITH", statementKeywordPos)) {
            String context = ParseInfo.getContextForWithStatement(sql, noBackslashEscapes);
            return context == null || !context.equalsIgnoreCase("DELETE") && !context.equalsIgnoreCase("UPDATE");
        }
        return true;
    }

    public static QueryReturnType getQueryReturnType(String sql, boolean noBackslashEscapes) {
        int statementKeywordPos = ParseInfo.indexOfStatementKeyword(sql, noBackslashEscapes);
        if (statementKeywordPos == -1) {
            return QueryReturnType.NONE;
        }
        char firstStatementChar = Character.toUpperCase(sql.charAt(statementKeywordPos));
        if (firstStatementChar == 'A' && StringUtils.startsWithIgnoreCaseAndWs(sql, "ANALYZE", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'C' && StringUtils.startsWithIgnoreCaseAndWs(sql, "CALL", statementKeywordPos)) {
            return QueryReturnType.MAY_PRODUCE_RESULT_SET;
        }
        if (firstStatementChar == 'C' && StringUtils.startsWithIgnoreCaseAndWs(sql, "CHECK", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'D' && StringUtils.startsWithIgnoreCaseAndWs(sql, "DESC", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'E' && StringUtils.startsWithIgnoreCaseAndWs(sql, "EXPLAIN", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'E' && StringUtils.startsWithIgnoreCaseAndWs(sql, "EXECUTE", statementKeywordPos)) {
            return QueryReturnType.MAY_PRODUCE_RESULT_SET;
        }
        if (firstStatementChar == 'H' && StringUtils.startsWithIgnoreCaseAndWs(sql, "HELP", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'O' && StringUtils.startsWithIgnoreCaseAndWs(sql, "OPTIMIZE", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'R' && StringUtils.startsWithIgnoreCaseAndWs(sql, "REPAIR", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'S' && (StringUtils.startsWithIgnoreCaseAndWs(sql, "SELECT", statementKeywordPos) || StringUtils.startsWithIgnoreCaseAndWs(sql, "SHOW", statementKeywordPos))) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'T' && StringUtils.startsWithIgnoreCaseAndWs(sql, "TABLE", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'V' && StringUtils.startsWithIgnoreCaseAndWs(sql, "VALUES", statementKeywordPos)) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        if (firstStatementChar == 'W' && StringUtils.startsWithIgnoreCaseAndWs(sql, "WITH", statementKeywordPos)) {
            String context = ParseInfo.getContextForWithStatement(sql, noBackslashEscapes);
            if (context == null) {
                return QueryReturnType.MAY_PRODUCE_RESULT_SET;
            }
            if (context.equalsIgnoreCase("SELECT") || context.equalsIgnoreCase("TABLE") || context.equalsIgnoreCase("VALUES")) {
                return QueryReturnType.PRODUCES_RESULT_SET;
            }
            return QueryReturnType.DOES_NOT_PRODUCE_RESULT_SET;
        }
        if (firstStatementChar == 'X' && StringUtils.indexOfIgnoreCase(statementKeywordPos, sql, new String[]{"XA", "RECOVER"}, "`'\"", "`'\"", noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__FULL) == statementKeywordPos) {
            return QueryReturnType.PRODUCES_RESULT_SET;
        }
        return QueryReturnType.DOES_NOT_PRODUCE_RESULT_SET;
    }

    private static String getContextForWithStatement(String sql, boolean noBackslashEscapes) {
        String section;
        String commentsFreeSql = StringUtils.stripCommentsAndHints(sql, "`'\"", "`'\"", !noBackslashEscapes);
        StringInspector strInspector = new StringInspector(commentsFreeSql, "`'\"(", "`'\")", "`'\"", noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__BSE_MRK_COM_MYM_HNT_WS);
        boolean asFound = false;
        while (true) {
            int nws;
            if ((nws = strInspector.indexOfNextNonWsChar()) == -1) {
                return null;
            }
            int ws = strInspector.indexOfNextWsChar();
            if (ws == -1) {
                ws = commentsFreeSql.length();
            }
            section = commentsFreeSql.substring(nws, ws);
            if (!asFound && section.equalsIgnoreCase("AS")) {
                asFound = true;
                continue;
            }
            if (!asFound) continue;
            if (!section.equalsIgnoreCase(",")) break;
            asFound = false;
        }
        return section;
    }

    public static int getOnDuplicateKeyLocation(String sql, boolean dontCheckOnDuplicateKeyUpdateInSQL, boolean rewriteBatchedStatements, boolean noBackslashEscapes) {
        return dontCheckOnDuplicateKeyUpdateInSQL && !rewriteBatchedStatements ? -1 : StringUtils.indexOfIgnoreCase(0, sql, ON_DUPLICATE_KEY_UPDATE_CLAUSE, "`'\"", "`'\"", noBackslashEscapes ? SearchMode.__MRK_COM_MYM_HNT_WS : SearchMode.__BSE_MRK_COM_MYM_HNT_WS);
    }

    protected static boolean canRewrite(String sql, boolean isOnDuplicateKeyUpdate, int locationOfOnDuplicateKeyUpdate, int statementStartPos) {
        if (StringUtils.startsWithIgnoreCaseAndWs(sql, "INSERT", statementStartPos)) {
            int updateClausePos;
            if (StringUtils.indexOfIgnoreCase(statementStartPos, sql, "SELECT", "`'\"", "`'\"", SearchMode.__MRK_COM_MYM_HNT_WS) != -1) {
                return false;
            }
            if (isOnDuplicateKeyUpdate && (updateClausePos = StringUtils.indexOfIgnoreCase(locationOfOnDuplicateKeyUpdate, sql, " UPDATE ")) != -1) {
                return StringUtils.indexOfIgnoreCase(updateClausePos, sql, "LAST_INSERT_ID", "`'\"", "`'\"", SearchMode.__MRK_COM_MYM_HNT_WS) == -1;
            }
            return true;
        }
        return StringUtils.startsWithIgnoreCaseAndWs(sql, "REPLACE", statementStartPos) && StringUtils.indexOfIgnoreCase(statementStartPos, sql, "SELECT", "`'\"", "`'\"", SearchMode.__MRK_COM_MYM_HNT_WS) == -1;
    }
}
