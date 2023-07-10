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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxNotice.SessionStateChanged.Builder
extends GeneratedMessageV3.Builder<MysqlxNotice.SessionStateChanged.Builder>
implements MysqlxNotice.SessionStateChangedOrBuilder {
    private int bitField0_;
    private int param_ = 1;
    private List<MysqlxDatatypes.Scalar> value_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_SessionStateChanged_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_SessionStateChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.SessionStateChanged.class, MysqlxNotice.SessionStateChanged.Builder.class);
    }

    private MysqlxNotice.SessionStateChanged.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxNotice.SessionStateChanged.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
        }
    }

    public MysqlxNotice.SessionStateChanged.Builder clear() {
        super.clear();
        this.param_ = 1;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.valueBuilder_ == null) {
            this.value_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
        } else {
            this.valueBuilder_.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Notice_SessionStateChanged_descriptor;
    }

    public MysqlxNotice.SessionStateChanged getDefaultInstanceForType() {
        return MysqlxNotice.SessionStateChanged.getDefaultInstance();
    }

    public MysqlxNotice.SessionStateChanged build() {
        MysqlxNotice.SessionStateChanged result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxNotice.SessionStateChanged.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxNotice.SessionStateChanged buildPartial() {
        MysqlxNotice.SessionStateChanged result = new MysqlxNotice.SessionStateChanged(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.param_ = this.param_;
        if (this.valueBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
                this.value_ = Collections.unmodifiableList(this.value_);
                this.bitField0_ &= 0xFFFFFFFD;
            }
            result.value_ = this.value_;
        } else {
            result.value_ = this.valueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxNotice.SessionStateChanged.Builder clone() {
        return (MysqlxNotice.SessionStateChanged.Builder)super.clone();
    }

    public MysqlxNotice.SessionStateChanged.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.setField(field, value);
    }

    public MysqlxNotice.SessionStateChanged.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.clearField(field);
    }

    public MysqlxNotice.SessionStateChanged.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.clearOneof(oneof);
    }

    public MysqlxNotice.SessionStateChanged.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxNotice.SessionStateChanged.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxNotice.SessionStateChanged.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxNotice.SessionStateChanged) {
            return this.mergeFrom((MysqlxNotice.SessionStateChanged)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder mergeFrom(MysqlxNotice.SessionStateChanged other) {
        if (other == MysqlxNotice.SessionStateChanged.getDefaultInstance()) {
            return this;
        }
        if (other.hasParam()) {
            this.setParam(other.getParam());
        }
        if (this.valueBuilder_ == null) {
            if (!other.value_.isEmpty()) {
                if (this.value_.isEmpty()) {
                    this.value_ = other.value_;
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.ensureValueIsMutable();
                    this.value_.addAll(other.value_);
                }
                this.onChanged();
            }
        } else if (!other.value_.isEmpty()) {
            if (this.valueBuilder_.isEmpty()) {
                this.valueBuilder_.dispose();
                this.valueBuilder_ = null;
                this.value_ = other.value_;
                this.bitField0_ &= 0xFFFFFFFD;
                this.valueBuilder_ = alwaysUseFieldBuilders ? this.getValueFieldBuilder() : null;
            } else {
                this.valueBuilder_.addAllMessages((Iterable)other.value_);
            }
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasParam()) {
            return false;
        }
        for (int i = 0; i < this.getValueCount(); ++i) {
            if (this.getValue(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxNotice.SessionStateChanged.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxNotice.SessionStateChanged parsedMessage = null;
        try {
            parsedMessage = (MysqlxNotice.SessionStateChanged)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxNotice.SessionStateChanged)e.getUnfinishedMessage();
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
    public MysqlxNotice.SessionStateChanged.Parameter getParam() {
        MysqlxNotice.SessionStateChanged.Parameter result = MysqlxNotice.SessionStateChanged.Parameter.valueOf(this.param_);
        return result == null ? MysqlxNotice.SessionStateChanged.Parameter.CURRENT_SCHEMA : result;
    }

    public MysqlxNotice.SessionStateChanged.Builder setParam(MysqlxNotice.SessionStateChanged.Parameter value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.param_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder clearParam() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.param_ = 1;
        this.onChanged();
        return this;
    }

    private void ensureValueIsMutable() {
        if ((this.bitField0_ & 2) == 0) {
            this.value_ = new ArrayList<MysqlxDatatypes.Scalar>(this.value_);
            this.bitField0_ |= 2;
        }
    }

    @Override
    public List<MysqlxDatatypes.Scalar> getValueList() {
        if (this.valueBuilder_ == null) {
            return Collections.unmodifiableList(this.value_);
        }
        return this.valueBuilder_.getMessageList();
    }

    @Override
    public int getValueCount() {
        if (this.valueBuilder_ == null) {
            return this.value_.size();
        }
        return this.valueBuilder_.getCount();
    }

    @Override
    public MysqlxDatatypes.Scalar getValue(int index) {
        if (this.valueBuilder_ == null) {
            return this.value_.get(index);
        }
        return (MysqlxDatatypes.Scalar)this.valueBuilder_.getMessage(index);
    }

    public MysqlxNotice.SessionStateChanged.Builder setValue(int index, MysqlxDatatypes.Scalar value) {
        if (this.valueBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureValueIsMutable();
            this.value_.set(index, value);
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder setValue(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder addValue(MysqlxDatatypes.Scalar value) {
        if (this.valueBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureValueIsMutable();
            this.value_.add(value);
            this.onChanged();
        } else {
            this.valueBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder addValue(int index, MysqlxDatatypes.Scalar value) {
        if (this.valueBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureValueIsMutable();
            this.value_.add(index, value);
            this.onChanged();
        } else {
            this.valueBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder addValue(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.valueBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder addValue(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.valueBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder addAllValue(Iterable<? extends MysqlxDatatypes.Scalar> values) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.value_);
            this.onChanged();
        } else {
            this.valueBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder clearValue() {
        if (this.valueBuilder_ == null) {
            this.value_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.valueBuilder_.clear();
        }
        return this;
    }

    public MysqlxNotice.SessionStateChanged.Builder removeValue(int index) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.remove(index);
            this.onChanged();
        } else {
            this.valueBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder getValueBuilder(int index) {
        return (MysqlxDatatypes.Scalar.Builder)this.getValueFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getValueOrBuilder(int index) {
        if (this.valueBuilder_ == null) {
            return this.value_.get(index);
        }
        return (MysqlxDatatypes.ScalarOrBuilder)this.valueBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getValueOrBuilderList() {
        if (this.valueBuilder_ != null) {
            return this.valueBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.value_);
    }

    public MysqlxDatatypes.Scalar.Builder addValueBuilder() {
        return (MysqlxDatatypes.Scalar.Builder)this.getValueFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
    }

    public MysqlxDatatypes.Scalar.Builder addValueBuilder(int index) {
        return (MysqlxDatatypes.Scalar.Builder)this.getValueFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
    }

    public List<MysqlxDatatypes.Scalar.Builder> getValueBuilderList() {
        return this.getValueFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getValueFieldBuilder() {
        if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new RepeatedFieldBuilderV3(this.value_, (this.bitField0_ & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.value_ = null;
        }
        return this.valueBuilder_;
    }

    public final MysqlxNotice.SessionStateChanged.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxNotice.SessionStateChanged.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.SessionStateChanged.Builder)super.mergeUnknownFields(unknownFields);
    }
}
