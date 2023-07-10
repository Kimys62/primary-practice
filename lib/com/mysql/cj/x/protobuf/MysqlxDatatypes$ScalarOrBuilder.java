/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public static interface MysqlxDatatypes.ScalarOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxDatatypes.Scalar.Type getType();

    public boolean hasVSignedInt();

    public long getVSignedInt();

    public boolean hasVUnsignedInt();

    public long getVUnsignedInt();

    public boolean hasVOctets();

    public MysqlxDatatypes.Scalar.Octets getVOctets();

    public MysqlxDatatypes.Scalar.OctetsOrBuilder getVOctetsOrBuilder();

    public boolean hasVDouble();

    public double getVDouble();

    public boolean hasVFloat();

    public float getVFloat();

    public boolean hasVBool();

    public boolean getVBool();

    public boolean hasVString();

    public MysqlxDatatypes.Scalar.String getVString();

    public MysqlxDatatypes.Scalar.StringOrBuilder getVStringOrBuilder();
}
