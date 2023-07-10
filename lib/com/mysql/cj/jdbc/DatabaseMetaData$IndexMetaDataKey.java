/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

protected class DatabaseMetaData.IndexMetaDataKey
implements Comparable<DatabaseMetaData.IndexMetaDataKey> {
    Boolean columnNonUnique;
    Short columnType;
    String columnIndexName;
    Short columnOrdinalPosition;

    DatabaseMetaData.IndexMetaDataKey(boolean columnNonUnique, short columnType, String columnIndexName, short columnOrdinalPosition) {
        this.columnNonUnique = columnNonUnique;
        this.columnType = columnType;
        this.columnIndexName = columnIndexName;
        this.columnOrdinalPosition = columnOrdinalPosition;
    }

    @Override
    public int compareTo(DatabaseMetaData.IndexMetaDataKey indexInfoKey) {
        int compareResult = this.columnNonUnique.compareTo(indexInfoKey.columnNonUnique);
        if (compareResult != 0) {
            return compareResult;
        }
        compareResult = this.columnType.compareTo(indexInfoKey.columnType);
        if (compareResult != 0) {
            return compareResult;
        }
        compareResult = this.columnIndexName.compareTo(indexInfoKey.columnIndexName);
        if (compareResult != 0) {
            return compareResult;
        }
        return this.columnOrdinalPosition.compareTo(indexInfoKey.columnOrdinalPosition);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatabaseMetaData.IndexMetaDataKey)) {
            return false;
        }
        return this.compareTo((DatabaseMetaData.IndexMetaDataKey)obj) == 0;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 0;
    }
}
