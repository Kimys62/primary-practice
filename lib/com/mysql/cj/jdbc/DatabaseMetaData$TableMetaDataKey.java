/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

protected class DatabaseMetaData.TableMetaDataKey
implements Comparable<DatabaseMetaData.TableMetaDataKey> {
    String tableType;
    String tableCat;
    String tableSchem;
    String tableName;

    DatabaseMetaData.TableMetaDataKey(String tableType, String tableCat, String tableSchem, String tableName) {
        this.tableType = tableType == null ? "" : tableType;
        this.tableCat = tableCat == null ? "" : tableCat;
        this.tableSchem = tableSchem == null ? "" : tableSchem;
        this.tableName = tableName == null ? "" : tableName;
    }

    @Override
    public int compareTo(DatabaseMetaData.TableMetaDataKey tablesKey) {
        int compareResult = this.tableType.compareTo(tablesKey.tableType);
        if (compareResult != 0) {
            return compareResult;
        }
        compareResult = this.tableCat.compareTo(tablesKey.tableCat);
        if (compareResult != 0) {
            return compareResult;
        }
        compareResult = this.tableSchem.compareTo(tablesKey.tableSchem);
        if (compareResult != 0) {
            return compareResult;
        }
        return this.tableName.compareTo(tablesKey.tableName);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatabaseMetaData.TableMetaDataKey)) {
            return false;
        }
        return this.compareTo((DatabaseMetaData.TableMetaDataKey)obj) == 0;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 0;
    }
}
