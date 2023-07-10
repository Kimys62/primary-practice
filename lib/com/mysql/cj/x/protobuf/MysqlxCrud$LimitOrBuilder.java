/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;

public static interface MysqlxCrud.LimitOrBuilder
extends MessageOrBuilder {
    public boolean hasRowCount();

    public long getRowCount();

    public boolean hasOffset();

    public long getOffset();
}
