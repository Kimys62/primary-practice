/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;

public static interface MysqlxCursor.FetchOrBuilder
extends MessageOrBuilder {
    public boolean hasCursorId();

    public int getCursorId();

    public boolean hasFetchRows();

    public long getFetchRows();
}
