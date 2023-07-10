/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.protocol.a.result.ByteArrayRow;
import com.mysql.cj.util.StringUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class DatabaseMetaData.10
extends IterateBlock<String> {
    final /* synthetic */ String val$table;
    final /* synthetic */ Statement val$stmt;
    final /* synthetic */ ArrayList val$rows;

    DatabaseMetaData.10(DatabaseMetaData.IteratorWithCleanup i, String string, Statement statement, ArrayList arrayList) {
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
        block16: {
            ResultSet results = null;
            try {
                block17: {
                    StringBuilder whereBuf = new StringBuilder(" Extra LIKE '%on update CURRENT_TIMESTAMP%'");
                    ArrayList rsFields = new ArrayList();
                    if (whereBuf.length() <= 0 && rsFields.size() <= 0) break block16;
                    StringBuilder queryBuf = new StringBuilder("SHOW COLUMNS FROM ");
                    queryBuf.append(StringUtils.quoteIdentifier(this.val$table, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                    queryBuf.append(" FROM ");
                    queryBuf.append(StringUtils.quoteIdentifier(dbStr, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                    queryBuf.append(" WHERE");
                    queryBuf.append(whereBuf.toString());
                    try {
                        results = this.val$stmt.executeQuery(queryBuf.toString());
                    }
                    catch (SQLException sqlEx) {
                        String sqlState = sqlEx.getSQLState();
                        int errorCode = sqlEx.getErrorCode();
                        if ("42S02".equals(sqlState) || errorCode == 1146 || errorCode == 1049) break block17;
                        throw sqlEx;
                    }
                }
                while (results != null && results.next()) {
                    DatabaseMetaData.TypeDescriptor typeDesc = new DatabaseMetaData.TypeDescriptor(DatabaseMetaData.this, results.getString("Type"), results.getString("Null"));
                    byte[][] rowVal = new byte[][]{null, results.getBytes("Field"), Short.toString((short)typeDesc.mysqlType.getJdbcType()).getBytes(), DatabaseMetaData.this.s2b(typeDesc.mysqlType.getName()), typeDesc.columnSize == null ? null : DatabaseMetaData.this.s2b(typeDesc.columnSize.toString()), DatabaseMetaData.this.s2b(Integer.toString(typeDesc.bufferLength)), typeDesc.decimalDigits == null ? null : DatabaseMetaData.this.s2b(typeDesc.decimalDigits.toString()), Integer.toString(1).getBytes()};
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
}
