/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxExpect;
import java.util.List;

public static interface MysqlxExpect.OpenOrBuilder
extends MessageOrBuilder {
    public boolean hasOp();

    public MysqlxExpect.Open.CtxOperation getOp();

    public List<MysqlxExpect.Open.Condition> getCondList();

    public MysqlxExpect.Open.Condition getCond(int var1);

    public int getCondCount();

    public List<? extends MysqlxExpect.Open.ConditionOrBuilder> getCondOrBuilderList();

    public MysqlxExpect.Open.ConditionOrBuilder getCondOrBuilder(int var1);
}
