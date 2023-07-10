/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a.authentication;

import com.mysql.cj.Messages;
import com.mysql.cj.exceptions.ExceptionFactory;

private static enum AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms {
    SCRAM_SHA_1("SCRAM-SHA-1", "MYSQLCJ-SCRAM-SHA-1"),
    SCRAM_SHA_256("SCRAM-SHA-256", "MYSQLCJ-SCRAM-SHA-256"),
    GSSAPI("GSSAPI", "GSSAPI");

    private String mechName = null;
    private String saslServiceName = null;

    private AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms(String mechName, String serviceName) {
        this.mechName = mechName;
        this.saslServiceName = serviceName;
    }

    static AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms fromValue(String mechName) {
        for (AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms am : AuthenticationLdapSaslClientPlugin.AuthenticationMechanisms.values()) {
            if (!am.mechName.equalsIgnoreCase(mechName)) continue;
            return am;
        }
        throw ExceptionFactory.createException(Messages.getString("AuthenticationLdapSaslClientPlugin.UnsupportedAuthMech", new String[]{mechName}));
    }

    String getMechName() {
        return this.mechName;
    }

    String getSaslServiceName() {
        return this.saslServiceName;
    }
}
