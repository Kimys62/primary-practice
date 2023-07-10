/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.conf.HostInfo;
import com.mysql.cj.conf.PropertySet;
import com.mysql.cj.protocol.x.XProtocol;
import java.io.IOException;
import java.util.List;

public class ClientImpl.PooledXProtocol
extends XProtocol {
    long idleSince;
    HostInfo hostInfo;

    public ClientImpl.PooledXProtocol(HostInfo hostInfo, PropertySet propertySet) {
        super(hostInfo, propertySet);
        this.idleSince = -1L;
        this.hostInfo = null;
        this.hostInfo = hostInfo;
    }

    @Override
    public void close() {
        this.reset();
        this.idleSince = System.currentTimeMillis();
        ClientImpl.this.idleProtocol(this);
    }

    public HostInfo getHostInfo() {
        return this.hostInfo;
    }

    boolean isIdleTimeoutReached() {
        return ClientImpl.this.maxIdleTime > 0 && this.idleSince > 0L && System.currentTimeMillis() > this.idleSince + (long)ClientImpl.this.maxIdleTime;
    }

    boolean isHostInfoValid(List<HostInfo> hostsList) {
        return hostsList.stream().filter(h -> h.equalHostPortPair(this.hostInfo)).findFirst().isPresent();
    }

    void realClose() {
        try {
            super.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}
