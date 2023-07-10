/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCursor;

public static interface MysqlxCursor.OpenOrBuilder
extends MessageOrBuilder {
    public boolean hasCursorId();

    public int getCursorId();

    public boolean hasStmt();

    public MysqlxCursor.Open.OneOfMessage getStmt();

    public MysqlxCursor.Open.OneOfMessageOrBuilder getStmtOrBuilder();

    public boolean hasFetchRows();

    public long getFetchRows();
}
