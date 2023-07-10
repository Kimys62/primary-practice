/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc.result;

import com.mysql.cj.MysqlType;

static class ResultSetMetaData.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$MysqlType;

    static {
        $SwitchMap$com$mysql$cj$MysqlType = new int[MysqlType.values().length];
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.YEAR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYBLOB.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BLOB.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMBLOB.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGBLOB.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIT.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT_UNSIGNED.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SMALLINT.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SMALLINT_UNSIGNED.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.INT.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.INT_UNSIGNED.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMINT.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMINT_UNSIGNED.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIGINT.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIGINT_UNSIGNED.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT_UNSIGNED.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE_UNSIGNED.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATE.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIME.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIMESTAMP.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATETIME.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.CHAR.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARCHAR.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYTEXT.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TEXT.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMTEXT.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGTEXT.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.JSON.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.ENUM.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResultSetMetaData.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SET.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
