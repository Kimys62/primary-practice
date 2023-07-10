/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxConnection.CapabilitiesSet
extends GeneratedMessageV3
implements MysqlxConnection.CapabilitiesSetOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    private MysqlxConnection.Capabilities capabilities_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxConnection.CapabilitiesSet DEFAULT_INSTANCE = new MysqlxConnection.CapabilitiesSet();
    @Deprecated
    public static final Parser<MysqlxConnection.CapabilitiesSet> PARSER = new AbstractParser<MysqlxConnection.CapabilitiesSet>(){

        public MysqlxConnection.CapabilitiesSet parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxConnection.CapabilitiesSet(input, extensionRegistry);
        }
    };

    private MysqlxConnection.CapabilitiesSet(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxConnection.CapabilitiesSet() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxConnection.CapabilitiesSet();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxConnection.CapabilitiesSet(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block10: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block10;
                    }
                    case 10: {
                        MysqlxConnection.Capabilities.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                            subBuilder = this.capabilities_.toBuilder();
                        }
                        this.capabilities_ = (MysqlxConnection.Capabilities)input.readMessage(MysqlxConnection.Capabilities.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.capabilities_);
                            this.capabilities_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block10;
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
        return internal_static_Mysqlx_Connection_CapabilitiesSet_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_CapabilitiesSet_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.CapabilitiesSet.class, Builder.class);
    }

    @Override
    public boolean hasCapabilities() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxConnection.Capabilities getCapabilities() {
        return this.capabilities_ == null ? MysqlxConnection.Capabilities.getDefaultInstance() : this.capabilities_;
    }

    @Override
    public MysqlxConnection.CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
        return this.capabilities_ == null ? MysqlxConnection.Capabilities.getDefaultInstance() : this.capabilities_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasCapabilities()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getCapabilities().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getCapabilities());
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
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getCapabilities());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxConnection.CapabilitiesSet)) {
            return super.equals(obj);
        }
        MysqlxConnection.CapabilitiesSet other = (MysqlxConnection.CapabilitiesSet)obj;
        if (this.hasCapabilities() != other.hasCapabilities()) {
            return false;
        }
        if (this.hasCapabilities() && !this.getCapabilities().equals(other.getCapabilities())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxConnection.CapabilitiesSet.getDescriptor().hashCode();
        if (this.hasCapabilities()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCapabilities().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesSet)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesSet)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesSet)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesSet)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesSet)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesSet)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(InputStream input) throws IOException {
        return (MysqlxConnection.CapabilitiesSet)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.CapabilitiesSet)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesSet parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxConnection.CapabilitiesSet)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.CapabilitiesSet parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.CapabilitiesSet)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxConnection.CapabilitiesSet)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxConnection.CapabilitiesSet parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.CapabilitiesSet)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxConnection.CapabilitiesSet.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxConnection.CapabilitiesSet prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxConnection.CapabilitiesSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxConnection.CapabilitiesSet> parser() {
        return PARSER;
    }

    public Parser<MysqlxConnection.CapabilitiesSet> getParserForType() {
        return PARSER;
    }

    public MysqlxConnection.CapabilitiesSet getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxConnection.CapabilitiesSetOrBuilder {
        private int bitField0_;
        private MysqlxConnection.Capabilities capabilities_;
        private SingleFieldBuilderV3<MysqlxConnection.Capabilities, MysqlxConnection.Capabilities.Builder, MysqlxConnection.CapabilitiesOrBuilder> capabilitiesBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Connection_CapabilitiesSet_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Connection_CapabilitiesSet_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.CapabilitiesSet.class, Builder.class);
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
                this.getCapabilitiesFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.capabilitiesBuilder_ == null) {
                this.capabilities_ = null;
            } else {
                this.capabilitiesBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Connection_CapabilitiesSet_descriptor;
        }

        public MysqlxConnection.CapabilitiesSet getDefaultInstanceForType() {
            return MysqlxConnection.CapabilitiesSet.getDefaultInstance();
        }

        public MysqlxConnection.CapabilitiesSet build() {
            MysqlxConnection.CapabilitiesSet result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxConnection.CapabilitiesSet buildPartial() {
            MysqlxConnection.CapabilitiesSet result = new MysqlxConnection.CapabilitiesSet(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.capabilitiesBuilder_ == null) {
                    result.capabilities_ = this.capabilities_;
                } else {
                    result.capabilities_ = (MysqlxConnection.Capabilities)this.capabilitiesBuilder_.build();
                }
                to_bitField0_ |= 1;
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
            if (other instanceof MysqlxConnection.CapabilitiesSet) {
                return this.mergeFrom((MysqlxConnection.CapabilitiesSet)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxConnection.CapabilitiesSet other) {
            if (other == MysqlxConnection.CapabilitiesSet.getDefaultInstance()) {
                return this;
            }
            if (other.hasCapabilities()) {
                this.mergeCapabilities(other.getCapabilities());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasCapabilities()) {
                return false;
            }
            return this.getCapabilities().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxConnection.CapabilitiesSet parsedMessage = null;
            try {
                parsedMessage = (MysqlxConnection.CapabilitiesSet)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxConnection.CapabilitiesSet)e.getUnfinishedMessage();
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
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public MysqlxConnection.Capabilities getCapabilities() {
            if (this.capabilitiesBuilder_ == null) {
                return this.capabilities_ == null ? MysqlxConnection.Capabilities.getDefaultInstance() : this.capabilities_;
            }
            return (MysqlxConnection.Capabilities)this.capabilitiesBuilder_.getMessage();
        }

        public Builder setCapabilities(MysqlxConnection.Capabilities value) {
            if (this.capabilitiesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.capabilities_ = value;
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder setCapabilities(MysqlxConnection.Capabilities.Builder builderForValue) {
            if (this.capabilitiesBuilder_ == null) {
                this.capabilities_ = builderForValue.build();
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeCapabilities(MysqlxConnection.Capabilities value) {
            if (this.capabilitiesBuilder_ == null) {
                this.capabilities_ = (this.bitField0_ & 1) != 0 && this.capabilities_ != null && this.capabilities_ != MysqlxConnection.Capabilities.getDefaultInstance() ? MysqlxConnection.Capabilities.newBuilder(this.capabilities_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearCapabilities() {
            if (this.capabilitiesBuilder_ == null) {
                this.capabilities_ = null;
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public MysqlxConnection.Capabilities.Builder getCapabilitiesBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxConnection.Capabilities.Builder)this.getCapabilitiesFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxConnection.CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            if (this.capabilitiesBuilder_ != null) {
                return (MysqlxConnection.CapabilitiesOrBuilder)this.capabilitiesBuilder_.getMessageOrBuilder();
            }
            return this.capabilities_ == null ? MysqlxConnection.Capabilities.getDefaultInstance() : this.capabilities_;
        }

        private SingleFieldBuilderV3<MysqlxConnection.Capabilities, MysqlxConnection.Capabilities.Builder, MysqlxConnection.CapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
            if (this.capabilitiesBuilder_ == null) {
                this.capabilitiesBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getCapabilities(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.capabilities_ = null;
            }
            return this.capabilitiesBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
