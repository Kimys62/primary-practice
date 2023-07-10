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
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxConnection.Capabilities.Builder
extends GeneratedMessageV3.Builder<MysqlxConnection.Capabilities.Builder>
implements MysqlxConnection.CapabilitiesOrBuilder {
    private int bitField0_;
    private List<MysqlxConnection.Capability> capabilities_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxConnection.Capability, MysqlxConnection.Capability.Builder, MysqlxConnection.CapabilityOrBuilder> capabilitiesBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Connection_Capabilities_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Capabilities.class, MysqlxConnection.Capabilities.Builder.class);
    }

    private MysqlxConnection.Capabilities.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxConnection.Capabilities.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCapabilitiesFieldBuilder();
        }
    }

    public MysqlxConnection.Capabilities.Builder clear() {
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
            throw MysqlxConnection.Capabilities.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxConnection.Capabilities buildPartial() {
        MysqlxConnection.Capabilities result = new MysqlxConnection.Capabilities(this, null);
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

    public MysqlxConnection.Capabilities.Builder clone() {
        return (MysqlxConnection.Capabilities.Builder)super.clone();
    }

    public MysqlxConnection.Capabilities.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Capabilities.Builder)super.setField(field, value);
    }

    public MysqlxConnection.Capabilities.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxConnection.Capabilities.Builder)super.clearField(field);
    }

    public MysqlxConnection.Capabilities.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxConnection.Capabilities.Builder)super.clearOneof(oneof);
    }

    public MysqlxConnection.Capabilities.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxConnection.Capabilities.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxConnection.Capabilities.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Capabilities.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxConnection.Capabilities.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxConnection.Capabilities) {
            return this.mergeFrom((MysqlxConnection.Capabilities)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxConnection.Capabilities.Builder mergeFrom(MysqlxConnection.Capabilities other) {
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

    public MysqlxConnection.Capabilities.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

    public MysqlxConnection.Capabilities.Builder setCapabilities(int index, MysqlxConnection.Capability value) {
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

    public MysqlxConnection.Capabilities.Builder setCapabilities(int index, MysqlxConnection.Capability.Builder builderForValue) {
        if (this.capabilitiesBuilder_ == null) {
            this.ensureCapabilitiesIsMutable();
            this.capabilities_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxConnection.Capabilities.Builder addCapabilities(MysqlxConnection.Capability value) {
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

    public MysqlxConnection.Capabilities.Builder addCapabilities(int index, MysqlxConnection.Capability value) {
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

    public MysqlxConnection.Capabilities.Builder addCapabilities(MysqlxConnection.Capability.Builder builderForValue) {
        if (this.capabilitiesBuilder_ == null) {
            this.ensureCapabilitiesIsMutable();
            this.capabilities_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxConnection.Capabilities.Builder addCapabilities(int index, MysqlxConnection.Capability.Builder builderForValue) {
        if (this.capabilitiesBuilder_ == null) {
            this.ensureCapabilitiesIsMutable();
            this.capabilities_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxConnection.Capabilities.Builder addAllCapabilities(Iterable<? extends MysqlxConnection.Capability> values) {
        if (this.capabilitiesBuilder_ == null) {
            this.ensureCapabilitiesIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.capabilities_);
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxConnection.Capabilities.Builder clearCapabilities() {
        if (this.capabilitiesBuilder_ == null) {
            this.capabilities_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.capabilitiesBuilder_.clear();
        }
        return this;
    }

    public MysqlxConnection.Capabilities.Builder removeCapabilities(int index) {
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

    public final MysqlxConnection.Capabilities.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Capabilities.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxConnection.Capabilities.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Capabilities.Builder)super.mergeUnknownFields(unknownFields);
    }
}
