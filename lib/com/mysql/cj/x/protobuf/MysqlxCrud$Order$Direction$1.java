/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxCrud;

static final class MysqlxCrud.Order.Direction.1
implements Internal.EnumLiteMap<MysqlxCrud.Order.Direction> {
    MysqlxCrud.Order.Direction.1() {
    }

    public MysqlxCrud.Order.Direction findValueByNumber(int number) {
        return MysqlxCrud.Order.Direction.forNumber(number);
    }
}
