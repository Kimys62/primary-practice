/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

public static interface Protocol.ProtocolEventListener {
    public void handleEvent(EventType var1, Object var2, Throwable var3);

    public static enum EventType {
        SERVER_SHUTDOWN,
        SERVER_CLOSED_SESSION;

    }
}
