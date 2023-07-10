/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.util.List;

public static interface MysqlxDatatypes.ObjectOrBuilder
extends MessageOrBuilder {
    public List<MysqlxDatatypes.Object.ObjectField> getFldList();

    public MysqlxDatatypes.Object.ObjectField getFld(int var1);

    public int getFldCount();

    public List<? extends MysqlxDatatypes.Object.ObjectFieldOrBuilder> getFldOrBuilderList();

    public MysqlxDatatypes.Object.ObjectFieldOrBuilder getFldOrBuilder(int var1);
}
