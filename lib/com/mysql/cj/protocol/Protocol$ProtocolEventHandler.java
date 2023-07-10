/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import com.mysql.cj.protocol.Protocol;

public static interface Protocol.ProtocolEventHandler {
    public void addListener(Protocol.ProtocolEventListener var1);

    public void removeListener(Protocol.ProtocolEventListener var1);

    public void invokeListeners(Protocol.ProtocolEventListener.EventType var1, Throwable var2);
}
