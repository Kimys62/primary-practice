/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.util.Util;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLException;

protected class WrapperBase.ConnectionErrorFiringInvocationHandler
implements InvocationHandler {
    Object invokeOn = null;

    public WrapperBase.ConnectionErrorFiringInvocationHandler(Object toInvokeOn) {
        this.invokeOn = toInvokeOn;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("equals".equals(method.getName())) {
            return args[0].equals(this);
        }
        Object result = null;
        try {
            result = method.invoke(this.invokeOn, args);
            if (result != null) {
                result = this.proxyIfInterfaceIsJdbc(result, result.getClass());
            }
        }
        catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof SQLException) {
                WrapperBase.this.checkAndFireConnectionError((SQLException)e.getTargetException());
            }
            throw e;
        }
        return result;
    }

    private Object proxyIfInterfaceIsJdbc(Object toProxy, Class<?> clazz) {
        int n = 0;
        Class<?>[] interfaces = clazz.getInterfaces();
        Class<?>[] classArray = interfaces;
        int n2 = classArray.length;
        if (n < n2) {
            Class<?> iclass = classArray[n];
            String packageName = Util.getPackageName(iclass);
            if ("java.sql".equals(packageName) || "javax.sql".equals(packageName)) {
                return Proxy.newProxyInstance(toProxy.getClass().getClassLoader(), interfaces, new WrapperBase.ConnectionErrorFiringInvocationHandler(toProxy));
            }
            return this.proxyIfInterfaceIsJdbc(toProxy, iclass);
        }
        return toProxy;
    }
}
