/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.util.List;

public static interface MysqlxExpr.ArrayOrBuilder
extends MessageOrBuilder {
    public List<MysqlxExpr.Expr> getValueList();

    public MysqlxExpr.Expr getValue(int var1);

    public int getValueCount();

    public List<? extends MysqlxExpr.ExprOrBuilder> getValueOrBuilderList();

    public MysqlxExpr.ExprOrBuilder getValueOrBuilder(int var1);
}
