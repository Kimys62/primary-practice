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

public static final class MysqlxCrud.UpdateOperation.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.UpdateOperation.Builder>
implements MysqlxCrud.UpdateOperationOrBuilder {
    private int bitField0_;
    private MysqlxExpr.ColumnIdentifier source_;
    private SingleFieldBuilderV3<MysqlxExpr.ColumnIdentifier, MysqlxExpr.ColumnIdentifier.Builder, MysqlxExpr.ColumnIdentifierOrBuilder> sourceBuilder_;
    private int operation_ = 1;
    private MysqlxExpr.Expr value_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.UpdateOperation.class, MysqlxCrud.UpdateOperation.Builder.class);
    }

    private MysqlxCrud.UpdateOperation.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.UpdateOperation.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getSourceFieldBuilder();
            this.getValueFieldBuilder();
        }
    }

    public MysqlxCrud.UpdateOperation.Builder clear() {
        super.clear();
        if (this.sourceBuilder_ == null) {
            this.source_ = null;
        } else {
            this.sourceBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.operation_ = 1;
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.valueBuilder_ == null) {
            this.value_ = null;
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
    }

    public MysqlxCrud.UpdateOperation getDefaultInstanceForType() {
        return MysqlxCrud.UpdateOperation.getDefaultInstance();
    }

    public MysqlxCrud.UpdateOperation build() {
        MysqlxCrud.UpdateOperation result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.UpdateOperation.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.UpdateOperation buildPartial() {
        MysqlxCrud.UpdateOperation result = new MysqlxCrud.UpdateOperation(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            if (this.sourceBuilder_ == null) {
                result.source_ = this.source_;
            } else {
                result.source_ = (MysqlxExpr.ColumnIdentifier)this.sourceBuilder_.build();
            }
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.operation_ = this.operation_;
        if ((from_bitField0_ & 4) != 0) {
            if (this.valueBuilder_ == null) {
                result.value_ = this.value_;
            } else {
                result.value_ = (MysqlxExpr.Expr)this.valueBuilder_.build();
            }
            to_bitField0_ |= 4;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.UpdateOperation.Builder clone() {
        return (MysqlxCrud.UpdateOperation.Builder)super.clone();
    }

    public MysqlxCrud.UpdateOperation.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.UpdateOperation.Builder)super.setField(field, value);
    }

    public MysqlxCrud.UpdateOperation.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.UpdateOperation.Builder)super.clearField(field);
    }

    public MysqlxCrud.UpdateOperation.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.UpdateOperation.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.UpdateOperation.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.UpdateOperation.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.UpdateOperation.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.UpdateOperation.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.UpdateOperation.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.UpdateOperation) {
            return this.mergeFrom((MysqlxCrud.UpdateOperation)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder mergeFrom(MysqlxCrud.UpdateOperation other) {
        if (other == MysqlxCrud.UpdateOperation.getDefaultInstance()) {
            return this;
        }
        if (other.hasSource()) {
            this.mergeSource(other.getSource());
        }
        if (other.hasOperation()) {
            this.setOperation(other.getOperation());
        }
        if (other.hasValue()) {
            this.mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasSource()) {
            return false;
        }
        if (!this.hasOperation()) {
            return false;
        }
        if (!this.getSource().isInitialized()) {
            return false;
        }
        return !this.hasValue() || this.getValue().isInitialized();
    }

    public MysqlxCrud.UpdateOperation.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.UpdateOperation parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.UpdateOperation)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.UpdateOperation)e.getUnfinishedMessage();
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
    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.ColumnIdentifier getSource() {
        if (this.sourceBuilder_ == null) {
            return this.source_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.source_;
        }
        return (MysqlxExpr.ColumnIdentifier)this.sourceBuilder_.getMessage();
    }

    public MysqlxCrud.UpdateOperation.Builder setSource(MysqlxExpr.ColumnIdentifier value) {
        if (this.sourceBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.source_ = value;
            this.onChanged();
        } else {
            this.sourceBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder setSource(MysqlxExpr.ColumnIdentifier.Builder builderForValue) {
        if (this.sourceBuilder_ == null) {
            this.source_ = builderForValue.build();
            this.onChanged();
        } else {
            this.sourceBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder mergeSource(MysqlxExpr.ColumnIdentifier value) {
        if (this.sourceBuilder_ == null) {
            this.source_ = (this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != MysqlxExpr.ColumnIdentifier.getDefaultInstance() ? MysqlxExpr.ColumnIdentifier.newBuilder(this.source_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.sourceBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder clearSource() {
        if (this.sourceBuilder_ == null) {
            this.source_ = null;
            this.onChanged();
        } else {
            this.sourceBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder getSourceBuilder() {
        this.bitField0_ |= 1;
        this.onChanged();
        return (MysqlxExpr.ColumnIdentifier.Builder)this.getSourceFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ColumnIdentifierOrBuilder getSourceOrBuilder() {
        if (this.sourceBuilder_ != null) {
            return (MysqlxExpr.ColumnIdentifierOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
        }
        return this.source_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.source_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.ColumnIdentifier, MysqlxExpr.ColumnIdentifier.Builder, MysqlxExpr.ColumnIdentifierOrBuilder> getSourceFieldBuilder() {
        if (this.sourceBuilder_ == null) {
            this.sourceBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getSource(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.source_ = null;
        }
        return this.sourceBuilder_;
    }

    @Override
    public boolean hasOperation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.UpdateOperation.UpdateType getOperation() {
        MysqlxCrud.UpdateOperation.UpdateType result = MysqlxCrud.UpdateOperation.UpdateType.valueOf(this.operation_);
        return result == null ? MysqlxCrud.UpdateOperation.UpdateType.SET : result;
    }

    public MysqlxCrud.UpdateOperation.Builder setOperation(MysqlxCrud.UpdateOperation.UpdateType value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.operation_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder clearOperation() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.operation_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxExpr.Expr getValue() {
        if (this.valueBuilder_ == null) {
            return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
        }
        return (MysqlxExpr.Expr)this.valueBuilder_.getMessage();
    }

    public MysqlxCrud.UpdateOperation.Builder setValue(MysqlxExpr.Expr value) {
        if (this.valueBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.value_ = value;
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder setValue(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.value_ = builderForValue.build();
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder mergeValue(MysqlxExpr.Expr value) {
        if (this.valueBuilder_ == null) {
            this.value_ = (this.bitField0_ & 4) != 0 && this.value_ != null && this.value_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.valueBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxCrud.UpdateOperation.Builder clearValue() {
        if (this.valueBuilder_ == null) {
            this.value_ = null;
            this.onChanged();
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public MysqlxExpr.Expr.Builder getValueBuilder() {
        this.bitField0_ |= 4;
        this.onChanged();
        return (MysqlxExpr.Expr.Builder)this.getValueFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getValueOrBuilder() {
        if (this.valueBuilder_ != null) {
            return (MysqlxExpr.ExprOrBuilder)this.valueBuilder_.getMessageOrBuilder();
        }
        return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getValueFieldBuilder() {
        if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getValue(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.value_ = null;
        }
        return this.valueBuilder_;
    }

    public final MysqlxCrud.UpdateOperation.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.UpdateOperation.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.UpdateOperation.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.UpdateOperation.Builder)super.mergeUnknownFields(unknownFields);
    }
}
