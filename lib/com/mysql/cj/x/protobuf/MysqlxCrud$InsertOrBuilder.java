/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.util.List;

public static interface MysqlxCrud.InsertOrBuilder
extends MessageOrBuilder {
    public boolean hasCollection();

    public MysqlxCrud.Collection getCollection();

    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    public boolean hasDataModel();

    public MysqlxCrud.DataModel getDataModel();

    public List<MysqlxCrud.Column> getProjectionList();

    public MysqlxCrud.Column getProjection(int var1);

    public int getProjectionCount();

    public List<? extends MysqlxCrud.ColumnOrBuilder> getProjectionOrBuilderList();

    public MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(int var1);

    public List<MysqlxCrud.Insert.TypedRow> getRowList();

    public MysqlxCrud.Insert.TypedRow getRow(int var1);

    public int getRowCount();

    public List<? extends MysqlxCrud.Insert.TypedRowOrBuilder> getRowOrBuilderList();

    public MysqlxCrud.Insert.TypedRowOrBuilder getRowOrBuilder(int var1);

    public List<MysqlxDatatypes.Scalar> getArgsList();

    public MysqlxDatatypes.Scalar getArgs(int var1);

    public int getArgsCount();

    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList();

    public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int var1);

    public boolean hasUpsert();

    public boolean getUpsert();
}
