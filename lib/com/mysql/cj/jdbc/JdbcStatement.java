/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.PingTarget;
import com.mysql.cj.Query;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Statement;

public interface JdbcStatement
extends Statement,
Query {
    public static final int MAX_ROWS = 50000000;

    public void enableStreamingResults() throws SQLException;

    public void disableStreamingResults() throws SQLException;

    public void setLocalInfileInputStream(InputStream var1);

    public InputStream getLocalInfileInputStream();

    public void setPingTarget(PingTarget var1);

    public ExceptionInterceptor getExceptionInterceptor();

    public void removeOpenResultSet(ResultSetInternalMethods var1);

    public int getOpenResultSetCount();

    public void setHoldResultsOpenOverClose(boolean var1);

    public Query getQuery();

    public void setAttribute(String var1, Object var2);

    public void clearAttributes();
}
