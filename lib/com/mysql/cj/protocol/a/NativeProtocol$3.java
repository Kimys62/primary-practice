/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a;

import com.mysql.cj.conf.PropertyKey;

static class NativeProtocol.3 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$conf$PropertyKey;

    static {
        $SwitchMap$com$mysql$cj$conf$PropertyKey = new int[PropertyKey.values().length];
        try {
            NativeProtocol.3.$SwitchMap$com$mysql$cj$conf$PropertyKey[PropertyKey.maintainTimeStats.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativeProtocol.3.$SwitchMap$com$mysql$cj$conf$PropertyKey[PropertyKey.traceProtocol.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativeProtocol.3.$SwitchMap$com$mysql$cj$conf$PropertyKey[PropertyKey.enablePacketDebug.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
