/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.ExprParser;

static class ExprParser.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType;

    static {
        $SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType = new int[ExprParser.TokenType.values().length];
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.EROTEME.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.COLON.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LPAREN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LCURLY.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LSQBRACKET.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.CAST.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.PLUS.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.MINUS.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.NOT.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.NEG.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.BANG.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LSTRING.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.NULL.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LNUM_INT.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LNUM_DOUBLE.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.TRUE.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.FALSE.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.DOLLAR.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.STAR.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.IDENT.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.IS.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.IN.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.LIKE.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.BETWEEN.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.REGEXP.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ExprParser.1.$SwitchMap$com$mysql$cj$xdevapi$ExprParser$TokenType[ExprParser.TokenType.OVERLAPS.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
