/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

class XMessageBuilder.1
implements CallbackHandler {
    final /* synthetic */ String val$user;
    final /* synthetic */ String val$password;

    XMessageBuilder.1(String string, String string2) {
        this.val$user = string;
        this.val$password = string2;
    }

    @Override
    public void handle(Callback[] callbacks) throws UnsupportedCallbackException {
        for (Callback c : callbacks) {
            if (NameCallback.class.isAssignableFrom(c.getClass())) {
                ((NameCallback)c).setName(this.val$user);
                continue;
            }
            if (PasswordCallback.class.isAssignableFrom(c.getClass())) {
                ((PasswordCallback)c).setPassword(this.val$password == null ? new char[]{} : this.val$password.toCharArray());
                continue;
            }
            throw new UnsupportedCallbackException(c);
        }
    }
}
