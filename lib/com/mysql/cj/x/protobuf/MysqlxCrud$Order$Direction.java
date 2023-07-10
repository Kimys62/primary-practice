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
import com.mysql.cj.x.protobuf.MysqlxCrud;

public static enum MysqlxCrud.Order.Direction implements ProtocolMessageEnum
{
    ASC(1),
    DESC(2);

    public static final int ASC_VALUE = 1;
    public static final int DESC_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxCrud.Order.Direction> internalValueMap;
    private static final MysqlxCrud.Order.Direction[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.Order.Direction valueOf(int value) {
        return MysqlxCrud.Order.Direction.forNumber(value);
    }

    public static MysqlxCrud.Order.Direction forNumber(int value) {
        switch (value) {
            case 1: {
                return ASC;
            }
            case 2: {
                return DESC;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.Order.Direction> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.Order.Direction.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.Order.Direction.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.Order.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxCrud.Order.Direction valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.Order.Direction.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.Order.Direction(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.Order.Direction>(){

            public MysqlxCrud.Order.Direction findValueByNumber(int number) {
                return MysqlxCrud.Order.Direction.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.Order.Direction.values();
    }
}
