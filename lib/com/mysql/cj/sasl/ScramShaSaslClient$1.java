/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.sasl;

import com.mysql.cj.sasl.ScramShaSaslClient;

static class ScramShaSaslClient.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$sasl$ScramShaSaslClient$ScramExchangeStage;

    static {
        $SwitchMap$com$mysql$cj$sasl$ScramShaSaslClient$ScramExchangeStage = new int[ScramShaSaslClient.ScramExchangeStage.values().length];
        try {
            ScramShaSaslClient.1.$SwitchMap$com$mysql$cj$sasl$ScramShaSaslClient$ScramExchangeStage[ScramShaSaslClient.ScramExchangeStage.CLIENT_FIRST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ScramShaSaslClient.1.$SwitchMap$com$mysql$cj$sasl$ScramShaSaslClient$ScramExchangeStage[ScramShaSaslClient.ScramExchangeStage.SERVER_FIRST_CLIENT_FINAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ScramShaSaslClient.1.$SwitchMap$com$mysql$cj$sasl$ScramShaSaslClient$ScramExchangeStage[ScramShaSaslClient.ScramExchangeStage.SERVER_FINAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
