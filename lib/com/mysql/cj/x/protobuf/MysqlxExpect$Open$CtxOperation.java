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

public static enum MysqlxExpect.Open.CtxOperation implements ProtocolMessageEnum
{
    EXPECT_CTX_COPY_PREV(0),
    EXPECT_CTX_EMPTY(1);

    public static final int EXPECT_CTX_COPY_PREV_VALUE = 0;
    public static final int EXPECT_CTX_EMPTY_VALUE = 1;
    private static final Internal.EnumLiteMap<MysqlxExpect.Open.CtxOperation> internalValueMap;
    private static final MysqlxExpect.Open.CtxOperation[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxExpect.Open.CtxOperation valueOf(int value) {
        return MysqlxExpect.Open.CtxOperation.forNumber(value);
    }

    public static MysqlxExpect.Open.CtxOperation forNumber(int value) {
        switch (value) {
            case 0: {
                return EXPECT_CTX_COPY_PREV;
            }
            case 1: {
                return EXPECT_CTX_EMPTY;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxExpect.Open.CtxOperation> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxExpect.Open.CtxOperation.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxExpect.Open.CtxOperation.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxExpect.Open.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxExpect.Open.CtxOperation valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxExpect.Open.CtxOperation.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxExpect.Open.CtxOperation(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxExpect.Open.CtxOperation>(){

            public MysqlxExpect.Open.CtxOperation findValueByNumber(int number) {
                return MysqlxExpect.Open.CtxOperation.forNumber(number);
            }
        };
        VALUES = MysqlxExpect.Open.CtxOperation.values();
    }
}
