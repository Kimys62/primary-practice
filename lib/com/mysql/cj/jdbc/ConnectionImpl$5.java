/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.IterateBlock;
import com.mysql.cj.jdbc.interceptors.ConnectionLifecycleInterceptor;
import java.sql.SQLException;
import java.util.Iterator;

class ConnectionImpl.5
extends IterateBlock<ConnectionLifecycleInterceptor> {
    final /* synthetic */ boolean val$autoCommitFlag;

    ConnectionImpl.5(Iterator i, boolean bl) {
        this.val$autoCommitFlag = bl;
        super(i);
    }

    @Override
    void forEach(ConnectionLifecycleInterceptor each) throws SQLException {
        if (!each.setAutoCommit(this.val$autoCommitFlag)) {
            this.stopIterating = true;
        }
    }
}
