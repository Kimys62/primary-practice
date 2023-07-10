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

public static enum MysqlxNotice.Frame.Type implements ProtocolMessageEnum
{
    WARNING(1),
    SESSION_VARIABLE_CHANGED(2),
    SESSION_STATE_CHANGED(3),
    GROUP_REPLICATION_STATE_CHANGED(4),
    SERVER_HELLO(5);

    public static final int WARNING_VALUE = 1;
    public static final int SESSION_VARIABLE_CHANGED_VALUE = 2;
    public static final int SESSION_STATE_CHANGED_VALUE = 3;
    public static final int GROUP_REPLICATION_STATE_CHANGED_VALUE = 4;
    public static final int SERVER_HELLO_VALUE = 5;
    private static final Internal.EnumLiteMap<MysqlxNotice.Frame.Type> internalValueMap;
    private static final MysqlxNotice.Frame.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxNotice.Frame.Type valueOf(int value) {
        return MysqlxNotice.Frame.Type.forNumber(value);
    }

    public static MysqlxNotice.Frame.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return WARNING;
            }
            case 2: {
                return SESSION_VARIABLE_CHANGED;
            }
            case 3: {
                return SESSION_STATE_CHANGED;
            }
            case 4: {
                return GROUP_REPLICATION_STATE_CHANGED;
            }
            case 5: {
                return SERVER_HELLO;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxNotice.Frame.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxNotice.Frame.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxNotice.Frame.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxNotice.Frame.getDescriptor().getEnumTypes().get(1);
    }

    public static MysqlxNotice.Frame.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxNotice.Frame.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxNotice.Frame.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxNotice.Frame.Type>(){

            public MysqlxNotice.Frame.Type findValueByNumber(int number) {
                return MysqlxNotice.Frame.Type.forNumber(number);
            }
        };
        VALUES = MysqlxNotice.Frame.Type.values();
    }
}
