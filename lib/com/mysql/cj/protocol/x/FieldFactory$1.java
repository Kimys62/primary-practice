/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import com.mysql.cj.MysqlType;
import com.mysql.cj.x.protobuf.MysqlxResultset;

static class FieldFactory.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$MysqlType;
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType;

    static {
        $SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType = new int[MysqlxResultset.ColumnMetaData.FieldType.values().length];
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.SINT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.UINT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.FLOAT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.DOUBLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.DECIMAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.BYTES.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.TIME.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.DATETIME.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.SET.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.ENUM.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxResultset$ColumnMetaData$FieldType[MysqlxResultset.ColumnMetaData.FieldType.BIT.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$com$mysql$cj$MysqlType = new int[MysqlType.values().length];
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.FLOAT_UNSIGNED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FieldFactory.1.$SwitchMap$com$mysql$cj$MysqlType[MysqlType.DOUBLE_UNSIGNED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
