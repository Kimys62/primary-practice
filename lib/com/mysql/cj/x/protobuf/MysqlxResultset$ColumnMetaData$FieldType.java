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

public static enum MysqlxResultset.ColumnMetaData.FieldType implements ProtocolMessageEnum
{
    SINT(1),
    UINT(2),
    DOUBLE(5),
    FLOAT(6),
    BYTES(7),
    TIME(10),
    DATETIME(12),
    SET(15),
    ENUM(16),
    BIT(17),
    DECIMAL(18);

    public static final int SINT_VALUE = 1;
    public static final int UINT_VALUE = 2;
    public static final int DOUBLE_VALUE = 5;
    public static final int FLOAT_VALUE = 6;
    public static final int BYTES_VALUE = 7;
    public static final int TIME_VALUE = 10;
    public static final int DATETIME_VALUE = 12;
    public static final int SET_VALUE = 15;
    public static final int ENUM_VALUE = 16;
    public static final int BIT_VALUE = 17;
    public static final int DECIMAL_VALUE = 18;
    private static final Internal.EnumLiteMap<MysqlxResultset.ColumnMetaData.FieldType> internalValueMap;
    private static final MysqlxResultset.ColumnMetaData.FieldType[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxResultset.ColumnMetaData.FieldType valueOf(int value) {
        return MysqlxResultset.ColumnMetaData.FieldType.forNumber(value);
    }

    public static MysqlxResultset.ColumnMetaData.FieldType forNumber(int value) {
        switch (value) {
            case 1: {
                return SINT;
            }
            case 2: {
                return UINT;
            }
            case 5: {
                return DOUBLE;
            }
            case 6: {
                return FLOAT;
            }
            case 7: {
                return BYTES;
            }
            case 10: {
                return TIME;
            }
            case 12: {
                return DATETIME;
            }
            case 15: {
                return SET;
            }
            case 16: {
                return ENUM;
            }
            case 17: {
                return BIT;
            }
            case 18: {
                return DECIMAL;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxResultset.ColumnMetaData.FieldType> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxResultset.ColumnMetaData.FieldType.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxResultset.ColumnMetaData.FieldType.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxResultset.ColumnMetaData.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxResultset.ColumnMetaData.FieldType valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxResultset.ColumnMetaData.FieldType.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxResultset.ColumnMetaData.FieldType(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxResultset.ColumnMetaData.FieldType>(){

            public MysqlxResultset.ColumnMetaData.FieldType findValueByNumber(int number) {
                return MysqlxResultset.ColumnMetaData.FieldType.forNumber(number);
            }
        };
        VALUES = MysqlxResultset.ColumnMetaData.FieldType.values();
    }
}
