/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.ProtocolMessageEnum
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.mysql.cj.x.protobuf.Mysqlx;

public static enum Mysqlx.Error.Severity implements ProtocolMessageEnum
{
    ERROR(0),
    FATAL(1);

    public static final int ERROR_VALUE = 0;
    public static final int FATAL_VALUE = 1;
    private static final Internal.EnumLiteMap<Mysqlx.Error.Severity> internalValueMap;
    private static final Mysqlx.Error.Severity[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Mysqlx.Error.Severity valueOf(int value) {
        return Mysqlx.Error.Severity.forNumber(value);
    }

    public static Mysqlx.Error.Severity forNumber(int value) {
        switch (value) {
            case 0: {
                return ERROR;
            }
            case 1: {
                return FATAL;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<Mysqlx.Error.Severity> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)Mysqlx.Error.Severity.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return Mysqlx.Error.Severity.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)Mysqlx.Error.getDescriptor().getEnumTypes().get(0);
    }

    public static Mysqlx.Error.Severity valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != Mysqlx.Error.Severity.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private Mysqlx.Error.Severity(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<Mysqlx.Error.Severity>(){

            public Mysqlx.Error.Severity findValueByNumber(int number) {
                return Mysqlx.Error.Severity.forNumber(number);
            }
        };
        VALUES = Mysqlx.Error.Severity.values();
    }
}
