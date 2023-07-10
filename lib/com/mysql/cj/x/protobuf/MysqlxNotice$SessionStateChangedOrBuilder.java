/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.util.List;

public static interface MysqlxNotice.SessionStateChangedOrBuilder
extends MessageOrBuilder {
    public boolean hasParam();

    public MysqlxNotice.SessionStateChanged.Parameter getParam();

    public List<MysqlxDatatypes.Scalar> getValueList();

    public MysqlxDatatypes.Scalar getValue(int var1);

    public int getValueCount();

    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getValueOrBuilderList();

    public MysqlxDatatypes.ScalarOrBuilder getValueOrBuilder(int var1);
}
