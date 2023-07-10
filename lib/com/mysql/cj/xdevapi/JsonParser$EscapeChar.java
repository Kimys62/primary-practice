/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

static enum JsonParser.EscapeChar {
    QUOTE('\"', "\\\""),
    RSOLIDUS('\\', "\\\\"),
    SOLIDUS('/', "\\/"),
    BACKSPACE('\b', "\\b"),
    FF('\f', "\\f"),
    LF('\n', "\\n"),
    CR('\r', "\\r"),
    TAB('\t', "\\t");

    public final char CHAR;
    public final String ESCAPED;

    private JsonParser.EscapeChar(char character, String escaped) {
        this.CHAR = character;
        this.ESCAPED = escaped;
    }
}
