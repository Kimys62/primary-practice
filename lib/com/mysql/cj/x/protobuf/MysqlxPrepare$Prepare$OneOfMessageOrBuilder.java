/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import com.mysql.cj.x.protobuf.MysqlxSql;

public static interface MysqlxPrepare.Prepare.OneOfMessageOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxPrepare.Prepare.OneOfMessage.Type getType();

    public boolean hasFind();

    public MysqlxCrud.Find getFind();

    public MysqlxCrud.FindOrBuilder getFindOrBuilder();

    public boolean hasInsert();

    public MysqlxCrud.Insert getInsert();

    public MysqlxCrud.InsertOrBuilder getInsertOrBuilder();

    public boolean hasUpdate();

    public MysqlxCrud.Update getUpdate();

    public MysqlxCrud.UpdateOrBuilder getUpdateOrBuilder();

    public boolean hasDelete();

    public MysqlxCrud.Delete getDelete();

    public MysqlxCrud.DeleteOrBuilder getDeleteOrBuilder();

    public boolean hasStmtExecute();

    public MysqlxSql.StmtExecute getStmtExecute();

    public MysqlxSql.StmtExecuteOrBuilder getStmtExecuteOrBuilder();
}
