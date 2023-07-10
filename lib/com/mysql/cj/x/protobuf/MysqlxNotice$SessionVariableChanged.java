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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxNotice.SessionVariableChanged
extends GeneratedMessageV3
implements MysqlxNotice.SessionVariableChangedOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int PARAM_FIELD_NUMBER = 1;
    private volatile Object param_;
    public static final int VALUE_FIELD_NUMBER = 2;
    private MysqlxDatatypes.Scalar value_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxNotice.SessionVariableChanged DEFAULT_INSTANCE = new MysqlxNotice.SessionVariableChanged();
    @Deprecated
    public static final Parser<MysqlxNotice.SessionVariableChanged> PARSER = new AbstractParser<MysqlxNotice.SessionVariableChanged>(){

        public MysqlxNotice.SessionVariableChanged parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxNotice.SessionVariableChanged(input, extensionRegistry);
        }
    };

    private MysqlxNotice.SessionVariableChanged(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxNotice.SessionVariableChanged() {
        this.param_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxNotice.SessionVariableChanged();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxNotice.SessionVariableChanged(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
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
                    case 10: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.param_ = bs;
                        continue block11;
                    }
                    case 18: {
                        MysqlxDatatypes.Scalar.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                            subBuilder = this.value_.toBuilder();
                        }
                        this.value_ = (MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.value_);
                            this.value_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 2;
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
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_SessionVariableChanged_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_SessionVariableChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.SessionVariableChanged.class, Builder.class);
    }

    @Override
    public boolean hasParam() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getParam() {
        Object ref = this.param_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.param_ = s;
        }
        return s;
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

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar getValue() {
        return this.value_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.value_;
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getValueOrBuilder() {
        return this.value_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.value_;
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
        if (this.hasValue() && !this.getValue().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.param_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, (MessageLite)this.getValue());
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
            size += GeneratedMessageV3.computeStringSize((int)1, (Object)this.param_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getValue());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxNotice.SessionVariableChanged)) {
            return super.equals(obj);
        }
        MysqlxNotice.SessionVariableChanged other = (MysqlxNotice.SessionVariableChanged)obj;
        if (this.hasParam() != other.hasParam()) {
            return false;
        }
        if (this.hasParam() && !this.getParam().equals(other.getParam())) {
            return false;
        }
        if (this.hasValue() != other.hasValue()) {
            return false;
        }
        if (this.hasValue() && !this.getValue().equals(other.getValue())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxNotice.SessionVariableChanged.getDescriptor().hashCode();
        if (this.hasParam()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getParam().hashCode();
        }
        if (this.hasValue()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getValue().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionVariableChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionVariableChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionVariableChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionVariableChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionVariableChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.SessionVariableChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(InputStream input) throws IOException {
        return (MysqlxNotice.SessionVariableChanged)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.SessionVariableChanged)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.SessionVariableChanged parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxNotice.SessionVariableChanged)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.SessionVariableChanged parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.SessionVariableChanged)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxNotice.SessionVariableChanged)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxNotice.SessionVariableChanged parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.SessionVariableChanged)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxNotice.SessionVariableChanged.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxNotice.SessionVariableChanged prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxNotice.SessionVariableChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxNotice.SessionVariableChanged> parser() {
        return PARSER;
    }

    public Parser<MysqlxNotice.SessionVariableChanged> getParserForType() {
        return PARSER;
    }

    public MysqlxNotice.SessionVariableChanged getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxNotice.SessionVariableChangedOrBuilder {
        private int bitField0_;
        private Object param_ = "";
        private MysqlxDatatypes.Scalar value_;
        private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> valueBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Notice_SessionVariableChanged_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Notice_SessionVariableChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.SessionVariableChanged.class, Builder.class);
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
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxNotice.SessionVariableChanged buildPartial() {
            MysqlxNotice.SessionVariableChanged result = new MysqlxNotice.SessionVariableChanged(this);
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
            if (other instanceof MysqlxNotice.SessionVariableChanged) {
                return this.mergeFrom((MysqlxNotice.SessionVariableChanged)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxNotice.SessionVariableChanged other) {
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

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

        public Builder setParam(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.param_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearParam() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.param_ = MysqlxNotice.SessionVariableChanged.getDefaultInstance().getParam();
            this.onChanged();
            return this;
        }

        public Builder setParamBytes(ByteString value) {
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

        public Builder setValue(MysqlxDatatypes.Scalar value) {
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

        public Builder setValue(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.value_ = builderForValue.build();
                this.onChanged();
            } else {
                this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder mergeValue(MysqlxDatatypes.Scalar value) {
            if (this.valueBuilder_ == null) {
                this.value_ = (this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != MysqlxDatatypes.Scalar.getDefaultInstance() ? MysqlxDatatypes.Scalar.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.valueBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder clearValue() {
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

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
