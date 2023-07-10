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
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.Operator
extends GeneratedMessageV3
implements MysqlxExpr.OperatorOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    public static final int PARAM_FIELD_NUMBER = 2;
    private List<MysqlxExpr.Expr> param_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpr.Operator DEFAULT_INSTANCE = new MysqlxExpr.Operator();
    @Deprecated
    public static final Parser<MysqlxExpr.Operator> PARSER = new AbstractParser<MysqlxExpr.Operator>(){

        public MysqlxExpr.Operator parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpr.Operator(input, extensionRegistry);
        }
    };

    private MysqlxExpr.Operator(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpr.Operator() {
        this.name_ = "";
        this.param_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpr.Operator();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpr.Operator(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.name_ = bs;
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
        return internal_static_Mysqlx_Expr_Operator_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Operator_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Operator.class, Builder.class);
    }

    @Override
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getName() {
        Object ref = this.name_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.name_ = s;
        }
        return s;
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
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.name_);
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
            size += GeneratedMessageV3.computeStringSize((int)1, (Object)this.name_);
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
        if (!(obj instanceof MysqlxExpr.Operator)) {
            return super.equals(obj);
        }
        MysqlxExpr.Operator other = (MysqlxExpr.Operator)obj;
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
        hash = 19 * hash + MysqlxExpr.Operator.getDescriptor().hashCode();
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

    public static MysqlxExpr.Operator parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Operator)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Operator parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Operator)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Operator parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Operator)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Operator parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Operator)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Operator parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Operator)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Operator parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Operator)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Operator parseFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Operator)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Operator parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Operator)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Operator parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Operator)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Operator parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Operator)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Operator parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpr.Operator)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpr.Operator parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Operator)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpr.Operator.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpr.Operator prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpr.Operator getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpr.Operator> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpr.Operator> getParserForType() {
        return PARSER;
    }

    public MysqlxExpr.Operator getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxExpr.OperatorOrBuilder {
        private int bitField0_;
        private Object name_ = "";
        private List<MysqlxExpr.Expr> param_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> paramBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expr_Operator_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expr_Operator_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Operator.class, Builder.class);
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
                this.getParamFieldBuilder();
            }
        }

        public Builder clear() {
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
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpr.Operator buildPartial() {
            MysqlxExpr.Operator result = new MysqlxExpr.Operator(this);
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
            if (other instanceof MysqlxExpr.Operator) {
                return this.mergeFrom((MysqlxExpr.Operator)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpr.Operator other) {
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

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.name_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = MysqlxExpr.Operator.getDefaultInstance().getName();
            this.onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
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
