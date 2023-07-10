/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a.authentication;

import java.util.HashMap;
import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

class AuthenticationLdapSaslClientPlugin.1
extends Configuration {
    final /* synthetic */ String val$localUser;
    final /* synthetic */ boolean val$debug;

    AuthenticationLdapSaslClientPlugin.1(String string, boolean bl) {
        this.val$localUser = string;
        this.val$debug = bl;
    }

    @Override
    public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("useTicketCache", "true");
        options.put("renewTGT", "false");
        options.put("principal", this.val$localUser);
        options.put("debug", Boolean.toString(this.val$debug));
        return new AppConfigurationEntry[]{new AppConfigurationEntry("com.sun.security.auth.module.Krb5LoginModule", AppConfigurationEntry.LoginModuleControlFlag.REQUIRED, options)};
    }
}
