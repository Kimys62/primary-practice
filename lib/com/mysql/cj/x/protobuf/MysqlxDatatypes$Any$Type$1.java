/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

static final class MysqlxDatatypes.Any.Type.1
implements Internal.EnumLiteMap<MysqlxDatatypes.Any.Type> {
    MysqlxDatatypes.Any.Type.1() {
    }

    public MysqlxDatatypes.Any.Type findValueByNumber(int number) {
        return MysqlxDatatypes.Any.Type.forNumber(number);
    }
}
