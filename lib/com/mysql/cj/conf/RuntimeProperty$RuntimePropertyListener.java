/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf;

import com.mysql.cj.conf.RuntimeProperty;

@FunctionalInterface
public static interface RuntimeProperty.RuntimePropertyListener {
    public void handlePropertyChange(RuntimeProperty<?> var1);
}
