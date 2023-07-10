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
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.FunctionCall.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.FunctionCall.Builder>
implements MysqlxExpr.FunctionCallOrBuilder {
    private int bitField0_;
    private MysqlxExpr.Identifier name_;
    private SingleFieldBuilderV3<MysqlxExpr.Identifier, MysqlxExpr.Identifier.Builder, MysqlxExpr.IdentifierOrBuilder> nameBuilder_;
    private List<MysqlxExpr.Expr> param_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> paramBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_FunctionCall_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_FunctionCall_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.FunctionCall.class, MysqlxExpr.FunctionCall.Builder.class);
    }

    private MysqlxExpr.FunctionCall.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.FunctionCall.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getNameFieldBuilder();
            this.getParamFieldBuilder();
        }
    }

    public MysqlxExpr.FunctionCall.Builder clear() {
        super.clear();
        if (this.nameBuilder_ == null) {
            this.name_ = null;
        } else {
            this.nameBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.paramBuilder_ == null) {
            this.param_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
        } else {
            this.paramBuilder_.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expr_FunctionCall_descriptor;
    }

    public MysqlxExpr.FunctionCall getDefaultInstanceForType() {
        return MysqlxExpr.FunctionCall.getDefaultInstance();
    }

    public MysqlxExpr.FunctionCall build() {
        MysqlxExpr.FunctionCall result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.FunctionCall.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.FunctionCall buildPartial() {
        MysqlxExpr.FunctionCall result = new MysqlxExpr.FunctionCall(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            if (this.nameBuilder_ == null) {
                result.name_ = this.name_;
            } else {
                result.name_ = (MysqlxExpr.Identifier)this.nameBuilder_.build();
            }
            to_bitField0_ |= 1;
        }
        if (this.paramBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
                this.param_ = Collections.unmodifiableList(this.param_);
                this.bitField0_ &= 0xFFFFFFFD;
            }
            result.param_ = this.param_;
        } else {
            result.param_ = this.paramBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpr.FunctionCall.Builder clone() {
        return (MysqlxExpr.FunctionCall.Builder)super.clone();
    }

    public MysqlxExpr.FunctionCall.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.FunctionCall.Builder)super.setField(field, value);
    }

    public MysqlxExpr.FunctionCall.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.FunctionCall.Builder)super.clearField(field);
    }

    public MysqlxExpr.FunctionCall.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.FunctionCall.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.FunctionCall.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.FunctionCall.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.FunctionCall.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.FunctionCall.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.FunctionCall.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.FunctionCall) {
            return this.mergeFrom((MysqlxExpr.FunctionCall)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder mergeFrom(MysqlxExpr.FunctionCall other) {
        if (other == MysqlxExpr.FunctionCall.getDefaultInstance()) {
            return this;
        }
        if (other.hasName()) {
            this.mergeName(other.getName());
        }
        if (this.paramBuilder_ == null) {
            if (!other.param_.isEmpty()) {
                if (this.param_.isEmpty()) {
                    this.param_ = other.param_;
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.ensureParamIsMutable();
                    this.param_.addAll(other.param_);
                }
                this.onChanged();
            }
        } else if (!other.param_.isEmpty()) {
            if (this.paramBuilder_.isEmpty()) {
                this.paramBuilder_.dispose();
                this.paramBuilder_ = null;
                this.param_ = other.param_;
                this.bitField0_ &= 0xFFFFFFFD;
                this.paramBuilder_ = alwaysUseFieldBuilders ? this.getParamFieldBuilder() : null;
            } else {
                this.paramBuilder_.addAllMessages((Iterable)other.param_);
            }
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasName()) {
            return false;
        }
        if (!this.getName().isInitialized()) {
            return false;
        }
        for (int i = 0; i < this.getParamCount(); ++i) {
            if (this.getParam(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxExpr.FunctionCall.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.FunctionCall parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.FunctionCall)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.FunctionCall)e.getUnfinishedMessage();
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
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Identifier getName() {
        if (this.nameBuilder_ == null) {
            return this.name_ == null ? MysqlxExpr.Identifier.getDefaultInstance() : this.name_;
        }
        return (MysqlxExpr.Identifier)this.nameBuilder_.getMessage();
    }

    public MysqlxExpr.FunctionCall.Builder setName(MysqlxExpr.Identifier value) {
        if (this.nameBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.name_ = value;
            this.onChanged();
        } else {
            this.nameBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder setName(MysqlxExpr.Identifier.Builder builderForValue) {
        if (this.nameBuilder_ == null) {
            this.name_ = builderForValue.build();
            this.onChanged();
        } else {
            this.nameBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder mergeName(MysqlxExpr.Identifier value) {
        if (this.nameBuilder_ == null) {
            this.name_ = (this.bitField0_ & 1) != 0 && this.name_ != null && this.name_ != MysqlxExpr.Identifier.getDefaultInstance() ? MysqlxExpr.Identifier.newBuilder(this.name_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.nameBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder clearName() {
        if (this.nameBuilder_ == null) {
            this.name_ = null;
            this.onChanged();
        } else {
            this.nameBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public MysqlxExpr.Identifier.Builder getNameBuilder() {
        this.bitField0_ |= 1;
        this.onChanged();
        return (MysqlxExpr.Identifier.Builder)this.getNameFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.IdentifierOrBuilder getNameOrBuilder() {
        if (this.nameBuilder_ != null) {
            return (MysqlxExpr.IdentifierOrBuilder)this.nameBuilder_.getMessageOrBuilder();
        }
        return this.name_ == null ? MysqlxExpr.Identifier.getDefaultInstance() : this.name_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Identifier, MysqlxExpr.Identifier.Builder, MysqlxExpr.IdentifierOrBuilder> getNameFieldBuilder() {
        if (this.nameBuilder_ == null) {
            this.nameBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getName(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.name_ = null;
        }
        return this.nameBuilder_;
    }

    private void ensureParamIsMutable() {
        if ((this.bitField0_ & 2) == 0) {
            this.param_ = new ArrayList<MysqlxExpr.Expr>(this.param_);
            this.bitField0_ |= 2;
        }
    }

    @Override
    public List<MysqlxExpr.Expr> getParamList() {
        if (this.paramBuilder_ == null) {
            return Collections.unmodifiableList(this.param_);
        }
        return this.paramBuilder_.getMessageList();
    }

    @Override
    public int getParamCount() {
        if (this.paramBuilder_ == null) {
            return this.param_.size();
        }
        return this.paramBuilder_.getCount();
    }

    @Override
    public MysqlxExpr.Expr getParam(int index) {
        if (this.paramBuilder_ == null) {
            return this.param_.get(index);
        }
        return (MysqlxExpr.Expr)this.paramBuilder_.getMessage(index);
    }

    public MysqlxExpr.FunctionCall.Builder setParam(int index, MysqlxExpr.Expr value) {
        if (this.paramBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureParamIsMutable();
            this.param_.set(index, value);
            this.onChanged();
        } else {
            this.paramBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder setParam(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.paramBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder addParam(MysqlxExpr.Expr value) {
        if (this.paramBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureParamIsMutable();
            this.param_.add(value);
            this.onChanged();
        } else {
            this.paramBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder addParam(int index, MysqlxExpr.Expr value) {
        if (this.paramBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureParamIsMutable();
            this.param_.add(index, value);
            this.onChanged();
        } else {
            this.paramBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder addParam(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.paramBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder addParam(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.paramBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder addAllParam(Iterable<? extends MysqlxExpr.Expr> values) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.param_);
            this.onChanged();
        } else {
            this.paramBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder clearParam() {
        if (this.paramBuilder_ == null) {
            this.param_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.paramBuilder_.clear();
        }
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder removeParam(int index) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.remove(index);
            this.onChanged();
        } else {
            this.paramBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxExpr.Expr.Builder getParamBuilder(int index) {
        return (MysqlxExpr.Expr.Builder)this.getParamFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getParamOrBuilder(int index) {
        if (this.paramBuilder_ == null) {
            return this.param_.get(index);
        }
        return (MysqlxExpr.ExprOrBuilder)this.paramBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxExpr.ExprOrBuilder> getParamOrBuilderList() {
        if (this.paramBuilder_ != null) {
            return this.paramBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.param_);
    }

    public MysqlxExpr.Expr.Builder addParamBuilder() {
        return (MysqlxExpr.Expr.Builder)this.getParamFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
    }

    public MysqlxExpr.Expr.Builder addParamBuilder(int index) {
        return (MysqlxExpr.Expr.Builder)this.getParamFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
    }

    public List<MysqlxExpr.Expr.Builder> getParamBuilderList() {
        return this.getParamFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getParamFieldBuilder() {
        if (this.paramBuilder_ == null) {
            this.paramBuilder_ = new RepeatedFieldBuilderV3(this.param_, (this.bitField0_ & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.param_ = null;
        }
        return this.paramBuilder_;
    }

    public final MysqlxExpr.FunctionCall.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.FunctionCall.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.FunctionCall.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.FunctionCall.Builder)super.mergeUnknownFields(unknownFields);
    }
}
