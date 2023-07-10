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
import com.mysql.cj.x.protobuf.MysqlxPrepare;

public static enum MysqlxPrepare.Prepare.OneOfMessage.Type implements ProtocolMessageEnum
{
    FIND(0),
    INSERT(1),
    UPDATE(2),
    DELETE(4),
    STMT(5);

    public static final int FIND_VALUE = 0;
    public static final int INSERT_VALUE = 1;
    public static final int UPDATE_VALUE = 2;
    public static final int DELETE_VALUE = 4;
    public static final int STMT_VALUE = 5;
    private static final Internal.EnumLiteMap<MysqlxPrepare.Prepare.OneOfMessage.Type> internalValueMap;
    private static final MysqlxPrepare.Prepare.OneOfMessage.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxPrepare.Prepare.OneOfMessage.Type valueOf(int value) {
        return MysqlxPrepare.Prepare.OneOfMessage.Type.forNumber(value);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage.Type forNumber(int value) {
        switch (value) {
            case 0: {
                return FIND;
            }
            case 1: {
                return INSERT;
            }
            case 2: {
                return UPDATE;
            }
            case 4: {
                return DELETE;
            }
            case 5: {
                return STMT;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxPrepare.Prepare.OneOfMessage.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxPrepare.Prepare.OneOfMessage.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxPrepare.Prepare.OneOfMessage.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxPrepare.Prepare.OneOfMessage.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxPrepare.Prepare.OneOfMessage.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxPrepare.Prepare.OneOfMessage.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxPrepare.Prepare.OneOfMessage.Type>(){

            public MysqlxPrepare.Prepare.OneOfMessage.Type findValueByNumber(int number) {
                return MysqlxPrepare.Prepare.OneOfMessage.Type.forNumber(number);
            }
        };
        VALUES = MysqlxPrepare.Prepare.OneOfMessage.Type.values();
    }
}
