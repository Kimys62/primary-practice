/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

public interface Warning {
    public int getLevel();

    public long getCode();

    public String getMessage();
}
