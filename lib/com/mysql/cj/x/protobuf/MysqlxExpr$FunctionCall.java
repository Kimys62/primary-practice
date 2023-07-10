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
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.FunctionCall
extends GeneratedMessageV3
implements MysqlxExpr.FunctionCallOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private MysqlxExpr.Identifier name_;
    public static final int PARAM_FIELD_NUMBER = 2;
    private List<MysqlxExpr.Expr> param_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpr.FunctionCall DEFAULT_INSTANCE = new MysqlxExpr.FunctionCall();
    @Deprecated
    public static final Parser<MysqlxExpr.FunctionCall> PARSER = new AbstractParser<MysqlxExpr.FunctionCall>(){

        public MysqlxExpr.FunctionCall parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpr.FunctionCall(input, extensionRegistry);
        }
    };

    private MysqlxExpr.FunctionCall(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpr.FunctionCall() {
        this.param_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpr.FunctionCall();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpr.FunctionCall(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block11: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block11;
                    }
                    case 10: {
                        MysqlxExpr.Identifier.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                            subBuilder = this.name_.toBuilder();
                        }
                        this.name_ = (MysqlxExpr.Identifier)input.readMessage(MysqlxExpr.Identifier.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.name_);
                            this.name_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block11;
                    }
                    case 18: {
                        if ((mutable_bitField0_ & 2) == 0) {
                            this.param_ = new ArrayList<MysqlxExpr.Expr>();
                            mutable_bitField0_ |= 2;
                        }
                        this.param_.add((MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry));
                        continue block11;
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
            if ((mutable_bitField0_ & 2) != 0) {
                this.param_ = Collections.unmodifiableList(this.param_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_FunctionCall_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_FunctionCall_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.FunctionCall.class, Builder.class);
    }

    @Override
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Identifier getName() {
        return this.name_ == null ? MysqlxExpr.Identifier.getDefaultInstance() : this.name_;
    }

    @Override
    public MysqlxExpr.IdentifierOrBuilder getNameOrBuilder() {
        return this.name_ == null ? MysqlxExpr.Identifier.getDefaultInstance() : this.name_;
    }

    @Override
    public List<MysqlxExpr.Expr> getParamList() {
        return this.param_;
    }

    @Override
    public List<? extends MysqlxExpr.ExprOrBuilder> getParamOrBuilderList() {
        return this.param_;
    }

    @Override
    public int getParamCount() {
        return this.param_.size();
    }

    @Override
    public MysqlxExpr.Expr getParam(int index) {
        return this.param_.get(index);
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getParamOrBuilder(int index) {
        return this.param_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getName().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < this.getParamCount(); ++i) {
            if (this.getParam(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getName());
        }
        for (int i = 0; i < this.param_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.param_.get(i));
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if ((this.bitField0_ & 1) != 0) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getName());
        }
        for (int i = 0; i < this.param_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.param_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpr.FunctionCall)) {
            return super.equals(obj);
        }
        MysqlxExpr.FunctionCall other = (MysqlxExpr.FunctionCall)obj;
        if (this.hasName() != other.hasName()) {
            return false;
        }
        if (this.hasName() && !this.getName().equals(other.getName())) {
            return false;
        }
        if (!this.getParamList().equals(other.getParamList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxExpr.FunctionCall.getDescriptor().hashCode();
        if (this.hasName()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getName().hashCode();
        }
        if (this.getParamCount() > 0) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getParamList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpr.FunctionCall parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.FunctionCall)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.FunctionCall parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.FunctionCall)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.FunctionCall parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.FunctionCall)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.FunctionCall parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.FunctionCall)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.FunctionCall parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.FunctionCall)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.FunctionCall parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.FunctionCall)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.FunctionCall parseFrom(InputStream input) throws IOException {
        return (MysqlxExpr.FunctionCall)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.FunctionCall parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.FunctionCall)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.FunctionCall parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpr.FunctionCall)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.FunctionCall parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.FunctionCall)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.FunctionCall parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpr.FunctionCall)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpr.FunctionCall parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.FunctionCall)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpr.FunctionCall.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpr.FunctionCall prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpr.FunctionCall getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpr.FunctionCall> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpr.FunctionCall> getParserForType() {
        return PARSER;
    }

    public MysqlxExpr.FunctionCall getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
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
            return internal_static_Mysqlx_Expr_FunctionCall_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.FunctionCall.class, Builder.class);
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
                this.getNameFieldBuilder();
                this.getParamFieldBuilder();
            }
        }

        public Builder clear() {
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
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpr.FunctionCall buildPartial() {
            MysqlxExpr.FunctionCall result = new MysqlxExpr.FunctionCall(this);
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
            if (other instanceof MysqlxExpr.FunctionCall) {
                return this.mergeFrom((MysqlxExpr.FunctionCall)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpr.FunctionCall other) {
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

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

        public Builder setName(MysqlxExpr.Identifier value) {
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

        public Builder setName(MysqlxExpr.Identifier.Builder builderForValue) {
            if (this.nameBuilder_ == null) {
                this.name_ = builderForValue.build();
                this.onChanged();
            } else {
                this.nameBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeName(MysqlxExpr.Identifier value) {
            if (this.nameBuilder_ == null) {
                this.name_ = (this.bitField0_ & 1) != 0 && this.name_ != null && this.name_ != MysqlxExpr.Identifier.getDefaultInstance() ? MysqlxExpr.Identifier.newBuilder(this.name_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.nameBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearName() {
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

        public Builder setParam(int index, MysqlxExpr.Expr value) {
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

        public Builder setParam(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.paramBuilder_ == null) {
                this.ensureParamIsMutable();
                this.param_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.paramBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addParam(MysqlxExpr.Expr value) {
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

        public Builder addParam(int index, MysqlxExpr.Expr value) {
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

        public Builder addParam(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.paramBuilder_ == null) {
                this.ensureParamIsMutable();
                this.param_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.paramBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addParam(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.paramBuilder_ == null) {
                this.ensureParamIsMutable();
                this.param_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.paramBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllParam(Iterable<? extends MysqlxExpr.Expr> values) {
            if (this.paramBuilder_ == null) {
                this.ensureParamIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.param_);
                this.onChanged();
            } else {
                this.paramBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearParam() {
            if (this.paramBuilder_ == null) {
                this.param_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
            } else {
                this.paramBuilder_.clear();
            }
            return this;
        }

        public Builder removeParam(int index) {
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

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
