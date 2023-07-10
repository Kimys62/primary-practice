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
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxNotice.SessionStateChanged
extends GeneratedMessageV3
implements MysqlxNotice.SessionStateChangedOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int PARAM_FIELD_NUMBER = 1;
    private int param_;
    public static final int VALUE_FIELD_NUMBER = 2;
    private List<MysqlxDatatypes.Scalar> value_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxNotice.SessionStateChanged DEFAULT_INSTANCE = new MysqlxNotice.SessionStateChanged();
    @Deprecated
    public static final Parser<MysqlxNotice.SessionStateChanged> PARSER = new AbstractParser<MysqlxNotice.SessionStateChanged>(){

        public MysqlxNotice.SessionStateChanged parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxNotice.SessionStateChanged(input, extensionRegistry);
        }
    };

    private MysqlxNotice.SessionStateChanged(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxNotice.SessionStateChanged() {
        this.param_ = 1;
        this.value_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxNotice.SessionStateChanged();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxNotice.SessionStateChanged(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        Parameter value = Parameter.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block11;
                        }
                        this.bitField0_ |= 1;
                        this.param_ = rawValue;
                        continue block11;
                    }
                    case 18: {
                        if ((mutable_bitField0_ & 2) == 0) {
                            this.value_ = new ArrayList<MysqlxDatatypes.Scalar>();
                            mutable_bitField0_ |= 2;
                        }
                        this.value_.add((MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry));
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
                this.value_ = Collections.unmodifiableList(this.value_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_SessionStateChanged_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_SessionStateChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.SessionStateChanged.class, Builder.class);
    }

    @Override
    public boolean hasParam() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Parameter getParam() {
        Parameter result = Parameter.valueOf(this.param_);
        return result == null ? Parameter.CURRENT_SCHEMA : result;
    }

    @Override
    public List<MysqlxDatatypes.Scalar> getValueList() {
        return this.value_;
    }

    @Override
    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getValueOrBuilderList() {
        return this.value_;
    }

    @Override
    public int getValueCount() {
        return this.value_.size();
    }

    @Override
    public MysqlxDatatypes.Scalar getValue(int index) {
        return this.value_.get(index);
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getValueOrBuilder(int index) {
        return this.value_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasParam()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < this.getValueCount(); ++i) {
            if (this.getValue(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.param_);
        }
        for (int i = 0; i < this.value_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.value_.get(i));
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.param_);
        }
        for (int i = 0; i < this.value_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.value_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxNotice.SessionStateChanged)) {
            return super.equals(obj);
        }
        MysqlxNotice.SessionStateChanged other = (MysqlxNotice.SessionStateChanged)obj;
        if (this.hasParam() != other.hasParam()) {
            return false;
        }
        if (this.hasParam() && this.param_ != other.param_) {
            return false;
        }
        if (!this.getValueList().equals(other.getValueList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxNotice.SessionStateChanged.getDescriptor().hashCode();
        if (this.hasParam()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.param_;
        }
        if (this.getValueCount() > 0) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getValueList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionStateChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionStateChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionStateChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionStateChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionStateChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionStateChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(InputStream input) throws IOException {
        return (MysqlxNotice.SessionStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.SessionStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.SessionStateChanged parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxNotice.SessionStateChanged)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.SessionStateChanged parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.SessionStateChanged)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxNotice.SessionStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxNotice.SessionStateChanged parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.SessionStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxNotice.SessionStateChanged.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxNotice.SessionStateChanged prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxNotice.SessionStateChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxNotice.SessionStateChanged> parser() {
        return PARSER;
    }

    public Parser<MysqlxNotice.SessionStateChanged> getParserForType() {
        return PARSER;
    }

    public MysqlxNotice.SessionStateChanged getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxNotice.SessionStateChangedOrBuilder {
        private int bitField0_;
        private int param_ = 1;
        private List<MysqlxDatatypes.Scalar> value_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> valueBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Notice_SessionStateChanged_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Notice_SessionStateChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.SessionStateChanged.class, Builder.class);
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
                this.getValueFieldBuilder();
            }
        }

        public Builder clear() {
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
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxNotice.SessionStateChanged buildPartial() {
            MysqlxNotice.SessionStateChanged result = new MysqlxNotice.SessionStateChanged(this);
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
            if (other instanceof MysqlxNotice.SessionStateChanged) {
                return this.mergeFrom((MysqlxNotice.SessionStateChanged)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxNotice.SessionStateChanged other) {
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

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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
        public Parameter getParam() {
            Parameter result = Parameter.valueOf(this.param_);
            return result == null ? Parameter.CURRENT_SCHEMA : result;
        }

        public Builder setParam(Parameter value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.param_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearParam() {
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

        public Builder setValue(int index, MysqlxDatatypes.Scalar value) {
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

        public Builder setValue(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.valueBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addValue(MysqlxDatatypes.Scalar value) {
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

        public Builder addValue(int index, MysqlxDatatypes.Scalar value) {
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

        public Builder addValue(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.valueBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addValue(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.valueBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllValue(Iterable<? extends MysqlxDatatypes.Scalar> values) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.value_);
                this.onChanged();
            } else {
                this.valueBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearValue() {
            if (this.valueBuilder_ == null) {
                this.value_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
            } else {
                this.valueBuilder_.clear();
            }
            return this;
        }

        public Builder removeValue(int index) {
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

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Parameter implements ProtocolMessageEnum
    {
        CURRENT_SCHEMA(1),
        ACCOUNT_EXPIRED(2),
        GENERATED_INSERT_ID(3),
        ROWS_AFFECTED(4),
        ROWS_FOUND(5),
        ROWS_MATCHED(6),
        TRX_COMMITTED(7),
        TRX_ROLLEDBACK(9),
        PRODUCED_MESSAGE(10),
        CLIENT_ID_ASSIGNED(11),
        GENERATED_DOCUMENT_IDS(12);

        public static final int CURRENT_SCHEMA_VALUE = 1;
        public static final int ACCOUNT_EXPIRED_VALUE = 2;
        public static final int GENERATED_INSERT_ID_VALUE = 3;
        public static final int ROWS_AFFECTED_VALUE = 4;
        public static final int ROWS_FOUND_VALUE = 5;
        public static final int ROWS_MATCHED_VALUE = 6;
        public static final int TRX_COMMITTED_VALUE = 7;
        public static final int TRX_ROLLEDBACK_VALUE = 9;
        public static final int PRODUCED_MESSAGE_VALUE = 10;
        public static final int CLIENT_ID_ASSIGNED_VALUE = 11;
        public static final int GENERATED_DOCUMENT_IDS_VALUE = 12;
        private static final Internal.EnumLiteMap<Parameter> internalValueMap;
        private static final Parameter[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Parameter valueOf(int value) {
            return Parameter.forNumber(value);
        }

        public static Parameter forNumber(int value) {
            switch (value) {
                case 1: {
                    return CURRENT_SCHEMA;
                }
                case 2: {
                    return ACCOUNT_EXPIRED;
                }
                case 3: {
                    return GENERATED_INSERT_ID;
                }
                case 4: {
                    return ROWS_AFFECTED;
                }
                case 5: {
                    return ROWS_FOUND;
                }
                case 6: {
                    return ROWS_MATCHED;
                }
                case 7: {
                    return TRX_COMMITTED;
                }
                case 9: {
                    return TRX_ROLLEDBACK;
                }
                case 10: {
                    return PRODUCED_MESSAGE;
                }
                case 11: {
                    return CLIENT_ID_ASSIGNED;
                }
                case 12: {
                    return GENERATED_DOCUMENT_IDS;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Parameter> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Parameter.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Parameter.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxNotice.SessionStateChanged.getDescriptor().getEnumTypes().get(0);
        }

        public static Parameter valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Parameter.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Parameter(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Parameter>(){

                public Parameter findValueByNumber(int number) {
                    return Parameter.forNumber(number);
                }
            };
            VALUES = Parameter.values();
        }
    }
}
