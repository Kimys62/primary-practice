/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.util;

import com.mysql.cj.CacheAdapter;
import java.util.Map;
import java.util.Set;

static final class PerVmServerConfigCacheFactory.1
implements CacheAdapter<String, Map<String, String>> {
    PerVmServerConfigCacheFactory.1() {
    }

    @Override
    public Map<String, String> get(String key) {
        return serverConfigByUrl.get(key);
    }

    @Override
    public void put(String key, Map<String, String> value) {
        serverConfigByUrl.putIfAbsent(key, value);
    }

    @Override
    public void invalidate(String key) {
        serverConfigByUrl.remove(key);
    }

    @Override
    public void invalidateAll(Set<String> keys) {
        for (String key : keys) {
            serverConfigByUrl.remove(key);
        }
    }

    @Override
    public void invalidateAll() {
        serverConfigByUrl.clear();
    }
}
