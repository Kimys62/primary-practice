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

public static interface MysqlxCrud.ColumnOrBuilder
extends MessageOrBuilder {
    public boolean hasName();

    public String getName();

    public ByteString getNameBytes();

    public boolean hasAlias();

    public String getAlias();

    public ByteString getAliasBytes();

    public List<MysqlxExpr.DocumentPathItem> getDocumentPathList();

    public MysqlxExpr.DocumentPathItem getDocumentPath(int var1);

    public int getDocumentPathCount();

    public List<? extends MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathOrBuilderList();

    public MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(int var1);
}
