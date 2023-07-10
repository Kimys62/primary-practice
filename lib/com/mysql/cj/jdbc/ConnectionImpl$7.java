/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import java.sql.SQLException;

class ConnectionImpl.7
implements Runnable {
    ConnectionImpl.7() {
    }

    @Override
    public void run() {
        try {
            ConnectionImpl.this.abortInternal();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
