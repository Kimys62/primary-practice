/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf;

public static enum BooleanPropertyDefinition.AllowableValues {
    TRUE(true),
    FALSE(false),
    YES(true),
    NO(false);

    private boolean asBoolean;

    private BooleanPropertyDefinition.AllowableValues(boolean booleanValue) {
        this.asBoolean = booleanValue;
    }

    public boolean asBoolean() {
        return this.asBoolean;
    }
}
