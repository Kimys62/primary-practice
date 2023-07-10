/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.ByteString
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
import com.google.protobuf.ByteString;
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

public static final class MysqlxCrud.Projection.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Projection.Builder>
implements MysqlxCrud.ProjectionOrBuilder {
    private int bitField0_;
    private MysqlxExpr.Expr source_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> sourceBuilder_;
    private Object alias_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Projection_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Projection_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Projection.class, MysqlxCrud.Projection.Builder.class);
    }

    private MysqlxCrud.Projection.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Projection.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getSourceFieldBuilder();
        }
    }

    public MysqlxCrud.Projection.Builder clear() {
        super.clear();
        if (this.sourceBuilder_ == null) {
            this.source_ = null;
        } else {
            this.sourceBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.alias_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Projection_descriptor;
    }

    public MysqlxCrud.Projection getDefaultInstanceForType() {
        return MysqlxCrud.Projection.getDefaultInstance();
    }

    public MysqlxCrud.Projection build() {
        MysqlxCrud.Projection result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Projection.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Projection buildPartial() {
        MysqlxCrud.Projection result = new MysqlxCrud.Projection(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            if (this.sourceBuilder_ == null) {
                result.source_ = this.source_;
            } else {
                result.source_ = (MysqlxExpr.Expr)this.sourceBuilder_.build();
            }
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.alias_ = this.alias_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Projection.Builder clone() {
        return (MysqlxCrud.Projection.Builder)super.clone();
    }

    public MysqlxCrud.Projection.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Projection.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Projection.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Projection.Builder)super.clearField(field);
    }

    public MysqlxCrud.Projection.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Projection.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Projection.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Projection.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Projection.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Projection.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Projection.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Projection) {
            return this.mergeFrom((MysqlxCrud.Projection)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Projection.Builder mergeFrom(MysqlxCrud.Projection other) {
        if (other == MysqlxCrud.Projection.getDefaultInstance()) {
            return this;
        }
        if (other.hasSource()) {
            this.mergeSource(other.getSource());
        }
        if (other.hasAlias()) {
            this.bitField0_ |= 2;
            this.alias_ = other.alias_;
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasSource()) {
            return false;
        }
        return this.getSource().isInitialized();
    }

    public MysqlxCrud.Projection.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Projection parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Projection)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Projection)e.getUnfinishedMessage();
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
    public MysqlxExpr.Expr getSource() {
        if (this.sourceBuilder_ == null) {
            return this.source_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.source_;
        }
        return (MysqlxExpr.Expr)this.sourceBuilder_.getMessage();
    }

    public MysqlxCrud.Projection.Builder setSource(MysqlxExpr.Expr value) {
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

    public MysqlxCrud.Projection.Builder setSource(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.sourceBuilder_ == null) {
            this.source_ = builderForValue.build();
            this.onChanged();
        } else {
            this.sourceBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Projection.Builder mergeSource(MysqlxExpr.Expr value) {
        if (this.sourceBuilder_ == null) {
            this.source_ = (this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.source_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.sourceBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Projection.Builder clearSource() {
        if (this.sourceBuilder_ == null) {
            this.source_ = null;
            this.onChanged();
        } else {
            this.sourceBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public MysqlxExpr.Expr.Builder getSourceBuilder() {
        this.bitField0_ |= 1;
        this.onChanged();
        return (MysqlxExpr.Expr.Builder)this.getSourceFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getSourceOrBuilder() {
        if (this.sourceBuilder_ != null) {
            return (MysqlxExpr.ExprOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
        }
        return this.source_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.source_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getSourceFieldBuilder() {
        if (this.sourceBuilder_ == null) {
            this.sourceBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getSource(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.source_ = null;
        }
        return this.sourceBuilder_;
    }

    @Override
    public boolean hasAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getAlias() {
        Object ref = this.alias_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.alias_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getAliasBytes() {
        Object ref = this.alias_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.alias_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxCrud.Projection.Builder setAlias(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.alias_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Projection.Builder clearAlias() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.alias_ = MysqlxCrud.Projection.getDefaultInstance().getAlias();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Projection.Builder setAliasBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.alias_ = value;
        this.onChanged();
        return this;
    }

    public final MysqlxCrud.Projection.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Projection.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Projection.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Projection.Builder)super.mergeUnknownFields(unknownFields);
    }
}
