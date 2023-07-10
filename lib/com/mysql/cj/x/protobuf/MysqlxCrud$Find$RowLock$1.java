/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxCrud;

static final class MysqlxCrud.Find.RowLock.1
implements Internal.EnumLiteMap<MysqlxCrud.Find.RowLock> {
    MysqlxCrud.Find.RowLock.1() {
    }

    public MysqlxCrud.Find.RowLock findValueByNumber(int number) {
        return MysqlxCrud.Find.RowLock.forNumber(number);
    }
}
