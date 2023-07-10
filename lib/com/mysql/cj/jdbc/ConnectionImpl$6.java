/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.jdbc.interceptors.ConnectionLifecycleInterceptor;
import java.sql.SQLException;
import java.util.Iterator;

class ConnectionImpl.6
extends IterateBlock<ConnectionLifecycleInterceptor> {
    final /* synthetic */ String val$db;

    ConnectionImpl.6(Iterator i, String string) {
        this.val$db = string;
        super(i);
    }

    @Override
    void forEach(ConnectionLifecycleInterceptor each) throws SQLException {
        if (!each.setDatabase(this.val$db)) {
            this.stopIterating = true;
        }
    }
}
