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

public static enum MysqlxCrud.ViewSqlSecurity implements ProtocolMessageEnum
{
    INVOKER(1),
    DEFINER(2);

    public static final int INVOKER_VALUE = 1;
    public static final int DEFINER_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxCrud.ViewSqlSecurity> internalValueMap;
    private static final MysqlxCrud.ViewSqlSecurity[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.ViewSqlSecurity valueOf(int value) {
        return MysqlxCrud.ViewSqlSecurity.forNumber(value);
    }

    public static MysqlxCrud.ViewSqlSecurity forNumber(int value) {
        switch (value) {
            case 1: {
                return INVOKER;
            }
            case 2: {
                return DEFINER;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.ViewSqlSecurity> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.ViewSqlSecurity.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.ViewSqlSecurity.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.getDescriptor().getEnumTypes().get(2);
    }

    public static MysqlxCrud.ViewSqlSecurity valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.ViewSqlSecurity.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.ViewSqlSecurity(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.ViewSqlSecurity>(){

            public MysqlxCrud.ViewSqlSecurity findValueByNumber(int number) {
                return MysqlxCrud.ViewSqlSecurity.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.ViewSqlSecurity.values();
    }
}
