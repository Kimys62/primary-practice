/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import com.mysql.cj.protocol.x.Notice;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxNotice;

public static class Notice.XSessionVariableChanged
extends Notice {
    private String paramName = null;
    private MysqlxDatatypes.Scalar value = null;

    public Notice.XSessionVariableChanged(MysqlxNotice.Frame frm) {
        super(frm);
        MysqlxNotice.SessionVariableChanged svmsg = Notice.XSessionVariableChanged.parseNotice(frm.getPayload(), MysqlxNotice.SessionVariableChanged.class);
        this.paramName = svmsg.getParam();
        this.value = svmsg.getValue();
    }

    public String getParamName() {
        return this.paramName;
    }

    public MysqlxDatatypes.Scalar getValue() {
        return this.value;
    }
}
