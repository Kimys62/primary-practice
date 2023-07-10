/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc.ha;

import com.mysql.cj.jdbc.ha.MultiHostConnectionProxy;
import java.lang.reflect.Method;

class FailoverConnectionProxy.FailoverJdbcInterfaceProxy
extends MultiHostConnectionProxy.JdbcInterfaceProxy {
    FailoverConnectionProxy.FailoverJdbcInterfaceProxy(Object toInvokeOn) {
        super(FailoverConnectionProxy.this, toInvokeOn);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        boolean isExecute = methodName.startsWith("execute");
        if (FailoverConnectionProxy.this.connectedToSecondaryHost() && isExecute) {
            FailoverConnectionProxy.this.incrementQueriesIssuedSinceFailover();
        }
        Object result = super.invoke(proxy, method, args);
        if (FailoverConnectionProxy.this.explicitlyAutoCommit && isExecute && FailoverConnectionProxy.this.readyToFallBackToPrimaryHost()) {
            FailoverConnectionProxy.this.fallBackToPrimaryIfAvailable();
        }
        return result;
    }
}
