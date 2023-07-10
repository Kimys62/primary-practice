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

public static interface MysqlxCrud.UpdateOperationOrBuilder
extends MessageOrBuilder {
    public boolean hasSource();

    public MysqlxExpr.ColumnIdentifier getSource();

    public MysqlxExpr.ColumnIdentifierOrBuilder getSourceOrBuilder();

    public boolean hasOperation();

    public MysqlxCrud.UpdateOperation.UpdateType getOperation();

    public boolean hasValue();

    public MysqlxExpr.Expr getValue();

    public MysqlxExpr.ExprOrBuilder getValueOrBuilder();
}
