/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.util.List;

public static interface MysqlxExpr.OperatorOrBuilder
extends MessageOrBuilder {
    public boolean hasName();

    public String getName();

    public ByteString getNameBytes();

    public List<MysqlxExpr.Expr> getParamList();

    public MysqlxExpr.Expr getParam(int var1);

    public int getParamCount();

    public List<? extends MysqlxExpr.ExprOrBuilder> getParamOrBuilderList();

    public MysqlxExpr.ExprOrBuilder getParamOrBuilder(int var1);
}
