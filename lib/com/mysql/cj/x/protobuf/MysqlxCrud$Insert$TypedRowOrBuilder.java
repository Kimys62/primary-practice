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

public static interface MysqlxCrud.Insert.TypedRowOrBuilder
extends MessageOrBuilder {
    public List<MysqlxExpr.Expr> getFieldList();

    public MysqlxExpr.Expr getField(int var1);

    public int getFieldCount();

    public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList();

    public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int var1);
}
