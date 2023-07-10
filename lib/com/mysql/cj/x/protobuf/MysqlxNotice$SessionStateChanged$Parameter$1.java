/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxNotice;

static final class MysqlxNotice.SessionStateChanged.Parameter.1
implements Internal.EnumLiteMap<MysqlxNotice.SessionStateChanged.Parameter> {
    MysqlxNotice.SessionStateChanged.Parameter.1() {
    }

    public MysqlxNotice.SessionStateChanged.Parameter findValueByNumber(int number) {
        return MysqlxNotice.SessionStateChanged.Parameter.forNumber(number);
    }
}
