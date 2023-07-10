/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.Schema;

public static class Schema.CreateCollectionOptions {
    private Boolean reuseExisting = null;
    private Schema.Validation validation = null;

    public Schema.CreateCollectionOptions setReuseExisting(boolean reuse) {
        this.reuseExisting = reuse;
        return this;
    }

    public Boolean getReuseExisting() {
        return this.reuseExisting;
    }

    public Schema.CreateCollectionOptions setValidation(Schema.Validation validation) {
        this.validation = validation;
        return this;
    }

    public Schema.Validation getValidation() {
        return this.validation;
    }
}
