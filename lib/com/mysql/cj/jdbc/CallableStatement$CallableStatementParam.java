/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.MysqlType;

protected static class CallableStatement.CallableStatementParam {
    int index;
    int inOutModifier;
    boolean isIn;
    boolean isOut;
    int jdbcType;
    short nullability;
    String paramName;
    int precision;
    int scale;
    String typeName;
    MysqlType desiredMysqlType = MysqlType.UNKNOWN;

    CallableStatement.CallableStatementParam(String name, int idx, boolean in, boolean out, int jdbcType, String typeName, int precision, int scale, short nullability, int inOutModifier) {
        this.paramName = name;
        this.isIn = in;
        this.isOut = out;
        this.index = idx;
        this.jdbcType = jdbcType;
        this.typeName = typeName;
        this.precision = precision;
        this.scale = scale;
        this.nullability = nullability;
        this.inOutModifier = inOutModifier;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
