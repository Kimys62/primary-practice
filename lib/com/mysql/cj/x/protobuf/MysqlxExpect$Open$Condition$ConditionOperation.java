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

public static enum MysqlxExpect.Open.Condition.ConditionOperation implements ProtocolMessageEnum
{
    EXPECT_OP_SET(0),
    EXPECT_OP_UNSET(1);

    public static final int EXPECT_OP_SET_VALUE = 0;
    public static final int EXPECT_OP_UNSET_VALUE = 1;
    private static final Internal.EnumLiteMap<MysqlxExpect.Open.Condition.ConditionOperation> internalValueMap;
    private static final MysqlxExpect.Open.Condition.ConditionOperation[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxExpect.Open.Condition.ConditionOperation valueOf(int value) {
        return MysqlxExpect.Open.Condition.ConditionOperation.forNumber(value);
    }

    public static MysqlxExpect.Open.Condition.ConditionOperation forNumber(int value) {
        switch (value) {
            case 0: {
                return EXPECT_OP_SET;
            }
            case 1: {
                return EXPECT_OP_UNSET;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxExpect.Open.Condition.ConditionOperation> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxExpect.Open.Condition.ConditionOperation.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxExpect.Open.Condition.ConditionOperation.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxExpect.Open.Condition.getDescriptor().getEnumTypes().get(1);
    }

    public static MysqlxExpect.Open.Condition.ConditionOperation valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxExpect.Open.Condition.ConditionOperation.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxExpect.Open.Condition.ConditionOperation(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxExpect.Open.Condition.ConditionOperation>(){

            public MysqlxExpect.Open.Condition.ConditionOperation findValueByNumber(int number) {
                return MysqlxExpect.Open.Condition.ConditionOperation.forNumber(number);
            }
        };
        VALUES = MysqlxExpect.Open.Condition.ConditionOperation.values();
    }
}
