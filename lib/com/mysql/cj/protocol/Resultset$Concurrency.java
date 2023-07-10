/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

public static enum Resultset.Concurrency {
    READ_ONLY(1007),
    UPDATABLE(1008);

    private int value;

    private Resultset.Concurrency(int jdbcRsConcur) {
        this.value = jdbcRsConcur;
    }

    public int getIntValue() {
        return this.value;
    }

    public static Resultset.Concurrency fromValue(int concurMode, Resultset.Concurrency backupValue) {
        for (Resultset.Concurrency c : Resultset.Concurrency.values()) {
            if (c.getIntValue() != concurMode) continue;
            return c;
        }
        return backupValue;
    }
}
