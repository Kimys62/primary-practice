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

public static enum MysqlxCrud.UpdateOperation.UpdateType implements ProtocolMessageEnum
{
    SET(1),
    ITEM_REMOVE(2),
    ITEM_SET(3),
    ITEM_REPLACE(4),
    ITEM_MERGE(5),
    ARRAY_INSERT(6),
    ARRAY_APPEND(7),
    MERGE_PATCH(8);

    public static final int SET_VALUE = 1;
    public static final int ITEM_REMOVE_VALUE = 2;
    public static final int ITEM_SET_VALUE = 3;
    public static final int ITEM_REPLACE_VALUE = 4;
    public static final int ITEM_MERGE_VALUE = 5;
    public static final int ARRAY_INSERT_VALUE = 6;
    public static final int ARRAY_APPEND_VALUE = 7;
    public static final int MERGE_PATCH_VALUE = 8;
    private static final Internal.EnumLiteMap<MysqlxCrud.UpdateOperation.UpdateType> internalValueMap;
    private static final MysqlxCrud.UpdateOperation.UpdateType[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.UpdateOperation.UpdateType valueOf(int value) {
        return MysqlxCrud.UpdateOperation.UpdateType.forNumber(value);
    }

    public static MysqlxCrud.UpdateOperation.UpdateType forNumber(int value) {
        switch (value) {
            case 1: {
                return SET;
            }
            case 2: {
                return ITEM_REMOVE;
            }
            case 3: {
                return ITEM_SET;
            }
            case 4: {
                return ITEM_REPLACE;
            }
            case 5: {
                return ITEM_MERGE;
            }
            case 6: {
                return ARRAY_INSERT;
            }
            case 7: {
                return ARRAY_APPEND;
            }
            case 8: {
                return MERGE_PATCH;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.UpdateOperation.UpdateType> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.UpdateOperation.UpdateType.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.UpdateOperation.UpdateType.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.UpdateOperation.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxCrud.UpdateOperation.UpdateType valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.UpdateOperation.UpdateType.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.UpdateOperation.UpdateType(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.UpdateOperation.UpdateType>(){

            public MysqlxCrud.UpdateOperation.UpdateType findValueByNumber(int number) {
                return MysqlxCrud.UpdateOperation.UpdateType.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.UpdateOperation.UpdateType.values();
    }
}
