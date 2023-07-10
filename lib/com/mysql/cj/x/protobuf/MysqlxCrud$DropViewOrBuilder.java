/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCrud;

public static interface MysqlxCrud.DropViewOrBuilder
extends MessageOrBuilder {
    public boolean hasCollection();

    public MysqlxCrud.Collection getCollection();

    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    public boolean hasIfExists();

    public boolean getIfExists();
}
