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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxPrepare.Execute
extends GeneratedMessageV3
implements MysqlxPrepare.ExecuteOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int STMT_ID_FIELD_NUMBER = 1;
    private int stmtId_;
    public static final int ARGS_FIELD_NUMBER = 2;
    private List<MysqlxDatatypes.Any> args_;
    public static final int COMPACT_METADATA_FIELD_NUMBER = 3;
    private boolean compactMetadata_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxPrepare.Execute DEFAULT_INSTANCE = new MysqlxPrepare.Execute();
    @Deprecated
    public static final Parser<MysqlxPrepare.Execute> PARSER = new AbstractParser<MysqlxPrepare.Execute>(){

        public MysqlxPrepare.Execute parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxPrepare.Execute(input, extensionRegistry);
        }
    };

    private MysqlxPrepare.Execute(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxPrepare.Execute() {
        this.args_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxPrepare.Execute();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxPrepare.Execute(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
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
                        this.stmtId_ = input.readUInt32();
                        continue block12;
                    }
                    case 18: {
                        if ((mutable_bitField0_ & 2) == 0) {
                            this.args_ = new ArrayList<MysqlxDatatypes.Any>();
                            mutable_bitField0_ |= 2;
                        }
                        this.args_.add((MysqlxDatatypes.Any)input.readMessage(MysqlxDatatypes.Any.PARSER, extensionRegistry));
                        continue block12;
                    }
                    case 24: {
                        this.bitField0_ |= 2;
                        this.compactMetadata_ = input.readBool();
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
            if ((mutable_bitField0_ & 2) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Prepare_Execute_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Prepare_Execute_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Execute.class, Builder.class);
    }

    @Override
    public boolean hasStmtId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getStmtId() {
        return this.stmtId_;
    }

    @Override
    public List<MysqlxDatatypes.Any> getArgsList() {
        return this.args_;
    }

    @Override
    public List<? extends MysqlxDatatypes.AnyOrBuilder> getArgsOrBuilderList() {
        return this.args_;
    }

    @Override
    public int getArgsCount() {
        return this.args_.size();
    }

    @Override
    public MysqlxDatatypes.Any getArgs(int index) {
        return this.args_.get(index);
    }

    @Override
    public MysqlxDatatypes.AnyOrBuilder getArgsOrBuilder(int index) {
        return this.args_.get(index);
    }

    @Override
    public boolean hasCompactMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public boolean getCompactMetadata() {
        return this.compactMetadata_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasStmtId()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt32(1, this.stmtId_);
        }
        for (int i = 0; i < this.args_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.args_.get(i));
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.compactMetadata_);
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
            size += CodedOutputStream.computeUInt32Size((int)1, (int)this.stmtId_);
        }
        for (int i = 0; i < this.args_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.args_.get(i)));
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeBoolSize((int)3, (boolean)this.compactMetadata_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxPrepare.Execute)) {
            return super.equals(obj);
        }
        MysqlxPrepare.Execute other = (MysqlxPrepare.Execute)obj;
        if (this.hasStmtId() != other.hasStmtId()) {
            return false;
        }
        if (this.hasStmtId() && this.getStmtId() != other.getStmtId()) {
            return false;
        }
        if (!this.getArgsList().equals(other.getArgsList())) {
            return false;
        }
        if (this.hasCompactMetadata() != other.hasCompactMetadata()) {
            return false;
        }
        if (this.hasCompactMetadata() && this.getCompactMetadata() != other.getCompactMetadata()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxPrepare.Execute.getDescriptor().hashCode();
        if (this.hasStmtId()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getStmtId();
        }
        if (this.getArgsCount() > 0) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getArgsList().hashCode();
        }
        if (this.hasCompactMetadata()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean((boolean)this.getCompactMetadata());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxPrepare.Execute parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Execute)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Execute parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Execute)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Execute parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Execute)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Execute parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Execute)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Execute parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Execute)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Execute parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Execute)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Execute parseFrom(InputStream input) throws IOException {
        return (MysqlxPrepare.Execute)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxPrepare.Execute parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Execute)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxPrepare.Execute parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxPrepare.Execute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxPrepare.Execute parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Execute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxPrepare.Execute parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxPrepare.Execute)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxPrepare.Execute parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Execute)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxPrepare.Execute.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxPrepare.Execute prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxPrepare.Execute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxPrepare.Execute> parser() {
        return PARSER;
    }

    public Parser<MysqlxPrepare.Execute> getParserForType() {
        return PARSER;
    }

    public MysqlxPrepare.Execute getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxPrepare.ExecuteOrBuilder {
        private int bitField0_;
        private int stmtId_;
        private List<MysqlxDatatypes.Any> args_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> argsBuilder_;
        private boolean compactMetadata_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Prepare_Execute_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Prepare_Execute_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Execute.class, Builder.class);
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
                this.getArgsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.stmtId_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFD;
            } else {
                this.argsBuilder_.clear();
            }
            this.compactMetadata_ = false;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Prepare_Execute_descriptor;
        }

        public MysqlxPrepare.Execute getDefaultInstanceForType() {
            return MysqlxPrepare.Execute.getDefaultInstance();
        }

        public MysqlxPrepare.Execute build() {
            MysqlxPrepare.Execute result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxPrepare.Execute buildPartial() {
            MysqlxPrepare.Execute result = new MysqlxPrepare.Execute(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.stmtId_ = this.stmtId_;
                to_bitField0_ |= 1;
            }
            if (this.argsBuilder_ == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.args_ = Collections.unmodifiableList(this.args_);
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.args_ = this.args_;
            } else {
                result.args_ = this.argsBuilder_.build();
            }
            if ((from_bitField0_ & 4) != 0) {
                result.compactMetadata_ = this.compactMetadata_;
                to_bitField0_ |= 2;
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
            if (other instanceof MysqlxPrepare.Execute) {
                return this.mergeFrom((MysqlxPrepare.Execute)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxPrepare.Execute other) {
            if (other == MysqlxPrepare.Execute.getDefaultInstance()) {
                return this;
            }
            if (other.hasStmtId()) {
                this.setStmtId(other.getStmtId());
            }
            if (this.argsBuilder_ == null) {
                if (!other.args_.isEmpty()) {
                    if (this.args_.isEmpty()) {
                        this.args_ = other.args_;
                        this.bitField0_ &= 0xFFFFFFFD;
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
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
                } else {
                    this.argsBuilder_.addAllMessages((Iterable)other.args_);
                }
            }
            if (other.hasCompactMetadata()) {
                this.setCompactMetadata(other.getCompactMetadata());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasStmtId()) {
                return false;
            }
            for (int i = 0; i < this.getArgsCount(); ++i) {
                if (this.getArgs(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxPrepare.Execute parsedMessage = null;
            try {
                parsedMessage = (MysqlxPrepare.Execute)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxPrepare.Execute)e.getUnfinishedMessage();
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
        public boolean hasStmtId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public int getStmtId() {
            return this.stmtId_;
        }

        public Builder setStmtId(int value) {
            this.bitField0_ |= 1;
            this.stmtId_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearStmtId() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.stmtId_ = 0;
            this.onChanged();
            return this;
        }

        private void ensureArgsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.args_ = new ArrayList<MysqlxDatatypes.Any>(this.args_);
                this.bitField0_ |= 2;
            }
        }

        @Override
        public List<MysqlxDatatypes.Any> getArgsList() {
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
        public MysqlxDatatypes.Any getArgs(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.Any)this.argsBuilder_.getMessage(index);
        }

        public Builder setArgs(int index, MysqlxDatatypes.Any value) {
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

        public Builder setArgs(int index, MysqlxDatatypes.Any.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(MysqlxDatatypes.Any value) {
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

        public Builder addArgs(int index, MysqlxDatatypes.Any value) {
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

        public Builder addArgs(MysqlxDatatypes.Any.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(int index, MysqlxDatatypes.Any.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Any> values) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.args_);
                this.onChanged();
            } else {
                this.argsBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearArgs() {
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
            } else {
                this.argsBuilder_.clear();
            }
            return this;
        }

        public Builder removeArgs(int index) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.remove(index);
                this.onChanged();
            } else {
                this.argsBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxDatatypes.Any.Builder getArgsBuilder(int index) {
            return (MysqlxDatatypes.Any.Builder)this.getArgsFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxDatatypes.AnyOrBuilder getArgsOrBuilder(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.AnyOrBuilder)this.argsBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxDatatypes.AnyOrBuilder> getArgsOrBuilderList() {
            if (this.argsBuilder_ != null) {
                return this.argsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.args_);
        }

        public MysqlxDatatypes.Any.Builder addArgsBuilder() {
            return (MysqlxDatatypes.Any.Builder)this.getArgsFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Any.getDefaultInstance());
        }

        public MysqlxDatatypes.Any.Builder addArgsBuilder(int index) {
            return (MysqlxDatatypes.Any.Builder)this.getArgsFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Any.getDefaultInstance());
        }

        public List<MysqlxDatatypes.Any.Builder> getArgsBuilderList() {
            return this.getArgsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> getArgsFieldBuilder() {
            if (this.argsBuilder_ == null) {
                this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.args_ = null;
            }
            return this.argsBuilder_;
        }

        @Override
        public boolean hasCompactMetadata() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public boolean getCompactMetadata() {
            return this.compactMetadata_;
        }

        public Builder setCompactMetadata(boolean value) {
            this.bitField0_ |= 4;
            this.compactMetadata_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearCompactMetadata() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.compactMetadata_ = false;
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
}
