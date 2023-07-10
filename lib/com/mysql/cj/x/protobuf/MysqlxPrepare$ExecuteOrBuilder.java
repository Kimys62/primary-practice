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

public static interface MysqlxPrepare.ExecuteOrBuilder
extends MessageOrBuilder {
    public boolean hasStmtId();

    public int getStmtId();

    public List<MysqlxDatatypes.Any> getArgsList();

    public MysqlxDatatypes.Any getArgs(int var1);

    public int getArgsCount();

    public List<? extends MysqlxDatatypes.AnyOrBuilder> getArgsOrBuilderList();

    public MysqlxDatatypes.AnyOrBuilder getArgsOrBuilder(int var1);

    public boolean hasCompactMetadata();

    public boolean getCompactMetadata();
}
