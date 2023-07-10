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

public static interface MysqlxCrud.ProjectionOrBuilder
extends MessageOrBuilder {
    public boolean hasSource();

    public MysqlxExpr.Expr getSource();

    public MysqlxExpr.ExprOrBuilder getSourceOrBuilder();

    public boolean hasAlias();

    public String getAlias();

    public ByteString getAliasBytes();
}
