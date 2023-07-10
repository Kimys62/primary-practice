/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.Mysqlx;

static final class Mysqlx.Error.Severity.1
implements Internal.EnumLiteMap<Mysqlx.Error.Severity> {
    Mysqlx.Error.Severity.1() {
    }

    public Mysqlx.Error.Severity findValueByNumber(int number) {
        return Mysqlx.Error.Severity.forNumber(number);
    }
}
