/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.x.protobuf.MysqlxExpr;

@FunctionalInterface
static interface ExprParser.ParseExpr {
    public MysqlxExpr.Expr parseExpr();
}
