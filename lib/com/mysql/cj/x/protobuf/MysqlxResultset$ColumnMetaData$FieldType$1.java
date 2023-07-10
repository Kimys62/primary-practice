/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxResultset;

static final class MysqlxResultset.ColumnMetaData.FieldType.1
implements Internal.EnumLiteMap<MysqlxResultset.ColumnMetaData.FieldType> {
    MysqlxResultset.ColumnMetaData.FieldType.1() {
    }

    public MysqlxResultset.ColumnMetaData.FieldType findValueByNumber(int number) {
        return MysqlxResultset.ColumnMetaData.FieldType.forNumber(number);
    }
}
