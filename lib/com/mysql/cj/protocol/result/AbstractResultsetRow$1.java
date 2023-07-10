/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.result;

import com.mysql.cj.MysqlType;

static class AbstractResultsetRow.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$MysqlType;

    static {
        $SwitchMap$com$mysql$cj$MysqlType = new int[MysqlType.values().length];
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT_UNSIGNED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SMALLINT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.YEAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SMALLINT_UNSIGNED.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.INT.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMINT.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.INT_UNSIGNED.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMINT_UNSIGNED.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIGINT.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIGINT_UNSIGNED.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT_UNSIGNED.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE_UNSIGNED.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DECIMAL.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DECIMAL_UNSIGNED.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BOOLEAN.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARBINARY.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARCHAR.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BINARY.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.CHAR.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYBLOB.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BLOB.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMBLOB.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGBLOB.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYTEXT.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TEXT.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMTEXT.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGTEXT.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.JSON.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.ENUM.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SET.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.GEOMETRY.ordinal()] = 34;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.UNKNOWN.ordinal()] = 35;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIT.ordinal()] = 36;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATETIME.ordinal()] = 37;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIMESTAMP.ordinal()] = 38;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATE.ordinal()] = 39;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIME.ordinal()] = 40;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractResultsetRow.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.NULL.ordinal()] = 41;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
