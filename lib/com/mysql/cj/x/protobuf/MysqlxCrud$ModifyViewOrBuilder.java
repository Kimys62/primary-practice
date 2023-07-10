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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.util.List;

public static interface MysqlxCrud.ModifyViewOrBuilder
extends MessageOrBuilder {
    public boolean hasCollection();

    public MysqlxCrud.Collection getCollection();

    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    public boolean hasDefiner();

    public String getDefiner();

    public ByteString getDefinerBytes();

    public boolean hasAlgorithm();

    public MysqlxCrud.ViewAlgorithm getAlgorithm();

    public boolean hasSecurity();

    public MysqlxCrud.ViewSqlSecurity getSecurity();

    public boolean hasCheck();

    public MysqlxCrud.ViewCheckOption getCheck();

    public List<String> getColumnList();

    public int getColumnCount();

    public String getColumn(int var1);

    public ByteString getColumnBytes(int var1);

    public boolean hasStmt();

    public MysqlxCrud.Find getStmt();

    public MysqlxCrud.FindOrBuilder getStmtOrBuilder();
}
