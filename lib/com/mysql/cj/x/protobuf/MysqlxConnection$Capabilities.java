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
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxConnection.Capabilities
extends GeneratedMessageV3
implements MysqlxConnection.CapabilitiesOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    private List<MysqlxConnection.Capability> capabilities_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxConnection.Capabilities DEFAULT_INSTANCE = new MysqlxConnection.Capabilities();
    @Deprecated
    public static final Parser<MysqlxConnection.Capabilities> PARSER = new AbstractParser<MysqlxConnection.Capabilities>(){

        public MysqlxConnection.Capabilities parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxConnection.Capabilities(input, extensionRegistry);
        }
    };

    private MysqlxConnection.Capabilities(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxConnection.Capabilities() {
        this.capabilities_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxConnection.Capabilities();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxConnection.Capabilities(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if (!(mutable_bitField0_ & true)) {
                            this.capabilities_ = new ArrayList<MysqlxConnection.Capability>();
                            mutable_bitField0_ |= true;
                        }
                        this.capabilities_.add((MysqlxConnection.Capability)input.readMessage(MysqlxConnection.Capability.PARSER, extensionRegistry));
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
            if (mutable_bitField0_ & true) {
                this.capabilities_ = Collections.unmodifiableList(this.capabilities_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Connection_Capabilities_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Capabilities.class, Builder.class);
    }

    @Override
    public List<MysqlxConnection.Capability> getCapabilitiesList() {
        return this.capabilities_;
    }

    @Override
    public List<? extends MysqlxConnection.CapabilityOrBuilder> getCapabilitiesOrBuilderList() {
        return this.capabilities_;
    }

    @Override
    public int getCapabilitiesCount() {
        return this.capabilities_.size();
    }

    @Override
    public MysqlxConnection.Capability getCapabilities(int index) {
        return this.capabilities_.get(index);
    }

    @Override
    public MysqlxConnection.CapabilityOrBuilder getCapabilitiesOrBuilder(int index) {
        return this.capabilities_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        for (int i = 0; i < this.getCapabilitiesCount(); ++i) {
            if (this.getCapabilities(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i = 0; i < this.capabilities_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.capabilities_.get(i));
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        for (int i = 0; i < this.capabilities_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.capabilities_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxConnection.Capabilities)) {
            return super.equals(obj);
        }
        MysqlxConnection.Capabilities other = (MysqlxConnection.Capabilities)obj;
        if (!this.getCapabilitiesList().equals(other.getCapabilitiesList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxConnection.Capabilities.getDescriptor().hashCode();
        if (this.getCapabilitiesCount() > 0) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCapabilitiesList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxConnection.Capabilities parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Capabilities)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.Capabilities parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Capabilities)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.Capabilities parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Capabilities)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.Capabilities parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Capabilities)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.Capabilities parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Capabilities)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.Capabilities parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Capabilities)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.Capabilities parseFrom(InputStream input) throws IOException {
        return (MysqlxConnection.Capabilities)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.Capabilities parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.Capabilities)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.Capabilities parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxConnection.Capabilities)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.Capabilities parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.Capabilities)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.Capabilities parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxConnection.Capabilities)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxConnection.Capabilities parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.Capabilities)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxConnection.Capabilities.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxConnection.Capabilities prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxConnection.Capabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxConnection.Capabilities> parser() {
        return PARSER;
    }

    public Parser<MysqlxConnection.Capabilities> getParserForType() {
        return PARSER;
    }

    public MysqlxConnection.Capabilities getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxConnection.CapabilitiesOrBuilder {
        private int bitField0_;
        private List<MysqlxConnection.Capability> capabilities_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxConnection.Capability, MysqlxConnection.Capability.Builder, MysqlxConnection.CapabilityOrBuilder> capabilitiesBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Connection_Capabilities_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Connection_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Capabilities.class, Builder.class);
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
                this.capabilities_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
            } else {
                this.capabilitiesBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Connection_Capabilities_descriptor;
        }

        public MysqlxConnection.Capabilities getDefaultInstanceForType() {
            return MysqlxConnection.Capabilities.getDefaultInstance();
        }

        public MysqlxConnection.Capabilities build() {
            MysqlxConnection.Capabilities result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxConnection.Capabilities buildPartial() {
            MysqlxConnection.Capabilities result = new MysqlxConnection.Capabilities(this);
            int from_bitField0_ = this.bitField0_;
            if (this.capabilitiesBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.capabilities_ = Collections.unmodifiableList(this.capabilities_);
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.capabilities_ = this.capabilities_;
            } else {
                result.capabilities_ = this.capabilitiesBuilder_.build();
            }
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
            if (other instanceof MysqlxConnection.Capabilities) {
                return this.mergeFrom((MysqlxConnection.Capabilities)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxConnection.Capabilities other) {
            if (other == MysqlxConnection.Capabilities.getDefaultInstance()) {
                return this;
            }
            if (this.capabilitiesBuilder_ == null) {
                if (!other.capabilities_.isEmpty()) {
                    if (this.capabilities_.isEmpty()) {
                        this.capabilities_ = other.capabilities_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    } else {
                        this.ensureCapabilitiesIsMutable();
                        this.capabilities_.addAll(other.capabilities_);
                    }
                    this.onChanged();
                }
            } else if (!other.capabilities_.isEmpty()) {
                if (this.capabilitiesBuilder_.isEmpty()) {
                    this.capabilitiesBuilder_.dispose();
                    this.capabilitiesBuilder_ = null;
                    this.capabilities_ = other.capabilities_;
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.capabilitiesBuilder_ = alwaysUseFieldBuilders ? this.getCapabilitiesFieldBuilder() : null;
                } else {
                    this.capabilitiesBuilder_.addAllMessages((Iterable)other.capabilities_);
                }
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < this.getCapabilitiesCount(); ++i) {
                if (this.getCapabilities(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxConnection.Capabilities parsedMessage = null;
            try {
                parsedMessage = (MysqlxConnection.Capabilities)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxConnection.Capabilities)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureCapabilitiesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.capabilities_ = new ArrayList<MysqlxConnection.Capability>(this.capabilities_);
                this.bitField0_ |= 1;
            }
        }

        @Override
        public List<MysqlxConnection.Capability> getCapabilitiesList() {
            if (this.capabilitiesBuilder_ == null) {
                return Collections.unmodifiableList(this.capabilities_);
            }
            return this.capabilitiesBuilder_.getMessageList();
        }

        @Override
        public int getCapabilitiesCount() {
            if (this.capabilitiesBuilder_ == null) {
                return this.capabilities_.size();
            }
            return this.capabilitiesBuilder_.getCount();
        }

        @Override
        public MysqlxConnection.Capability getCapabilities(int index) {
            if (this.capabilitiesBuilder_ == null) {
                return this.capabilities_.get(index);
            }
            return (MysqlxConnection.Capability)this.capabilitiesBuilder_.getMessage(index);
        }

        public Builder setCapabilities(int index, MysqlxConnection.Capability value) {
            if (this.capabilitiesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.set(index, value);
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setCapabilities(int index, MysqlxConnection.Capability.Builder builderForValue) {
            if (this.capabilitiesBuilder_ == null) {
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addCapabilities(MysqlxConnection.Capability value) {
            if (this.capabilitiesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.add(value);
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addCapabilities(int index, MysqlxConnection.Capability value) {
            if (this.capabilitiesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.add(index, value);
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addCapabilities(MysqlxConnection.Capability.Builder builderForValue) {
            if (this.capabilitiesBuilder_ == null) {
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addCapabilities(int index, MysqlxConnection.Capability.Builder builderForValue) {
            if (this.capabilitiesBuilder_ == null) {
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllCapabilities(Iterable<? extends MysqlxConnection.Capability> values) {
            if (this.capabilitiesBuilder_ == null) {
                this.ensureCapabilitiesIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.capabilities_);
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearCapabilities() {
            if (this.capabilitiesBuilder_ == null) {
                this.capabilities_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.clear();
            }
            return this;
        }

        public Builder removeCapabilities(int index) {
            if (this.capabilitiesBuilder_ == null) {
                this.ensureCapabilitiesIsMutable();
                this.capabilities_.remove(index);
                this.onChanged();
            } else {
                this.capabilitiesBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxConnection.Capability.Builder getCapabilitiesBuilder(int index) {
            return (MysqlxConnection.Capability.Builder)this.getCapabilitiesFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxConnection.CapabilityOrBuilder getCapabilitiesOrBuilder(int index) {
            if (this.capabilitiesBuilder_ == null) {
                return this.capabilities_.get(index);
            }
            return (MysqlxConnection.CapabilityOrBuilder)this.capabilitiesBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxConnection.CapabilityOrBuilder> getCapabilitiesOrBuilderList() {
            if (this.capabilitiesBuilder_ != null) {
                return this.capabilitiesBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.capabilities_);
        }

        public MysqlxConnection.Capability.Builder addCapabilitiesBuilder() {
            return (MysqlxConnection.Capability.Builder)this.getCapabilitiesFieldBuilder().addBuilder((AbstractMessage)MysqlxConnection.Capability.getDefaultInstance());
        }

        public MysqlxConnection.Capability.Builder addCapabilitiesBuilder(int index) {
            return (MysqlxConnection.Capability.Builder)this.getCapabilitiesFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxConnection.Capability.getDefaultInstance());
        }

        public List<MysqlxConnection.Capability.Builder> getCapabilitiesBuilderList() {
            return this.getCapabilitiesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxConnection.Capability, MysqlxConnection.Capability.Builder, MysqlxConnection.CapabilityOrBuilder> getCapabilitiesFieldBuilder() {
            if (this.capabilitiesBuilder_ == null) {
                this.capabilitiesBuilder_ = new RepeatedFieldBuilderV3(this.capabilities_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
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
