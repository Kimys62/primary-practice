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
import com.mysql.cj.x.protobuf.MysqlxExpect;

public static enum MysqlxExpect.Open.Condition.Key implements ProtocolMessageEnum
{
    EXPECT_NO_ERROR(1),
    EXPECT_FIELD_EXIST(2),
    EXPECT_DOCID_GENERATED(3);

    public static final int EXPECT_NO_ERROR_VALUE = 1;
    public static final int EXPECT_FIELD_EXIST_VALUE = 2;
    public static final int EXPECT_DOCID_GENERATED_VALUE = 3;
    private static final Internal.EnumLiteMap<MysqlxExpect.Open.Condition.Key> internalValueMap;
    private static final MysqlxExpect.Open.Condition.Key[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxExpect.Open.Condition.Key valueOf(int value) {
        return MysqlxExpect.Open.Condition.Key.forNumber(value);
    }

    public static MysqlxExpect.Open.Condition.Key forNumber(int value) {
        switch (value) {
            case 1: {
                return EXPECT_NO_ERROR;
            }
            case 2: {
                return EXPECT_FIELD_EXIST;
            }
            case 3: {
                return EXPECT_DOCID_GENERATED;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxExpect.Open.Condition.Key> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxExpect.Open.Condition.Key.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxExpect.Open.Condition.Key.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxExpect.Open.Condition.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxExpect.Open.Condition.Key valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxExpect.Open.Condition.Key.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxExpect.Open.Condition.Key(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxExpect.Open.Condition.Key>(){

            public MysqlxExpect.Open.Condition.Key findValueByNumber(int number) {
                return MysqlxExpect.Open.Condition.Key.forNumber(number);
            }
        };
        VALUES = MysqlxExpect.Open.Condition.Key.values();
    }
}
