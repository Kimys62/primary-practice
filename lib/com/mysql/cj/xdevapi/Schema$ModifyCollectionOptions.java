/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.Schema;

public static class Schema.ModifyCollectionOptions {
    private Schema.Validation validation = null;

    public Schema.ModifyCollectionOptions setValidation(Schema.Validation validation) {
        this.validation = validation;
        return this;
    }

    public Schema.Validation getValidation() {
        return this.validation;
    }
}
