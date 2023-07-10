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
import java.util.SortedMap;

class DatabaseMetaData.6
extends IterateBlock<String> {
    final /* synthetic */ String val$table;
    final /* synthetic */ Statement val$stmt;
    final /* synthetic */ boolean val$dbMapsToSchema;
    final /* synthetic */ boolean val$unique;
    final /* synthetic */ SortedMap val$sortedRows;

    DatabaseMetaData.6(DatabaseMetaData.IteratorWithCleanup i, String string, Statement statement, boolean bl, boolean bl2, SortedMap sortedMap) {
        this.val$table = string;
        this.val$stmt = statement;
        this.val$dbMapsToSchema = bl;
        this.val$unique = bl2;
        this.val$sortedRows = sortedMap;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbStr) throws SQLException {
        ResultSet results = null;
        try {
            block12: {
                StringBuilder queryBuf = new StringBuilder("SHOW INDEX FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(this.val$table, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                queryBuf.append(" FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(dbStr, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                try {
                    results = this.val$stmt.executeQuery(queryBuf.toString());
                }
                catch (SQLException sqlEx) {
                    String sqlState = sqlEx.getSQLState();
                    int errorCode = sqlEx.getErrorCode();
                    if ("42S02".equals(sqlState) || errorCode == 1146 || errorCode == 1049) break block12;
                    throw sqlEx;
                }
            }
            while (results != null && results.next()) {
                byte[][] row = new byte[14][];
                row[0] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b("def") : DatabaseMetaData.this.s2b(dbStr);
                row[1] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b(dbStr) : null;
                row[2] = results.getBytes("Table");
                boolean indexIsUnique = results.getInt("Non_unique") == 0;
                row[3] = !indexIsUnique ? DatabaseMetaData.this.s2b("true") : DatabaseMetaData.this.s2b("false");
                row[4] = null;
                row[5] = results.getBytes("Key_name");
                short indexType = 3;
                row[6] = Integer.toString(indexType).getBytes();
                row[7] = results.getBytes("Seq_in_index");
                row[8] = results.getBytes("Column_name");
                row[9] = results.getBytes("Collation");
                long cardinality = results.getLong("Cardinality");
                row[10] = DatabaseMetaData.this.s2b(String.valueOf(cardinality));
                row[11] = DatabaseMetaData.this.s2b("0");
                row[12] = null;
                DatabaseMetaData.IndexMetaDataKey indexInfoKey = new DatabaseMetaData.IndexMetaDataKey(DatabaseMetaData.this, !indexIsUnique, indexType, results.getString("Key_name").toLowerCase(), results.getShort("Seq_in_index"));
                if (this.val$unique) {
                    if (!indexIsUnique) continue;
                    this.val$sortedRows.put(indexInfoKey, new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                    continue;
                }
                this.val$sortedRows.put(indexInfoKey, new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
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
