/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.log.Log;
import java.sql.SQLException;
import java.util.Properties;

class NativeSession.1
implements ExceptionInterceptor {
    NativeSession.1() {
    }

    @Override
    public ExceptionInterceptor init(Properties config, Log log1) {
        return this;
    }

    @Override
    public void destroy() {
    }

    @Override
    public Exception interceptException(Exception sqlEx) {
        if (sqlEx instanceof SQLException && ((SQLException)sqlEx).getSQLState() != null && ((SQLException)sqlEx).getSQLState().startsWith("08")) {
            NativeSession.this.serverConfigCache.invalidate(NativeSession.this.hostInfo.getDatabaseUrl());
        }
        return null;
    }
}
