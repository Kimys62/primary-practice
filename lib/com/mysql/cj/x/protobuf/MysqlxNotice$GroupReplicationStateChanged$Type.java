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

public static enum MysqlxNotice.GroupReplicationStateChanged.Type implements ProtocolMessageEnum
{
    MEMBERSHIP_QUORUM_LOSS(1),
    MEMBERSHIP_VIEW_CHANGE(2),
    MEMBER_ROLE_CHANGE(3),
    MEMBER_STATE_CHANGE(4);

    public static final int MEMBERSHIP_QUORUM_LOSS_VALUE = 1;
    public static final int MEMBERSHIP_VIEW_CHANGE_VALUE = 2;
    public static final int MEMBER_ROLE_CHANGE_VALUE = 3;
    public static final int MEMBER_STATE_CHANGE_VALUE = 4;
    private static final Internal.EnumLiteMap<MysqlxNotice.GroupReplicationStateChanged.Type> internalValueMap;
    private static final MysqlxNotice.GroupReplicationStateChanged.Type[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxNotice.GroupReplicationStateChanged.Type valueOf(int value) {
        return MysqlxNotice.GroupReplicationStateChanged.Type.forNumber(value);
    }

    public static MysqlxNotice.GroupReplicationStateChanged.Type forNumber(int value) {
        switch (value) {
            case 1: {
                return MEMBERSHIP_QUORUM_LOSS;
            }
            case 2: {
                return MEMBERSHIP_VIEW_CHANGE;
            }
            case 3: {
                return MEMBER_ROLE_CHANGE;
            }
            case 4: {
                return MEMBER_STATE_CHANGE;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxNotice.GroupReplicationStateChanged.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxNotice.GroupReplicationStateChanged.Type.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxNotice.GroupReplicationStateChanged.Type.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxNotice.GroupReplicationStateChanged.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxNotice.GroupReplicationStateChanged.Type valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxNotice.GroupReplicationStateChanged.Type.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxNotice.GroupReplicationStateChanged.Type(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxNotice.GroupReplicationStateChanged.Type>(){

            public MysqlxNotice.GroupReplicationStateChanged.Type findValueByNumber(int number) {
                return MysqlxNotice.GroupReplicationStateChanged.Type.forNumber(number);
            }
        };
        VALUES = MysqlxNotice.GroupReplicationStateChanged.Type.values();
    }
}
