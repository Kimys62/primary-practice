/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxNotice;

static final class MysqlxNotice.GroupReplicationStateChanged.Type.1
implements Internal.EnumLiteMap<MysqlxNotice.GroupReplicationStateChanged.Type> {
    MysqlxNotice.GroupReplicationStateChanged.Type.1() {
    }

    public MysqlxNotice.GroupReplicationStateChanged.Type findValueByNumber(int number) {
        return MysqlxNotice.GroupReplicationStateChanged.Type.forNumber(number);
    }
}
