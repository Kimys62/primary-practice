/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.jdbc.interceptors.ConnectionLifecycleInterceptor;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Iterator;

class ConnectionImpl.4
extends IterateBlock<ConnectionLifecycleInterceptor> {
    final /* synthetic */ Savepoint val$savepoint;

    ConnectionImpl.4(Iterator i, Savepoint savepoint) {
        this.val$savepoint = savepoint;
        super(i);
    }

    @Override
    void forEach(ConnectionLifecycleInterceptor each) throws SQLException {
        if (!each.rollback(this.val$savepoint)) {
            this.stopIterating = true;
        }
    }
}
