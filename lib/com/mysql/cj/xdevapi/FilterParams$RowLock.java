/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

public static enum FilterParams.RowLock {
    SHARED_LOCK(1),
    EXCLUSIVE_LOCK(2);

    private int rowLock;

    private FilterParams.RowLock(int rowLock) {
        this.rowLock = rowLock;
    }

    public int asNumber() {
        return this.rowLock;
    }
}
