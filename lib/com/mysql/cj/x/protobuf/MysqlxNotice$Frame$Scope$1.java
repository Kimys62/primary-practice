/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxNotice;

static final class MysqlxNotice.Frame.Scope.1
implements Internal.EnumLiteMap<MysqlxNotice.Frame.Scope> {
    MysqlxNotice.Frame.Scope.1() {
    }

    public MysqlxNotice.Frame.Scope findValueByNumber(int number) {
        return MysqlxNotice.Frame.Scope.forNumber(number);
    }
}
