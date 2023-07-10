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

public static enum MysqlxCrud.Find.RowLock implements ProtocolMessageEnum
{
    SHARED_LOCK(1),
    EXCLUSIVE_LOCK(2);

    public static final int SHARED_LOCK_VALUE = 1;
    public static final int EXCLUSIVE_LOCK_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxCrud.Find.RowLock> internalValueMap;
    private static final MysqlxCrud.Find.RowLock[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.Find.RowLock valueOf(int value) {
        return MysqlxCrud.Find.RowLock.forNumber(value);
    }

    public static MysqlxCrud.Find.RowLock forNumber(int value) {
        switch (value) {
            case 1: {
                return SHARED_LOCK;
            }
            case 2: {
                return EXCLUSIVE_LOCK;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.Find.RowLock> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.Find.RowLock.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.Find.RowLock.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.Find.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxCrud.Find.RowLock valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.Find.RowLock.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.Find.RowLock(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.Find.RowLock>(){

            public MysqlxCrud.Find.RowLock findValueByNumber(int number) {
                return MysqlxCrud.Find.RowLock.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.Find.RowLock.values();
    }
}
