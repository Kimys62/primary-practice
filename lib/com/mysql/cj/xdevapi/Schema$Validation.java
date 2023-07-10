/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

public static class Schema.Validation {
    private ValidationLevel level = null;
    private String schema = null;

    public Schema.Validation setLevel(ValidationLevel level) {
        this.level = level;
        return this;
    }

    public ValidationLevel getLevel() {
        return this.level;
    }

    public Schema.Validation setSchema(String schema) {
        this.schema = schema;
        return this;
    }

    public String getSchema() {
        return this.schema;
    }

    public static enum ValidationLevel {
        STRICT,
        OFF;

    }
}
