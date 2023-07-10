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

public static enum MysqlxCrud.DataModel implements ProtocolMessageEnum
{
    DOCUMENT(1),
    TABLE(2);

    public static final int DOCUMENT_VALUE = 1;
    public static final int TABLE_VALUE = 2;
    private static final Internal.EnumLiteMap<MysqlxCrud.DataModel> internalValueMap;
    private static final MysqlxCrud.DataModel[] VALUES;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static MysqlxCrud.DataModel valueOf(int value) {
        return MysqlxCrud.DataModel.forNumber(value);
    }

    public static MysqlxCrud.DataModel forNumber(int value) {
        switch (value) {
            case 1: {
                return DOCUMENT;
            }
            case 2: {
                return TABLE;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<MysqlxCrud.DataModel> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)MysqlxCrud.DataModel.getDescriptor().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return MysqlxCrud.DataModel.getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor)MysqlxCrud.getDescriptor().getEnumTypes().get(0);
    }

    public static MysqlxCrud.DataModel valueOf(Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != MysqlxCrud.DataModel.getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private MysqlxCrud.DataModel(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<MysqlxCrud.DataModel>(){

            public MysqlxCrud.DataModel findValueByNumber(int number) {
                return MysqlxCrud.DataModel.forNumber(number);
            }
        };
        VALUES = MysqlxCrud.DataModel.values();
    }
}
