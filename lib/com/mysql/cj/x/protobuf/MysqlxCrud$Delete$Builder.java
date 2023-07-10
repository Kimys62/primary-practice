/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Delete.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Delete.Builder>
implements MysqlxCrud.DeleteOrBuilder {
    private int bitField0_;
    private MysqlxCrud.Collection collection_;
    private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
    private int dataModel_ = 1;
    private MysqlxExpr.Expr criteria_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> criteriaBuilder_;
    private MysqlxCrud.Limit limit_;
    private SingleFieldBuilderV3<MysqlxCrud.Limit, MysqlxCrud.Limit.Builder, MysqlxCrud.LimitOrBuilder> limitBuilder_;
    private List<MysqlxCrud.Order> order_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxCrud.Order, MysqlxCrud.Order.Builder, MysqlxCrud.OrderOrBuilder> orderBuilder_;
    private List<MysqlxDatatypes.Scalar> args_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;
    private MysqlxCrud.LimitExpr limitExpr_;
    private SingleFieldBuilderV3<MysqlxCrud.LimitExpr, MysqlxCrud.LimitExpr.Builder, MysqlxCrud.LimitExprOrBuilder> limitExprBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Delete_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Delete_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Delete.class, MysqlxCrud.Delete.Builder.class);
    }

    private MysqlxCrud.Delete.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Delete.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCollectionFieldBuilder();
            this.getCriteriaFieldBuilder();
            this.getLimitFieldBuilder();
            this.getOrderFieldBuilder();
            this.getArgsFieldBuilder();
            this.getLimitExprFieldBuilder();
        }
    }

    public MysqlxCrud.Delete.Builder clear() {
        super.clear();
        if (this.collectionBuilder_ == null) {
            this.collection_ = null;
        } else {
            this.collectionBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.dataModel_ = 1;
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.criteriaBuilder_ == null) {
            this.criteria_ = null;
        } else {
            this.criteriaBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        if (this.limitBuilder_ == null) {
            this.limit_ = null;
        } else {
            this.limitBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        if (this.orderBuilder_ == null) {
            this.order_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFEF;
        } else {
            this.orderBuilder_.clear();
        }
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFDF;
        } else {
            this.argsBuilder_.clear();
        }
        if (this.limitExprBuilder_ == null) {
            this.limitExpr_ = null;
        } else {
            this.limitExprBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Delete_descriptor;
    }

    public MysqlxCrud.Delete getDefaultInstanceForType() {
        return MysqlxCrud.Delete.getDefaultInstance();
    }

    public MysqlxCrud.Delete build() {
        MysqlxCrud.Delete result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Delete.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Delete buildPartial() {
        MysqlxCrud.Delete result = new MysqlxCrud.Delete(this, null);
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
        if ((from_bitField0_ & 4) != 0) {
            if (this.criteriaBuilder_ == null) {
                result.criteria_ = this.criteria_;
            } else {
                result.criteria_ = (MysqlxExpr.Expr)this.criteriaBuilder_.build();
            }
            to_bitField0_ |= 4;
        }
        if ((from_bitField0_ & 8) != 0) {
            if (this.limitBuilder_ == null) {
                result.limit_ = this.limit_;
            } else {
                result.limit_ = (MysqlxCrud.Limit)this.limitBuilder_.build();
            }
            to_bitField0_ |= 8;
        }
        if (this.orderBuilder_ == null) {
            if ((this.bitField0_ & 0x10) != 0) {
                this.order_ = Collections.unmodifiableList(this.order_);
                this.bitField0_ &= 0xFFFFFFEF;
            }
            result.order_ = this.order_;
        } else {
            result.order_ = this.orderBuilder_.build();
        }
        if (this.argsBuilder_ == null) {
            if ((this.bitField0_ & 0x20) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
                this.bitField0_ &= 0xFFFFFFDF;
            }
            result.args_ = this.args_;
        } else {
            result.args_ = this.argsBuilder_.build();
        }
        if ((from_bitField0_ & 0x40) != 0) {
            if (this.limitExprBuilder_ == null) {
                result.limitExpr_ = this.limitExpr_;
            } else {
                result.limitExpr_ = (MysqlxCrud.LimitExpr)this.limitExprBuilder_.build();
            }
            to_bitField0_ |= 0x10;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Delete.Builder clone() {
        return (MysqlxCrud.Delete.Builder)super.clone();
    }

    public MysqlxCrud.Delete.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Delete.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Delete.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Delete.Builder)super.clearField(field);
    }

    public MysqlxCrud.Delete.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Delete.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Delete.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Delete.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Delete.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Delete.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Delete.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Delete) {
            return this.mergeFrom((MysqlxCrud.Delete)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Delete.Builder mergeFrom(MysqlxCrud.Delete other) {
        if (other == MysqlxCrud.Delete.getDefaultInstance()) {
            return this;
        }
        if (other.hasCollection()) {
            this.mergeCollection(other.getCollection());
        }
        if (other.hasDataModel()) {
            this.setDataModel(other.getDataModel());
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
                    this.bitField0_ &= 0xFFFFFFEF;
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
                this.bitField0_ &= 0xFFFFFFEF;
                this.orderBuilder_ = alwaysUseFieldBuilders ? this.getOrderFieldBuilder() : null;
            } else {
                this.orderBuilder_.addAllMessages((Iterable)other.order_);
            }
        }
        if (this.argsBuilder_ == null) {
            if (!other.args_.isEmpty()) {
                if (this.args_.isEmpty()) {
                    this.args_ = other.args_;
                    this.bitField0_ &= 0xFFFFFFDF;
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
                this.bitField0_ &= 0xFFFFFFDF;
                this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
            } else {
                this.argsBuilder_.addAllMessages((Iterable)other.args_);
            }
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
        for (i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            return false;
        }
        return !this.hasLimitExpr() || this.getLimitExpr().isInitialized();
    }

    public MysqlxCrud.Delete.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Delete parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Delete)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Delete)e.getUnfinishedMessage();
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

    public MysqlxCrud.Delete.Builder setCollection(MysqlxCrud.Collection value) {
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

    public MysqlxCrud.Delete.Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = builderForValue.build();
            this.onChanged();
        } else {
            this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Delete.Builder mergeCollection(MysqlxCrud.Collection value) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.collectionBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Delete.Builder clearCollection() {
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

    public MysqlxCrud.Delete.Builder setDataModel(MysqlxCrud.DataModel value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.dataModel_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Delete.Builder clearDataModel() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.dataModel_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasCriteria() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxExpr.Expr getCriteria() {
        if (this.criteriaBuilder_ == null) {
            return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
        }
        return (MysqlxExpr.Expr)this.criteriaBuilder_.getMessage();
    }

    public MysqlxCrud.Delete.Builder setCriteria(MysqlxExpr.Expr value) {
        if (this.criteriaBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.criteria_ = value;
            this.onChanged();
        } else {
            this.criteriaBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxCrud.Delete.Builder setCriteria(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.criteriaBuilder_ == null) {
            this.criteria_ = builderForValue.build();
            this.onChanged();
        } else {
            this.criteriaBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxCrud.Delete.Builder mergeCriteria(MysqlxExpr.Expr value) {
        if (this.criteriaBuilder_ == null) {
            this.criteria_ = (this.bitField0_ & 4) != 0 && this.criteria_ != null && this.criteria_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.criteria_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.criteriaBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxCrud.Delete.Builder clearCriteria() {
        if (this.criteriaBuilder_ == null) {
            this.criteria_ = null;
            this.onChanged();
        } else {
            this.criteriaBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public MysqlxExpr.Expr.Builder getCriteriaBuilder() {
        this.bitField0_ |= 4;
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
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.Limit getLimit() {
        if (this.limitBuilder_ == null) {
            return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
        }
        return (MysqlxCrud.Limit)this.limitBuilder_.getMessage();
    }

    public MysqlxCrud.Delete.Builder setLimit(MysqlxCrud.Limit value) {
        if (this.limitBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.limit_ = value;
            this.onChanged();
        } else {
            this.limitBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxCrud.Delete.Builder setLimit(MysqlxCrud.Limit.Builder builderForValue) {
        if (this.limitBuilder_ == null) {
            this.limit_ = builderForValue.build();
            this.onChanged();
        } else {
            this.limitBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxCrud.Delete.Builder mergeLimit(MysqlxCrud.Limit value) {
        if (this.limitBuilder_ == null) {
            this.limit_ = (this.bitField0_ & 8) != 0 && this.limit_ != null && this.limit_ != MysqlxCrud.Limit.getDefaultInstance() ? MysqlxCrud.Limit.newBuilder(this.limit_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.limitBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxCrud.Delete.Builder clearLimit() {
        if (this.limitBuilder_ == null) {
            this.limit_ = null;
            this.onChanged();
        } else {
            this.limitBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public MysqlxCrud.Limit.Builder getLimitBuilder() {
        this.bitField0_ |= 8;
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
        if ((this.bitField0_ & 0x10) == 0) {
            this.order_ = new ArrayList<MysqlxCrud.Order>(this.order_);
            this.bitField0_ |= 0x10;
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

    public MysqlxCrud.Delete.Builder setOrder(int index, MysqlxCrud.Order value) {
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

    public MysqlxCrud.Delete.Builder setOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            this.order_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.orderBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder addOrder(MysqlxCrud.Order value) {
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

    public MysqlxCrud.Delete.Builder addOrder(int index, MysqlxCrud.Order value) {
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

    public MysqlxCrud.Delete.Builder addOrder(MysqlxCrud.Order.Builder builderForValue) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            this.order_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.orderBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder addOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            this.order_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.orderBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder addAllOrder(Iterable<? extends MysqlxCrud.Order> values) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.order_);
            this.onChanged();
        } else {
            this.orderBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder clearOrder() {
        if (this.orderBuilder_ == null) {
            this.order_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFEF;
            this.onChanged();
        } else {
            this.orderBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder removeOrder(int index) {
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
            this.orderBuilder_ = new RepeatedFieldBuilderV3(this.order_, (this.bitField0_ & 0x10) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.order_ = null;
        }
        return this.orderBuilder_;
    }

    private void ensureArgsIsMutable() {
        if ((this.bitField0_ & 0x20) == 0) {
            this.args_ = new ArrayList<MysqlxDatatypes.Scalar>(this.args_);
            this.bitField0_ |= 0x20;
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

    public MysqlxCrud.Delete.Builder setArgs(int index, MysqlxDatatypes.Scalar value) {
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

    public MysqlxCrud.Delete.Builder setArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder addArgs(MysqlxDatatypes.Scalar value) {
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

    public MysqlxCrud.Delete.Builder addArgs(int index, MysqlxDatatypes.Scalar value) {
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

    public MysqlxCrud.Delete.Builder addArgs(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder addArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Scalar> values) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.args_);
            this.onChanged();
        } else {
            this.argsBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder clearArgs() {
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFDF;
            this.onChanged();
        } else {
            this.argsBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Delete.Builder removeArgs(int index) {
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
            this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 0x20) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.args_ = null;
        }
        return this.argsBuilder_;
    }

    @Override
    public boolean hasLimitExpr() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public MysqlxCrud.LimitExpr getLimitExpr() {
        if (this.limitExprBuilder_ == null) {
            return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
        }
        return (MysqlxCrud.LimitExpr)this.limitExprBuilder_.getMessage();
    }

    public MysqlxCrud.Delete.Builder setLimitExpr(MysqlxCrud.LimitExpr value) {
        if (this.limitExprBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.limitExpr_ = value;
            this.onChanged();
        } else {
            this.limitExprBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x40;
        return this;
    }

    public MysqlxCrud.Delete.Builder setLimitExpr(MysqlxCrud.LimitExpr.Builder builderForValue) {
        if (this.limitExprBuilder_ == null) {
            this.limitExpr_ = builderForValue.build();
            this.onChanged();
        } else {
            this.limitExprBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x40;
        return this;
    }

    public MysqlxCrud.Delete.Builder mergeLimitExpr(MysqlxCrud.LimitExpr value) {
        if (this.limitExprBuilder_ == null) {
            this.limitExpr_ = (this.bitField0_ & 0x40) != 0 && this.limitExpr_ != null && this.limitExpr_ != MysqlxCrud.LimitExpr.getDefaultInstance() ? MysqlxCrud.LimitExpr.newBuilder(this.limitExpr_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.limitExprBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x40;
        return this;
    }

    public MysqlxCrud.Delete.Builder clearLimitExpr() {
        if (this.limitExprBuilder_ == null) {
            this.limitExpr_ = null;
            this.onChanged();
        } else {
            this.limitExprBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFBF;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder getLimitExprBuilder() {
        this.bitField0_ |= 0x40;
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

    public final MysqlxCrud.Delete.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Delete.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Delete.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Delete.Builder)super.mergeUnknownFields(unknownFields);
    }
}
