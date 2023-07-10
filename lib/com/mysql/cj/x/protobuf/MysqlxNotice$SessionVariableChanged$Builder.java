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
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;

public static final class MysqlxNotice.SessionVariableChanged.Builder
extends GeneratedMessageV3.Builder<MysqlxNotice.SessionVariableChanged.Builder>
implements MysqlxNotice.SessionVariableChangedOrBuilder {
    private int bitField0_;
    private Object param_ = "";
    private MysqlxDatatypes.Scalar value_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_SessionVariableChanged_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_SessionVariableChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.SessionVariableChanged.class, MysqlxNotice.SessionVariableChanged.Builder.class);
    }

    private MysqlxNotice.SessionVariableChanged.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxNotice.SessionVariableChanged.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
        }
    }

    public MysqlxNotice.SessionVariableChanged.Builder clear() {
        super.clear();
        this.param_ = "";
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
        return internal_static_Mysqlx_Notice_SessionVariableChanged_descriptor;
    }

    public MysqlxNotice.SessionVariableChanged getDefaultInstanceForType() {
        return MysqlxNotice.SessionVariableChanged.getDefaultInstance();
    }

    public MysqlxNotice.SessionVariableChanged build() {
        MysqlxNotice.SessionVariableChanged result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxNotice.SessionVariableChanged.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxNotice.SessionVariableChanged buildPartial() {
        MysqlxNotice.SessionVariableChanged result = new MysqlxNotice.SessionVariableChanged(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.param_ = this.param_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.valueBuilder_ == null) {
                result.value_ = this.value_;
            } else {
                result.value_ = (MysqlxDatatypes.Scalar)this.valueBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxNotice.SessionVariableChanged.Builder clone() {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.clone();
    }

    public MysqlxNotice.SessionVariableChanged.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.setField(field, value);
    }

    public MysqlxNotice.SessionVariableChanged.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.clearField(field);
    }

    public MysqlxNotice.SessionVariableChanged.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.clearOneof(oneof);
    }

    public MysqlxNotice.SessionVariableChanged.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxNotice.SessionVariableChanged.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxNotice.SessionVariableChanged.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxNotice.SessionVariableChanged) {
            return this.mergeFrom((MysqlxNotice.SessionVariableChanged)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxNotice.SessionVariableChanged.Builder mergeFrom(MysqlxNotice.SessionVariableChanged other) {
        if (other == MysqlxNotice.SessionVariableChanged.getDefaultInstance()) {
            return this;
        }
        if (other.hasParam()) {
            this.bitField0_ |= 1;
            this.param_ = other.param_;
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
        if (!this.hasParam()) {
            return false;
        }
        return !this.hasValue() || this.getValue().isInitialized();
    }

    public MysqlxNotice.SessionVariableChanged.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxNotice.SessionVariableChanged parsedMessage = null;
        try {
            parsedMessage = (MysqlxNotice.SessionVariableChanged)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxNotice.SessionVariableChanged)e.getUnfinishedMessage();
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
    public boolean hasParam() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getParam() {
        Object ref = this.param_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.param_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getParamBytes() {
        Object ref = this.param_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.param_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxNotice.SessionVariableChanged.Builder setParam(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.param_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.SessionVariableChanged.Builder clearParam() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.param_ = MysqlxNotice.SessionVariableChanged.getDefaultInstance().getParam();
        this.onChanged();
        return this;
    }

    public MysqlxNotice.SessionVariableChanged.Builder setParamBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.param_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar getValue() {
        if (this.valueBuilder_ == null) {
            return this.value_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.value_;
        }
        return (MysqlxDatatypes.Scalar)this.valueBuilder_.getMessage();
    }

    public MysqlxNotice.SessionVariableChanged.Builder setValue(MysqlxDatatypes.Scalar value) {
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

    public MysqlxNotice.SessionVariableChanged.Builder setValue(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.value_ = builderForValue.build();
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxNotice.SessionVariableChanged.Builder mergeValue(MysqlxDatatypes.Scalar value) {
        if (this.valueBuilder_ == null) {
            this.value_ = (this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != MysqlxDatatypes.Scalar.getDefaultInstance() ? MysqlxDatatypes.Scalar.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.valueBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxNotice.SessionVariableChanged.Builder clearValue() {
        if (this.valueBuilder_ == null) {
            this.value_ = null;
            this.onChanged();
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder getValueBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxDatatypes.Scalar.Builder)this.getValueFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getValueOrBuilder() {
        if (this.valueBuilder_ != null) {
            return (MysqlxDatatypes.ScalarOrBuilder)this.valueBuilder_.getMessageOrBuilder();
        }
        return this.value_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.value_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getValueFieldBuilder() {
        if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getValue(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.value_ = null;
        }
        return this.valueBuilder_;
    }

    public final MysqlxNotice.SessionVariableChanged.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxNotice.SessionVariableChanged.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.SessionVariableChanged.Builder)super.mergeUnknownFields(unknownFields);
    }
}
