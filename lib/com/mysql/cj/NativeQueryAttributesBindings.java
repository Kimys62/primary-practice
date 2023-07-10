/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.NativeQueryAttributesBindValue;
import com.mysql.cj.QueryAttributesBindValue;
import com.mysql.cj.QueryAttributesBindings;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NativeQueryAttributesBindings
implements QueryAttributesBindings {
    private List<NativeQueryAttributesBindValue> bindAttributes = new ArrayList<NativeQueryAttributesBindValue>();

    @Override
    public void setAttribute(String name, Object value) {
        this.bindAttributes.add(new NativeQueryAttributesBindValue(name, value));
    }

    @Override
    public int getCount() {
        return this.bindAttributes.size();
    }

    @Override
    public QueryAttributesBindValue getAttributeValue(int index) {
        return this.bindAttributes.get(index);
    }

    @Override
    public void runThroughAll(Consumer<QueryAttributesBindValue> bindAttribute) {
        this.bindAttributes.forEach(bindAttribute::accept);
    }

    @Override
    public void clearAttributes() {
        this.bindAttributes.clear();
    }
}
