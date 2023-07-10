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

public static enum MysqlxCrud.ViewAlgorithm implements ProtocolMessageEnum
{
    UNDEFINED(1),
    MERGE(2),
    TEMPTABLE(3);

    public static final int UNDEFINED_VALUE = 1;
    public static final int MERGE_VALUE = 2;
    public static final int TEMPTABLE_VALUE = 3;
    private static final Internal.EnumLiteMap<MysqlxCrud.ViewAlgorithm> internalValueMap;
    private static final MysqlxCrud.ViewAlgorithm[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.ViewAlgorithm valueOf(int value) {
        return MysqlxCrud.ViewAlgorithm.forNumber(value);
    }

    public static MysqlxCrud.ViewAlgorithm forNumber(int value) {
        switch (value) {
            case 1: {
                return UNDEFINED;
            }
            case 2: {
                return MERGE;
            }
            case 3: {
                return TEMPTABLE;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.ViewAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.ViewAlgorithm.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.ViewAlgorithm.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.getDescriptor().getEnumTypes().get(1);
    }

    public static MysqlxCrud.ViewAlgorithm valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.ViewAlgorithm.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.ViewAlgorithm(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.ViewAlgorithm>(){

            public MysqlxCrud.ViewAlgorithm findValueByNumber(int number) {
                return MysqlxCrud.ViewAlgorithm.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.ViewAlgorithm.values();
    }
}
