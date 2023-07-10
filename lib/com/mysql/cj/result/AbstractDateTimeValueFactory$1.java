/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.result;

import com.mysql.cj.conf.PropertyDefinitions;

static class AbstractDateTimeValueFactory.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$conf$PropertyDefinitions$ZeroDatetimeBehavior;

    static {
        $SwitchMap$com$mysql$cj$conf$PropertyDefinitions$ZeroDatetimeBehavior = new int[PropertyDefinitions.ZeroDatetimeBehavior.values().length];
        try {
            AbstractDateTimeValueFactory.1.$SwitchMap$com$mysql$cj$conf$PropertyDefinitions$ZeroDatetimeBehavior[PropertyDefinitions.ZeroDatetimeBehavior.CONVERT_TO_NULL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AbstractDateTimeValueFactory.1.$SwitchMap$com$mysql$cj$conf$PropertyDefinitions$ZeroDatetimeBehavior[PropertyDefinitions.ZeroDatetimeBehavior.ROUND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
