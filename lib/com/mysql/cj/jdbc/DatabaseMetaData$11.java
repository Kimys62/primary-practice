/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.DatabaseMetaData;

static class DatabaseMetaData.11 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$MysqlType;
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType;

    static {
        $SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType = new int[DatabaseMetaData.TableType.values().length];
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType[DatabaseMetaData.TableType.TABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType[DatabaseMetaData.TableType.VIEW.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType[DatabaseMetaData.TableType.SYSTEM_TABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType[DatabaseMetaData.TableType.SYSTEM_VIEW.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$jdbc$DatabaseMetaData$TableType[DatabaseMetaData.TableType.LOCAL_TEMPORARY.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$com$mysql$cj$MysqlType = new int[MysqlType.values().length];
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DECIMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DECIMAL_UNSIGNED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE_UNSIGNED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.ENUM.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SET.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT_UNSIGNED.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.CHAR.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARCHAR.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYTEXT.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMTEXT.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGTEXT.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.JSON.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TEXT.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYBLOB.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMBLOB.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGBLOB.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BLOB.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BINARY.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARBINARY.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIT.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT_UNSIGNED.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATE.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIME.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATETIME.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIMESTAMP.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BOOLEAN.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.GEOMETRY.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.NULL.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.UNKNOWN.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DatabaseMetaData.11.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.YEAR.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
