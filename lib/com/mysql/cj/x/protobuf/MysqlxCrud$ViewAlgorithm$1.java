/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxCrud;

static final class MysqlxCrud.ViewAlgorithm.1
implements Internal.EnumLiteMap<MysqlxCrud.ViewAlgorithm> {
    MysqlxCrud.ViewAlgorithm.1() {
    }

    public MysqlxCrud.ViewAlgorithm findValueByNumber(int number) {
        return MysqlxCrud.ViewAlgorithm.forNumber(number);
    }
}
