/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import com.mysql.cj.protocol.x.Notice;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.util.List;

public static class Notice.XSessionStateChanged
extends Notice {
    private Integer paramType = null;
    private List<MysqlxDatatypes.Scalar> valueList = null;

    public Notice.XSessionStateChanged(MysqlxNotice.Frame frm) {
        super(frm);
        MysqlxNotice.SessionStateChanged ssmsg = Notice.XSessionStateChanged.parseNotice(frm.getPayload(), MysqlxNotice.SessionStateChanged.class);
        this.paramType = ssmsg.getParam().getNumber();
        this.valueList = ssmsg.getValueList();
    }

    public Integer getParamType() {
        return this.paramType;
    }

    public List<MysqlxDatatypes.Scalar> getValueList() {
        return this.valueList;
    }

    public MysqlxDatatypes.Scalar getValue() {
        if (this.valueList != null && !this.valueList.isEmpty()) {
            return this.valueList.get(0);
        }
        return null;
    }
}
