/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

public static enum Resultset.Type {
    FORWARD_ONLY(1003),
    SCROLL_INSENSITIVE(1004),
    SCROLL_SENSITIVE(1005);

    private int value;

    private Resultset.Type(int jdbcRsType) {
        this.value = jdbcRsType;
    }

    public int getIntValue() {
        return this.value;
    }

    public static Resultset.Type fromValue(int rsType, Resultset.Type backupValue) {
        for (Resultset.Type t : Resultset.Type.values()) {
            if (t.getIntValue() != rsType) continue;
            return t;
        }
        return backupValue;
    }
}
