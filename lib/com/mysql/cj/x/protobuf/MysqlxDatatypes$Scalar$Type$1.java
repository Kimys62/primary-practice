/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

static final class MysqlxDatatypes.Scalar.Type.1
implements Internal.EnumLiteMap<MysqlxDatatypes.Scalar.Type> {
    MysqlxDatatypes.Scalar.Type.1() {
    }

    public MysqlxDatatypes.Scalar.Type findValueByNumber(int number) {
        return MysqlxDatatypes.Scalar.Type.forNumber(number);
    }
}
