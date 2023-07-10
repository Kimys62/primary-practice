/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.QueryAttributesBindValue;
import java.util.function.Consumer;

public interface QueryAttributesBindings {
    public void setAttribute(String var1, Object var2);

    public int getCount();

    public QueryAttributesBindValue getAttributeValue(int var1);

    public void runThroughAll(Consumer<QueryAttributesBindValue> var1);

    public void clearAttributes();
}
