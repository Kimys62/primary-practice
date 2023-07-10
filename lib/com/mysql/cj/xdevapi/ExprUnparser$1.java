/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;

static class ExprUnparser.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type;
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type;
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type;

    static {
        $SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type = new int[MysqlxExpr.Expr.Type.values().length];
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.LITERAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.IDENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.FUNC_CALL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.OPERATOR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.PLACEHOLDER.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.ARRAY.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$Expr$Type[MysqlxExpr.Expr.Type.OBJECT.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type = new int[MysqlxExpr.DocumentPathItem.Type.values().length];
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type[MysqlxExpr.DocumentPathItem.Type.MEMBER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type[MysqlxExpr.DocumentPathItem.Type.MEMBER_ASTERISK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type[MysqlxExpr.DocumentPathItem.Type.ARRAY_INDEX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type[MysqlxExpr.DocumentPathItem.Type.ARRAY_INDEX_ASTERISK.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxExpr$DocumentPathItem$Type[MysqlxExpr.DocumentPathItem.Type.DOUBLE_ASTERISK.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type = new int[MysqlxDatatypes.Scalar.Type.values().length];
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type[MysqlxDatatypes.Scalar.Type.V_SINT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type[MysqlxDatatypes.Scalar.Type.V_OCTETS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type[MysqlxDatatypes.Scalar.Type.V_STRING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type[MysqlxDatatypes.Scalar.Type.V_DOUBLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type[MysqlxDatatypes.Scalar.Type.V_BOOL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprUnparser.1.$SwitchMap$com$mysql$cj$x$protobuf$MysqlxDatatypes$Scalar$Type[MysqlxDatatypes.Scalar.Type.V_NULL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
