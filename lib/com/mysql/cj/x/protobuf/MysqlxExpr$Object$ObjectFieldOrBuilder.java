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

public static interface MysqlxExpr.Object.ObjectFieldOrBuilder
extends MessageOrBuilder {
    public boolean hasKey();

    public String getKey();

    public ByteString getKeyBytes();

    public boolean hasValue();

    public MysqlxExpr.Expr getValue();

    public MysqlxExpr.ExprOrBuilder getValueOrBuilder();
}
