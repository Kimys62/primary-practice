/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.Messages;
import com.mysql.cj.conf.PropertyDefinitions;
import com.mysql.cj.exceptions.AssertionFailedException;
import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.jdbc.exceptions.SQLError;
import com.mysql.cj.protocol.a.result.ByteArrayRow;
import com.mysql.cj.util.StringUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

class DatabaseMetaData.2
extends IterateBlock<String> {
    final /* synthetic */ boolean val$dbMapsToSchema;
    final /* synthetic */ String val$tableNamePattern;
    final /* synthetic */ String val$schemaPattern;
    final /* synthetic */ String val$colPattern;
    final /* synthetic */ Statement val$stmt;
    final /* synthetic */ ArrayList val$rows;

    DatabaseMetaData.2(DatabaseMetaData.IteratorWithCleanup i, boolean bl, String string, String string2, String string3, Statement statement, ArrayList arrayList) {
        this.val$dbMapsToSchema = bl;
        this.val$tableNamePattern = string;
        this.val$schemaPattern = string2;
        this.val$colPattern = string3;
        this.val$stmt = statement;
        this.val$rows = arrayList;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbStr) throws SQLException {
        ArrayList<String> tableNameList = new ArrayList<String>();
        ResultSet tables = null;
        try {
            ResultSet resultSet = tables = this.val$dbMapsToSchema ? DatabaseMetaData.this.getTables(null, dbStr, this.val$tableNamePattern, new String[0]) : DatabaseMetaData.this.getTables(dbStr, this.val$schemaPattern, this.val$tableNamePattern, new String[0]);
            while (tables.next()) {
                String tableNameFromList = tables.getString("TABLE_NAME");
                tableNameList.add(tableNameFromList);
            }
        }
        finally {
            if (tables != null) {
                try {
                    tables.close();
                }
                catch (Exception sqlEx) {
                    AssertionFailedException.shouldNotHappen(sqlEx);
                }
                tables = null;
            }
        }
        for (String tableName : tableNameList) {
            ResultSet results = null;
            try {
                StringBuilder queryBuf = new StringBuilder("SHOW FULL COLUMNS FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(tableName, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                queryBuf.append(" FROM ");
                queryBuf.append(StringUtils.quoteIdentifier(dbStr, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                if (this.val$colPattern != null) {
                    queryBuf.append(" LIKE ");
                    queryBuf.append(StringUtils.quoteIdentifier(this.val$colPattern, "'", true));
                }
                boolean fixUpOrdinalsRequired = false;
                HashMap<String, Integer> ordinalFixUpMap = null;
                if (this.val$colPattern != null && !this.val$colPattern.equals("%")) {
                    fixUpOrdinalsRequired = true;
                    StringBuilder fullColumnQueryBuf = new StringBuilder("SHOW FULL COLUMNS FROM ");
                    fullColumnQueryBuf.append(StringUtils.quoteIdentifier(tableName, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                    fullColumnQueryBuf.append(" FROM ");
                    fullColumnQueryBuf.append(StringUtils.quoteIdentifier(dbStr, DatabaseMetaData.this.quotedId, DatabaseMetaData.this.pedantic));
                    results = this.val$stmt.executeQuery(fullColumnQueryBuf.toString());
                    ordinalFixUpMap = new HashMap<String, Integer>();
                    int fullOrdinalPos = 1;
                    while (results.next()) {
                        String fullOrdColName = results.getString("Field");
                        ordinalFixUpMap.put(fullOrdColName, fullOrdinalPos++);
                    }
                    results.close();
                }
                results = this.val$stmt.executeQuery(queryBuf.toString());
                int ordPos = 1;
                while (results.next()) {
                    DatabaseMetaData.TypeDescriptor typeDesc = new DatabaseMetaData.TypeDescriptor(DatabaseMetaData.this, results.getString("Type"), results.getString("Null"));
                    byte[][] rowVal = new byte[24][];
                    rowVal[0] = DatabaseMetaData.this.databaseTerm.getValue() == PropertyDefinitions.DatabaseTerm.SCHEMA ? DatabaseMetaData.this.s2b("def") : DatabaseMetaData.this.s2b(dbStr);
                    rowVal[1] = DatabaseMetaData.this.databaseTerm.getValue() == PropertyDefinitions.DatabaseTerm.SCHEMA ? DatabaseMetaData.this.s2b(dbStr) : null;
                    rowVal[2] = DatabaseMetaData.this.s2b(tableName);
                    rowVal[3] = results.getBytes("Field");
                    rowVal[4] = Short.toString((short)typeDesc.mysqlType.getJdbcType()).getBytes();
                    rowVal[5] = DatabaseMetaData.this.s2b(typeDesc.mysqlType.getName());
                    if (typeDesc.columnSize == null) {
                        rowVal[6] = null;
                    } else {
                        String collation = results.getString("Collation");
                        int mbminlen = 1;
                        if (collation != null) {
                            if (collation.indexOf("ucs2") > -1 || collation.indexOf("utf16") > -1) {
                                mbminlen = 2;
                            } else if (collation.indexOf("utf32") > -1) {
                                mbminlen = 4;
                            }
                        }
                        rowVal[6] = mbminlen == 1 ? DatabaseMetaData.this.s2b(typeDesc.columnSize.toString()) : DatabaseMetaData.this.s2b(Integer.valueOf(typeDesc.columnSize / mbminlen).toString());
                    }
                    rowVal[7] = DatabaseMetaData.this.s2b(Integer.toString(typeDesc.bufferLength));
                    rowVal[8] = typeDesc.decimalDigits == null ? null : DatabaseMetaData.this.s2b(typeDesc.decimalDigits.toString());
                    rowVal[9] = DatabaseMetaData.this.s2b(Integer.toString(typeDesc.numPrecRadix));
                    rowVal[10] = DatabaseMetaData.this.s2b(Integer.toString(typeDesc.nullability));
                    try {
                        rowVal[11] = results.getBytes("Comment");
                    }
                    catch (Exception E) {
                        rowVal[11] = new byte[0];
                    }
                    rowVal[12] = results.getBytes("Default");
                    rowVal[13] = new byte[]{48};
                    rowVal[14] = new byte[]{48};
                    rowVal[15] = (byte[])(StringUtils.indexOfIgnoreCase(typeDesc.mysqlType.getName(), "CHAR") != -1 || StringUtils.indexOfIgnoreCase(typeDesc.mysqlType.getName(), "BLOB") != -1 || StringUtils.indexOfIgnoreCase(typeDesc.mysqlType.getName(), "TEXT") != -1 || StringUtils.indexOfIgnoreCase(typeDesc.mysqlType.getName(), "ENUM") != -1 || StringUtils.indexOfIgnoreCase(typeDesc.mysqlType.getName(), "SET") != -1 || StringUtils.indexOfIgnoreCase(typeDesc.mysqlType.getName(), "BINARY") != -1 ? rowVal[6] : null);
                    if (!fixUpOrdinalsRequired) {
                        rowVal[16] = Integer.toString(ordPos++).getBytes();
                    } else {
                        String origColName = results.getString("Field");
                        Integer realOrdinal = (Integer)ordinalFixUpMap.get(origColName);
                        if (realOrdinal != null) {
                            rowVal[16] = realOrdinal.toString().getBytes();
                        } else {
                            throw SQLError.createSQLException(Messages.getString("DatabaseMetaData.10"), "S1000", DatabaseMetaData.this.getExceptionInterceptor());
                        }
                    }
                    rowVal[17] = DatabaseMetaData.this.s2b(typeDesc.isNullable);
                    rowVal[18] = null;
                    rowVal[19] = null;
                    rowVal[20] = null;
                    rowVal[21] = null;
                    rowVal[22] = DatabaseMetaData.this.s2b("");
                    String extra = results.getString("Extra");
                    if (extra != null) {
                        rowVal[22] = DatabaseMetaData.this.s2b(StringUtils.indexOfIgnoreCase(extra, "auto_increment") != -1 ? "YES" : "NO");
                        rowVal[23] = DatabaseMetaData.this.s2b(StringUtils.indexOfIgnoreCase(extra, "generated") != -1 ? "YES" : "NO");
                    }
                    this.val$rows.add(new ByteArrayRow(rowVal, DatabaseMetaData.this.getExceptionInterceptor()));
                }
            }
            finally {
                if (results == null) continue;
                try {
                    results.close();
                }
                catch (Exception exception) {}
                results = null;
            }
        }
    }
}
