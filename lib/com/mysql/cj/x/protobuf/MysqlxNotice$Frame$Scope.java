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

public static enum MysqlxNotice.Frame.Scope implements ProtocolMessageEnum
{
    GLOBAL(1),
    LOCAL(2);

    public static final int GLOBAL_VALUE = 1;
    public static final int LOCAL_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxNotice.Frame.Scope> internalValueMap;
    private static final MysqlxNotice.Frame.Scope[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxNotice.Frame.Scope valueOf(int value) {
        return MysqlxNotice.Frame.Scope.forNumber(value);
    }

    public static MysqlxNotice.Frame.Scope forNumber(int value) {
        switch (value) {
            case 1: {
                return GLOBAL;
            }
            case 2: {
                return LOCAL;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxNotice.Frame.Scope> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxNotice.Frame.Scope.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxNotice.Frame.Scope.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxNotice.Frame.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxNotice.Frame.Scope valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxNotice.Frame.Scope.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxNotice.Frame.Scope(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxNotice.Frame.Scope>(){

            public MysqlxNotice.Frame.Scope findValueByNumber(int number) {
                return MysqlxNotice.Frame.Scope.forNumber(number);
            }
        };
        VALUES = MysqlxNotice.Frame.Scope.values();
    }
}
