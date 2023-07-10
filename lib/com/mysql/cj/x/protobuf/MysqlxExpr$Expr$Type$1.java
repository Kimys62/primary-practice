/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLiteMap
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.Internal;
import com.mysql.cj.x.protobuf.MysqlxExpr;

static final class MysqlxExpr.Expr.Type.1
implements Internal.EnumLiteMap<MysqlxExpr.Expr.Type> {
    MysqlxExpr.Expr.Type.1() {
    }

    public MysqlxExpr.Expr.Type findValueByNumber(int number) {
        return MysqlxExpr.Expr.Type.forNumber(number);
    }
}
