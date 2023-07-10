/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.SQLException;

protected class DatabaseMetaData.SingleStringIterator
extends DatabaseMetaData.IteratorWithCleanup<String> {
    boolean onFirst;
    String value;

    DatabaseMetaData.SingleStringIterator(String s) {
        super(DatabaseMetaData.this);
        this.onFirst = true;
        this.value = s;
    }

    @Override
    void close() throws SQLException {
    }

    @Override
    boolean hasNext() throws SQLException {
        return this.onFirst;
    }

    @Override
    String next() throws SQLException {
        this.onFirst = false;
        return this.value;
    }
}
