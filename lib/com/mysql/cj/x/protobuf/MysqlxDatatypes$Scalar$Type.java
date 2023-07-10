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

public static enum MysqlxDatatypes.Scalar.Type implements ProtocolMessageEnum
{
    V_SINT(1),
    V_UINT(2),
    V_NULL(3),
    V_OCTETS(4),
    V_DOUBLE(5),
    V_FLOAT(6),
    V_BOOL(7),
    V_STRING(8);

    public static final int V_SINT_VALUE = 1;
    public static final int V_UINT_VALUE = 2;
    public static final int V_NULL_VALUE = 3;
    public static final int V_OCTETS_VALUE = 4;
    public static final int V_DOUBLE_VALUE = 5;
    public static final int V_FLOAT_VALUE = 6;
    public static final int V_BOOL_VALUE = 7;
    public static final int V_STRING_VALUE = 8;
    private static final Internal.EnumLiteMap<MysqlxDatatypes.Scalar.Type> internalValueMap;
    private static final MysqlxDatatypes.Scalar.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxDatatypes.Scalar.Type valueOf(int value) {
        return MysqlxDatatypes.Scalar.Type.forNumber(value);
    }

    public static MysqlxDatatypes.Scalar.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return V_SINT;
            }
            case 2: {
                return V_UINT;
            }
            case 3: {
                return V_NULL;
            }
            case 4: {
                return V_OCTETS;
            }
            case 5: {
                return V_DOUBLE;
            }
            case 6: {
                return V_FLOAT;
            }
            case 7: {
                return V_BOOL;
            }
            case 8: {
                return V_STRING;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxDatatypes.Scalar.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxDatatypes.Scalar.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxDatatypes.Scalar.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxDatatypes.Scalar.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxDatatypes.Scalar.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxDatatypes.Scalar.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxDatatypes.Scalar.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxDatatypes.Scalar.Type>(){

            public MysqlxDatatypes.Scalar.Type findValueByNumber(int number) {
                return MysqlxDatatypes.Scalar.Type.forNumber(number);
            }
        };
        VALUES = MysqlxDatatypes.Scalar.Type.values();
    }
}
