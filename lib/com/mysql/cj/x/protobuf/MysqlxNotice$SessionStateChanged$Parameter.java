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

public static enum MysqlxNotice.SessionStateChanged.Parameter implements ProtocolMessageEnum
{
    CURRENT_SCHEMA(1),
    ACCOUNT_EXPIRED(2),
    GENERATED_INSERT_ID(3),
    ROWS_AFFECTED(4),
    ROWS_FOUND(5),
    ROWS_MATCHED(6),
    TRX_COMMITTED(7),
    TRX_ROLLEDBACK(9),
    PRODUCED_MESSAGE(10),
    CLIENT_ID_ASSIGNED(11),
    GENERATED_DOCUMENT_IDS(12);

    public static final int CURRENT_SCHEMA_VALUE = 1;
    public static final int ACCOUNT_EXPIRED_VALUE = 2;
    public static final int GENERATED_INSERT_ID_VALUE = 3;
    public static final int ROWS_AFFECTED_VALUE = 4;
    public static final int ROWS_FOUND_VALUE = 5;
    public static final int ROWS_MATCHED_VALUE = 6;
    public static final int TRX_COMMITTED_VALUE = 7;
    public static final int TRX_ROLLEDBACK_VALUE = 9;
    public static final int PRODUCED_MESSAGE_VALUE = 10;
    public static final int CLIENT_ID_ASSIGNED_VALUE = 11;
    public static final int GENERATED_DOCUMENT_IDS_VALUE = 12;
    private static final Internal.EnumLiteMap<MysqlxNotice.SessionStateChanged.Parameter> internalValueMap;
    private static final MysqlxNotice.SessionStateChanged.Parameter[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxNotice.SessionStateChanged.Parameter valueOf(int value) {
        return MysqlxNotice.SessionStateChanged.Parameter.forNumber(value);
    }

    public static MysqlxNotice.SessionStateChanged.Parameter forNumber(int value) {
        switch (value) {
            case 1: {
                return CURRENT_SCHEMA;
            }
            case 2: {
                return ACCOUNT_EXPIRED;
            }
            case 3: {
                return GENERATED_INSERT_ID;
            }
            case 4: {
                return ROWS_AFFECTED;
            }
            case 5: {
                return ROWS_FOUND;
            }
            case 6: {
                return ROWS_MATCHED;
            }
            case 7: {
                return TRX_COMMITTED;
            }
            case 9: {
                return TRX_ROLLEDBACK;
            }
            case 10: {
                return PRODUCED_MESSAGE;
            }
            case 11: {
                return CLIENT_ID_ASSIGNED;
            }
            case 12: {
                return GENERATED_DOCUMENT_IDS;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxNotice.SessionStateChanged.Parameter> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxNotice.SessionStateChanged.Parameter.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxNotice.SessionStateChanged.Parameter.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxNotice.SessionStateChanged.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxNotice.SessionStateChanged.Parameter valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxNotice.SessionStateChanged.Parameter.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxNotice.SessionStateChanged.Parameter(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxNotice.SessionStateChanged.Parameter>(){

            public MysqlxNotice.SessionStateChanged.Parameter findValueByNumber(int number) {
                return MysqlxNotice.SessionStateChanged.Parameter.forNumber(number);
            }
        };
        VALUES = MysqlxNotice.SessionStateChanged.Parameter.values();
    }
}
