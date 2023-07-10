/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

protected static enum DatabaseMetaData.TableType {
    LOCAL_TEMPORARY("LOCAL TEMPORARY"),
    SYSTEM_TABLE("SYSTEM TABLE"),
    SYSTEM_VIEW("SYSTEM VIEW"),
    TABLE("TABLE", new String[]{"BASE TABLE"}),
    VIEW("VIEW"),
    UNKNOWN("UNKNOWN");

    private String name;
    private byte[] nameAsBytes;
    private String[] synonyms;

    private DatabaseMetaData.TableType(String tableTypeName) {
        this(tableTypeName, null);
    }

    private DatabaseMetaData.TableType(String tableTypeName, String[] tableTypeSynonyms) {
        this.name = tableTypeName;
        this.nameAsBytes = tableTypeName.getBytes();
        this.synonyms = tableTypeSynonyms;
    }

    String getName() {
        return this.name;
    }

    byte[] asBytes() {
        return this.nameAsBytes;
    }

    boolean equalsTo(String tableTypeName) {
        return this.name.equalsIgnoreCase(tableTypeName);
    }

    static DatabaseMetaData.TableType getTableTypeEqualTo(String tableTypeName) {
        for (DatabaseMetaData.TableType tableType : DatabaseMetaData.TableType.values()) {
            if (!tableType.equalsTo(tableTypeName)) continue;
            return tableType;
        }
        return UNKNOWN;
    }

    boolean compliesWith(String tableTypeName) {
        if (this.equalsTo(tableTypeName)) {
            return true;
        }
        if (this.synonyms != null) {
            for (String synonym : this.synonyms) {
                if (!synonym.equalsIgnoreCase(tableTypeName)) continue;
                return true;
            }
        }
        return false;
    }

    static DatabaseMetaData.TableType getTableTypeCompliantWith(String tableTypeName) {
        for (DatabaseMetaData.TableType tableType : DatabaseMetaData.TableType.values()) {
            if (!tableType.compliesWith(tableTypeName)) continue;
            return tableType;
        }
        return UNKNOWN;
    }
}
