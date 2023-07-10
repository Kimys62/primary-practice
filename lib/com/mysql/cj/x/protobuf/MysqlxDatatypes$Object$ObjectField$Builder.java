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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;

public static final class MysqlxDatatypes.Object.ObjectField.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Object.ObjectField.Builder>
implements MysqlxDatatypes.Object.ObjectFieldOrBuilder {
    private int bitField0_;
    private Object key_ = "";
    private MysqlxDatatypes.Any value_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Object_ObjectField_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Object_ObjectField_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Object.ObjectField.class, MysqlxDatatypes.Object.ObjectField.Builder.class);
    }

    private MysqlxDatatypes.Object.ObjectField.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Object.ObjectField.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
        }
    }

    public MysqlxDatatypes.Object.ObjectField.Builder clear() {
        super.clear();
        this.key_ = "";
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
        return internal_static_Mysqlx_Datatypes_Object_ObjectField_descriptor;
    }

    public MysqlxDatatypes.Object.ObjectField getDefaultInstanceForType() {
        return MysqlxDatatypes.Object.ObjectField.getDefaultInstance();
    }

    public MysqlxDatatypes.Object.ObjectField build() {
        MysqlxDatatypes.Object.ObjectField result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Object.ObjectField.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Object.ObjectField buildPartial() {
        MysqlxDatatypes.Object.ObjectField result = new MysqlxDatatypes.Object.ObjectField(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.key_ = this.key_;
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

    public MysqlxDatatypes.Object.ObjectField.Builder clone() {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.clone();
    }

    public MysqlxDatatypes.Object.ObjectField.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Object.ObjectField.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Object.ObjectField.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Object.ObjectField.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Object.ObjectField.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Object.ObjectField.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Object.ObjectField) {
            return this.mergeFrom((MysqlxDatatypes.Object.ObjectField)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder mergeFrom(MysqlxDatatypes.Object.ObjectField other) {
        if (other == MysqlxDatatypes.Object.ObjectField.getDefaultInstance()) {
            return this;
        }
        if (other.hasKey()) {
            this.bitField0_ |= 1;
            this.key_ = other.key_;
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
        if (!this.hasKey()) {
            return false;
        }
        if (!this.hasValue()) {
            return false;
        }
        return this.getValue().isInitialized();
    }

    public MysqlxDatatypes.Object.ObjectField.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Object.ObjectField parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Object.ObjectField)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Object.ObjectField)e.getUnfinishedMessage();
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
    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getKey() {
        Object ref = this.key_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.key_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getKeyBytes() {
        Object ref = this.key_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.key_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder setKey(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.key_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder clearKey() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.key_ = MysqlxDatatypes.Object.ObjectField.getDefaultInstance().getKey();
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder setKeyBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.key_ = value;
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

    public MysqlxDatatypes.Object.ObjectField.Builder setValue(MysqlxDatatypes.Any value) {
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

    public MysqlxDatatypes.Object.ObjectField.Builder setValue(MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.value_ = builderForValue.build();
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder mergeValue(MysqlxDatatypes.Any value) {
        if (this.valueBuilder_ == null) {
            this.value_ = (this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != MysqlxDatatypes.Any.getDefaultInstance() ? MysqlxDatatypes.Any.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.valueBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder clearValue() {
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

    public final MysqlxDatatypes.Object.ObjectField.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Object.ObjectField.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)super.mergeUnknownFields(unknownFields);
    }
}
