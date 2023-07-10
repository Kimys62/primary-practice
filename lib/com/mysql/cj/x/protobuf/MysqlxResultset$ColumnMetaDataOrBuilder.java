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
import com.mysql.cj.x.protobuf.MysqlxResultset;

public static interface MysqlxResultset.ColumnMetaDataOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxResultset.ColumnMetaData.FieldType getType();

    public boolean hasName();

    public ByteString getName();

    public boolean hasOriginalName();

    public ByteString getOriginalName();

    public boolean hasTable();

    public ByteString getTable();

    public boolean hasOriginalTable();

    public ByteString getOriginalTable();

    public boolean hasSchema();

    public ByteString getSchema();

    public boolean hasCatalog();

    public ByteString getCatalog();

    public boolean hasCollation();

    public long getCollation();

    public boolean hasFractionalDigits();

    public int getFractionalDigits();

    public boolean hasLength();

    public int getLength();

    public boolean hasFlags();

    public int getFlags();

    public boolean hasContentType();

    public int getContentType();
}
