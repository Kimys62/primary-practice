/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import java.util.ArrayList;
import java.util.List;

public static class ServerSessionStateController.SessionStateChange {
    private int type;
    private List<String> values = new ArrayList<String>();

    public ServerSessionStateController.SessionStateChange(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public List<String> getValues() {
        return this.values;
    }

    public ServerSessionStateController.SessionStateChange addValue(String value) {
        this.values.add(value);
        return this;
    }
}
