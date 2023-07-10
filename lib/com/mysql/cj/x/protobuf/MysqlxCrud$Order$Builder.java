/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;

public static final class MysqlxCrud.Order.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Order.Builder>
implements MysqlxCrud.OrderOrBuilder {
    private int bitField0_;
    private MysqlxExpr.Expr expr_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> exprBuilder_;
    private int direction_ = 1;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Order_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Order_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Order.class, MysqlxCrud.Order.Builder.class);
    }

    private MysqlxCrud.Order.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Order.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getExprFieldBuilder();
        }
    }

    public MysqlxCrud.Order.Builder clear() {
        super.clear();
        if (this.exprBuilder_ == null) {
            this.expr_ = null;
        } else {
            this.exprBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.direction_ = 1;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Order_descriptor;
    }

    public MysqlxCrud.Order getDefaultInstanceForType() {
        return MysqlxCrud.Order.getDefaultInstance();
    }

    public MysqlxCrud.Order build() {
        MysqlxCrud.Order result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Order.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Order buildPartial() {
        MysqlxCrud.Order result = new MysqlxCrud.Order(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            if (this.exprBuilder_ == null) {
                result.expr_ = this.expr_;
            } else {
                result.expr_ = (MysqlxExpr.Expr)this.exprBuilder_.build();
            }
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.direction_ = this.direction_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Order.Builder clone() {
        return (MysqlxCrud.Order.Builder)super.clone();
    }

    public MysqlxCrud.Order.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Order.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Order.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Order.Builder)super.clearField(field);
    }

    public MysqlxCrud.Order.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Order.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Order.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Order.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Order.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Order.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Order.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Order) {
            return this.mergeFrom((MysqlxCrud.Order)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Order.Builder mergeFrom(MysqlxCrud.Order other) {
        if (other == MysqlxCrud.Order.getDefaultInstance()) {
            return this;
        }
        if (other.hasExpr()) {
            this.mergeExpr(other.getExpr());
        }
        if (other.hasDirection()) {
            this.setDirection(other.getDirection());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasExpr()) {
            return false;
        }
        return this.getExpr().isInitialized();
    }

    public MysqlxCrud.Order.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Order parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Order)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Order)e.getUnfinishedMessage();
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
    public boolean hasExpr() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Expr getExpr() {
        if (this.exprBuilder_ == null) {
            return this.expr_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.expr_;
        }
        return (MysqlxExpr.Expr)this.exprBuilder_.getMessage();
    }

    public MysqlxCrud.Order.Builder setExpr(MysqlxExpr.Expr value) {
        if (this.exprBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.expr_ = value;
            this.onChanged();
        } else {
            this.exprBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Order.Builder setExpr(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.exprBuilder_ == null) {
            this.expr_ = builderForValue.build();
            this.onChanged();
        } else {
            this.exprBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Order.Builder mergeExpr(MysqlxExpr.Expr value) {
        if (this.exprBuilder_ == null) {
            this.expr_ = (this.bitField0_ & 1) != 0 && this.expr_ != null && this.expr_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.expr_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.exprBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Order.Builder clearExpr() {
        if (this.exprBuilder_ == null) {
            this.expr_ = null;
            this.onChanged();
        } else {
            this.exprBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public MysqlxExpr.Expr.Builder getExprBuilder() {
        this.bitField0_ |= 1;
        this.onChanged();
        return (MysqlxExpr.Expr.Builder)this.getExprFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getExprOrBuilder() {
        if (this.exprBuilder_ != null) {
            return (MysqlxExpr.ExprOrBuilder)this.exprBuilder_.getMessageOrBuilder();
        }
        return this.expr_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.expr_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getExprFieldBuilder() {
        if (this.exprBuilder_ == null) {
            this.exprBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getExpr(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.expr_ = null;
        }
        return this.exprBuilder_;
    }

    @Override
    public boolean hasDirection() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.Order.Direction getDirection() {
        MysqlxCrud.Order.Direction result = MysqlxCrud.Order.Direction.valueOf(this.direction_);
        return result == null ? MysqlxCrud.Order.Direction.ASC : result;
    }

    public MysqlxCrud.Order.Builder setDirection(MysqlxCrud.Order.Direction value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.direction_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Order.Builder clearDirection() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.direction_ = 1;
        this.onChanged();
        return this;
    }

    public final MysqlxCrud.Order.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Order.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Order.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Order.Builder)super.mergeUnknownFields(unknownFields);
    }
}
