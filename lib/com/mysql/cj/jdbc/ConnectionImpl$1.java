/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.jdbc.interceptors.ConnectionLifecycleInterceptor;
import java.sql.SQLException;
import java.util.Iterator;

class ConnectionImpl.1
extends IterateBlock<ConnectionLifecycleInterceptor> {
    ConnectionImpl.1(Iterator i) {
        super(i);
    }

    @Override
    void forEach(ConnectionLifecycleInterceptor each) throws SQLException {
        if (!each.commit()) {
            this.stopIterating = true;
        }
    }
}
