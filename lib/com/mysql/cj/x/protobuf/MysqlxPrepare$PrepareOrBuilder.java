/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

public static interface MysqlxPrepare.PrepareOrBuilder
extends MessageOrBuilder {
    public boolean hasStmtId();

    public int getStmtId();

    public boolean hasStmt();

    public MysqlxPrepare.Prepare.OneOfMessage getStmt();

    public MysqlxPrepare.Prepare.OneOfMessageOrBuilder getStmtOrBuilder();
}
