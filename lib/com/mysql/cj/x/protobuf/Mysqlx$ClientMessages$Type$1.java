/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.Mysqlx;

static final class Mysqlx.ClientMessages.Type.1
implements Internal.EnumLiteMap<Mysqlx.ClientMessages.Type> {
    Mysqlx.ClientMessages.Type.1() {
    }

    public Mysqlx.ClientMessages.Type findValueByNumber(int number) {
        return Mysqlx.ClientMessages.Type.forNumber(number);
    }
}
