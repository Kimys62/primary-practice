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
import com.mysql.cj.x.protobuf.MysqlxExpect;

public static interface MysqlxExpect.Open.ConditionOrBuilder
extends MessageOrBuilder {
    public boolean hasConditionKey();

    public int getConditionKey();

    public boolean hasConditionValue();

    public ByteString getConditionValue();

    public boolean hasOp();

    public MysqlxExpect.Open.Condition.ConditionOperation getOp();
}
