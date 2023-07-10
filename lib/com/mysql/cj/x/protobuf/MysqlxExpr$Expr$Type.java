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

public static enum MysqlxExpr.Expr.Type implements ProtocolMessageEnum
{
    IDENT(1),
    LITERAL(2),
    VARIABLE(3),
    FUNC_CALL(4),
    OPERATOR(5),
    PLACEHOLDER(6),
    OBJECT(7),
    ARRAY(8);

    public static final int IDENT_VALUE = 1;
    public static final int LITERAL_VALUE = 2;
    public static final int VARIABLE_VALUE = 3;
    public static final int FUNC_CALL_VALUE = 4;
    public static final int OPERATOR_VALUE = 5;
    public static final int PLACEHOLDER_VALUE = 6;
    public static final int OBJECT_VALUE = 7;
    public static final int ARRAY_VALUE = 8;
    private static final Internal.EnumLiteMap<MysqlxExpr.Expr.Type> internalValueMap;
    private static final MysqlxExpr.Expr.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxExpr.Expr.Type valueOf(int value) {
        return MysqlxExpr.Expr.Type.forNumber(value);
    }

    public static MysqlxExpr.Expr.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return IDENT;
            }
            case 2: {
                return LITERAL;
            }
            case 3: {
                return VARIABLE;
            }
            case 4: {
                return FUNC_CALL;
            }
            case 5: {
                return OPERATOR;
            }
            case 6: {
                return PLACEHOLDER;
            }
            case 7: {
                return OBJECT;
            }
            case 8: {
                return ARRAY;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxExpr.Expr.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxExpr.Expr.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxExpr.Expr.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxExpr.Expr.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxExpr.Expr.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxExpr.Expr.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxExpr.Expr.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxExpr.Expr.Type>(){

            public MysqlxExpr.Expr.Type findValueByNumber(int number) {
                return MysqlxExpr.Expr.Type.forNumber(number);
            }
        };
        VALUES = MysqlxExpr.Expr.Type.values();
    }
}
