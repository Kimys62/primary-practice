/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a.authentication;

import com.mysql.cj.protocol.a.authentication.AuthenticationLdapSaslClientPlugin;

static class AuthenticationLdapSaslClientPlugin.2 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$protocol$a$authentication$AuthenticationLdapSaslClientPlugin$AuthenticationMechanisms;

    static {
        $SwitchMap$com$mysql$cj$protocol$a$authentication$AuthenticationLdapSaslClientPlugin$AuthenticationMechanisms = new int[AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms.values().length];
        try {
            AuthenticationLdapSaslClientPlugin.2.$SwitchMap$com$mysql$cj$protocol$a$authentication$AuthenticationLdapSaslClientPlugin$AuthenticationMechanisms[AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms.GSSAPI.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AuthenticationLdapSaslClientPlugin.2.$SwitchMap$com$mysql$cj$protocol$a$authentication$AuthenticationLdapSaslClientPlugin$AuthenticationMechanisms[AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms.SCRAM_SHA_1.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AuthenticationLdapSaslClientPlugin.2.$SwitchMap$com$mysql$cj$protocol$a$authentication$AuthenticationLdapSaslClientPlugin$AuthenticationMechanisms[AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms.SCRAM_SHA_256.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
