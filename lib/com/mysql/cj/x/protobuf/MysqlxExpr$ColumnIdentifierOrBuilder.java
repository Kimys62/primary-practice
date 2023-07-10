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

public static interface MysqlxExpr.ColumnIdentifierOrBuilder
extends MessageOrBuilder {
    public List<MysqlxExpr.DocumentPathItem> getDocumentPathList();

    public MysqlxExpr.DocumentPathItem getDocumentPath(int var1);

    public int getDocumentPathCount();

    public List<? extends MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathOrBuilderList();

    public MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(int var1);

    public boolean hasName();

    public String getName();

    public ByteString getNameBytes();

    public boolean hasTableName();

    public String getTableName();

    public ByteString getTableNameBytes();

    public boolean hasSchemaName();

    public String getSchemaName();

    public ByteString getSchemaNameBytes();
}
