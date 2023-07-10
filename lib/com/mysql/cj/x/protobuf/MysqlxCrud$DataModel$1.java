/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxCrud;

static final class MysqlxCrud.DataModel.1
implements Internal.EnumLiteMap<MysqlxCrud.DataModel> {
    MysqlxCrud.DataModel.1() {
    }

    public MysqlxCrud.DataModel findValueByNumber(int number) {
        return MysqlxCrud.DataModel.forNumber(number);
    }
}
