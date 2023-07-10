/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.protocol.Protocol;

static class ClientImpl.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$protocol$Protocol$ProtocolEventListener$EventType;

    static {
        $SwitchMap$com$mysql$cj$protocol$Protocol$ProtocolEventListener$EventType = new int[Protocol.ProtocolEventListener.EventType.values().length];
        try {
            ClientImpl.1.$SwitchMap$com$mysql$cj$protocol$Protocol$ProtocolEventListener$EventType[Protocol.ProtocolEventListener.EventType.SERVER_SHUTDOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ClientImpl.1.$SwitchMap$com$mysql$cj$protocol$Protocol$ProtocolEventListener$EventType[Protocol.ProtocolEventListener.EventType.SERVER_CLOSED_SESSION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
