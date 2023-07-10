/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.conf.ConnectionUrl;

static class NonRegisteringDriver.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type;

    static {
        $SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type = new int[ConnectionUrl.Type.values().length];
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.SINGLE_CONNECTION.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.FAILOVER_CONNECTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.FAILOVER_DNS_SRV_CONNECTION.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.LOADBALANCE_CONNECTION.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.LOADBALANCE_DNS_SRV_CONNECTION.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.REPLICATION_CONNECTION.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NonRegisteringDriver.1.$SwitchMap$com$mysql$cj$conf$ConnectionUrl$Type[ConnectionUrl.Type.REPLICATION_DNS_SRV_CONNECTION.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
