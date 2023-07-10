/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.exceptions.AssertionFailedException;
import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.IterateBlock;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class DatabaseMetaData.4
extends IterateBlock<String> {
    final /* synthetic */ String val$table;
    final /* synthetic */ ArrayList val$rows;

    DatabaseMetaData.4(DatabaseMetaData.IteratorWithCleanup i, String string, ArrayList arrayList) {
        this.val$table = string;
        this.val$rows = arrayList;
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
            String tableNameWithCase = DatabaseMetaData.this.getTableNameWithCase(this.val$table);
            while (fkresults.next()) {
                StringTokenizer commentTokens;
                String comment;
                String tableType = fkresults.getString("Type");
                if (tableType == null || !tableType.equalsIgnoreCase("innodb") && !tableType.equalsIgnoreCase(DatabaseMetaData.SUPPORTS_FK) || (comment = fkresults.getString("Comment").trim()) == null || !(commentTokens = new StringTokenizer(comment, ";", false)).hasMoreTokens()) continue;
                commentTokens.nextToken();
                while (commentTokens.hasMoreTokens()) {
                    String keysComment = commentTokens.nextToken();
                    DatabaseMetaData.this.populateKeyResults(dbStr, tableNameWithCase, keysComment, this.val$rows, fkresults.getString("Name"), true);
                }
            }
        }
        finally {
            if (fkresults != null) {
                try {
                    fkresults.close();
                }
                catch (SQLException sqlEx) {
                    AssertionFailedException.shouldNotHappen(sqlEx);
                }
                fkresults = null;
            }
        }
    }
}
