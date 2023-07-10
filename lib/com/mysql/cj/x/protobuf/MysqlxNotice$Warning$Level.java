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
import com.mysql.cj.x.protobuf.MysqlxNotice;

public static enum MysqlxNotice.Warning.Level implements ProtocolMessageEnum
{
    NOTE(1),
    WARNING(2),
    ERROR(3);

    public static final int NOTE_VALUE = 1;
    public static final int WARNING_VALUE = 2;
    public static final int ERROR_VALUE = 3;
    private static final Internal.EnumLiteMap<MysqlxNotice.Warning.Level> internalValueMap;
    private static final MysqlxNotice.Warning.Level[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxNotice.Warning.Level valueOf(int value) {
        return MysqlxNotice.Warning.Level.forNumber(value);
    }

    public static MysqlxNotice.Warning.Level forNumber(int value) {
        switch (value) {
            case 1: {
                return NOTE;
            }
            case 2: {
                return WARNING;
            }
            case 3: {
                return ERROR;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxNotice.Warning.Level> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxNotice.Warning.Level.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxNotice.Warning.Level.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxNotice.Warning.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxNotice.Warning.Level valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxNotice.Warning.Level.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxNotice.Warning.Level(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxNotice.Warning.Level>(){

            public MysqlxNotice.Warning.Level findValueByNumber(int number) {
                return MysqlxNotice.Warning.Level.forNumber(number);
            }
        };
        VALUES = MysqlxNotice.Warning.Level.values();
    }
}
