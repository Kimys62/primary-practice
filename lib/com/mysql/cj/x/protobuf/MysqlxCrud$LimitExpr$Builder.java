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

public static final class MysqlxCrud.LimitExpr.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.LimitExpr.Builder>
implements MysqlxCrud.LimitExprOrBuilder {
    private int bitField0_;
    private MysqlxExpr.Expr rowCount_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> rowCountBuilder_;
    private MysqlxExpr.Expr offset_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> offsetBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_LimitExpr_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.LimitExpr.class, MysqlxCrud.LimitExpr.Builder.class);
    }

    private MysqlxCrud.LimitExpr.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.LimitExpr.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getRowCountFieldBuilder();
            this.getOffsetFieldBuilder();
        }
    }

    public MysqlxCrud.LimitExpr.Builder clear() {
        super.clear();
        if (this.rowCountBuilder_ == null) {
            this.rowCount_ = null;
        } else {
            this.rowCountBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.offsetBuilder_ == null) {
            this.offset_ = null;
        } else {
            this.offsetBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_LimitExpr_descriptor;
    }

    public MysqlxCrud.LimitExpr getDefaultInstanceForType() {
        return MysqlxCrud.LimitExpr.getDefaultInstance();
    }

    public MysqlxCrud.LimitExpr build() {
        MysqlxCrud.LimitExpr result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.LimitExpr.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.LimitExpr buildPartial() {
        MysqlxCrud.LimitExpr result = new MysqlxCrud.LimitExpr(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            if (this.rowCountBuilder_ == null) {
                result.rowCount_ = this.rowCount_;
            } else {
                result.rowCount_ = (MysqlxExpr.Expr)this.rowCountBuilder_.build();
            }
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            if (this.offsetBuilder_ == null) {
                result.offset_ = this.offset_;
            } else {
                result.offset_ = (MysqlxExpr.Expr)this.offsetBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.LimitExpr.Builder clone() {
        return (MysqlxCrud.LimitExpr.Builder)super.clone();
    }

    public MysqlxCrud.LimitExpr.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.LimitExpr.Builder)super.setField(field, value);
    }

    public MysqlxCrud.LimitExpr.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.LimitExpr.Builder)super.clearField(field);
    }

    public MysqlxCrud.LimitExpr.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.LimitExpr.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.LimitExpr.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.LimitExpr.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.LimitExpr.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.LimitExpr.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.LimitExpr.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.LimitExpr) {
            return this.mergeFrom((MysqlxCrud.LimitExpr)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder mergeFrom(MysqlxCrud.LimitExpr other) {
        if (other == MysqlxCrud.LimitExpr.getDefaultInstance()) {
            return this;
        }
        if (other.hasRowCount()) {
            this.mergeRowCount(other.getRowCount());
        }
        if (other.hasOffset()) {
            this.mergeOffset(other.getOffset());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasRowCount()) {
            return false;
        }
        if (!this.getRowCount().isInitialized()) {
            return false;
        }
        return !this.hasOffset() || this.getOffset().isInitialized();
    }

    public MysqlxCrud.LimitExpr.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.LimitExpr parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.LimitExpr)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.LimitExpr)e.getUnfinishedMessage();
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
    public boolean hasRowCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Expr getRowCount() {
        if (this.rowCountBuilder_ == null) {
            return this.rowCount_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.rowCount_;
        }
        return (MysqlxExpr.Expr)this.rowCountBuilder_.getMessage();
    }

    public MysqlxCrud.LimitExpr.Builder setRowCount(MysqlxExpr.Expr value) {
        if (this.rowCountBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.rowCount_ = value;
            this.onChanged();
        } else {
            this.rowCountBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder setRowCount(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.rowCountBuilder_ == null) {
            this.rowCount_ = builderForValue.build();
            this.onChanged();
        } else {
            this.rowCountBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder mergeRowCount(MysqlxExpr.Expr value) {
        if (this.rowCountBuilder_ == null) {
            this.rowCount_ = (this.bitField0_ & 1) != 0 && this.rowCount_ != null && this.rowCount_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.rowCount_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.rowCountBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder clearRowCount() {
        if (this.rowCountBuilder_ == null) {
            this.rowCount_ = null;
            this.onChanged();
        } else {
            this.rowCountBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public MysqlxExpr.Expr.Builder getRowCountBuilder() {
        this.bitField0_ |= 1;
        this.onChanged();
        return (MysqlxExpr.Expr.Builder)this.getRowCountFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getRowCountOrBuilder() {
        if (this.rowCountBuilder_ != null) {
            return (MysqlxExpr.ExprOrBuilder)this.rowCountBuilder_.getMessageOrBuilder();
        }
        return this.rowCount_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.rowCount_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getRowCountFieldBuilder() {
        if (this.rowCountBuilder_ == null) {
            this.rowCountBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getRowCount(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.rowCount_ = null;
        }
        return this.rowCountBuilder_;
    }

    @Override
    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxExpr.Expr getOffset() {
        if (this.offsetBuilder_ == null) {
            return this.offset_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.offset_;
        }
        return (MysqlxExpr.Expr)this.offsetBuilder_.getMessage();
    }

    public MysqlxCrud.LimitExpr.Builder setOffset(MysqlxExpr.Expr value) {
        if (this.offsetBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.offset_ = value;
            this.onChanged();
        } else {
            this.offsetBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder setOffset(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.offsetBuilder_ == null) {
            this.offset_ = builderForValue.build();
            this.onChanged();
        } else {
            this.offsetBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder mergeOffset(MysqlxExpr.Expr value) {
        if (this.offsetBuilder_ == null) {
            this.offset_ = (this.bitField0_ & 2) != 0 && this.offset_ != null && this.offset_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.offset_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.offsetBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCrud.LimitExpr.Builder clearOffset() {
        if (this.offsetBuilder_ == null) {
            this.offset_ = null;
            this.onChanged();
        } else {
            this.offsetBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxExpr.Expr.Builder getOffsetBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxExpr.Expr.Builder)this.getOffsetFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getOffsetOrBuilder() {
        if (this.offsetBuilder_ != null) {
            return (MysqlxExpr.ExprOrBuilder)this.offsetBuilder_.getMessageOrBuilder();
        }
        return this.offset_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.offset_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getOffsetFieldBuilder() {
        if (this.offsetBuilder_ == null) {
            this.offsetBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getOffset(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.offset_ = null;
        }
        return this.offsetBuilder_;
    }

    public final MysqlxCrud.LimitExpr.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.LimitExpr.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.LimitExpr.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.LimitExpr.Builder)super.mergeUnknownFields(unknownFields);
    }
}
