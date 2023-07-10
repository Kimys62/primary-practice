/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.protocol.a.result.ByteArrayRow;
import com.mysql.cj.util.StringUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;

class DatabaseMetaData.1
extends IterateBlock<String> {
    final /* synthetic */ String val$table;
    final /* synthetic */ Statement val$stmt;
    final /* synthetic */ ArrayList val$rows;

    DatabaseMetaData.1(DatabaseMetaData.IteratorWithCleanup i, String string, Statement statement, ArrayList arrayList) {
        this.val$table = string;
        this.val$stmt = statement;
        this.val$rows = arrayList;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbStr) throws SQLException {
        ResultSet results = null;
        try {
            block22: {
                StringBuilder queryBuf = new StringBuilder("SHOW COLUMNS FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(this.val$table, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                queryBuf.append(" FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(dbStr, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                try {
                    results = this.val$stmt.executeQuery(queryBuf.toString());
                }
                catch (SQLException sqlEx) {
                    String sqlState = sqlEx.getSQLState();
                    int errorCode = sqlEx.getErrorCode();
                    if ("42S02".equals(sqlState) || errorCode == 1146 || errorCode == 1049) break block22;
                    throw sqlEx;
                }
            }
            while (results != null && results.next()) {
                String keyType = results.getString("Key");
                if (keyType == null || !StringUtils.startsWithIgnoreCase(keyType, "PRI")) continue;
                byte[][] rowVal = new byte[8][];
                rowVal[0] = Integer.toString(2).getBytes();
                rowVal[1] = results.getBytes("Field");
                String type = results.getString("Type");
                int size = this.val$stmt.getMaxFieldSize();
                int decimals = 0;
                boolean hasLength = false;
                if (type.indexOf("enum") != -1) {
                    String temp = type.substring(type.indexOf("("), type.indexOf(")"));
                    StringTokenizer tokenizer = new StringTokenizer(temp, ",");
                    int maxLength = 0;
                    while (tokenizer.hasMoreTokens()) {
                        maxLength = Math.max(maxLength, tokenizer.nextToken().length() - 2);
                    }
                    size = maxLength;
                    decimals = 0;
                    type = "enum";
                } else if (type.indexOf("(") != -1) {
                    hasLength = true;
                    if (type.indexOf(",") != -1) {
                        size = Integer.parseInt(type.substring(type.indexOf("(") + 1, type.indexOf(",")));
                        decimals = Integer.parseInt(type.substring(type.indexOf(",") + 1, type.indexOf(")")));
                    } else {
                        size = Integer.parseInt(type.substring(type.indexOf("(") + 1, type.indexOf(")")));
                    }
                    type = type.substring(0, type.indexOf("("));
                }
                MysqlType ft = MysqlType.getByName(type.toUpperCase());
                rowVal[2] = DatabaseMetaData.this.s2b(String.valueOf(ft.getJdbcType()));
                rowVal[3] = DatabaseMetaData.this.s2b(type);
                rowVal[4] = hasLength ? Integer.toString(size + decimals).getBytes() : Long.toString(ft.getPrecision()).getBytes();
                rowVal[5] = Integer.toString(maxBufferSize).getBytes();
                rowVal[6] = Integer.toString(decimals).getBytes();
                rowVal[7] = Integer.toString(1).getBytes();
                this.val$rows.add(new ByteArrayRow(rowVal, DatabaseMetaData.this.getExceptionInterceptor()));
            }
        }
        catch (SQLException sqlEx) {
            if (!"42S02".equals(sqlEx.getSQLState())) {
                throw sqlEx;
            }
        }
        finally {
            if (results != null) {
                try {
                    results.close();
                }
                catch (Exception exception) {}
                results = null;
            }
        }
    }
}
