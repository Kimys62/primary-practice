/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf;

import com.mysql.cj.conf.ConnectionUrl;

static final class ConnectionUrl.HostsCardinality.3
extends ConnectionUrl.HostsCardinality {
    @Override
    public boolean assertSize(int n) {
        return n >= 1;
    }
}
