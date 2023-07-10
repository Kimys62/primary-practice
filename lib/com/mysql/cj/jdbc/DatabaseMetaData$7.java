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
import java.util.Iterator;
import java.util.TreeMap;

class DatabaseMetaData.7
extends IterateBlock<String> {
    final /* synthetic */ String val$table;
    final /* synthetic */ Statement val$stmt;
    final /* synthetic */ boolean val$dbMapsToSchema;
    final /* synthetic */ ArrayList val$rows;

    DatabaseMetaData.7(DatabaseMetaData.IteratorWithCleanup i, String string, Statement statement, boolean bl, ArrayList arrayList) {
        this.val$table = string;
        this.val$stmt = statement;
        this.val$dbMapsToSchema = bl;
        this.val$rows = arrayList;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbStr) throws SQLException {
        ResultSet rs = null;
        try {
            block12: {
                StringBuilder queryBuf = new StringBuilder("SHOW KEYS FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(this.val$table, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                queryBuf.append(" FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(dbStr, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                try {
                    rs = this.val$stmt.executeQuery(queryBuf.toString());
                }
                catch (SQLException sqlEx) {
                    String sqlState = sqlEx.getSQLState();
                    int errorCode = sqlEx.getErrorCode();
                    if ("42S02".equals(sqlState) || errorCode == 1146 || errorCode == 1049) break block12;
                    throw sqlEx;
                }
            }
            TreeMap<String, byte[][]> sortMap = new TreeMap<String, byte[][]>();
            while (rs != null && rs.next()) {
                String keyType = rs.getString("Key_name");
                if (keyType == null || !keyType.equalsIgnoreCase("PRIMARY") && !keyType.equalsIgnoreCase("PRI")) continue;
                byte[][] tuple = new byte[6][];
                tuple[0] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b("def") : DatabaseMetaData.this.s2b(dbStr);
                tuple[1] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b(dbStr) : null;
                tuple[2] = DatabaseMetaData.this.s2b(this.val$table);
                String columnName = rs.getString("Column_name");
                tuple[3] = DatabaseMetaData.this.s2b(columnName);
                tuple[4] = DatabaseMetaData.this.s2b(rs.getString("Seq_in_index"));
                tuple[5] = DatabaseMetaData.this.s2b(keyType);
                sortMap.put(columnName, tuple);
            }
            Iterator sortedIterator = sortMap.values().iterator();
            while (sortedIterator.hasNext()) {
                this.val$rows.add(new ByteArrayRow((byte[][])sortedIterator.next(), DatabaseMetaData.this.getExceptionInterceptor()));
            }
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                }
                catch (Exception exception) {}
                rs = null;
            }
        }
    }
}
