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
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;

public static final class MysqlxConnection.CapabilitiesSet.Builder
extends GeneratedMessageV3.Builder<MysqlxConnection.CapabilitiesSet.Builder>
implements MysqlxConnection.CapabilitiesSetOrBuilder {
    private int bitField0_;
    private MysqlxConnection.Capabilities capabilities_;
    private SingleFieldBuilderV3<MysqlxConnection.Capabilities, MysqlxConnection.Capabilities.Builder, MysqlxConnection.CapabilitiesOrBuilder> capabilitiesBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Connection_CapabilitiesSet_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_CapabilitiesSet_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.CapabilitiesSet.class, MysqlxConnection.CapabilitiesSet.Builder.class);
    }

    private MysqlxConnection.CapabilitiesSet.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxConnection.CapabilitiesSet.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCapabilitiesFieldBuilder();
        }
    }

    public MysqlxConnection.CapabilitiesSet.Builder clear() {
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
            throw MysqlxConnection.CapabilitiesSet.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxConnection.CapabilitiesSet buildPartial() {
        MysqlxConnection.CapabilitiesSet result = new MysqlxConnection.CapabilitiesSet(this, null);
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

    public MysqlxConnection.CapabilitiesSet.Builder clone() {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.clone();
    }

    public MysqlxConnection.CapabilitiesSet.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.setField(field, value);
    }

    public MysqlxConnection.CapabilitiesSet.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.clearField(field);
    }

    public MysqlxConnection.CapabilitiesSet.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.clearOneof(oneof);
    }

    public MysqlxConnection.CapabilitiesSet.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxConnection.CapabilitiesSet.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxConnection.CapabilitiesSet.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxConnection.CapabilitiesSet) {
            return this.mergeFrom((MysqlxConnection.CapabilitiesSet)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxConnection.CapabilitiesSet.Builder mergeFrom(MysqlxConnection.CapabilitiesSet other) {
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

    public MysqlxConnection.CapabilitiesSet.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

    public MysqlxConnection.CapabilitiesSet.Builder setCapabilities(MysqlxConnection.Capabilities value) {
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

    public MysqlxConnection.CapabilitiesSet.Builder setCapabilities(MysqlxConnection.Capabilities.Builder builderForValue) {
        if (this.capabilitiesBuilder_ == null) {
            this.capabilities_ = builderForValue.build();
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxConnection.CapabilitiesSet.Builder mergeCapabilities(MysqlxConnection.Capabilities value) {
        if (this.capabilitiesBuilder_ == null) {
            this.capabilities_ = (this.bitField0_ & 1) != 0 && this.capabilities_ != null && this.capabilities_ != MysqlxConnection.Capabilities.getDefaultInstance() ? MysqlxConnection.Capabilities.newBuilder(this.capabilities_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxConnection.CapabilitiesSet.Builder clearCapabilities() {
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

    public final MysqlxConnection.CapabilitiesSet.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxConnection.CapabilitiesSet.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.CapabilitiesSet.Builder)super.mergeUnknownFields(unknownFields);
    }
}
