/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import java.sql.SQLException;

protected abstract class DatabaseMetaData.IteratorWithCleanup<T> {
    protected DatabaseMetaData.IteratorWithCleanup() {
    }

    abstract void close() throws SQLException;

    abstract boolean hasNext() throws SQLException;

    abstract T next() throws SQLException;
}
