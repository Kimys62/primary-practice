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
import com.mysql.cj.x.protobuf.MysqlxCursor;

public static enum MysqlxCursor.Open.OneOfMessage.Type implements ProtocolMessageEnum
{
    PREPARE_EXECUTE(0);

    public static final int PREPARE_EXECUTE_VALUE = 0;
    private static final Internal.EnumLiteMap<MysqlxCursor.Open.OneOfMessage.Type> internalValueMap;
    private static final MysqlxCursor.Open.OneOfMessage.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCursor.Open.OneOfMessage.Type valueOf(int value) {
        return MysqlxCursor.Open.OneOfMessage.Type.forNumber(value);
    }

    public static MysqlxCursor.Open.OneOfMessage.Type forNumber(int value) {
        switch (value) {
            case 0: {
                return PREPARE_EXECUTE;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCursor.Open.OneOfMessage.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCursor.Open.OneOfMessage.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCursor.Open.OneOfMessage.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCursor.Open.OneOfMessage.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxCursor.Open.OneOfMessage.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCursor.Open.OneOfMessage.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCursor.Open.OneOfMessage.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCursor.Open.OneOfMessage.Type>(){

            public MysqlxCursor.Open.OneOfMessage.Type findValueByNumber(int number) {
                return MysqlxCursor.Open.OneOfMessage.Type.forNumber(number);
            }
        };
        VALUES = MysqlxCursor.Open.OneOfMessage.Type.values();
    }
}
