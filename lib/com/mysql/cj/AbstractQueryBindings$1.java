/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.MysqlType;

static class AbstractQueryBindings.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$MysqlType;

    static {
        $SwitchMap$com$mysql$cj$MysqlType = new int[MysqlType.values().length];
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DATETIME.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIMESTAMP.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.YEAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.CHAR.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARCHAR.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYTEXT.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TEXT.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMTEXT.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGTEXT.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TIME.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BOOLEAN.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIT.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYINT_UNSIGNED.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SMALLINT.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SMALLINT_UNSIGNED.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMINT.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMINT_UNSIGNED.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.INT.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.INT_UNSIGNED.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIGINT.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BIGINT_UNSIGNED.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT_UNSIGNED.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE_UNSIGNED.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DECIMAL.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DECIMAL_UNSIGNED.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.ENUM.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.SET.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.JSON.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BINARY.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.GEOMETRY.ordinal()] = 34;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.VARBINARY.ordinal()] = 35;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TINYBLOB.ordinal()] = 36;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BLOB.ordinal()] = 37;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMBLOB.ordinal()] = 38;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGBLOB.ordinal()] = 39;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractQueryBindings.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.UNKNOWN.ordinal()] = 40;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
