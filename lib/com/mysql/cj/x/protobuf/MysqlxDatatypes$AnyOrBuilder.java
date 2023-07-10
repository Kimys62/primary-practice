/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public static interface MysqlxDatatypes.AnyOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxDatatypes.Any.Type getType();

    public boolean hasScalar();

    public MysqlxDatatypes.Scalar getScalar();

    public MysqlxDatatypes.ScalarOrBuilder getScalarOrBuilder();

    public boolean hasObj();

    public MysqlxDatatypes.Object getObj();

    public MysqlxDatatypes.ObjectOrBuilder getObjOrBuilder();

    public boolean hasArray();

    public MysqlxDatatypes.Array getArray();

    public MysqlxDatatypes.ArrayOrBuilder getArrayOrBuilder();
}
