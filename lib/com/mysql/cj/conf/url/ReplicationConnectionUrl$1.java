/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf.url;

import com.mysql.cj.conf.HostsListView;

static class ReplicationConnectionUrl.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$conf$HostsListView;

    static {
        $SwitchMap$com$mysql$cj$conf$HostsListView = new int[HostsListView.values().length];
        try {
            ReplicationConnectionUrl.1.$SwitchMap$com$mysql$cj$conf$HostsListView[HostsListView.SOURCES.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ReplicationConnectionUrl.1.$SwitchMap$com$mysql$cj$conf$HostsListView[HostsListView.REPLICAS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
