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
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageOrBuilder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolMessageEnum
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpect;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpect.Open
extends GeneratedMessageV3
implements MysqlxExpect.OpenOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int OP_FIELD_NUMBER = 1;
    private int op_;
    public static final int COND_FIELD_NUMBER = 2;
    private List<Condition> cond_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpect.Open DEFAULT_INSTANCE = new MysqlxExpect.Open();
    @Deprecated
    public static final Parser<MysqlxExpect.Open> PARSER = new AbstractParser<MysqlxExpect.Open>(){

        public MysqlxExpect.Open parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpect.Open(input, extensionRegistry);
        }
    };

    private MysqlxExpect.Open(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpect.Open() {
        this.op_ = 0;
        this.cond_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpect.Open();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpect.Open(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 8: {
                        int rawValue = input.readEnum();
                        CtxOperation value = CtxOperation.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block11;
                        }
                        this.bitField0_ |= 1;
                        this.op_ = rawValue;
                        continue block11;
                    }
                    case 18: {
                        if ((mutable_bitField0_ & 2) == 0) {
                            this.cond_ = new ArrayList<Condition>();
                            mutable_bitField0_ |= 2;
                        }
                        this.cond_.add((Condition)input.readMessage(Condition.PARSER, extensionRegistry));
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
                this.cond_ = Collections.unmodifiableList(this.cond_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expect_Open_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expect_Open_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Open.class, Builder.class);
    }

    @Override
    public boolean hasOp() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public CtxOperation getOp() {
        CtxOperation result = CtxOperation.valueOf(this.op_);
        return result == null ? CtxOperation.EXPECT_CTX_COPY_PREV : result;
    }

    @Override
    public List<Condition> getCondList() {
        return this.cond_;
    }

    @Override
    public List<? extends ConditionOrBuilder> getCondOrBuilderList() {
        return this.cond_;
    }

    @Override
    public int getCondCount() {
        return this.cond_.size();
    }

    @Override
    public Condition getCond(int index) {
        return this.cond_.get(index);
    }

    @Override
    public ConditionOrBuilder getCondOrBuilder(int index) {
        return this.cond_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        for (int i = 0; i < this.getCondCount(); ++i) {
            if (this.getCond(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.op_);
        }
        for (int i = 0; i < this.cond_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.cond_.get(i));
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.op_);
        }
        for (int i = 0; i < this.cond_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.cond_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpect.Open)) {
            return super.equals(obj);
        }
        MysqlxExpect.Open other = (MysqlxExpect.Open)obj;
        if (this.hasOp() != other.hasOp()) {
            return false;
        }
        if (this.hasOp() && this.op_ != other.op_) {
            return false;
        }
        if (!this.getCondList().equals(other.getCondList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxExpect.Open.getDescriptor().hashCode();
        if (this.hasOp()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.op_;
        }
        if (this.getCondCount() > 0) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCondList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpect.Open parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open)PARSER.parseFrom(data);
    }

    public static MysqlxExpect.Open parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpect.Open parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open)PARSER.parseFrom(data);
    }

    public static MysqlxExpect.Open parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpect.Open parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open)PARSER.parseFrom(data);
    }

    public static MysqlxExpect.Open parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpect.Open parseFrom(InputStream input) throws IOException {
        return (MysqlxExpect.Open)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpect.Open parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpect.Open)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpect.Open parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpect.Open)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpect.Open parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpect.Open)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpect.Open parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpect.Open)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpect.Open parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpect.Open)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpect.Open.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpect.Open prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpect.Open getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpect.Open> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpect.Open> getParserForType() {
        return PARSER;
    }

    public MysqlxExpect.Open getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxExpect.OpenOrBuilder {
        private int bitField0_;
        private int op_ = 0;
        private List<Condition> cond_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<Condition, Condition.Builder, ConditionOrBuilder> condBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expect_Open_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expect_Open_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Open.class, Builder.class);
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
                this.getCondFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.op_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            if (this.condBuilder_ == null) {
                this.cond_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFD;
            } else {
                this.condBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Expect_Open_descriptor;
        }

        public MysqlxExpect.Open getDefaultInstanceForType() {
            return MysqlxExpect.Open.getDefaultInstance();
        }

        public MysqlxExpect.Open build() {
            MysqlxExpect.Open result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpect.Open buildPartial() {
            MysqlxExpect.Open result = new MysqlxExpect.Open(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.op_ = this.op_;
            if (this.condBuilder_ == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.cond_ = Collections.unmodifiableList(this.cond_);
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.cond_ = this.cond_;
            } else {
                result.cond_ = this.condBuilder_.build();
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
            if (other instanceof MysqlxExpect.Open) {
                return this.mergeFrom((MysqlxExpect.Open)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpect.Open other) {
            if (other == MysqlxExpect.Open.getDefaultInstance()) {
                return this;
            }
            if (other.hasOp()) {
                this.setOp(other.getOp());
            }
            if (this.condBuilder_ == null) {
                if (!other.cond_.isEmpty()) {
                    if (this.cond_.isEmpty()) {
                        this.cond_ = other.cond_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    } else {
                        this.ensureCondIsMutable();
                        this.cond_.addAll(other.cond_);
                    }
                    this.onChanged();
                }
            } else if (!other.cond_.isEmpty()) {
                if (this.condBuilder_.isEmpty()) {
                    this.condBuilder_.dispose();
                    this.condBuilder_ = null;
                    this.cond_ = other.cond_;
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.condBuilder_ = alwaysUseFieldBuilders ? this.getCondFieldBuilder() : null;
                } else {
                    this.condBuilder_.addAllMessages((Iterable)other.cond_);
                }
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < this.getCondCount(); ++i) {
                if (this.getCond(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxExpect.Open parsedMessage = null;
            try {
                parsedMessage = (MysqlxExpect.Open)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxExpect.Open)e.getUnfinishedMessage();
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
        public boolean hasOp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public CtxOperation getOp() {
            CtxOperation result = CtxOperation.valueOf(this.op_);
            return result == null ? CtxOperation.EXPECT_CTX_COPY_PREV : result;
        }

        public Builder setOp(CtxOperation value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.op_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearOp() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.op_ = 0;
            this.onChanged();
            return this;
        }

        private void ensureCondIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.cond_ = new ArrayList<Condition>(this.cond_);
                this.bitField0_ |= 2;
            }
        }

        @Override
        public List<Condition> getCondList() {
            if (this.condBuilder_ == null) {
                return Collections.unmodifiableList(this.cond_);
            }
            return this.condBuilder_.getMessageList();
        }

        @Override
        public int getCondCount() {
            if (this.condBuilder_ == null) {
                return this.cond_.size();
            }
            return this.condBuilder_.getCount();
        }

        @Override
        public Condition getCond(int index) {
            if (this.condBuilder_ == null) {
                return this.cond_.get(index);
            }
            return (Condition)this.condBuilder_.getMessage(index);
        }

        public Builder setCond(int index, Condition value) {
            if (this.condBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureCondIsMutable();
                this.cond_.set(index, value);
                this.onChanged();
            } else {
                this.condBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setCond(int index, Condition.Builder builderForValue) {
            if (this.condBuilder_ == null) {
                this.ensureCondIsMutable();
                this.cond_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.condBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addCond(Condition value) {
            if (this.condBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureCondIsMutable();
                this.cond_.add(value);
                this.onChanged();
            } else {
                this.condBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addCond(int index, Condition value) {
            if (this.condBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureCondIsMutable();
                this.cond_.add(index, value);
                this.onChanged();
            } else {
                this.condBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addCond(Condition.Builder builderForValue) {
            if (this.condBuilder_ == null) {
                this.ensureCondIsMutable();
                this.cond_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.condBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addCond(int index, Condition.Builder builderForValue) {
            if (this.condBuilder_ == null) {
                this.ensureCondIsMutable();
                this.cond_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.condBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllCond(Iterable<? extends Condition> values) {
            if (this.condBuilder_ == null) {
                this.ensureCondIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.cond_);
                this.onChanged();
            } else {
                this.condBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearCond() {
            if (this.condBuilder_ == null) {
                this.cond_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
            } else {
                this.condBuilder_.clear();
            }
            return this;
        }

        public Builder removeCond(int index) {
            if (this.condBuilder_ == null) {
                this.ensureCondIsMutable();
                this.cond_.remove(index);
                this.onChanged();
            } else {
                this.condBuilder_.remove(index);
            }
            return this;
        }

        public Condition.Builder getCondBuilder(int index) {
            return (Condition.Builder)this.getCondFieldBuilder().getBuilder(index);
        }

        @Override
        public ConditionOrBuilder getCondOrBuilder(int index) {
            if (this.condBuilder_ == null) {
                return this.cond_.get(index);
            }
            return (ConditionOrBuilder)this.condBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends ConditionOrBuilder> getCondOrBuilderList() {
            if (this.condBuilder_ != null) {
                return this.condBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.cond_);
        }

        public Condition.Builder addCondBuilder() {
            return (Condition.Builder)this.getCondFieldBuilder().addBuilder((AbstractMessage)Condition.getDefaultInstance());
        }

        public Condition.Builder addCondBuilder(int index) {
            return (Condition.Builder)this.getCondFieldBuilder().addBuilder(index, (AbstractMessage)Condition.getDefaultInstance());
        }

        public List<Condition.Builder> getCondBuilderList() {
            return this.getCondFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Condition, Condition.Builder, ConditionOrBuilder> getCondFieldBuilder() {
            if (this.condBuilder_ == null) {
                this.condBuilder_ = new RepeatedFieldBuilderV3(this.cond_, (this.bitField0_ & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.cond_ = null;
            }
            return this.condBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static final class Condition
    extends GeneratedMessageV3
    implements ConditionOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int CONDITION_KEY_FIELD_NUMBER = 1;
        private int conditionKey_;
        public static final int CONDITION_VALUE_FIELD_NUMBER = 2;
        private ByteString conditionValue_;
        public static final int OP_FIELD_NUMBER = 3;
        private int op_;
        private byte memoizedIsInitialized = (byte)-1;
        private static final Condition DEFAULT_INSTANCE = new Condition();
        @Deprecated
        public static final Parser<Condition> PARSER = new AbstractParser<Condition>(){

            public Condition parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new Condition(input, extensionRegistry);
            }
        };

        private Condition(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Condition() {
            this.conditionValue_ = ByteString.EMPTY;
            this.op_ = 0;
        }

        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
            return new Condition();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Condition(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            boolean mutable_bitField0_ = false;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                block12: while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue block12;
                        }
                        case 8: {
                            this.bitField0_ |= 1;
                            this.conditionKey_ = input.readUInt32();
                            continue block12;
                        }
                        case 18: {
                            this.bitField0_ |= 2;
                            this.conditionValue_ = input.readBytes();
                            continue block12;
                        }
                        case 24: {
                            int rawValue = input.readEnum();
                            ConditionOperation value = ConditionOperation.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(3, rawValue);
                                continue block12;
                            }
                            this.bitField0_ |= 4;
                            this.op_ = rawValue;
                            continue block12;
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expect_Open_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(Condition.class, Builder.class);
        }

        @Override
        public boolean hasConditionKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public int getConditionKey() {
            return this.conditionKey_;
        }

        @Override
        public boolean hasConditionValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public ByteString getConditionValue() {
            return this.conditionValue_;
        }

        @Override
        public boolean hasOp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public ConditionOperation getOp() {
            ConditionOperation result = ConditionOperation.valueOf(this.op_);
            return result == null ? ConditionOperation.EXPECT_OP_SET : result;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!this.hasConditionKey()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                output.writeUInt32(1, this.conditionKey_);
            }
            if ((this.bitField0_ & 2) != 0) {
                output.writeBytes(2, this.conditionValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                output.writeEnum(3, this.op_);
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
                size += CodedOutputStream.computeUInt32Size((int)1, (int)this.conditionKey_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.conditionValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                size += CodedOutputStream.computeEnumSize((int)3, (int)this.op_);
            }
            this.memoizedSize = size += this.unknownFields.getSerializedSize();
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Condition)) {
                return super.equals(obj);
            }
            Condition other = (Condition)obj;
            if (this.hasConditionKey() != other.hasConditionKey()) {
                return false;
            }
            if (this.hasConditionKey() && this.getConditionKey() != other.getConditionKey()) {
                return false;
            }
            if (this.hasConditionValue() != other.hasConditionValue()) {
                return false;
            }
            if (this.hasConditionValue() && !this.getConditionValue().equals((Object)other.getConditionValue())) {
                return false;
            }
            if (this.hasOp() != other.hasOp()) {
                return false;
            }
            if (this.hasOp() && this.op_ != other.op_) {
                return false;
            }
            return this.unknownFields.equals((Object)other.unknownFields);
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + Condition.getDescriptor().hashCode();
            if (this.hasConditionKey()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getConditionKey();
            }
            if (this.hasConditionValue()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getConditionValue().hashCode();
            }
            if (this.hasOp()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.op_;
            }
            this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
            return hash;
        }

        public static Condition parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Condition)PARSER.parseFrom(data);
        }

        public static Condition parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Condition)PARSER.parseFrom(data, extensionRegistry);
        }

        public static Condition parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Condition)PARSER.parseFrom(data);
        }

        public static Condition parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Condition)PARSER.parseFrom(data, extensionRegistry);
        }

        public static Condition parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Condition)PARSER.parseFrom(data);
        }

        public static Condition parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Condition)PARSER.parseFrom(data, extensionRegistry);
        }

        public static Condition parseFrom(InputStream input) throws IOException {
            return (Condition)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
        }

        public static Condition parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Condition)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static Condition parseDelimitedFrom(InputStream input) throws IOException {
            return (Condition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
        }

        public static Condition parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Condition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static Condition parseFrom(CodedInputStream input) throws IOException {
            return (Condition)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
        }

        public static Condition parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Condition)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public Builder newBuilderForType() {
            return Condition.newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Condition prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static Condition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Condition> parser() {
            return PARSER;
        }

        public Parser<Condition> getParserForType() {
            return PARSER;
        }

        public Condition getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder
        extends GeneratedMessageV3.Builder<Builder>
        implements ConditionOrBuilder {
            private int bitField0_;
            private int conditionKey_;
            private ByteString conditionValue_ = ByteString.EMPTY;
            private int op_ = 0;

            public static final Descriptors.Descriptor getDescriptor() {
                return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
            }

            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return internal_static_Mysqlx_Expect_Open_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(Condition.class, Builder.class);
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
                    // empty if block
                }
            }

            public Builder clear() {
                super.clear();
                this.conditionKey_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.conditionValue_ = ByteString.EMPTY;
                this.bitField0_ &= 0xFFFFFFFD;
                this.op_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
            }

            public Condition getDefaultInstanceForType() {
                return Condition.getDefaultInstance();
            }

            public Condition build() {
                Condition result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw Builder.newUninitializedMessageException((Message)result);
                }
                return result;
            }

            public Condition buildPartial() {
                Condition result = new Condition(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) != 0) {
                    result.conditionKey_ = this.conditionKey_;
                    to_bitField0_ |= 1;
                }
                if ((from_bitField0_ & 2) != 0) {
                    to_bitField0_ |= 2;
                }
                result.conditionValue_ = this.conditionValue_;
                if ((from_bitField0_ & 4) != 0) {
                    to_bitField0_ |= 4;
                }
                result.op_ = this.op_;
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
                if (other instanceof Condition) {
                    return this.mergeFrom((Condition)other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(Condition other) {
                if (other == Condition.getDefaultInstance()) {
                    return this;
                }
                if (other.hasConditionKey()) {
                    this.setConditionKey(other.getConditionKey());
                }
                if (other.hasConditionValue()) {
                    this.setConditionValue(other.getConditionValue());
                }
                if (other.hasOp()) {
                    this.setOp(other.getOp());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return this.hasConditionKey();
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                Condition parsedMessage = null;
                try {
                    parsedMessage = (Condition)PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Condition)e.getUnfinishedMessage();
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
            public boolean hasConditionKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public int getConditionKey() {
                return this.conditionKey_;
            }

            public Builder setConditionKey(int value) {
                this.bitField0_ |= 1;
                this.conditionKey_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearConditionKey() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.conditionKey_ = 0;
                this.onChanged();
                return this;
            }

            @Override
            public boolean hasConditionValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public ByteString getConditionValue() {
                return this.conditionValue_;
            }

            public Builder setConditionValue(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 2;
                this.conditionValue_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearConditionValue() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.conditionValue_ = Condition.getDefaultInstance().getConditionValue();
                this.onChanged();
                return this;
            }

            @Override
            public boolean hasOp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override
            public ConditionOperation getOp() {
                ConditionOperation result = ConditionOperation.valueOf(this.op_);
                return result == null ? ConditionOperation.EXPECT_OP_SET : result;
            }

            public Builder setOp(ConditionOperation value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 4;
                this.op_ = value.getNumber();
                this.onChanged();
                return this;
            }

            public Builder clearOp() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.op_ = 0;
                this.onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum ConditionOperation implements ProtocolMessageEnum
        {
            EXPECT_OP_SET(0),
            EXPECT_OP_UNSET(1);

            public static final int EXPECT_OP_SET_VALUE = 0;
            public static final int EXPECT_OP_UNSET_VALUE = 1;
            private static final Internal.EnumLiteMap<ConditionOperation> internalValueMap;
            private static final ConditionOperation[] VALUES;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ConditionOperation valueOf(int value) {
                return ConditionOperation.forNumber(value);
            }

            public static ConditionOperation forNumber(int value) {
                switch (value) {
                    case 0: {
                        return EXPECT_OP_SET;
                    }
                    case 1: {
                        return EXPECT_OP_UNSET;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<ConditionOperation> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return (Descriptors.EnumValueDescriptor)ConditionOperation.getDescriptor().getValues().get(this.ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return ConditionOperation.getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return (Descriptors.EnumDescriptor)Condition.getDescriptor().getEnumTypes().get(1);
            }

            public static ConditionOperation valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != ConditionOperation.getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private ConditionOperation(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<ConditionOperation>(){

                    public ConditionOperation findValueByNumber(int number) {
                        return ConditionOperation.forNumber(number);
                    }
                };
                VALUES = ConditionOperation.values();
            }
        }

        public static enum Key implements ProtocolMessageEnum
        {
            EXPECT_NO_ERROR(1),
            EXPECT_FIELD_EXIST(2),
            EXPECT_DOCID_GENERATED(3);

            public static final int EXPECT_NO_ERROR_VALUE = 1;
            public static final int EXPECT_FIELD_EXIST_VALUE = 2;
            public static final int EXPECT_DOCID_GENERATED_VALUE = 3;
            private static final Internal.EnumLiteMap<Key> internalValueMap;
            private static final Key[] VALUES;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Key valueOf(int value) {
                return Key.forNumber(value);
            }

            public static Key forNumber(int value) {
                switch (value) {
                    case 1: {
                        return EXPECT_NO_ERROR;
                    }
                    case 2: {
                        return EXPECT_FIELD_EXIST;
                    }
                    case 3: {
                        return EXPECT_DOCID_GENERATED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<Key> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return (Descriptors.EnumValueDescriptor)Key.getDescriptor().getValues().get(this.ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return Key.getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return (Descriptors.EnumDescriptor)Condition.getDescriptor().getEnumTypes().get(0);
            }

            public static Key valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != Key.getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private Key(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<Key>(){

                    public Key findValueByNumber(int number) {
                        return Key.forNumber(number);
                    }
                };
                VALUES = Key.values();
            }
        }
    }

    public static interface ConditionOrBuilder
    extends MessageOrBuilder {
        public boolean hasConditionKey();

        public int getConditionKey();

        public boolean hasConditionValue();

        public ByteString getConditionValue();

        public boolean hasOp();

        public Condition.ConditionOperation getOp();
    }

    public static enum CtxOperation implements ProtocolMessageEnum
    {
        EXPECT_CTX_COPY_PREV(0),
        EXPECT_CTX_EMPTY(1);

        public static final int EXPECT_CTX_COPY_PREV_VALUE = 0;
        public static final int EXPECT_CTX_EMPTY_VALUE = 1;
        private static final Internal.EnumLiteMap<CtxOperation> internalValueMap;
        private static final CtxOperation[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CtxOperation valueOf(int value) {
            return CtxOperation.forNumber(value);
        }

        public static CtxOperation forNumber(int value) {
            switch (value) {
                case 0: {
                    return EXPECT_CTX_COPY_PREV;
                }
                case 1: {
                    return EXPECT_CTX_EMPTY;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<CtxOperation> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)CtxOperation.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return CtxOperation.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxExpect.Open.getDescriptor().getEnumTypes().get(0);
        }

        public static CtxOperation valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != CtxOperation.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private CtxOperation(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<CtxOperation>(){

                public CtxOperation findValueByNumber(int number) {
                    return CtxOperation.forNumber(number);
                }
            };
            VALUES = CtxOperation.values();
        }
    }
}
