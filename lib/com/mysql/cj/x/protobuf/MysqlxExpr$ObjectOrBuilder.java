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

public static interface MysqlxExpr.ObjectOrBuilder
extends MessageOrBuilder {
    public List<MysqlxExpr.Object.ObjectField> getFldList();

    public MysqlxExpr.Object.ObjectField getFld(int var1);

    public int getFldCount();

    public List<? extends MysqlxExpr.Object.ObjectFieldOrBuilder> getFldOrBuilderList();

    public MysqlxExpr.Object.ObjectFieldOrBuilder getFldOrBuilder(int var1);
}
