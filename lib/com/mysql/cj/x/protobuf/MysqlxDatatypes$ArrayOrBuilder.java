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

public static interface MysqlxDatatypes.ArrayOrBuilder
extends MessageOrBuilder {
    public List<MysqlxDatatypes.Any> getValueList();

    public MysqlxDatatypes.Any getValue(int var1);

    public int getValueCount();

    public List<? extends MysqlxDatatypes.AnyOrBuilder> getValueOrBuilderList();

    public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder(int var1);
}
