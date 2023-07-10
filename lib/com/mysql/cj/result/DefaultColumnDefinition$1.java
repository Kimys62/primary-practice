/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.result;

import com.mysql.cj.MysqlType;

static class DefaultColumnDefinition.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$MysqlType;

    static {
        $SwitchMap$com$mysql$cj$MysqlType = new int[MysqlType.values().length];
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.BLOB.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMBLOB.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGBLOB.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.TEXT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.MEDIUMTEXT.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.LONGTEXT.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DefaultColumnDefinition.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.JSON.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
