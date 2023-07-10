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

public static enum Mysqlx.ServerMessages.Type implements ProtocolMessageEnum
{
    OK(0),
    ERROR(1),
    CONN_CAPABILITIES(2),
    SESS_AUTHENTICATE_CONTINUE(3),
    SESS_AUTHENTICATE_OK(4),
    NOTICE(11),
    RESULTSET_COLUMN_META_DATA(12),
    RESULTSET_ROW(13),
    RESULTSET_FETCH_DONE(14),
    RESULTSET_FETCH_SUSPENDED(15),
    RESULTSET_FETCH_DONE_MORE_RESULTSETS(16),
    SQL_STMT_EXECUTE_OK(17),
    RESULTSET_FETCH_DONE_MORE_OUT_PARAMS(18),
    COMPRESSION(19);

    public static final int OK_VALUE = 0;
    public static final int ERROR_VALUE = 1;
    public static final int CONN_CAPABILITIES_VALUE = 2;
    public static final int SESS_AUTHENTICATE_CONTINUE_VALUE = 3;
    public static final int SESS_AUTHENTICATE_OK_VALUE = 4;
    public static final int NOTICE_VALUE = 11;
    public static final int RESULTSET_COLUMN_META_DATA_VALUE = 12;
    public static final int RESULTSET_ROW_VALUE = 13;
    public static final int RESULTSET_FETCH_DONE_VALUE = 14;
    public static final int RESULTSET_FETCH_SUSPENDED_VALUE = 15;
    public static final int RESULTSET_FETCH_DONE_MORE_RESULTSETS_VALUE = 16;
    public static final int SQL_STMT_EXECUTE_OK_VALUE = 17;
    public static final int RESULTSET_FETCH_DONE_MORE_OUT_PARAMS_VALUE = 18;
    public static final int COMPRESSION_VALUE = 19;
    private static final Internal.EnumLiteMap<Mysqlx.ServerMessages.Type> internalValueMap;
    private static final Mysqlx.ServerMessages.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Mysqlx.ServerMessages.Type valueOf(int value) {
        return Mysqlx.ServerMessages.Type.forNumber(value);
    }

    public static Mysqlx.ServerMessages.Type forNumber(int value) {
        switch (value) {
            case 0: {
                return OK;
            }
            case 1: {
                return ERROR;
            }
            case 2: {
                return CONN_CAPABILITIES;
            }
            case 3: {
                return SESS_AUTHENTICATE_CONTINUE;
            }
            case 4: {
                return SESS_AUTHENTICATE_OK;
            }
            case 11: {
                return NOTICE;
            }
            case 12: {
                return RESULTSET_COLUMN_META_DATA;
            }
            case 13: {
                return RESULTSET_ROW;
            }
            case 14: {
                return RESULTSET_FETCH_DONE;
            }
            case 15: {
                return RESULTSET_FETCH_SUSPENDED;
            }
            case 16: {
                return RESULTSET_FETCH_DONE_MORE_RESULTSETS;
            }
            case 17: {
                return SQL_STMT_EXECUTE_OK;
            }
            case 18: {
                return RESULTSET_FETCH_DONE_MORE_OUT_PARAMS;
            }
            case 19: {
                return COMPRESSION;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<Mysqlx.ServerMessages.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)Mysqlx.ServerMessages.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return Mysqlx.ServerMessages.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)Mysqlx.ServerMessages.getDescriptor().getEnumTypes().get(0);
    }

    public static Mysqlx.ServerMessages.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != Mysqlx.ServerMessages.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private Mysqlx.ServerMessages.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<Mysqlx.ServerMessages.Type>(){

            public Mysqlx.ServerMessages.Type findValueByNumber(int number) {
                return Mysqlx.ServerMessages.Type.forNumber(number);
            }
        };
        VALUES = Mysqlx.ServerMessages.Type.values();
    }
}
