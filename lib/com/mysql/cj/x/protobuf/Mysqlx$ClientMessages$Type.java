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
import com.mysql.cj.x.protobuf.Mysqlx;

public static enum Mysqlx.ClientMessages.Type implements ProtocolMessageEnum
{
    CON_CAPABILITIES_GET(1),
    CON_CAPABILITIES_SET(2),
    CON_CLOSE(3),
    SESS_AUTHENTICATE_START(4),
    SESS_AUTHENTICATE_CONTINUE(5),
    SESS_RESET(6),
    SESS_CLOSE(7),
    SQL_STMT_EXECUTE(12),
    CRUD_FIND(17),
    CRUD_INSERT(18),
    CRUD_UPDATE(19),
    CRUD_DELETE(20),
    EXPECT_OPEN(24),
    EXPECT_CLOSE(25),
    CRUD_CREATE_VIEW(30),
    CRUD_MODIFY_VIEW(31),
    CRUD_DROP_VIEW(32),
    PREPARE_PREPARE(40),
    PREPARE_EXECUTE(41),
    PREPARE_DEALLOCATE(42),
    CURSOR_OPEN(43),
    CURSOR_CLOSE(44),
    CURSOR_FETCH(45),
    COMPRESSION(46);

    public static final int CON_CAPABILITIES_GET_VALUE = 1;
    public static final int CON_CAPABILITIES_SET_VALUE = 2;
    public static final int CON_CLOSE_VALUE = 3;
    public static final int SESS_AUTHENTICATE_START_VALUE = 4;
    public static final int SESS_AUTHENTICATE_CONTINUE_VALUE = 5;
    public static final int SESS_RESET_VALUE = 6;
    public static final int SESS_CLOSE_VALUE = 7;
    public static final int SQL_STMT_EXECUTE_VALUE = 12;
    public static final int CRUD_FIND_VALUE = 17;
    public static final int CRUD_INSERT_VALUE = 18;
    public static final int CRUD_UPDATE_VALUE = 19;
    public static final int CRUD_DELETE_VALUE = 20;
    public static final int EXPECT_OPEN_VALUE = 24;
    public static final int EXPECT_CLOSE_VALUE = 25;
    public static final int CRUD_CREATE_VIEW_VALUE = 30;
    public static final int CRUD_MODIFY_VIEW_VALUE = 31;
    public static final int CRUD_DROP_VIEW_VALUE = 32;
    public static final int PREPARE_PREPARE_VALUE = 40;
    public static final int PREPARE_EXECUTE_VALUE = 41;
    public static final int PREPARE_DEALLOCATE_VALUE = 42;
    public static final int CURSOR_OPEN_VALUE = 43;
    public static final int CURSOR_CLOSE_VALUE = 44;
    public static final int CURSOR_FETCH_VALUE = 45;
    public static final int COMPRESSION_VALUE = 46;
    private static final Internal.EnumLiteMap<Mysqlx.ClientMessages.Type> internalValueMap;
    private static final Mysqlx.ClientMessages.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Mysqlx.ClientMessages.Type valueOf(int value) {
        return Mysqlx.ClientMessages.Type.forNumber(value);
    }

    public static Mysqlx.ClientMessages.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return CON_CAPABILITIES_GET;
            }
            case 2: {
                return CON_CAPABILITIES_SET;
            }
            case 3: {
                return CON_CLOSE;
            }
            case 4: {
                return SESS_AUTHENTICATE_START;
            }
            case 5: {
                return SESS_AUTHENTICATE_CONTINUE;
            }
            case 6: {
                return SESS_RESET;
            }
            case 7: {
                return SESS_CLOSE;
            }
            case 12: {
                return SQL_STMT_EXECUTE;
            }
            case 17: {
                return CRUD_FIND;
            }
            case 18: {
                return CRUD_INSERT;
            }
            case 19: {
                return CRUD_UPDATE;
            }
            case 20: {
                return CRUD_DELETE;
            }
            case 24: {
                return EXPECT_OPEN;
            }
            case 25: {
                return EXPECT_CLOSE;
            }
            case 30: {
                return CRUD_CREATE_VIEW;
            }
            case 31: {
                return CRUD_MODIFY_VIEW;
            }
            case 32: {
                return CRUD_DROP_VIEW;
            }
            case 40: {
                return PREPARE_PREPARE;
            }
            case 41: {
                return PREPARE_EXECUTE;
            }
            case 42: {
                return PREPARE_DEALLOCATE;
            }
            case 43: {
                return CURSOR_OPEN;
            }
            case 44: {
                return CURSOR_CLOSE;
            }
            case 45: {
                return CURSOR_FETCH;
            }
            case 46: {
                return COMPRESSION;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<Mysqlx.ClientMessages.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)Mysqlx.ClientMessages.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return Mysqlx.ClientMessages.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)Mysqlx.ClientMessages.getDescriptor().getEnumTypes().get(0);
    }

    public static Mysqlx.ClientMessages.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != Mysqlx.ClientMessages.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private Mysqlx.ClientMessages.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<Mysqlx.ClientMessages.Type>(){

            public Mysqlx.ClientMessages.Type findValueByNumber(int number) {
                return Mysqlx.ClientMessages.Type.forNumber(number);
            }
        };
        VALUES = Mysqlx.ClientMessages.Type.values();
    }
}
