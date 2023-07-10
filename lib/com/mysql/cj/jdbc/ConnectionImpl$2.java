/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.ServerPreparedStatement;
import com.mysql.cj.util.LRUCache;
import java.sql.SQLException;
import java.util.Map;

class ConnectionImpl.2
extends LRUCache<ConnectionImpl.CompoundCacheKey, ServerPreparedStatement> {
    private static final long serialVersionUID = 7692318650375988114L;

    ConnectionImpl.2(int maxSize) {
        super(maxSize);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<ConnectionImpl.CompoundCacheKey, ServerPreparedStatement> eldest) {
        if (this.maxElements <= 1) {
            return false;
        }
        boolean removeIt = super.removeEldestEntry(eldest);
        if (removeIt) {
            ServerPreparedStatement ps = eldest.getValue();
            ps.isCached = false;
            ps.setClosed(false);
            try {
                ps.realClose(true, true);
            }
            catch (SQLException sQLException) {
                // empty catch block
            }
        }
        return removeIt;
    }
}
