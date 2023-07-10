/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxNotice;

static final class MysqlxNotice.Frame.Type.1
implements Internal.EnumLiteMap<MysqlxNotice.Frame.Type> {
    MysqlxNotice.Frame.Type.1() {
    }

    public MysqlxNotice.Frame.Type findValueByNumber(int number) {
        return MysqlxNotice.Frame.Type.forNumber(number);
    }
}
