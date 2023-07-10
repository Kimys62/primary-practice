/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.exceptions.AssertionFailedException;
import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.protocol.a.result.ByteArrayRow;
import com.mysql.cj.util.StringUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

class DatabaseMetaData.3
extends IterateBlock<String> {
    final /* synthetic */ String val$foreignTable;
    final /* synthetic */ String val$primaryTable;
    final /* synthetic */ boolean val$dbMapsToSchema;
    final /* synthetic */ ArrayList val$tuples;

    DatabaseMetaData.3(DatabaseMetaData.IteratorWithCleanup i, String string, String string2, boolean bl, ArrayList arrayList) {
        this.val$foreignTable = string;
        this.val$primaryTable = string2;
        this.val$dbMapsToSchema = bl;
        this.val$tuples = arrayList;
        super(i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void forEach(String dbStr) throws SQLException {
        ResultSet fkresults = null;
        try {
            fkresults = DatabaseMetaData.this.extractForeignKeyFromCreateTable(dbStr, null);
            String foreignTableWithCase = DatabaseMetaData.this.getTableNameWithCase(this.val$foreignTable);
            String primaryTableWithCase = DatabaseMetaData.this.getTableNameWithCase(this.val$primaryTable);
            while (fkresults.next()) {
                String comment;
                String tableType = fkresults.getString("Type");
                if (tableType == null || !tableType.equalsIgnoreCase("innodb") && !tableType.equalsIgnoreCase(DatabaseMetaData.SUPPORTS_FK) || (comment = fkresults.getString("Comment").trim()) == null) continue;
                StringTokenizer commentTokens = new StringTokenizer(comment, ";", false);
                if (commentTokens.hasMoreTokens()) {
                    String string = commentTokens.nextToken();
                }
                while (commentTokens.hasMoreTokens()) {
                    String keys = commentTokens.nextToken();
                    DatabaseMetaData.LocalAndReferencedColumns parsedInfo = DatabaseMetaData.this.parseTableStatusIntoLocalAndReferencedColumns(keys);
                    int keySeq = 1;
                    Iterator<String> referencingColumns = parsedInfo.localColumnsList.iterator();
                    Iterator<String> referencedColumns = parsedInfo.referencedColumnsList.iterator();
                    while (referencingColumns.hasNext()) {
                        String referencingColumn = StringUtils.unQuoteIdentifier(referencingColumns.next(), DatabaseMetaData.this.quotedId);
                        String dummy = fkresults.getString("Name");
                        if (dummy.compareTo(foreignTableWithCase) != 0 || parsedInfo.referencedTable.compareTo(primaryTableWithCase) != 0) continue;
                        byte[][] tuple = new byte[14][];
                        tuple[0] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b("def") : DatabaseMetaData.this.s2b(parsedInfo.referencedDatabase);
                        tuple[1] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b(parsedInfo.referencedDatabase) : null;
                        tuple[2] = DatabaseMetaData.this.s2b(parsedInfo.referencedTable);
                        tuple[3] = DatabaseMetaData.this.s2b(StringUtils.unQuoteIdentifier(referencedColumns.next(), DatabaseMetaData.this.quotedId));
                        tuple[4] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b("def") : DatabaseMetaData.this.s2b(dbStr);
                        tuple[5] = this.val$dbMapsToSchema ? DatabaseMetaData.this.s2b(dbStr) : null;
                        tuple[6] = DatabaseMetaData.this.s2b(dummy);
                        tuple[7] = DatabaseMetaData.this.s2b(referencingColumn);
                        tuple[8] = Integer.toString(keySeq).getBytes();
                        int[] actions = DatabaseMetaData.this.getForeignKeyActions(keys);
                        tuple[9] = Integer.toString(actions[1]).getBytes();
                        tuple[10] = Integer.toString(actions[0]).getBytes();
                        tuple[11] = DatabaseMetaData.this.s2b(parsedInfo.constraintName);
                        tuple[12] = null;
                        tuple[13] = Integer.toString(7).getBytes();
                        this.val$tuples.add(new ByteArrayRow(tuple, DatabaseMetaData.this.getExceptionInterceptor()));
                        ++keySeq;
                    }
                }
            }
        }
        finally {
            if (fkresults != null) {
                try {
                    fkresults.close();
                }
                catch (Exception sqlEx) {
                    AssertionFailedException.shouldNotHappen(sqlEx);
                }
                fkresults = null;
            }
        }
    }
}
