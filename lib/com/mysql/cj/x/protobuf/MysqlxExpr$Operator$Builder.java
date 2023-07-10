/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.Operator.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.Operator.Builder>
implements MysqlxExpr.OperatorOrBuilder {
    private int bitField0_;
    private Object name_ = "";
    private List<MysqlxExpr.Expr> param_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> paramBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_Operator_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Operator_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Operator.class, MysqlxExpr.Operator.Builder.class);
    }

    private MysqlxExpr.Operator.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.Operator.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getParamFieldBuilder();
        }
    }

    public MysqlxExpr.Operator.Builder clear() {
        super.clear();
        this.name_ = "";
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
        return internal_static_Mysqlx_Expr_Operator_descriptor;
    }

    public MysqlxExpr.Operator getDefaultInstanceForType() {
        return MysqlxExpr.Operator.getDefaultInstance();
    }

    public MysqlxExpr.Operator build() {
        MysqlxExpr.Operator result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.Operator.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.Operator buildPartial() {
        MysqlxExpr.Operator result = new MysqlxExpr.Operator(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.name_ = this.name_;
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

    public MysqlxExpr.Operator.Builder clone() {
        return (MysqlxExpr.Operator.Builder)super.clone();
    }

    public MysqlxExpr.Operator.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Operator.Builder)super.setField(field, value);
    }

    public MysqlxExpr.Operator.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.Operator.Builder)super.clearField(field);
    }

    public MysqlxExpr.Operator.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.Operator.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.Operator.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.Operator.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.Operator.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Operator.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.Operator.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.Operator) {
            return this.mergeFrom((MysqlxExpr.Operator)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.Operator.Builder mergeFrom(MysqlxExpr.Operator other) {
        if (other == MysqlxExpr.Operator.getDefaultInstance()) {
            return this;
        }
        if (other.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = other.name_;
            this.onChanged();
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
        for (int i = 0; i < this.getParamCount(); ++i) {
            if (this.getParam(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxExpr.Operator.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.Operator parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.Operator)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.Operator)e.getUnfinishedMessage();
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
    public String getName() {
        Object ref = this.name_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.name_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getNameBytes() {
        Object ref = this.name_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.name_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.Operator.Builder setName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Operator.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.name_ = MysqlxExpr.Operator.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Operator.Builder setNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
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

    public MysqlxExpr.Operator.Builder setParam(int index, MysqlxExpr.Expr value) {
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

    public MysqlxExpr.Operator.Builder setParam(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.paramBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.Operator.Builder addParam(MysqlxExpr.Expr value) {
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

    public MysqlxExpr.Operator.Builder addParam(int index, MysqlxExpr.Expr value) {
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

    public MysqlxExpr.Operator.Builder addParam(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.paramBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.Operator.Builder addParam(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            this.param_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.paramBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.Operator.Builder addAllParam(Iterable<? extends MysqlxExpr.Expr> values) {
        if (this.paramBuilder_ == null) {
            this.ensureParamIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.param_);
            this.onChanged();
        } else {
            this.paramBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxExpr.Operator.Builder clearParam() {
        if (this.paramBuilder_ == null) {
            this.param_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.paramBuilder_.clear();
        }
        return this;
    }

    public MysqlxExpr.Operator.Builder removeParam(int index) {
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

    public final MysqlxExpr.Operator.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Operator.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.Operator.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Operator.Builder)super.mergeUnknownFields(unknownFields);
    }
}
