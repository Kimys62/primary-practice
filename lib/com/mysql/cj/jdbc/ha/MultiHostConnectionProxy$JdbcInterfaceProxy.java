/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc.ha;

import com.mysql.cj.jdbc.ha.MultiHostConnectionProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MultiHostConnectionProxy.JdbcInterfaceProxy
implements InvocationHandler {
    Object invokeOn = null;

    MultiHostConnectionProxy.JdbcInterfaceProxy(Object toInvokeOn) {
        this.invokeOn = toInvokeOn;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (MultiHostConnectionProxy.METHOD_EQUALS.equals(method.getName())) {
            return args[0].equals(this);
        }
        MultiHostConnectionProxy multiHostConnectionProxy = MultiHostConnectionProxy.this;
        synchronized (multiHostConnectionProxy) {
            Object result = null;
            try {
                result = method.invoke(this.invokeOn, args);
                result = MultiHostConnectionProxy.this.proxyIfReturnTypeIsJdbcInterface(method.getReturnType(), result);
            }
            catch (InvocationTargetException e) {
                MultiHostConnectionProxy.this.dealWithInvocationException(e);
            }
            return result;
        }
    }
}
