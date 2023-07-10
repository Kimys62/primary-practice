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

class DatabaseMetaData.9
extends IterateBlock<String> {
    final /* synthetic */ String val$tableNamePat;
    final /* synthetic */ Statement val$stmt;
    final /* synthetic */ String[] val$types;
    final /* synthetic */ boolean val$dbMapsToSchema;
    final /* synthetic */ SortedMap val$sortedRows;

    DatabaseMetaData.9(DatabaseMetaData.IteratorWithCleanup i, String string, Statement statement, String[] stringArray, boolean bl, SortedMap sortedMap) {
        this.val$tableNamePat = string;
        this.val$stmt = statement;
        this.val$types = stringArray;
        this.val$dbMapsToSchema = bl;
        this.val$sortedRows = sortedMap;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbPattern) throws SQLException {
        boolean operatingOnSystemDB = "information_schema".equalsIgnoreCase(dbPattern) || "mysql".equalsIgnoreCase(dbPattern) || "performance_schema".equalsIgnoreCase(dbPattern);
        ResultSet results = null;
        try {
            try {
                StringBuilder sqlBuf = new StringBuilder("SHOW FULL TABLES FROM ");
                sqlBuf.append(StringUtils.quoteIdentifier(dbPattern, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                if (this.val$tableNamePat != null) {
                    sqlBuf.append(" LIKE ");
                    sqlBuf.append(StringUtils.quoteIdentifier(this.val$tableNamePat, "'", true));
                }
                results = this.val$stmt.executeQuery(sqlBuf.toString());
            }
            catch (SQLException sqlEx) {
                if ("08S01".equals(sqlEx.getSQLState())) {
                    throw sqlEx;
                }
                if (results != null) {
                    try {
                        results.close();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    results = null;
                }
                return;
            }
            boolean shouldReportTables = false;
            boolean shouldReportViews = false;
            boolean shouldReportSystemTables = false;
            boolean shouldReportSystemViews = false;
            boolean shouldReportLocalTemporaries = false;
            if (this.val$types == null || this.val$types.length == 0) {
                shouldReportTables = true;
                shouldReportViews = true;
                shouldReportSystemTables = true;
                shouldReportSystemViews = true;
                shouldReportLocalTemporaries = true;
            } else {
                for (int i = 0; i < this.val$types.length; ++i) {
                    if (DatabaseMetaData.TableType.TABLE.equalsTo(this.val$types[i])) {
                        shouldReportTables = true;
                        continue;
                    }
                    if (DatabaseMetaData.TableType.VIEW.equalsTo(this.val$types[i])) {
                        shouldReportViews = true;
                        continue;
                    }
                    if (DatabaseMetaData.TableType.SYSTEM_TABLE.equalsTo(this.val$types[i])) {
                        shouldReportSystemTables = true;
                        continue;
                    }
                    if (DatabaseMetaData.TableType.SYSTEM_VIEW.equalsTo(this.val$types[i])) {
                        shouldReportSystemViews = true;
                        continue;
                    }
                    if (!DatabaseMetaData.TableType.LOCAL_TEMPORARY.equalsTo(this.val$types[i])) continue;
                    shouldReportLocalTemporaries = true;
                }
            }
            int typeColumnIndex = 0;
            boolean hasTableTypes = false;
            try {
                typeColumnIndex = results.findColumn("table_type");
                hasTableTypes = true;
            }
            catch (SQLException sqlEx) {
                try {
                    typeColumnIndex = results.findColumn("Type");
                    hasTableTypes = true;
                }
                catch (SQLException sqlEx2) {
                    hasTableTypes = false;
                }
            }
            block24: while (results.next()) {
                byte[][] row = new byte[10][];
                row[0] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b("def") : DatabaseMetaData.this.s2b(dbPattern);
                row[1] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b(dbPattern) : null;
                row[2] = results.getBytes(1);
                row[4] = new byte[0];
                row[5] = null;
                row[6] = null;
                row[7] = null;
                row[8] = null;
                row[9] = null;
                if (hasTableTypes) {
                    String tableType = results.getString(typeColumnIndex);
                    switch (DatabaseMetaData.TableType.getTableTypeCompliantWith(tableType)) {
                        case TABLE: {
                            boolean reportTable = false;
                            DatabaseMetaData.TableMetaDataKey tablesKey = null;
                            if (operatingOnSystemDB && shouldReportSystemTables) {
                                row[3] = DatabaseMetaData.TableType.SYSTEM_TABLE.asBytes();
                                tablesKey = new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.SYSTEM_TABLE.getName(), dbPattern, null, results.getString(1));
                                reportTable = true;
                            } else if (!operatingOnSystemDB && shouldReportTables) {
                                row[3] = DatabaseMetaData.TableType.TABLE.asBytes();
                                tablesKey = new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.TABLE.getName(), dbPattern, null, results.getString(1));
                                reportTable = true;
                            }
                            if (!reportTable) continue block24;
                            this.val$sortedRows.put(tablesKey, new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                            break;
                        }
                        case VIEW: {
                            if (!shouldReportViews) continue block24;
                            row[3] = DatabaseMetaData.TableType.VIEW.asBytes();
                            this.val$sortedRows.put(new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.VIEW.getName(), dbPattern, null, results.getString(1)), new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                            break;
                        }
                        case SYSTEM_TABLE: {
                            if (!shouldReportSystemTables) continue block24;
                            row[3] = DatabaseMetaData.TableType.SYSTEM_TABLE.asBytes();
                            this.val$sortedRows.put(new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.SYSTEM_TABLE.getName(), dbPattern, null, results.getString(1)), new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                            break;
                        }
                        case SYSTEM_VIEW: {
                            if (!shouldReportSystemViews) continue block24;
                            row[3] = DatabaseMetaData.TableType.SYSTEM_VIEW.asBytes();
                            this.val$sortedRows.put(new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.SYSTEM_VIEW.getName(), dbPattern, null, results.getString(1)), new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                            break;
                        }
                        case LOCAL_TEMPORARY: {
                            if (!shouldReportLocalTemporaries) continue block24;
                            row[3] = DatabaseMetaData.TableType.LOCAL_TEMPORARY.asBytes();
                            this.val$sortedRows.put(new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.LOCAL_TEMPORARY.getName(), dbPattern, null, results.getString(1)), new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                            break;
                        }
                        default: {
                            row[3] = DatabaseMetaData.TableType.TABLE.asBytes();
                            this.val$sortedRows.put(new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.TABLE.getName(), dbPattern, null, results.getString(1)), new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
                            break;
                        }
                    }
                    continue;
                }
                if (!shouldReportTables) continue;
                row[3] = DatabaseMetaData.TableType.TABLE.asBytes();
                this.val$sortedRows.put(new DatabaseMetaData.TableMetaDataKey(DatabaseMetaData.this, DatabaseMetaData.TableType.TABLE.getName(), dbPattern, null, results.getString(1)), new ByteArrayRow(row, DatabaseMetaData.this.getExceptionInterceptor()));
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
