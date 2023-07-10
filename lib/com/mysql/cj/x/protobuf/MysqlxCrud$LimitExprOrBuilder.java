/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxExpr;

public static interface MysqlxCrud.LimitExprOrBuilder
extends MessageOrBuilder {
    public boolean hasRowCount();

    public MysqlxExpr.Expr getRowCount();

    public MysqlxExpr.ExprOrBuilder getRowCountOrBuilder();

    public boolean hasOffset();

    public MysqlxExpr.Expr getOffset();

    public MysqlxExpr.ExprOrBuilder getOffsetOrBuilder();
}
