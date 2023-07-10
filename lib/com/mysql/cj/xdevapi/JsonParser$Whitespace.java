/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

static enum JsonParser.Whitespace {
    TAB('\t'),
    LF('\n'),
    CR('\r'),
    SPACE(' ');

    public final char CHAR;

    private JsonParser.Whitespace(char character) {
        this.CHAR = character;
    }
}
