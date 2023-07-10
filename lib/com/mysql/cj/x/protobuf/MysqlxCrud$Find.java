/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolMessageEnum
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Find
extends GeneratedMessageV3
implements MysqlxCrud.FindOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 2;
    private MysqlxCrud.Collection collection_;
    public static final int DATA_MODEL_FIELD_NUMBER = 3;
    private int dataModel_;
    public static final int PROJECTION_FIELD_NUMBER = 4;
    private List<MysqlxCrud.Projection> projection_;
    public static final int ARGS_FIELD_NUMBER = 11;
    private List<MysqlxDatatypes.Scalar> args_;
    public static final int CRITERIA_FIELD_NUMBER = 5;
    private MysqlxExpr.Expr criteria_;
    public static final int LIMIT_FIELD_NUMBER = 6;
    private MysqlxCrud.Limit limit_;
    public static final int ORDER_FIELD_NUMBER = 7;
    private List<MysqlxCrud.Order> order_;
    public static final int GROUPING_FIELD_NUMBER = 8;
    private List<MysqlxExpr.Expr> grouping_;
    public static final int GROUPING_CRITERIA_FIELD_NUMBER = 9;
    private MysqlxExpr.Expr groupingCriteria_;
    public static final int LOCKING_FIELD_NUMBER = 12;
    private int locking_;
    public static final int LOCKING_OPTIONS_FIELD_NUMBER = 13;
    private int lockingOptions_;
    public static final int LIMIT_EXPR_FIELD_NUMBER = 14;
    private MysqlxCrud.LimitExpr limitExpr_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Find DEFAULT_INSTANCE = new MysqlxCrud.Find();
    @Deprecated
    public static final Parser<MysqlxCrud.Find> PARSER = new AbstractParser<MysqlxCrud.Find>(){

        public MysqlxCrud.Find parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Find(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Find(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Find() {
        this.dataModel_ = 1;
        this.projection_ = Collections.emptyList();
        this.args_ = Collections.emptyList();
        this.order_ = Collections.emptyList();
        this.grouping_ = Collections.emptyList();
        this.locking_ = 1;
        this.lockingOptions_ = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Find();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Find(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block21: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block21;
                    }
                    case 18: {
                        MysqlxCrud.Collection.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                            subBuilder = this.collection_.toBuilder();
                        }
                        this.collection_ = (MysqlxCrud.Collection)input.readMessage(MysqlxCrud.Collection.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.collection_);
                            this.collection_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block21;
                    }
                    case 24: {
                        int rawValue = input.readEnum();
                        Enum value = MysqlxCrud.DataModel.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(3, rawValue);
                            continue block21;
                        }
                        this.bitField0_ |= 2;
                        this.dataModel_ = rawValue;
                        continue block21;
                    }
                    case 34: {
                        if ((mutable_bitField0_ & 4) == 0) {
                            this.projection_ = new ArrayList<MysqlxCrud.Projection>();
                            mutable_bitField0_ |= 4;
                        }
                        this.projection_.add((MysqlxCrud.Projection)input.readMessage(MysqlxCrud.Projection.PARSER, extensionRegistry));
                        continue block21;
                    }
                    case 42: {
                        MysqlxExpr.Expr.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                            subBuilder = this.criteria_.toBuilder();
                        }
                        this.criteria_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.criteria_);
                            this.criteria_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 4;
                        continue block21;
                    }
                    case 50: {
                        MysqlxCrud.Limit.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                            subBuilder = this.limit_.toBuilder();
                        }
                        this.limit_ = (MysqlxCrud.Limit)input.readMessage(MysqlxCrud.Limit.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.limit_);
                            this.limit_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 8;
                        continue block21;
                    }
                    case 58: {
                        if ((mutable_bitField0_ & 0x40) == 0) {
                            this.order_ = new ArrayList<MysqlxCrud.Order>();
                            mutable_bitField0_ |= 0x40;
                        }
                        this.order_.add((MysqlxCrud.Order)input.readMessage(MysqlxCrud.Order.PARSER, extensionRegistry));
                        continue block21;
                    }
                    case 66: {
                        if ((mutable_bitField0_ & 0x80) == 0) {
                            this.grouping_ = new ArrayList<MysqlxExpr.Expr>();
                            mutable_bitField0_ |= 0x80;
                        }
                        this.grouping_.add((MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry));
                        continue block21;
                    }
                    case 74: {
                        MysqlxExpr.Expr.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x10) != 0) {
                            subBuilder = this.groupingCriteria_.toBuilder();
                        }
                        this.groupingCriteria_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.groupingCriteria_);
                            this.groupingCriteria_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x10;
                        continue block21;
                    }
                    case 90: {
                        if ((mutable_bitField0_ & 8) == 0) {
                            this.args_ = new ArrayList<MysqlxDatatypes.Scalar>();
                            mutable_bitField0_ |= 8;
                        }
                        this.args_.add((MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry));
                        continue block21;
                    }
                    case 96: {
                        int rawValue = input.readEnum();
                        Enum value = RowLock.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(12, rawValue);
                            continue block21;
                        }
                        this.bitField0_ |= 0x20;
                        this.locking_ = rawValue;
                        continue block21;
                    }
                    case 104: {
                        int rawValue = input.readEnum();
                        Enum value = RowLockOptions.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(13, rawValue);
                            continue block21;
                        }
                        this.bitField0_ |= 0x40;
                        this.lockingOptions_ = rawValue;
                        continue block21;
                    }
                    case 114: {
                        MysqlxCrud.LimitExpr.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x80) != 0) {
                            subBuilder = this.limitExpr_.toBuilder();
                        }
                        this.limitExpr_ = (MysqlxCrud.LimitExpr)input.readMessage(MysqlxCrud.LimitExpr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.limitExpr_);
                            this.limitExpr_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x80;
                        continue block21;
                    }
                }
                if (this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) continue;
                done = true;
            }
        }
        catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException e) {
            throw new InvalidProtocolBufferException(e).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((mutable_bitField0_ & 4) != 0) {
                this.projection_ = Collections.unmodifiableList(this.projection_);
            }
            if ((mutable_bitField0_ & 0x40) != 0) {
                this.order_ = Collections.unmodifiableList(this.order_);
            }
            if ((mutable_bitField0_ & 0x80) != 0) {
                this.grouping_ = Collections.unmodifiableList(this.grouping_);
            }
            if ((mutable_bitField0_ & 8) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Find_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Find_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Find.class, Builder.class);
    }

    @Override
    public boolean hasCollection() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxCrud.Collection getCollection() {
        return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
    }

    @Override
    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
    }

    @Override
    public boolean hasDataModel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.DataModel getDataModel() {
        MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
        return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
    }

    @Override
    public List<MysqlxCrud.Projection> getProjectionList() {
        return this.projection_;
    }

    @Override
    public List<? extends MysqlxCrud.ProjectionOrBuilder> getProjectionOrBuilderList() {
        return this.projection_;
    }

    @Override
    public int getProjectionCount() {
        return this.projection_.size();
    }

    @Override
    public MysqlxCrud.Projection getProjection(int index) {
        return this.projection_.get(index);
    }

    @Override
    public MysqlxCrud.ProjectionOrBuilder getProjectionOrBuilder(int index) {
        return this.projection_.get(index);
    }

    @Override
    public List<MysqlxDatatypes.Scalar> getArgsList() {
        return this.args_;
    }

    @Override
    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
        return this.args_;
    }

    @Override
    public int getArgsCount() {
        return this.args_.size();
    }

    @Override
    public MysqlxDatatypes.Scalar getArgs(int index) {
        return this.args_.get(index);
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
        return this.args_.get(index);
    }

    @Override
    public boolean hasCriteria() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxExpr.Expr getCriteria() {
        return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
        return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
    }

    @Override
    public boolean hasLimit() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.Limit getLimit() {
        return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
    }

    @Override
    public MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
        return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
    }

    @Override
    public List<MysqlxCrud.Order> getOrderList() {
        return this.order_;
    }

    @Override
    public List<? extends MysqlxCrud.OrderOrBuilder> getOrderOrBuilderList() {
        return this.order_;
    }

    @Override
    public int getOrderCount() {
        return this.order_.size();
    }

    @Override
    public MysqlxCrud.Order getOrder(int index) {
        return this.order_.get(index);
    }

    @Override
    public MysqlxCrud.OrderOrBuilder getOrderOrBuilder(int index) {
        return this.order_.get(index);
    }

    @Override
    public List<MysqlxExpr.Expr> getGroupingList() {
        return this.grouping_;
    }

    @Override
    public List<? extends MysqlxExpr.ExprOrBuilder> getGroupingOrBuilderList() {
        return this.grouping_;
    }

    @Override
    public int getGroupingCount() {
        return this.grouping_.size();
    }

    @Override
    public MysqlxExpr.Expr getGrouping(int index) {
        return this.grouping_.get(index);
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getGroupingOrBuilder(int index) {
        return this.grouping_.get(index);
    }

    @Override
    public boolean hasGroupingCriteria() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxExpr.Expr getGroupingCriteria() {
        return this.groupingCriteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.groupingCriteria_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getGroupingCriteriaOrBuilder() {
        return this.groupingCriteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.groupingCriteria_;
    }

    @Override
    public boolean hasLocking() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public RowLock getLocking() {
        RowLock result = RowLock.valueOf(this.locking_);
        return result == null ? RowLock.SHARED_LOCK : result;
    }

    @Override
    public boolean hasLockingOptions() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public RowLockOptions getLockingOptions() {
        RowLockOptions result = RowLockOptions.valueOf(this.lockingOptions_);
        return result == null ? RowLockOptions.NOWAIT : result;
    }

    @Override
    public boolean hasLimitExpr() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public MysqlxCrud.LimitExpr getLimitExpr() {
        return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
    }

    @Override
    public MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
        return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
    }

    public final boolean isInitialized() {
        int i;
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasCollection()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getCollection().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getProjectionCount(); ++i) {
            if (this.getProjection(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasCriteria() && !this.getCriteria().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasLimit() && !this.getLimit().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getOrderCount(); ++i) {
            if (this.getOrder(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getGroupingCount(); ++i) {
            if (this.getGrouping(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasGroupingCriteria() && !this.getGroupingCriteria().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasLimitExpr() && !this.getLimitExpr().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        int i;
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(3, this.dataModel_);
        }
        for (i = 0; i < this.projection_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.projection_.get(i));
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(5, (MessageLite)this.getCriteria());
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(6, (MessageLite)this.getLimit());
        }
        for (i = 0; i < this.order_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.order_.get(i));
        }
        for (i = 0; i < this.grouping_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.grouping_.get(i));
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeMessage(9, (MessageLite)this.getGroupingCriteria());
        }
        for (i = 0; i < this.args_.size(); ++i) {
            output.writeMessage(11, (MessageLite)this.args_.get(i));
        }
        if ((this.bitField0_ & 0x20) != 0) {
            output.writeEnum(12, this.locking_);
        }
        if ((this.bitField0_ & 0x40) != 0) {
            output.writeEnum(13, this.lockingOptions_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            output.writeMessage(14, (MessageLite)this.getLimitExpr());
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int i;
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if ((this.bitField0_ & 1) != 0) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)3, (int)this.dataModel_);
        }
        for (i = 0; i < this.projection_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.projection_.get(i)));
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.getCriteria());
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.getLimit());
        }
        for (i = 0; i < this.order_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((MessageLite)this.order_.get(i)));
        }
        for (i = 0; i < this.grouping_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)8, (MessageLite)((MessageLite)this.grouping_.get(i)));
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeMessageSize((int)9, (MessageLite)this.getGroupingCriteria());
        }
        for (i = 0; i < this.args_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)11, (MessageLite)((MessageLite)this.args_.get(i)));
        }
        if ((this.bitField0_ & 0x20) != 0) {
            size += CodedOutputStream.computeEnumSize((int)12, (int)this.locking_);
        }
        if ((this.bitField0_ & 0x40) != 0) {
            size += CodedOutputStream.computeEnumSize((int)13, (int)this.lockingOptions_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            size += CodedOutputStream.computeMessageSize((int)14, (MessageLite)this.getLimitExpr());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Find)) {
            return super.equals(obj);
        }
        MysqlxCrud.Find other = (MysqlxCrud.Find)obj;
        if (this.hasCollection() != other.hasCollection()) {
            return false;
        }
        if (this.hasCollection() && !this.getCollection().equals(other.getCollection())) {
            return false;
        }
        if (this.hasDataModel() != other.hasDataModel()) {
            return false;
        }
        if (this.hasDataModel() && this.dataModel_ != other.dataModel_) {
            return false;
        }
        if (!this.getProjectionList().equals(other.getProjectionList())) {
            return false;
        }
        if (!this.getArgsList().equals(other.getArgsList())) {
            return false;
        }
        if (this.hasCriteria() != other.hasCriteria()) {
            return false;
        }
        if (this.hasCriteria() && !this.getCriteria().equals(other.getCriteria())) {
            return false;
        }
        if (this.hasLimit() != other.hasLimit()) {
            return false;
        }
        if (this.hasLimit() && !this.getLimit().equals(other.getLimit())) {
            return false;
        }
        if (!this.getOrderList().equals(other.getOrderList())) {
            return false;
        }
        if (!this.getGroupingList().equals(other.getGroupingList())) {
            return false;
        }
        if (this.hasGroupingCriteria() != other.hasGroupingCriteria()) {
            return false;
        }
        if (this.hasGroupingCriteria() && !this.getGroupingCriteria().equals(other.getGroupingCriteria())) {
            return false;
        }
        if (this.hasLocking() != other.hasLocking()) {
            return false;
        }
        if (this.hasLocking() && this.locking_ != other.locking_) {
            return false;
        }
        if (this.hasLockingOptions() != other.hasLockingOptions()) {
            return false;
        }
        if (this.hasLockingOptions() && this.lockingOptions_ != other.lockingOptions_) {
            return false;
        }
        if (this.hasLimitExpr() != other.hasLimitExpr()) {
            return false;
        }
        if (this.hasLimitExpr() && !this.getLimitExpr().equals(other.getLimitExpr())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Find.getDescriptor().hashCode();
        if (this.hasCollection()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCollection().hashCode();
        }
        if (this.hasDataModel()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.dataModel_;
        }
        if (this.getProjectionCount() > 0) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getProjectionList().hashCode();
        }
        if (this.getArgsCount() > 0) {
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getArgsList().hashCode();
        }
        if (this.hasCriteria()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getCriteria().hashCode();
        }
        if (this.hasLimit()) {
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getLimit().hashCode();
        }
        if (this.getOrderCount() > 0) {
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getOrderList().hashCode();
        }
        if (this.getGroupingCount() > 0) {
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getGroupingList().hashCode();
        }
        if (this.hasGroupingCriteria()) {
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getGroupingCriteria().hashCode();
        }
        if (this.hasLocking()) {
            hash = 37 * hash + 12;
            hash = 53 * hash + this.locking_;
        }
        if (this.hasLockingOptions()) {
            hash = 37 * hash + 13;
            hash = 53 * hash + this.lockingOptions_;
        }
        if (this.hasLimitExpr()) {
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getLimitExpr().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Find parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Find)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Find parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Find)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Find parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Find)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Find parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Find)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Find parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Find)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Find parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Find)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Find parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Find)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Find parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Find)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Find parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Find)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Find parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Find)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Find parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Find)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Find parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Find)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Find.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Find prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Find getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Find> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Find> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Find getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.FindOrBuilder {
        private int bitField0_;
        private MysqlxCrud.Collection collection_;
        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
        private int dataModel_ = 1;
        private List<MysqlxCrud.Projection> projection_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxCrud.Projection, MysqlxCrud.Projection.Builder, MysqlxCrud.ProjectionOrBuilder> projectionBuilder_;
        private List<MysqlxDatatypes.Scalar> args_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;
        private MysqlxExpr.Expr criteria_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> criteriaBuilder_;
        private MysqlxCrud.Limit limit_;
        private SingleFieldBuilderV3<MysqlxCrud.Limit, MysqlxCrud.Limit.Builder, MysqlxCrud.LimitOrBuilder> limitBuilder_;
        private List<MysqlxCrud.Order> order_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxCrud.Order, MysqlxCrud.Order.Builder, MysqlxCrud.OrderOrBuilder> orderBuilder_;
        private List<MysqlxExpr.Expr> grouping_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> groupingBuilder_;
        private MysqlxExpr.Expr groupingCriteria_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> groupingCriteriaBuilder_;
        private int locking_ = 1;
        private int lockingOptions_ = 1;
        private MysqlxCrud.LimitExpr limitExpr_;
        private SingleFieldBuilderV3<MysqlxCrud.LimitExpr, MysqlxCrud.LimitExpr.Builder, MysqlxCrud.LimitExprOrBuilder> limitExprBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Find_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Find_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Find.class, Builder.class);
        }

        private Builder() {
            this.maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (alwaysUseFieldBuilders) {
                this.getCollectionFieldBuilder();
                this.getProjectionFieldBuilder();
                this.getArgsFieldBuilder();
                this.getCriteriaFieldBuilder();
                this.getLimitFieldBuilder();
                this.getOrderFieldBuilder();
                this.getGroupingFieldBuilder();
                this.getGroupingCriteriaFieldBuilder();
                this.getLimitExprFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.collectionBuilder_ == null) {
                this.collection_ = null;
            } else {
                this.collectionBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            this.dataModel_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.projectionBuilder_ == null) {
                this.projection_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFB;
            } else {
                this.projectionBuilder_.clear();
            }
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFF7;
            } else {
                this.argsBuilder_.clear();
            }
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = null;
            } else {
                this.criteriaBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFEF;
            if (this.limitBuilder_ == null) {
                this.limit_ = null;
            } else {
                this.limitBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFDF;
            if (this.orderBuilder_ == null) {
                this.order_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFBF;
            } else {
                this.orderBuilder_.clear();
            }
            if (this.groupingBuilder_ == null) {
                this.grouping_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFF7F;
            } else {
                this.groupingBuilder_.clear();
            }
            if (this.groupingCriteriaBuilder_ == null) {
                this.groupingCriteria_ = null;
            } else {
                this.groupingCriteriaBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFEFF;
            this.locking_ = 1;
            this.bitField0_ &= 0xFFFFFDFF;
            this.lockingOptions_ = 1;
            this.bitField0_ &= 0xFFFFFBFF;
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = null;
            } else {
                this.limitExprBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFF7FF;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Find_descriptor;
        }

        public MysqlxCrud.Find getDefaultInstanceForType() {
            return MysqlxCrud.Find.getDefaultInstance();
        }

        public MysqlxCrud.Find build() {
            MysqlxCrud.Find result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Find buildPartial() {
            MysqlxCrud.Find result = new MysqlxCrud.Find(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.collectionBuilder_ == null) {
                    result.collection_ = this.collection_;
                } else {
                    result.collection_ = (MysqlxCrud.Collection)this.collectionBuilder_.build();
                }
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.dataModel_ = this.dataModel_;
            if (this.projectionBuilder_ == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.projection_ = Collections.unmodifiableList(this.projection_);
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.projection_ = this.projection_;
            } else {
                result.projection_ = this.projectionBuilder_.build();
            }
            if (this.argsBuilder_ == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.args_ = Collections.unmodifiableList(this.args_);
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.args_ = this.args_;
            } else {
                result.args_ = this.argsBuilder_.build();
            }
            if ((from_bitField0_ & 0x10) != 0) {
                if (this.criteriaBuilder_ == null) {
                    result.criteria_ = this.criteria_;
                } else {
                    result.criteria_ = (MysqlxExpr.Expr)this.criteriaBuilder_.build();
                }
                to_bitField0_ |= 4;
            }
            if ((from_bitField0_ & 0x20) != 0) {
                if (this.limitBuilder_ == null) {
                    result.limit_ = this.limit_;
                } else {
                    result.limit_ = (MysqlxCrud.Limit)this.limitBuilder_.build();
                }
                to_bitField0_ |= 8;
            }
            if (this.orderBuilder_ == null) {
                if ((this.bitField0_ & 0x40) != 0) {
                    this.order_ = Collections.unmodifiableList(this.order_);
                    this.bitField0_ &= 0xFFFFFFBF;
                }
                result.order_ = this.order_;
            } else {
                result.order_ = this.orderBuilder_.build();
            }
            if (this.groupingBuilder_ == null) {
                if ((this.bitField0_ & 0x80) != 0) {
                    this.grouping_ = Collections.unmodifiableList(this.grouping_);
                    this.bitField0_ &= 0xFFFFFF7F;
                }
                result.grouping_ = this.grouping_;
            } else {
                result.grouping_ = this.groupingBuilder_.build();
            }
            if ((from_bitField0_ & 0x100) != 0) {
                if (this.groupingCriteriaBuilder_ == null) {
                    result.groupingCriteria_ = this.groupingCriteria_;
                } else {
                    result.groupingCriteria_ = (MysqlxExpr.Expr)this.groupingCriteriaBuilder_.build();
                }
                to_bitField0_ |= 0x10;
            }
            if ((from_bitField0_ & 0x200) != 0) {
                to_bitField0_ |= 0x20;
            }
            result.locking_ = this.locking_;
            if ((from_bitField0_ & 0x400) != 0) {
                to_bitField0_ |= 0x40;
            }
            result.lockingOptions_ = this.lockingOptions_;
            if ((from_bitField0_ & 0x800) != 0) {
                if (this.limitExprBuilder_ == null) {
                    result.limitExpr_ = this.limitExpr_;
                } else {
                    result.limitExpr_ = (MysqlxCrud.LimitExpr)this.limitExprBuilder_.build();
                }
                to_bitField0_ |= 0x80;
            }
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder)super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
        }

        public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(Message other) {
            if (other instanceof MysqlxCrud.Find) {
                return this.mergeFrom((MysqlxCrud.Find)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Find other) {
            if (other == MysqlxCrud.Find.getDefaultInstance()) {
                return this;
            }
            if (other.hasCollection()) {
                this.mergeCollection(other.getCollection());
            }
            if (other.hasDataModel()) {
                this.setDataModel(other.getDataModel());
            }
            if (this.projectionBuilder_ == null) {
                if (!other.projection_.isEmpty()) {
                    if (this.projection_.isEmpty()) {
                        this.projection_ = other.projection_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    } else {
                        this.ensureProjectionIsMutable();
                        this.projection_.addAll(other.projection_);
                    }
                    this.onChanged();
                }
            } else if (!other.projection_.isEmpty()) {
                if (this.projectionBuilder_.isEmpty()) {
                    this.projectionBuilder_.dispose();
                    this.projectionBuilder_ = null;
                    this.projection_ = other.projection_;
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.projectionBuilder_ = alwaysUseFieldBuilders ? this.getProjectionFieldBuilder() : null;
                } else {
                    this.projectionBuilder_.addAllMessages((Iterable)other.projection_);
                }
            }
            if (this.argsBuilder_ == null) {
                if (!other.args_.isEmpty()) {
                    if (this.args_.isEmpty()) {
                        this.args_ = other.args_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    } else {
                        this.ensureArgsIsMutable();
                        this.args_.addAll(other.args_);
                    }
                    this.onChanged();
                }
            } else if (!other.args_.isEmpty()) {
                if (this.argsBuilder_.isEmpty()) {
                    this.argsBuilder_.dispose();
                    this.argsBuilder_ = null;
                    this.args_ = other.args_;
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
                } else {
                    this.argsBuilder_.addAllMessages((Iterable)other.args_);
                }
            }
            if (other.hasCriteria()) {
                this.mergeCriteria(other.getCriteria());
            }
            if (other.hasLimit()) {
                this.mergeLimit(other.getLimit());
            }
            if (this.orderBuilder_ == null) {
                if (!other.order_.isEmpty()) {
                    if (this.order_.isEmpty()) {
                        this.order_ = other.order_;
                        this.bitField0_ &= 0xFFFFFFBF;
                    } else {
                        this.ensureOrderIsMutable();
                        this.order_.addAll(other.order_);
                    }
                    this.onChanged();
                }
            } else if (!other.order_.isEmpty()) {
                if (this.orderBuilder_.isEmpty()) {
                    this.orderBuilder_.dispose();
                    this.orderBuilder_ = null;
                    this.order_ = other.order_;
                    this.bitField0_ &= 0xFFFFFFBF;
                    this.orderBuilder_ = alwaysUseFieldBuilders ? this.getOrderFieldBuilder() : null;
                } else {
                    this.orderBuilder_.addAllMessages((Iterable)other.order_);
                }
            }
            if (this.groupingBuilder_ == null) {
                if (!other.grouping_.isEmpty()) {
                    if (this.grouping_.isEmpty()) {
                        this.grouping_ = other.grouping_;
                        this.bitField0_ &= 0xFFFFFF7F;
                    } else {
                        this.ensureGroupingIsMutable();
                        this.grouping_.addAll(other.grouping_);
                    }
                    this.onChanged();
                }
            } else if (!other.grouping_.isEmpty()) {
                if (this.groupingBuilder_.isEmpty()) {
                    this.groupingBuilder_.dispose();
                    this.groupingBuilder_ = null;
                    this.grouping_ = other.grouping_;
                    this.bitField0_ &= 0xFFFFFF7F;
                    this.groupingBuilder_ = alwaysUseFieldBuilders ? this.getGroupingFieldBuilder() : null;
                } else {
                    this.groupingBuilder_.addAllMessages((Iterable)other.grouping_);
                }
            }
            if (other.hasGroupingCriteria()) {
                this.mergeGroupingCriteria(other.getGroupingCriteria());
            }
            if (other.hasLocking()) {
                this.setLocking(other.getLocking());
            }
            if (other.hasLockingOptions()) {
                this.setLockingOptions(other.getLockingOptions());
            }
            if (other.hasLimitExpr()) {
                this.mergeLimitExpr(other.getLimitExpr());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            int i;
            if (!this.hasCollection()) {
                return false;
            }
            if (!this.getCollection().isInitialized()) {
                return false;
            }
            for (i = 0; i < this.getProjectionCount(); ++i) {
                if (this.getProjection(i).isInitialized()) continue;
                return false;
            }
            for (i = 0; i < this.getArgsCount(); ++i) {
                if (this.getArgs(i).isInitialized()) continue;
                return false;
            }
            if (this.hasCriteria() && !this.getCriteria().isInitialized()) {
                return false;
            }
            if (this.hasLimit() && !this.getLimit().isInitialized()) {
                return false;
            }
            for (i = 0; i < this.getOrderCount(); ++i) {
                if (this.getOrder(i).isInitialized()) continue;
                return false;
            }
            for (i = 0; i < this.getGroupingCount(); ++i) {
                if (this.getGrouping(i).isInitialized()) continue;
                return false;
            }
            if (this.hasGroupingCriteria() && !this.getGroupingCriteria().isInitialized()) {
                return false;
            }
            return !this.hasLimitExpr() || this.getLimitExpr().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Find parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Find)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Find)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        @Override
        public boolean hasCollection() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public MysqlxCrud.Collection getCollection() {
            if (this.collectionBuilder_ == null) {
                return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
            }
            return (MysqlxCrud.Collection)this.collectionBuilder_.getMessage();
        }

        public Builder setCollection(MysqlxCrud.Collection value) {
            if (this.collectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.collection_ = value;
                this.onChanged();
            } else {
                this.collectionBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
            if (this.collectionBuilder_ == null) {
                this.collection_ = builderForValue.build();
                this.onChanged();
            } else {
                this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeCollection(MysqlxCrud.Collection value) {
            if (this.collectionBuilder_ == null) {
                this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.collectionBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearCollection() {
            if (this.collectionBuilder_ == null) {
                this.collection_ = null;
                this.onChanged();
            } else {
                this.collectionBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public MysqlxCrud.Collection.Builder getCollectionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxCrud.Collection.Builder)this.getCollectionFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
            if (this.collectionBuilder_ != null) {
                return (MysqlxCrud.CollectionOrBuilder)this.collectionBuilder_.getMessageOrBuilder();
            }
            return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> getCollectionFieldBuilder() {
            if (this.collectionBuilder_ == null) {
                this.collectionBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getCollection(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.collection_ = null;
            }
            return this.collectionBuilder_;
        }

        @Override
        public boolean hasDataModel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxCrud.DataModel getDataModel() {
            MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
            return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
        }

        public Builder setDataModel(MysqlxCrud.DataModel value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.dataModel_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearDataModel() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.dataModel_ = 1;
            this.onChanged();
            return this;
        }

        private void ensureProjectionIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.projection_ = new ArrayList<MysqlxCrud.Projection>(this.projection_);
                this.bitField0_ |= 4;
            }
        }

        @Override
        public List<MysqlxCrud.Projection> getProjectionList() {
            if (this.projectionBuilder_ == null) {
                return Collections.unmodifiableList(this.projection_);
            }
            return this.projectionBuilder_.getMessageList();
        }

        @Override
        public int getProjectionCount() {
            if (this.projectionBuilder_ == null) {
                return this.projection_.size();
            }
            return this.projectionBuilder_.getCount();
        }

        @Override
        public MysqlxCrud.Projection getProjection(int index) {
            if (this.projectionBuilder_ == null) {
                return this.projection_.get(index);
            }
            return (MysqlxCrud.Projection)this.projectionBuilder_.getMessage(index);
        }

        public Builder setProjection(int index, MysqlxCrud.Projection value) {
            if (this.projectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureProjectionIsMutable();
                this.projection_.set(index, value);
                this.onChanged();
            } else {
                this.projectionBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setProjection(int index, MysqlxCrud.Projection.Builder builderForValue) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.projectionBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addProjection(MysqlxCrud.Projection value) {
            if (this.projectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureProjectionIsMutable();
                this.projection_.add(value);
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addProjection(int index, MysqlxCrud.Projection value) {
            if (this.projectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureProjectionIsMutable();
                this.projection_.add(index, value);
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addProjection(MysqlxCrud.Projection.Builder builderForValue) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addProjection(int index, MysqlxCrud.Projection.Builder builderForValue) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllProjection(Iterable<? extends MysqlxCrud.Projection> values) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.projection_);
                this.onChanged();
            } else {
                this.projectionBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearProjection() {
            if (this.projectionBuilder_ == null) {
                this.projection_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
            } else {
                this.projectionBuilder_.clear();
            }
            return this;
        }

        public Builder removeProjection(int index) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.remove(index);
                this.onChanged();
            } else {
                this.projectionBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxCrud.Projection.Builder getProjectionBuilder(int index) {
            return (MysqlxCrud.Projection.Builder)this.getProjectionFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxCrud.ProjectionOrBuilder getProjectionOrBuilder(int index) {
            if (this.projectionBuilder_ == null) {
                return this.projection_.get(index);
            }
            return (MysqlxCrud.ProjectionOrBuilder)this.projectionBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxCrud.ProjectionOrBuilder> getProjectionOrBuilderList() {
            if (this.projectionBuilder_ != null) {
                return this.projectionBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.projection_);
        }

        public MysqlxCrud.Projection.Builder addProjectionBuilder() {
            return (MysqlxCrud.Projection.Builder)this.getProjectionFieldBuilder().addBuilder((AbstractMessage)MysqlxCrud.Projection.getDefaultInstance());
        }

        public MysqlxCrud.Projection.Builder addProjectionBuilder(int index) {
            return (MysqlxCrud.Projection.Builder)this.getProjectionFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxCrud.Projection.getDefaultInstance());
        }

        public List<MysqlxCrud.Projection.Builder> getProjectionBuilderList() {
            return this.getProjectionFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxCrud.Projection, MysqlxCrud.Projection.Builder, MysqlxCrud.ProjectionOrBuilder> getProjectionFieldBuilder() {
            if (this.projectionBuilder_ == null) {
                this.projectionBuilder_ = new RepeatedFieldBuilderV3(this.projection_, (this.bitField0_ & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.projection_ = null;
            }
            return this.projectionBuilder_;
        }

        private void ensureArgsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.args_ = new ArrayList<MysqlxDatatypes.Scalar>(this.args_);
                this.bitField0_ |= 8;
            }
        }

        @Override
        public List<MysqlxDatatypes.Scalar> getArgsList() {
            if (this.argsBuilder_ == null) {
                return Collections.unmodifiableList(this.args_);
            }
            return this.argsBuilder_.getMessageList();
        }

        @Override
        public int getArgsCount() {
            if (this.argsBuilder_ == null) {
                return this.args_.size();
            }
            return this.argsBuilder_.getCount();
        }

        @Override
        public MysqlxDatatypes.Scalar getArgs(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.Scalar)this.argsBuilder_.getMessage(index);
        }

        public Builder setArgs(int index, MysqlxDatatypes.Scalar value) {
            if (this.argsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgsIsMutable();
                this.args_.set(index, value);
                this.onChanged();
            } else {
                this.argsBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(MysqlxDatatypes.Scalar value) {
            if (this.argsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgsIsMutable();
                this.args_.add(value);
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addArgs(int index, MysqlxDatatypes.Scalar value) {
            if (this.argsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgsIsMutable();
                this.args_.add(index, value);
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addArgs(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Scalar> values) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.args_);
                this.onChanged();
            } else {
                this.argsBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearArgs() {
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
            } else {
                this.argsBuilder_.clear();
            }
            return this;
        }

        public Builder removeArgs(int index) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.remove(index);
                this.onChanged();
            } else {
                this.argsBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxDatatypes.Scalar.Builder getArgsBuilder(int index) {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.ScalarOrBuilder)this.argsBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
            if (this.argsBuilder_ != null) {
                return this.argsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.args_);
        }

        public MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
        }

        public MysqlxDatatypes.Scalar.Builder addArgsBuilder(int index) {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
        }

        public List<MysqlxDatatypes.Scalar.Builder> getArgsBuilderList() {
            return this.getArgsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getArgsFieldBuilder() {
            if (this.argsBuilder_ == null) {
                this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 8) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.args_ = null;
            }
            return this.argsBuilder_;
        }

        @Override
        public boolean hasCriteria() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public MysqlxExpr.Expr getCriteria() {
            if (this.criteriaBuilder_ == null) {
                return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
            }
            return (MysqlxExpr.Expr)this.criteriaBuilder_.getMessage();
        }

        public Builder setCriteria(MysqlxExpr.Expr value) {
            if (this.criteriaBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.criteria_ = value;
                this.onChanged();
            } else {
                this.criteriaBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder setCriteria(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = builderForValue.build();
                this.onChanged();
            } else {
                this.criteriaBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder mergeCriteria(MysqlxExpr.Expr value) {
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = (this.bitField0_ & 0x10) != 0 && this.criteria_ != null && this.criteria_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.criteria_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.criteriaBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder clearCriteria() {
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = null;
                this.onChanged();
            } else {
                this.criteriaBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }

        public MysqlxExpr.Expr.Builder getCriteriaBuilder() {
            this.bitField0_ |= 0x10;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getCriteriaFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
            if (this.criteriaBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.criteriaBuilder_.getMessageOrBuilder();
            }
            return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getCriteriaFieldBuilder() {
            if (this.criteriaBuilder_ == null) {
                this.criteriaBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getCriteria(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.criteria_ = null;
            }
            return this.criteriaBuilder_;
        }

        @Override
        public boolean hasLimit() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public MysqlxCrud.Limit getLimit() {
            if (this.limitBuilder_ == null) {
                return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
            }
            return (MysqlxCrud.Limit)this.limitBuilder_.getMessage();
        }

        public Builder setLimit(MysqlxCrud.Limit value) {
            if (this.limitBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.limit_ = value;
                this.onChanged();
            } else {
                this.limitBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder setLimit(MysqlxCrud.Limit.Builder builderForValue) {
            if (this.limitBuilder_ == null) {
                this.limit_ = builderForValue.build();
                this.onChanged();
            } else {
                this.limitBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder mergeLimit(MysqlxCrud.Limit value) {
            if (this.limitBuilder_ == null) {
                this.limit_ = (this.bitField0_ & 0x20) != 0 && this.limit_ != null && this.limit_ != MysqlxCrud.Limit.getDefaultInstance() ? MysqlxCrud.Limit.newBuilder(this.limit_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.limitBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder clearLimit() {
            if (this.limitBuilder_ == null) {
                this.limit_ = null;
                this.onChanged();
            } else {
                this.limitBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }

        public MysqlxCrud.Limit.Builder getLimitBuilder() {
            this.bitField0_ |= 0x20;
            this.onChanged();
            return (MysqlxCrud.Limit.Builder)this.getLimitFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
            if (this.limitBuilder_ != null) {
                return (MysqlxCrud.LimitOrBuilder)this.limitBuilder_.getMessageOrBuilder();
            }
            return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Limit, MysqlxCrud.Limit.Builder, MysqlxCrud.LimitOrBuilder> getLimitFieldBuilder() {
            if (this.limitBuilder_ == null) {
                this.limitBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getLimit(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.limit_ = null;
            }
            return this.limitBuilder_;
        }

        private void ensureOrderIsMutable() {
            if ((this.bitField0_ & 0x40) == 0) {
                this.order_ = new ArrayList<MysqlxCrud.Order>(this.order_);
                this.bitField0_ |= 0x40;
            }
        }

        @Override
        public List<MysqlxCrud.Order> getOrderList() {
            if (this.orderBuilder_ == null) {
                return Collections.unmodifiableList(this.order_);
            }
            return this.orderBuilder_.getMessageList();
        }

        @Override
        public int getOrderCount() {
            if (this.orderBuilder_ == null) {
                return this.order_.size();
            }
            return this.orderBuilder_.getCount();
        }

        @Override
        public MysqlxCrud.Order getOrder(int index) {
            if (this.orderBuilder_ == null) {
                return this.order_.get(index);
            }
            return (MysqlxCrud.Order)this.orderBuilder_.getMessage(index);
        }

        public Builder setOrder(int index, MysqlxCrud.Order value) {
            if (this.orderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureOrderIsMutable();
                this.order_.set(index, value);
                this.onChanged();
            } else {
                this.orderBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.orderBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addOrder(MysqlxCrud.Order value) {
            if (this.orderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureOrderIsMutable();
                this.order_.add(value);
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addOrder(int index, MysqlxCrud.Order value) {
            if (this.orderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureOrderIsMutable();
                this.order_.add(index, value);
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addOrder(MysqlxCrud.Order.Builder builderForValue) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllOrder(Iterable<? extends MysqlxCrud.Order> values) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.order_);
                this.onChanged();
            } else {
                this.orderBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearOrder() {
            if (this.orderBuilder_ == null) {
                this.order_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFBF;
                this.onChanged();
            } else {
                this.orderBuilder_.clear();
            }
            return this;
        }

        public Builder removeOrder(int index) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.remove(index);
                this.onChanged();
            } else {
                this.orderBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxCrud.Order.Builder getOrderBuilder(int index) {
            return (MysqlxCrud.Order.Builder)this.getOrderFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxCrud.OrderOrBuilder getOrderOrBuilder(int index) {
            if (this.orderBuilder_ == null) {
                return this.order_.get(index);
            }
            return (MysqlxCrud.OrderOrBuilder)this.orderBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxCrud.OrderOrBuilder> getOrderOrBuilderList() {
            if (this.orderBuilder_ != null) {
                return this.orderBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.order_);
        }

        public MysqlxCrud.Order.Builder addOrderBuilder() {
            return (MysqlxCrud.Order.Builder)this.getOrderFieldBuilder().addBuilder((AbstractMessage)MysqlxCrud.Order.getDefaultInstance());
        }

        public MysqlxCrud.Order.Builder addOrderBuilder(int index) {
            return (MysqlxCrud.Order.Builder)this.getOrderFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxCrud.Order.getDefaultInstance());
        }

        public List<MysqlxCrud.Order.Builder> getOrderBuilderList() {
            return this.getOrderFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxCrud.Order, MysqlxCrud.Order.Builder, MysqlxCrud.OrderOrBuilder> getOrderFieldBuilder() {
            if (this.orderBuilder_ == null) {
                this.orderBuilder_ = new RepeatedFieldBuilderV3(this.order_, (this.bitField0_ & 0x40) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.order_ = null;
            }
            return this.orderBuilder_;
        }

        private void ensureGroupingIsMutable() {
            if ((this.bitField0_ & 0x80) == 0) {
                this.grouping_ = new ArrayList<MysqlxExpr.Expr>(this.grouping_);
                this.bitField0_ |= 0x80;
            }
        }

        @Override
        public List<MysqlxExpr.Expr> getGroupingList() {
            if (this.groupingBuilder_ == null) {
                return Collections.unmodifiableList(this.grouping_);
            }
            return this.groupingBuilder_.getMessageList();
        }

        @Override
        public int getGroupingCount() {
            if (this.groupingBuilder_ == null) {
                return this.grouping_.size();
            }
            return this.groupingBuilder_.getCount();
        }

        @Override
        public MysqlxExpr.Expr getGrouping(int index) {
            if (this.groupingBuilder_ == null) {
                return this.grouping_.get(index);
            }
            return (MysqlxExpr.Expr)this.groupingBuilder_.getMessage(index);
        }

        public Builder setGrouping(int index, MysqlxExpr.Expr value) {
            if (this.groupingBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureGroupingIsMutable();
                this.grouping_.set(index, value);
                this.onChanged();
            } else {
                this.groupingBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setGrouping(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.groupingBuilder_ == null) {
                this.ensureGroupingIsMutable();
                this.grouping_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.groupingBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addGrouping(MysqlxExpr.Expr value) {
            if (this.groupingBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureGroupingIsMutable();
                this.grouping_.add(value);
                this.onChanged();
            } else {
                this.groupingBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addGrouping(int index, MysqlxExpr.Expr value) {
            if (this.groupingBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureGroupingIsMutable();
                this.grouping_.add(index, value);
                this.onChanged();
            } else {
                this.groupingBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addGrouping(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.groupingBuilder_ == null) {
                this.ensureGroupingIsMutable();
                this.grouping_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.groupingBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addGrouping(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.groupingBuilder_ == null) {
                this.ensureGroupingIsMutable();
                this.grouping_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.groupingBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllGrouping(Iterable<? extends MysqlxExpr.Expr> values) {
            if (this.groupingBuilder_ == null) {
                this.ensureGroupingIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.grouping_);
                this.onChanged();
            } else {
                this.groupingBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearGrouping() {
            if (this.groupingBuilder_ == null) {
                this.grouping_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFF7F;
                this.onChanged();
            } else {
                this.groupingBuilder_.clear();
            }
            return this;
        }

        public Builder removeGrouping(int index) {
            if (this.groupingBuilder_ == null) {
                this.ensureGroupingIsMutable();
                this.grouping_.remove(index);
                this.onChanged();
            } else {
                this.groupingBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxExpr.Expr.Builder getGroupingBuilder(int index) {
            return (MysqlxExpr.Expr.Builder)this.getGroupingFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getGroupingOrBuilder(int index) {
            if (this.groupingBuilder_ == null) {
                return this.grouping_.get(index);
            }
            return (MysqlxExpr.ExprOrBuilder)this.groupingBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxExpr.ExprOrBuilder> getGroupingOrBuilderList() {
            if (this.groupingBuilder_ != null) {
                return this.groupingBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.grouping_);
        }

        public MysqlxExpr.Expr.Builder addGroupingBuilder() {
            return (MysqlxExpr.Expr.Builder)this.getGroupingFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
        }

        public MysqlxExpr.Expr.Builder addGroupingBuilder(int index) {
            return (MysqlxExpr.Expr.Builder)this.getGroupingFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
        }

        public List<MysqlxExpr.Expr.Builder> getGroupingBuilderList() {
            return this.getGroupingFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getGroupingFieldBuilder() {
            if (this.groupingBuilder_ == null) {
                this.groupingBuilder_ = new RepeatedFieldBuilderV3(this.grouping_, (this.bitField0_ & 0x80) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.grouping_ = null;
            }
            return this.groupingBuilder_;
        }

        @Override
        public boolean hasGroupingCriteria() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override
        public MysqlxExpr.Expr getGroupingCriteria() {
            if (this.groupingCriteriaBuilder_ == null) {
                return this.groupingCriteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.groupingCriteria_;
            }
            return (MysqlxExpr.Expr)this.groupingCriteriaBuilder_.getMessage();
        }

        public Builder setGroupingCriteria(MysqlxExpr.Expr value) {
            if (this.groupingCriteriaBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.groupingCriteria_ = value;
                this.onChanged();
            } else {
                this.groupingCriteriaBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x100;
            return this;
        }

        public Builder setGroupingCriteria(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.groupingCriteriaBuilder_ == null) {
                this.groupingCriteria_ = builderForValue.build();
                this.onChanged();
            } else {
                this.groupingCriteriaBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x100;
            return this;
        }

        public Builder mergeGroupingCriteria(MysqlxExpr.Expr value) {
            if (this.groupingCriteriaBuilder_ == null) {
                this.groupingCriteria_ = (this.bitField0_ & 0x100) != 0 && this.groupingCriteria_ != null && this.groupingCriteria_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.groupingCriteria_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.groupingCriteriaBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x100;
            return this;
        }

        public Builder clearGroupingCriteria() {
            if (this.groupingCriteriaBuilder_ == null) {
                this.groupingCriteria_ = null;
                this.onChanged();
            } else {
                this.groupingCriteriaBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFEFF;
            return this;
        }

        public MysqlxExpr.Expr.Builder getGroupingCriteriaBuilder() {
            this.bitField0_ |= 0x100;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getGroupingCriteriaFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getGroupingCriteriaOrBuilder() {
            if (this.groupingCriteriaBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.groupingCriteriaBuilder_.getMessageOrBuilder();
            }
            return this.groupingCriteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.groupingCriteria_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getGroupingCriteriaFieldBuilder() {
            if (this.groupingCriteriaBuilder_ == null) {
                this.groupingCriteriaBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getGroupingCriteria(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.groupingCriteria_ = null;
            }
            return this.groupingCriteriaBuilder_;
        }

        @Override
        public boolean hasLocking() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override
        public RowLock getLocking() {
            RowLock result = RowLock.valueOf(this.locking_);
            return result == null ? RowLock.SHARED_LOCK : result;
        }

        public Builder setLocking(RowLock value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 0x200;
            this.locking_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearLocking() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.locking_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasLockingOptions() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override
        public RowLockOptions getLockingOptions() {
            RowLockOptions result = RowLockOptions.valueOf(this.lockingOptions_);
            return result == null ? RowLockOptions.NOWAIT : result;
        }

        public Builder setLockingOptions(RowLockOptions value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 0x400;
            this.lockingOptions_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearLockingOptions() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.lockingOptions_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasLimitExpr() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override
        public MysqlxCrud.LimitExpr getLimitExpr() {
            if (this.limitExprBuilder_ == null) {
                return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
            }
            return (MysqlxCrud.LimitExpr)this.limitExprBuilder_.getMessage();
        }

        public Builder setLimitExpr(MysqlxCrud.LimitExpr value) {
            if (this.limitExprBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.limitExpr_ = value;
                this.onChanged();
            } else {
                this.limitExprBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x800;
            return this;
        }

        public Builder setLimitExpr(MysqlxCrud.LimitExpr.Builder builderForValue) {
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = builderForValue.build();
                this.onChanged();
            } else {
                this.limitExprBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x800;
            return this;
        }

        public Builder mergeLimitExpr(MysqlxCrud.LimitExpr value) {
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = (this.bitField0_ & 0x800) != 0 && this.limitExpr_ != null && this.limitExpr_ != MysqlxCrud.LimitExpr.getDefaultInstance() ? MysqlxCrud.LimitExpr.newBuilder(this.limitExpr_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.limitExprBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x800;
            return this;
        }

        public Builder clearLimitExpr() {
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = null;
                this.onChanged();
            } else {
                this.limitExprBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFF7FF;
            return this;
        }

        public MysqlxCrud.LimitExpr.Builder getLimitExprBuilder() {
            this.bitField0_ |= 0x800;
            this.onChanged();
            return (MysqlxCrud.LimitExpr.Builder)this.getLimitExprFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
            if (this.limitExprBuilder_ != null) {
                return (MysqlxCrud.LimitExprOrBuilder)this.limitExprBuilder_.getMessageOrBuilder();
            }
            return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.LimitExpr, MysqlxCrud.LimitExpr.Builder, MysqlxCrud.LimitExprOrBuilder> getLimitExprFieldBuilder() {
            if (this.limitExprBuilder_ == null) {
                this.limitExprBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getLimitExpr(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.limitExpr_ = null;
            }
            return this.limitExprBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum RowLockOptions implements ProtocolMessageEnum
    {
        NOWAIT(1),
        SKIP_LOCKED(2);

        public static final int NOWAIT_VALUE = 1;
        public static final int SKIP_LOCKED_VALUE = 2;
        private static final Internal.EnumLiteMap<RowLockOptions> internalValueMap;
        private static final RowLockOptions[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RowLockOptions valueOf(int value) {
            return RowLockOptions.forNumber(value);
        }

        public static RowLockOptions forNumber(int value) {
            switch (value) {
                case 1: {
                    return NOWAIT;
                }
                case 2: {
                    return SKIP_LOCKED;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<RowLockOptions> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)RowLockOptions.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return RowLockOptions.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxCrud.Find.getDescriptor().getEnumTypes().get(1);
        }

        public static RowLockOptions valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != RowLockOptions.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private RowLockOptions(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<RowLockOptions>(){

                public RowLockOptions findValueByNumber(int number) {
                    return RowLockOptions.forNumber(number);
                }
            };
            VALUES = RowLockOptions.values();
        }
    }

    public static enum RowLock implements ProtocolMessageEnum
    {
        SHARED_LOCK(1),
        EXCLUSIVE_LOCK(2);

        public static final int SHARED_LOCK_VALUE = 1;
        public static final int EXCLUSIVE_LOCK_VALUE = 2;
        private static final Internal.EnumLiteMap<RowLock> internalValueMap;
        private static final RowLock[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RowLock valueOf(int value) {
            return RowLock.forNumber(value);
        }

        public static RowLock forNumber(int value) {
            switch (value) {
                case 1: {
                    return SHARED_LOCK;
                }
                case 2: {
                    return EXCLUSIVE_LOCK;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<RowLock> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)RowLock.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return RowLock.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxCrud.Find.getDescriptor().getEnumTypes().get(0);
        }

        public static RowLock valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != RowLock.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private RowLock(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<RowLock>(){

                public RowLock findValueByNumber(int number) {
                    return RowLock.forNumber(number);
                }
            };
            VALUES = RowLock.values();
        }
    }
}
