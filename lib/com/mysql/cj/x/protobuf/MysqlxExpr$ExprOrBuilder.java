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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;

public static interface MysqlxExpr.ExprOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxExpr.Expr.Type getType();

    public boolean hasIdentifier();

    public MysqlxExpr.ColumnIdentifier getIdentifier();

    public MysqlxExpr.ColumnIdentifierOrBuilder getIdentifierOrBuilder();

    public boolean hasVariable();

    public String getVariable();

    public ByteString getVariableBytes();

    public boolean hasLiteral();

    public MysqlxDatatypes.Scalar getLiteral();

    public MysqlxDatatypes.ScalarOrBuilder getLiteralOrBuilder();

    public boolean hasFunctionCall();

    public MysqlxExpr.FunctionCall getFunctionCall();

    public MysqlxExpr.FunctionCallOrBuilder getFunctionCallOrBuilder();

    public boolean hasOperator();

    public MysqlxExpr.Operator getOperator();

    public MysqlxExpr.OperatorOrBuilder getOperatorOrBuilder();

    public boolean hasPosition();

    public int getPosition();

    public boolean hasObject();

    public MysqlxExpr.Object getObject();

    public MysqlxExpr.ObjectOrBuilder getObjectOrBuilder();

    public boolean hasArray();

    public MysqlxExpr.Array getArray();

    public MysqlxExpr.ArrayOrBuilder getArrayOrBuilder();
}
