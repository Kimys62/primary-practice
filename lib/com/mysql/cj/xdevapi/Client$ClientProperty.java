/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

public static enum Client.ClientProperty {
    POOLING_ENABLED("pooling.enabled"),
    POOLING_MAX_SIZE("pooling.maxSize"),
    POOLING_MAX_IDLE_TIME("pooling.maxIdleTime"),
    POOLING_QUEUE_TIMEOUT("pooling.queueTimeout");

    private String keyName = "";

    private Client.ClientProperty(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return this.keyName;
    }
}
