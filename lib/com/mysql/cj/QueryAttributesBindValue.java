/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

public interface QueryAttributesBindValue {
    public boolean isNull();

    public String getName();

    public int getType();

    public Object getValue();

    public long getBoundLength();
}
