/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import com.mysql.cj.conf.PropertyDefinitions;

static class XAuthenticationProvider.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$conf$PropertyDefinitions$AuthMech;

    static {
        $SwitchMap$com$mysql$cj$conf$PropertyDefinitions$AuthMech = new int[PropertyDefinitions.AuthMech.values().length];
        try {
            XAuthenticationProvider.1.$SwitchMap$com$mysql$cj$conf$PropertyDefinitions$AuthMech[PropertyDefinitions.AuthMech.SHA256_MEMORY.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XAuthenticationProvider.1.$SwitchMap$com$mysql$cj$conf$PropertyDefinitions$AuthMech[PropertyDefinitions.AuthMech.MYSQL41.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XAuthenticationProvider.1.$SwitchMap$com$mysql$cj$conf$PropertyDefinitions$AuthMech[PropertyDefinitions.AuthMech.PLAIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XAuthenticationProvider.1.$SwitchMap$com$mysql$cj$conf$PropertyDefinitions$AuthMech[PropertyDefinitions.AuthMech.EXTERNAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
