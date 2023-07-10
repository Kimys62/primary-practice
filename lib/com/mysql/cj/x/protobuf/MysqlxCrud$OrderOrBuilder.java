/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;

public static interface MysqlxCrud.OrderOrBuilder
extends MessageOrBuilder {
    public boolean hasExpr();

    public MysqlxExpr.Expr getExpr();

    public MysqlxExpr.ExprOrBuilder getExprOrBuilder();

    public boolean hasDirection();

    public MysqlxCrud.Order.Direction getDirection();
}
