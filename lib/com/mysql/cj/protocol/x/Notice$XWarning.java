/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import com.mysql.cj.protocol.Warning;
import com.mysql.cj.protocol.x.Notice;
import com.mysql.cj.x.protobuf.MysqlxNotice;

public static class Notice.XWarning
extends Notice
implements Warning {
    private int level;
    private long code;
    private String message;

    public Notice.XWarning(MysqlxNotice.Frame frm) {
        super(frm);
        MysqlxNotice.Warning warn = Notice.XWarning.parseNotice(frm.getPayload(), MysqlxNotice.Warning.class);
        this.level = warn.getLevel().getNumber();
        this.code = Integer.toUnsignedLong(warn.getCode());
        this.message = warn.getMsg();
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public long getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
