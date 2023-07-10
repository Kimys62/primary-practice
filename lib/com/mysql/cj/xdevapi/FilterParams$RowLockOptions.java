/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

public static enum FilterParams.RowLockOptions {
    NOWAIT(1),
    SKIP_LOCKED(2);

    private int rowLockOption;

    private FilterParams.RowLockOptions(int rowLockOption) {
        this.rowLockOption = rowLockOption;
    }

    public int asNumber() {
        return this.rowLockOption;
    }
}
