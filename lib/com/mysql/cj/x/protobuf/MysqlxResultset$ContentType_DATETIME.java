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

public static enum MysqlxResultset.ContentType_DATETIME implements ProtocolMessageEnum
{
    DATE(1),
    DATETIME(2);

    public static final int DATE_VALUE = 1;
    public static final int DATETIME_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxResultset.ContentType_DATETIME> internalValueMap;
    private static final MysqlxResultset.ContentType_DATETIME[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxResultset.ContentType_DATETIME valueOf(int value) {
        return MysqlxResultset.ContentType_DATETIME.forNumber(value);
    }

    public static MysqlxResultset.ContentType_DATETIME forNumber(int value) {
        switch (value) {
            case 1: {
                return DATE;
            }
            case 2: {
                return DATETIME;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxResultset.ContentType_DATETIME> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxResultset.ContentType_DATETIME.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxResultset.ContentType_DATETIME.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxResultset.getDescriptor().getEnumTypes().get(1);
    }

    public static MysqlxResultset.ContentType_DATETIME valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxResultset.ContentType_DATETIME.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxResultset.ContentType_DATETIME(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxResultset.ContentType_DATETIME>(){

            public MysqlxResultset.ContentType_DATETIME findValueByNumber(int number) {
                return MysqlxResultset.ContentType_DATETIME.forNumber(number);
            }
        };
        VALUES = MysqlxResultset.ContentType_DATETIME.values();
    }
}
