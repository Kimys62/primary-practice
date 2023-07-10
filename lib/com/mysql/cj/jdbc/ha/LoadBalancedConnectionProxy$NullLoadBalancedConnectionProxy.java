/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc.ha;

import com.mysql.cj.Messages;
import com.mysql.cj.jdbc.exceptions.SQLError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLException;

private static class LoadBalancedConnectionProxy.NullLoadBalancedConnectionProxy
implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class<?>[] declaredException;
        SQLException exceptionToThrow = SQLError.createSQLException(Messages.getString("LoadBalancedConnectionProxy.unusableConnection"), "25000", 1000001, true, null);
        for (Class<?> declEx : declaredException = method.getExceptionTypes()) {
            if (!declEx.isAssignableFrom(exceptionToThrow.getClass())) continue;
            throw exceptionToThrow;
        }
        throw new IllegalStateException(exceptionToThrow.getMessage(), exceptionToThrow);
    }
}
