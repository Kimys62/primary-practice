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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public static enum MysqlxDatatypes.Any.Type implements ProtocolMessageEnum
{
    SCALAR(1),
    OBJECT(2),
    ARRAY(3);

    public static final int SCALAR_VALUE = 1;
    public static final int OBJECT_VALUE = 2;
    public static final int ARRAY_VALUE = 3;
    private static final Internal.EnumLiteMap<MysqlxDatatypes.Any.Type> internalValueMap;
    private static final MysqlxDatatypes.Any.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxDatatypes.Any.Type valueOf(int value) {
        return MysqlxDatatypes.Any.Type.forNumber(value);
    }

    public static MysqlxDatatypes.Any.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return SCALAR;
            }
            case 2: {
                return OBJECT;
            }
            case 3: {
                return ARRAY;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxDatatypes.Any.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxDatatypes.Any.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxDatatypes.Any.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxDatatypes.Any.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxDatatypes.Any.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxDatatypes.Any.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxDatatypes.Any.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxDatatypes.Any.Type>(){

            public MysqlxDatatypes.Any.Type findValueByNumber(int number) {
                return MysqlxDatatypes.Any.Type.forNumber(number);
            }
        };
        VALUES = MysqlxDatatypes.Any.Type.values();
    }
}
