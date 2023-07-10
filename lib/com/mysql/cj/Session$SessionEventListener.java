/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

public static interface Session.SessionEventListener {
    public void handleNormalClose();

    public void handleReconnect();

    public void handleCleanup(Throwable var1);
}
