/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.NativeSession;
import com.mysql.cj.jdbc.JdbcConnection;
import java.lang.ref.WeakReference;

private static class ConnectionImpl.NetworkTimeoutSetter
implements Runnable {
    private final WeakReference<JdbcConnection> connRef;
    private final int milliseconds;

    public ConnectionImpl.NetworkTimeoutSetter(JdbcConnection conn, int milliseconds) {
        this.connRef = new WeakReference<JdbcConnection>(conn);
        this.milliseconds = milliseconds;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        JdbcConnection conn = (JdbcConnection)this.connRef.get();
        if (conn != null) {
            Object object = conn.getConnectionMutex();
            synchronized (object) {
                ((NativeSession)conn.getSession()).setSocketTimeout(this.milliseconds);
            }
        }
    }
}
