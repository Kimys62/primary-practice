/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxConnection;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;

public static final class MysqlxConnection.Capability.Builder
extends GeneratedMessageV3.Builder<MysqlxConnection.Capability.Builder>
implements MysqlxConnection.CapabilityOrBuilder {
    private int bitField0_;
    private Object name_ = "";
    private MysqlxDatatypes.Any value_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Connection_Capability_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_Capability_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Capability.class, MysqlxConnection.Capability.Builder.class);
    }

    private MysqlxConnection.Capability.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxConnection.Capability.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
        }
    }

    public MysqlxConnection.Capability.Builder clear() {
        super.clear();
        this.name_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.valueBuilder_ == null) {
            this.value_ = null;
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Connection_Capability_descriptor;
    }

    public MysqlxConnection.Capability getDefaultInstanceForType() {
        return MysqlxConnection.Capability.getDefaultInstance();
    }

    public MysqlxConnection.Capability build() {
        MysqlxConnection.Capability result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxConnection.Capability.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxConnection.Capability buildPartial() {
        MysqlxConnection.Capability result = new MysqlxConnection.Capability(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.name_ = this.name_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.valueBuilder_ == null) {
                result.value_ = this.value_;
            } else {
                result.value_ = (MysqlxDatatypes.Any)this.valueBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxConnection.Capability.Builder clone() {
        return (MysqlxConnection.Capability.Builder)super.clone();
    }

    public MysqlxConnection.Capability.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Capability.Builder)super.setField(field, value);
    }

    public MysqlxConnection.Capability.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxConnection.Capability.Builder)super.clearField(field);
    }

    public MysqlxConnection.Capability.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxConnection.Capability.Builder)super.clearOneof(oneof);
    }

    public MysqlxConnection.Capability.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxConnection.Capability.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxConnection.Capability.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Capability.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxConnection.Capability.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxConnection.Capability) {
            return this.mergeFrom((MysqlxConnection.Capability)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxConnection.Capability.Builder mergeFrom(MysqlxConnection.Capability other) {
        if (other == MysqlxConnection.Capability.getDefaultInstance()) {
            return this;
        }
        if (other.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = other.name_;
            this.onChanged();
        }
        if (other.hasValue()) {
            this.mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasName()) {
            return false;
        }
        if (!this.hasValue()) {
            return false;
        }
        return this.getValue().isInitialized();
    }

    public MysqlxConnection.Capability.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxConnection.Capability parsedMessage = null;
        try {
            parsedMessage = (MysqlxConnection.Capability)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxConnection.Capability)e.getUnfinishedMessage();
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

    public MysqlxConnection.Capability.Builder setName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxConnection.Capability.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.name_ = MysqlxConnection.Capability.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    public MysqlxConnection.Capability.Builder setNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxDatatypes.Any getValue() {
        if (this.valueBuilder_ == null) {
            return this.value_ == null ? MysqlxDatatypes.Any.getDefaultInstance() : this.value_;
        }
        return (MysqlxDatatypes.Any)this.valueBuilder_.getMessage();
    }

    public MysqlxConnection.Capability.Builder setValue(MysqlxDatatypes.Any value) {
        if (this.valueBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.value_ = value;
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxConnection.Capability.Builder setValue(MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.value_ = builderForValue.build();
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxConnection.Capability.Builder mergeValue(MysqlxDatatypes.Any value) {
        if (this.valueBuilder_ == null) {
            this.value_ = (this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != MysqlxDatatypes.Any.getDefaultInstance() ? MysqlxDatatypes.Any.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.valueBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxConnection.Capability.Builder clearValue() {
        if (this.valueBuilder_ == null) {
            this.value_ = null;
            this.onChanged();
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxDatatypes.Any.Builder getValueBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxDatatypes.Any.Builder)this.getValueFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder() {
        if (this.valueBuilder_ != null) {
            return (MysqlxDatatypes.AnyOrBuilder)this.valueBuilder_.getMessageOrBuilder();
        }
        return this.value_ == null ? MysqlxDatatypes.Any.getDefaultInstance() : this.value_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> getValueFieldBuilder() {
        if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getValue(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.value_ = null;
        }
        return this.valueBuilder_;
    }

    public final MysqlxConnection.Capability.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Capability.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxConnection.Capability.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Capability.Builder)super.mergeUnknownFields(unknownFields);
    }
}
