/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxNotice;

static final class MysqlxNotice.Warning.Level.1
implements Internal.EnumLiteMap<MysqlxNotice.Warning.Level> {
    MysqlxNotice.Warning.Level.1() {
    }

    public MysqlxNotice.Warning.Level findValueByNumber(int number) {
        return MysqlxNotice.Warning.Level.forNumber(number);
    }
}
