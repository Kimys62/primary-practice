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

public static enum MysqlxCrud.ViewCheckOption implements ProtocolMessageEnum
{
    LOCAL(1),
    CASCADED(2);

    public static final int LOCAL_VALUE = 1;
    public static final int CASCADED_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxCrud.ViewCheckOption> internalValueMap;
    private static final MysqlxCrud.ViewCheckOption[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.ViewCheckOption valueOf(int value) {
        return MysqlxCrud.ViewCheckOption.forNumber(value);
    }

    public static MysqlxCrud.ViewCheckOption forNumber(int value) {
        switch (value) {
            case 1: {
                return LOCAL;
            }
            case 2: {
                return CASCADED;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.ViewCheckOption> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.ViewCheckOption.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.ViewCheckOption.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.getDescriptor().getEnumTypes().get(3);
    }

    public static MysqlxCrud.ViewCheckOption valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.ViewCheckOption.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.ViewCheckOption(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.ViewCheckOption>(){

            public MysqlxCrud.ViewCheckOption findValueByNumber(int number) {
                return MysqlxCrud.ViewCheckOption.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.ViewCheckOption.values();
    }
}
