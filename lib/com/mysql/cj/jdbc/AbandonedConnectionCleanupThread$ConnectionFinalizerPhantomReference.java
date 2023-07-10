/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.MysqlConnection;
import com.mysql.cj.protocol.NetworkResources;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

private static class AbandonedConnectionCleanupThread.ConnectionFinalizerPhantomReference
extends PhantomReference<MysqlConnection> {
    private NetworkResources networkResources;

    AbandonedConnectionCleanupThread.ConnectionFinalizerPhantomReference(MysqlConnection conn, NetworkResources networkResources, ReferenceQueue<? super MysqlConnection> refQueue) {
        super(conn, refQueue);
        this.networkResources = networkResources;
    }

    void finalizeResources() {
        if (this.networkResources != null) {
            try {
                this.networkResources.forceClose();
            }
            finally {
                this.networkResources = null;
            }
        }
    }
}
