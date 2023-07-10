/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

private static class ExportControlled.KeyStoreConf {
    public String keyStoreUrl = null;
    public String keyStorePassword = null;
    public String keyStoreType = "JKS";

    public ExportControlled.KeyStoreConf() {
    }

    public ExportControlled.KeyStoreConf(String keyStoreUrl, String keyStorePassword, String keyStoreType) {
        this.keyStoreUrl = keyStoreUrl;
        this.keyStorePassword = keyStorePassword;
        this.keyStoreType = keyStoreType;
    }
}
