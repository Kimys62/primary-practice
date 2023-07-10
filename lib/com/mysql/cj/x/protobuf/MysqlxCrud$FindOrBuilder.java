/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.util.List;

public static interface MysqlxCrud.FindOrBuilder
extends MessageOrBuilder {
    public boolean hasCollection();

    public MysqlxCrud.Collection getCollection();

    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    public boolean hasDataModel();

    public MysqlxCrud.DataModel getDataModel();

    public List<MysqlxCrud.Projection> getProjectionList();

    public MysqlxCrud.Projection getProjection(int var1);

    public int getProjectionCount();

    public List<? extends MysqlxCrud.ProjectionOrBuilder> getProjectionOrBuilderList();

    public MysqlxCrud.ProjectionOrBuilder getProjectionOrBuilder(int var1);

    public List<MysqlxDatatypes.Scalar> getArgsList();

    public MysqlxDatatypes.Scalar getArgs(int var1);

    public int getArgsCount();

    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList();

    public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int var1);

    public boolean hasCriteria();

    public MysqlxExpr.Expr getCriteria();

    public MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder();

    public boolean hasLimit();

    public MysqlxCrud.Limit getLimit();

    public MysqlxCrud.LimitOrBuilder getLimitOrBuilder();

    public List<MysqlxCrud.Order> getOrderList();

    public MysqlxCrud.Order getOrder(int var1);

    public int getOrderCount();

    public List<? extends MysqlxCrud.OrderOrBuilder> getOrderOrBuilderList();

    public MysqlxCrud.OrderOrBuilder getOrderOrBuilder(int var1);

    public List<MysqlxExpr.Expr> getGroupingList();

    public MysqlxExpr.Expr getGrouping(int var1);

    public int getGroupingCount();

    public List<? extends MysqlxExpr.ExprOrBuilder> getGroupingOrBuilderList();

    public MysqlxExpr.ExprOrBuilder getGroupingOrBuilder(int var1);

    public boolean hasGroupingCriteria();

    public MysqlxExpr.Expr getGroupingCriteria();

    public MysqlxExpr.ExprOrBuilder getGroupingCriteriaOrBuilder();

    public boolean hasLocking();

    public MysqlxCrud.Find.RowLock getLocking();

    public boolean hasLockingOptions();

    public MysqlxCrud.Find.RowLockOptions getLockingOptions();

    public boolean hasLimitExpr();

    public MysqlxCrud.LimitExpr getLimitExpr();

    public MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder();
}
