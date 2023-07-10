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

public static final class MysqlxCrud.Find.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Find.Builder>
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
        return internal_static_Mysqlx_Crud_Find_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Find.class, MysqlxCrud.Find.Builder.class);
    }

    private MysqlxCrud.Find.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Find.Builder(GeneratedMessageV3.BuilderParent parent) {
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

    public MysqlxCrud.Find.Builder clear() {
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
            throw MysqlxCrud.Find.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Find buildPartial() {
        MysqlxCrud.Find result = new MysqlxCrud.Find(this, null);
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

    public MysqlxCrud.Find.Builder clone() {
        return (MysqlxCrud.Find.Builder)super.clone();
    }

    public MysqlxCrud.Find.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Find.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Find.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Find.Builder)super.clearField(field);
    }

    public MysqlxCrud.Find.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Find.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Find.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Find.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Find.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Find.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Find.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Find) {
            return this.mergeFrom((MysqlxCrud.Find)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Find.Builder mergeFrom(MysqlxCrud.Find other) {
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

    public MysqlxCrud.Find.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

    public MysqlxCrud.Find.Builder setCollection(MysqlxCrud.Collection value) {
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

    public MysqlxCrud.Find.Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = builderForValue.build();
            this.onChanged();
        } else {
            this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Find.Builder mergeCollection(MysqlxCrud.Collection value) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.collectionBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Find.Builder clearCollection() {
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

    public MysqlxCrud.Find.Builder setDataModel(MysqlxCrud.DataModel value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.dataModel_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Find.Builder clearDataModel() {
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

    public MysqlxCrud.Find.Builder setProjection(int index, MysqlxCrud.Projection value) {
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

    public MysqlxCrud.Find.Builder setProjection(int index, MysqlxCrud.Projection.Builder builderForValue) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.projectionBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addProjection(MysqlxCrud.Projection value) {
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

    public MysqlxCrud.Find.Builder addProjection(int index, MysqlxCrud.Projection value) {
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

    public MysqlxCrud.Find.Builder addProjection(MysqlxCrud.Projection.Builder builderForValue) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.projectionBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addProjection(int index, MysqlxCrud.Projection.Builder builderForValue) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.projectionBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addAllProjection(Iterable<? extends MysqlxCrud.Projection> values) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.projection_);
            this.onChanged();
        } else {
            this.projectionBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Find.Builder clearProjection() {
        if (this.projectionBuilder_ == null) {
            this.projection_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.projectionBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Find.Builder removeProjection(int index) {
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

    public MysqlxCrud.Find.Builder setArgs(int index, MysqlxDatatypes.Scalar value) {
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

    public MysqlxCrud.Find.Builder setArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addArgs(MysqlxDatatypes.Scalar value) {
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

    public MysqlxCrud.Find.Builder addArgs(int index, MysqlxDatatypes.Scalar value) {
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

    public MysqlxCrud.Find.Builder addArgs(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Scalar> values) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.args_);
            this.onChanged();
        } else {
            this.argsBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Find.Builder clearArgs() {
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFF7;
            this.onChanged();
        } else {
            this.argsBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Find.Builder removeArgs(int index) {
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

    public MysqlxCrud.Find.Builder setCriteria(MysqlxExpr.Expr value) {
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

    public MysqlxCrud.Find.Builder setCriteria(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.criteriaBuilder_ == null) {
            this.criteria_ = builderForValue.build();
            this.onChanged();
        } else {
            this.criteriaBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxCrud.Find.Builder mergeCriteria(MysqlxExpr.Expr value) {
        if (this.criteriaBuilder_ == null) {
            this.criteria_ = (this.bitField0_ & 0x10) != 0 && this.criteria_ != null && this.criteria_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.criteria_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.criteriaBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxCrud.Find.Builder clearCriteria() {
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

    public MysqlxCrud.Find.Builder setLimit(MysqlxCrud.Limit value) {
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

    public MysqlxCrud.Find.Builder setLimit(MysqlxCrud.Limit.Builder builderForValue) {
        if (this.limitBuilder_ == null) {
            this.limit_ = builderForValue.build();
            this.onChanged();
        } else {
            this.limitBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxCrud.Find.Builder mergeLimit(MysqlxCrud.Limit value) {
        if (this.limitBuilder_ == null) {
            this.limit_ = (this.bitField0_ & 0x20) != 0 && this.limit_ != null && this.limit_ != MysqlxCrud.Limit.getDefaultInstance() ? MysqlxCrud.Limit.newBuilder(this.limit_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.limitBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxCrud.Find.Builder clearLimit() {
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

    public MysqlxCrud.Find.Builder setOrder(int index, MysqlxCrud.Order value) {
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

    public MysqlxCrud.Find.Builder setOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            this.order_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.orderBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addOrder(MysqlxCrud.Order value) {
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

    public MysqlxCrud.Find.Builder addOrder(int index, MysqlxCrud.Order value) {
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

    public MysqlxCrud.Find.Builder addOrder(MysqlxCrud.Order.Builder builderForValue) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            this.order_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.orderBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            this.order_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.orderBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addAllOrder(Iterable<? extends MysqlxCrud.Order> values) {
        if (this.orderBuilder_ == null) {
            this.ensureOrderIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.order_);
            this.onChanged();
        } else {
            this.orderBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Find.Builder clearOrder() {
        if (this.orderBuilder_ == null) {
            this.order_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFBF;
            this.onChanged();
        } else {
            this.orderBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Find.Builder removeOrder(int index) {
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

    public MysqlxCrud.Find.Builder setGrouping(int index, MysqlxExpr.Expr value) {
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

    public MysqlxCrud.Find.Builder setGrouping(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.groupingBuilder_ == null) {
            this.ensureGroupingIsMutable();
            this.grouping_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.groupingBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addGrouping(MysqlxExpr.Expr value) {
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

    public MysqlxCrud.Find.Builder addGrouping(int index, MysqlxExpr.Expr value) {
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

    public MysqlxCrud.Find.Builder addGrouping(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.groupingBuilder_ == null) {
            this.ensureGroupingIsMutable();
            this.grouping_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.groupingBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addGrouping(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.groupingBuilder_ == null) {
            this.ensureGroupingIsMutable();
            this.grouping_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.groupingBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Find.Builder addAllGrouping(Iterable<? extends MysqlxExpr.Expr> values) {
        if (this.groupingBuilder_ == null) {
            this.ensureGroupingIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.grouping_);
            this.onChanged();
        } else {
            this.groupingBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Find.Builder clearGrouping() {
        if (this.groupingBuilder_ == null) {
            this.grouping_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFF7F;
            this.onChanged();
        } else {
            this.groupingBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Find.Builder removeGrouping(int index) {
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

    public MysqlxCrud.Find.Builder setGroupingCriteria(MysqlxExpr.Expr value) {
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

    public MysqlxCrud.Find.Builder setGroupingCriteria(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.groupingCriteriaBuilder_ == null) {
            this.groupingCriteria_ = builderForValue.build();
            this.onChanged();
        } else {
            this.groupingCriteriaBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x100;
        return this;
    }

    public MysqlxCrud.Find.Builder mergeGroupingCriteria(MysqlxExpr.Expr value) {
        if (this.groupingCriteriaBuilder_ == null) {
            this.groupingCriteria_ = (this.bitField0_ & 0x100) != 0 && this.groupingCriteria_ != null && this.groupingCriteria_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.groupingCriteria_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.groupingCriteriaBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x100;
        return this;
    }

    public MysqlxCrud.Find.Builder clearGroupingCriteria() {
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
    public MysqlxCrud.Find.RowLock getLocking() {
        MysqlxCrud.Find.RowLock result = MysqlxCrud.Find.RowLock.valueOf(this.locking_);
        return result == null ? MysqlxCrud.Find.RowLock.SHARED_LOCK : result;
    }

    public MysqlxCrud.Find.Builder setLocking(MysqlxCrud.Find.RowLock value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 0x200;
        this.locking_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Find.Builder clearLocking() {
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
    public MysqlxCrud.Find.RowLockOptions getLockingOptions() {
        MysqlxCrud.Find.RowLockOptions result = MysqlxCrud.Find.RowLockOptions.valueOf(this.lockingOptions_);
        return result == null ? MysqlxCrud.Find.RowLockOptions.NOWAIT : result;
    }

    public MysqlxCrud.Find.Builder setLockingOptions(MysqlxCrud.Find.RowLockOptions value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 0x400;
        this.lockingOptions_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Find.Builder clearLockingOptions() {
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

    public MysqlxCrud.Find.Builder setLimitExpr(MysqlxCrud.LimitExpr value) {
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

    public MysqlxCrud.Find.Builder setLimitExpr(MysqlxCrud.LimitExpr.Builder builderForValue) {
        if (this.limitExprBuilder_ == null) {
            this.limitExpr_ = builderForValue.build();
            this.onChanged();
        } else {
            this.limitExprBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x800;
        return this;
    }

    public MysqlxCrud.Find.Builder mergeLimitExpr(MysqlxCrud.LimitExpr value) {
        if (this.limitExprBuilder_ == null) {
            this.limitExpr_ = (this.bitField0_ & 0x800) != 0 && this.limitExpr_ != null && this.limitExpr_ != MysqlxCrud.LimitExpr.getDefaultInstance() ? MysqlxCrud.LimitExpr.newBuilder(this.limitExpr_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.limitExprBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x800;
        return this;
    }

    public MysqlxCrud.Find.Builder clearLimitExpr() {
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

    public final MysqlxCrud.Find.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Find.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Find.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Find.Builder)super.mergeUnknownFields(unknownFields);
    }
}
