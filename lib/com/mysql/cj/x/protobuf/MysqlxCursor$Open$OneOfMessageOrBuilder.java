/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCursor;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

public static interface MysqlxCursor.Open.OneOfMessageOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxCursor.Open.OneOfMessage.Type getType();

    public boolean hasPrepareExecute();

    public MysqlxPrepare.Execute getPrepareExecute();

    public MysqlxPrepare.ExecuteOrBuilder getPrepareExecuteOrBuilder();
}
