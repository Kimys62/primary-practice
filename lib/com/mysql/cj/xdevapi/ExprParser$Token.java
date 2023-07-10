/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.ExprParser;

static class ExprParser.Token {
    ExprParser.TokenType type;
    String value;

    public ExprParser.Token(ExprParser.TokenType x, char c) {
        this.type = x;
        this.value = new String(new char[]{c});
    }

    public ExprParser.Token(ExprParser.TokenType t, String v) {
        this.type = t;
        this.value = v;
    }

    public String toString() {
        if (this.type == ExprParser.TokenType.IDENT || this.type == ExprParser.TokenType.LNUM_INT || this.type == ExprParser.TokenType.LNUM_DOUBLE || this.type == ExprParser.TokenType.LSTRING) {
            return this.type.toString() + "(" + this.value + ")";
        }
        return this.type.toString();
    }
}
