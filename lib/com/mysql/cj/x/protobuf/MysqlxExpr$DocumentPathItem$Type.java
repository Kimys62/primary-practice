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
import com.mysql.cj.x.protobuf.MysqlxExpr;

public static enum MysqlxExpr.DocumentPathItem.Type implements ProtocolMessageEnum
{
    MEMBER(1),
    MEMBER_ASTERISK(2),
    ARRAY_INDEX(3),
    ARRAY_INDEX_ASTERISK(4),
    DOUBLE_ASTERISK(5);

    public static final int MEMBER_VALUE = 1;
    public static final int MEMBER_ASTERISK_VALUE = 2;
    public static final int ARRAY_INDEX_VALUE = 3;
    public static final int ARRAY_INDEX_ASTERISK_VALUE = 4;
    public static final int DOUBLE_ASTERISK_VALUE = 5;
    private static final Internal.EnumLiteMap<MysqlxExpr.DocumentPathItem.Type> internalValueMap;
    private static final MysqlxExpr.DocumentPathItem.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxExpr.DocumentPathItem.Type valueOf(int value) {
        return MysqlxExpr.DocumentPathItem.Type.forNumber(value);
    }

    public static MysqlxExpr.DocumentPathItem.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return MEMBER;
            }
            case 2: {
                return MEMBER_ASTERISK;
            }
            case 3: {
                return ARRAY_INDEX;
            }
            case 4: {
                return ARRAY_INDEX_ASTERISK;
            }
            case 5: {
                return DOUBLE_ASTERISK;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxExpr.DocumentPathItem.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxExpr.DocumentPathItem.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxExpr.DocumentPathItem.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxExpr.DocumentPathItem.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxExpr.DocumentPathItem.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxExpr.DocumentPathItem.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxExpr.DocumentPathItem.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxExpr.DocumentPathItem.Type>(){

            public MysqlxExpr.DocumentPathItem.Type findValueByNumber(int number) {
                return MysqlxExpr.DocumentPathItem.Type.forNumber(number);
            }
        };
        VALUES = MysqlxExpr.DocumentPathItem.Type.values();
    }
}
