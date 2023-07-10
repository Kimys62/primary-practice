/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import java.util.List;

class DatabaseMetaData.LocalAndReferencedColumns {
    String constraintName;
    List<String> localColumnsList;
    String referencedDatabase;
    List<String> referencedColumnsList;
    String referencedTable;

    DatabaseMetaData.LocalAndReferencedColumns(List<String> localColumns, List<String> refColumns, String constName, String refDatabase, String refTable) {
        this.localColumnsList = localColumns;
        this.referencedColumnsList = refColumns;
        this.constraintName = constName;
        this.referencedTable = refTable;
        this.referencedDatabase = refDatabase;
    }
}
