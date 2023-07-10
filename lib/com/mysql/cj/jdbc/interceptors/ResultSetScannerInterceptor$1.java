/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc.interceptors;

import com.mysql.cj.Messages;
import com.mysql.cj.protocol.Resultset;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.regex.Matcher;

class ResultSetScannerInterceptor.1
implements InvocationHandler {
    final /* synthetic */ Resultset val$finalResultSet;

    ResultSetScannerInterceptor.1(Resultset resultset) {
        this.val$finalResultSet = resultset;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Matcher matcher;
        if ("equals".equals(method.getName())) {
            return args[0].equals(this);
        }
        Object invocationResult = method.invoke(this.val$finalResultSet, args);
        String methodName = method.getName();
        if ((invocationResult != null && invocationResult instanceof String || "getString".equals(methodName) || "getObject".equals(methodName) || "getObjectStoredProc".equals(methodName)) && (matcher = ResultSetScannerInterceptor.this.regexP.matcher(invocationResult.toString())).matches()) {
            throw new SQLException(Messages.getString("ResultSetScannerInterceptor.2"));
        }
        return invocationResult;
    }
}
