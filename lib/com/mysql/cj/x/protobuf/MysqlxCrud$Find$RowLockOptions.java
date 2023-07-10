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

public static enum MysqlxCrud.Find.RowLockOptions implements ProtocolMessageEnum
{
    NOWAIT(1),
    SKIP_LOCKED(2);

    public static final int NOWAIT_VALUE = 1;
    public static final int SKIP_LOCKED_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxCrud.Find.RowLockOptions> internalValueMap;
    private static final MysqlxCrud.Find.RowLockOptions[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.Find.RowLockOptions valueOf(int value) {
        return MysqlxCrud.Find.RowLockOptions.forNumber(value);
    }

    public static MysqlxCrud.Find.RowLockOptions forNumber(int value) {
        switch (value) {
            case 1: {
                return NOWAIT;
            }
            case 2: {
                return SKIP_LOCKED;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.Find.RowLockOptions> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.Find.RowLockOptions.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.Find.RowLockOptions.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.Find.getDescriptor().getEnumTypes().get(1);
    }

    public static MysqlxCrud.Find.RowLockOptions valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.Find.RowLockOptions.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.Find.RowLockOptions(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.Find.RowLockOptions>(){

            public MysqlxCrud.Find.RowLockOptions findValueByNumber(int number) {
                return MysqlxCrud.Find.RowLockOptions.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.Find.RowLockOptions.values();
    }
}
