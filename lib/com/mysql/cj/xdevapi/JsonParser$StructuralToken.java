/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

static enum JsonParser.StructuralToken {
    LSQBRACKET('['),
    RSQBRACKET(']'),
    LCRBRACKET('{'),
    RCRBRACKET('}'),
    COLON(':'),
    COMMA(',');

    public final char CHAR;

    private JsonParser.StructuralToken(char character) {
        this.CHAR = character;
    }
}
