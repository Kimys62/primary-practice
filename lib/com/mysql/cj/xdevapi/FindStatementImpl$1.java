/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.Statement;

static class FindStatementImpl.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$xdevapi$Statement$LockContention;

    static {
        $SwitchMap$com$mysql$cj$xdevapi$Statement$LockContention = new int[Statement.LockContention.values().length];
        try {
            FindStatementImpl.1.$SwitchMap$com$mysql$cj$xdevapi$Statement$LockContention[Statement.LockContention.NOWAIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FindStatementImpl.1.$SwitchMap$com$mysql$cj$xdevapi$Statement$LockContention[Statement.LockContention.SKIP_LOCKED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FindStatementImpl.1.$SwitchMap$com$mysql$cj$xdevapi$Statement$LockContention[Statement.LockContention.DEFAULT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
