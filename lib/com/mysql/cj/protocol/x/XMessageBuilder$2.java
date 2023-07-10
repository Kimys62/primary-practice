/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

class XMessageBuilder.2
implements CallbackHandler {
    XMessageBuilder.2() {
    }

    @Override
    public void handle(Callback[] callbacks) throws UnsupportedCallbackException {
        int n = 0;
        Callback[] callbackArray = callbacks;
        int n2 = callbackArray.length;
        if (n < n2) {
            Callback c = callbackArray[n];
            if (NameCallback.class.isAssignableFrom(c.getClass())) {
                throw new UnsupportedCallbackException(c);
            }
            if (PasswordCallback.class.isAssignableFrom(c.getClass())) {
                throw new UnsupportedCallbackException(c);
            }
            throw new UnsupportedCallbackException(c);
        }
    }
}
