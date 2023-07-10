/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.result.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

class DatabaseMetaData.8
extends IterateBlock<String> {
    final /* synthetic */ boolean val$returnProcedures;
    final /* synthetic */ boolean val$returnFunctions;
    final /* synthetic */ boolean val$dbMapsToSchema;
    final /* synthetic */ String val$procedureNamePattern;
    final /* synthetic */ List val$procedureRowsToSort;
    final /* synthetic */ Field[] val$fields;

    DatabaseMetaData.8(DatabaseMetaData.IteratorWithCleanup i, boolean bl, boolean bl2, boolean bl3, String string, List list, Field[] fieldArray) {
        this.val$returnProcedures = bl;
        this.val$returnFunctions = bl2;
        this.val$dbMapsToSchema = bl3;
        this.val$procedureNamePattern = string;
        this.val$procedureRowsToSort = list;
        this.val$fields = fieldArray;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbPattern) throws SQLException {
        ResultSet proceduresRs = null;
        StringBuilder selectFromMySQLProcSQL = new StringBuilder();
        selectFromMySQLProcSQL.append("SELECT db, name, type, comment FROM mysql.proc WHERE");
        if (this.val$returnProcedures && !this.val$returnFunctions) {
            selectFromMySQLProcSQL.append(" type = 'PROCEDURE' AND ");
        } else if (!this.val$returnProcedures && this.val$returnFunctions) {
            selectFromMySQLProcSQL.append(" type = 'FUNCTION' AND ");
        }
        selectFromMySQLProcSQL.append(this.val$dbMapsToSchema ? " db LIKE ?" : " db = ?");
        if (this.val$procedureNamePattern != null && this.val$procedureNamePattern.length() > 0) {
            selectFromMySQLProcSQL.append(" AND name LIKE ?");
        }
        selectFromMySQLProcSQL.append(" ORDER BY name, type");
        PreparedStatement proceduresStmt = DatabaseMetaData.this.prepareMetaDataSafeStatement(selectFromMySQLProcSQL.toString());
        try {
            if (DatabaseMetaData.this.conn.lowerCaseTableNames()) {
                dbPattern = dbPattern.toLowerCase();
            }
            proceduresStmt.setString(1, dbPattern);
            if (this.val$procedureNamePattern != null && this.val$procedureNamePattern.length() > 0) {
                proceduresStmt.setString(2, this.val$procedureNamePattern);
            }
            try {
                proceduresRs = proceduresStmt.executeQuery();
                if (this.val$returnProcedures) {
                    DatabaseMetaData.this.convertToJdbcProcedureList(true, proceduresRs, this.val$procedureRowsToSort);
                }
                if (this.val$returnFunctions) {
                    DatabaseMetaData.this.convertToJdbcFunctionList(proceduresRs, this.val$procedureRowsToSort, this.val$fields);
                }
            }
            catch (SQLException sqlEx) {
                String sql;
                if (this.val$returnFunctions) {
                    proceduresStmt.close();
                    sql = "SHOW FUNCTION STATUS WHERE " + (this.val$dbMapsToSchema ? "Db LIKE ?" : "Db = ?");
                    if (this.val$procedureNamePattern != null && this.val$procedureNamePattern.length() > 0) {
                        sql = sql + " AND Name LIKE ?";
                    }
                    proceduresStmt = DatabaseMetaData.this.prepareMetaDataSafeStatement(sql);
                    proceduresStmt.setString(1, dbPattern);
                    if (this.val$procedureNamePattern != null && this.val$procedureNamePattern.length() > 0) {
                        proceduresStmt.setString(2, this.val$procedureNamePattern);
                    }
                    proceduresRs = proceduresStmt.executeQuery();
                    DatabaseMetaData.this.convertToJdbcFunctionList(proceduresRs, this.val$procedureRowsToSort, this.val$fields);
                }
                if (this.val$returnProcedures) {
                    proceduresStmt.close();
                    sql = "SHOW PROCEDURE STATUS WHERE " + (this.val$dbMapsToSchema ? "Db LIKE ?" : "Db = ?");
                    if (this.val$procedureNamePattern != null && this.val$procedureNamePattern.length() > 0) {
                        sql = sql + " AND Name LIKE ?";
                    }
                    proceduresStmt = DatabaseMetaData.this.prepareMetaDataSafeStatement(sql);
                    proceduresStmt.setString(1, dbPattern);
                    if (this.val$procedureNamePattern != null && this.val$procedureNamePattern.length() > 0) {
                        proceduresStmt.setString(2, this.val$procedureNamePattern);
                    }
                    proceduresRs = proceduresStmt.executeQuery();
                    DatabaseMetaData.this.convertToJdbcProcedureList(false, proceduresRs, this.val$procedureRowsToSort);
                }
            }
        }
        finally {
            SQLException rethrowSqlEx = null;
            if (proceduresRs != null) {
                try {
                    proceduresRs.close();
                }
                catch (SQLException sqlEx) {
                    rethrowSqlEx = sqlEx;
                }
            }
            if (proceduresStmt != null) {
                try {
                    proceduresStmt.close();
                }
                catch (SQLException sqlEx) {
                    rethrowSqlEx = sqlEx;
                }
            }
            if (rethrowSqlEx != null) {
                throw rethrowSqlEx;
            }
        }
    }
}
