/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;

protected class DatabaseMetaData.StringListIterator
extends DatabaseMetaData.IteratorWithCleanup<String> {
    int idx;
    List<String> list;

    DatabaseMetaData.StringListIterator(List<String> list) {
        super(DatabaseMetaData.this);
        this.idx = -1;
        this.list = list;
    }

    @Override
    void close() throws SQLException {
        this.list = null;
    }

    @Override
    boolean hasNext() throws SQLException {
        return this.idx < this.list.size() - 1;
    }

    @Override
    String next() throws SQLException {
        ++this.idx;
        return this.list.get(this.idx);
    }
}
