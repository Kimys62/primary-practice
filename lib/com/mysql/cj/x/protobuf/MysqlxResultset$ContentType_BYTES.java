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
import com.mysql.cj.x.protobuf.MysqlxResultset;

public static enum MysqlxResultset.ContentType_BYTES implements ProtocolMessageEnum
{
    GEOMETRY(1),
    JSON(2),
    XML(3);

    public static final int GEOMETRY_VALUE = 1;
    public static final int JSON_VALUE = 2;
    public static final int XML_VALUE = 3;
    private static final Internal.EnumLiteMap<MysqlxResultset.ContentType_BYTES> internalValueMap;
    private static final MysqlxResultset.ContentType_BYTES[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxResultset.ContentType_BYTES valueOf(int value) {
        return MysqlxResultset.ContentType_BYTES.forNumber(value);
    }

    public static MysqlxResultset.ContentType_BYTES forNumber(int value) {
        switch (value) {
            case 1: {
                return GEOMETRY;
            }
            case 2: {
                return JSON;
            }
            case 3: {
                return XML;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxResultset.ContentType_BYTES> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxResultset.ContentType_BYTES.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxResultset.ContentType_BYTES.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxResultset.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxResultset.ContentType_BYTES valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxResultset.ContentType_BYTES.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxResultset.ContentType_BYTES(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxResultset.ContentType_BYTES>(){

            public MysqlxResultset.ContentType_BYTES findValueByNumber(int number) {
                return MysqlxResultset.ContentType_BYTES.forNumber(number);
            }
        };
        VALUES = MysqlxResultset.ContentType_BYTES.values();
    }
}
