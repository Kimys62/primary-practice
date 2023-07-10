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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCursor;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxCursor.Open.OneOfMessage
extends GeneratedMessageV3
implements MysqlxCursor.Open.OneOfMessageOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int PREPARE_EXECUTE_FIELD_NUMBER = 2;
    private MysqlxPrepare.Execute prepareExecute_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCursor.Open.OneOfMessage DEFAULT_INSTANCE = new MysqlxCursor.Open.OneOfMessage();
    @Deprecated
    public static final Parser<MysqlxCursor.Open.OneOfMessage> PARSER = new AbstractParser<MysqlxCursor.Open.OneOfMessage>(){

        public MysqlxCursor.Open.OneOfMessage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCursor.Open.OneOfMessage(input, extensionRegistry);
        }
    };

    private MysqlxCursor.Open.OneOfMessage(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCursor.Open.OneOfMessage() {
        this.type_ = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCursor.Open.OneOfMessage();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCursor.Open.OneOfMessage(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 8: {
                        int rawValue = input.readEnum();
                        Type value = Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block11;
                        }
                        this.bitField0_ |= 1;
                        this.type_ = rawValue;
                        continue block11;
                    }
                    case 18: {
                        MysqlxPrepare.Execute.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                            subBuilder = this.prepareExecute_.toBuilder();
                        }
                        this.prepareExecute_ = (MysqlxPrepare.Execute)input.readMessage(MysqlxPrepare.Execute.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.prepareExecute_);
                            this.prepareExecute_ = subBuilder.buildPartial();
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
        return internal_static_Mysqlx_Cursor_Open_OneOfMessage_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Cursor_Open_OneOfMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Open.OneOfMessage.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Type getType() {
        Type result = Type.valueOf(this.type_);
        return result == null ? Type.PREPARE_EXECUTE : result;
    }

    @Override
    public boolean hasPrepareExecute() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxPrepare.Execute getPrepareExecute() {
        return this.prepareExecute_ == null ? MysqlxPrepare.Execute.getDefaultInstance() : this.prepareExecute_;
    }

    @Override
    public MysqlxPrepare.ExecuteOrBuilder getPrepareExecuteOrBuilder() {
        return this.prepareExecute_ == null ? MysqlxPrepare.Execute.getDefaultInstance() : this.prepareExecute_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasPrepareExecute() && !this.getPrepareExecute().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, (MessageLite)this.getPrepareExecute());
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getPrepareExecute());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCursor.Open.OneOfMessage)) {
            return super.equals(obj);
        }
        MysqlxCursor.Open.OneOfMessage other = (MysqlxCursor.Open.OneOfMessage)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.type_ != other.type_) {
            return false;
        }
        if (this.hasPrepareExecute() != other.hasPrepareExecute()) {
            return false;
        }
        if (this.hasPrepareExecute() && !this.getPrepareExecute().equals(other.getPrepareExecute())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCursor.Open.OneOfMessage.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
        }
        if (this.hasPrepareExecute()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPrepareExecute().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Open.OneOfMessage)PARSER.parseFrom(data);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Open.OneOfMessage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Open.OneOfMessage)PARSER.parseFrom(data);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Open.OneOfMessage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Open.OneOfMessage)PARSER.parseFrom(data);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Open.OneOfMessage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(InputStream input) throws IOException {
        return (MysqlxCursor.Open.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCursor.Open.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCursor.Open.OneOfMessage parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCursor.Open.OneOfMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCursor.Open.OneOfMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCursor.Open.OneOfMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCursor.Open.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCursor.Open.OneOfMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCursor.Open.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCursor.Open.OneOfMessage.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCursor.Open.OneOfMessage prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCursor.Open.OneOfMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCursor.Open.OneOfMessage> parser() {
        return PARSER;
    }

    public Parser<MysqlxCursor.Open.OneOfMessage> getParserForType() {
        return PARSER;
    }

    public MysqlxCursor.Open.OneOfMessage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCursor.Open.OneOfMessageOrBuilder {
        private int bitField0_;
        private int type_ = 0;
        private MysqlxPrepare.Execute prepareExecute_;
        private SingleFieldBuilderV3<MysqlxPrepare.Execute, MysqlxPrepare.Execute.Builder, MysqlxPrepare.ExecuteOrBuilder> prepareExecuteBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Cursor_Open_OneOfMessage_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Cursor_Open_OneOfMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Open.OneOfMessage.class, Builder.class);
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
                this.getPrepareExecuteFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            if (this.prepareExecuteBuilder_ == null) {
                this.prepareExecute_ = null;
            } else {
                this.prepareExecuteBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Cursor_Open_OneOfMessage_descriptor;
        }

        public MysqlxCursor.Open.OneOfMessage getDefaultInstanceForType() {
            return MysqlxCursor.Open.OneOfMessage.getDefaultInstance();
        }

        public MysqlxCursor.Open.OneOfMessage build() {
            MysqlxCursor.Open.OneOfMessage result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCursor.Open.OneOfMessage buildPartial() {
            MysqlxCursor.Open.OneOfMessage result = new MysqlxCursor.Open.OneOfMessage(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
                if (this.prepareExecuteBuilder_ == null) {
                    result.prepareExecute_ = this.prepareExecute_;
                } else {
                    result.prepareExecute_ = (MysqlxPrepare.Execute)this.prepareExecuteBuilder_.build();
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
            if (other instanceof MysqlxCursor.Open.OneOfMessage) {
                return this.mergeFrom((MysqlxCursor.Open.OneOfMessage)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCursor.Open.OneOfMessage other) {
            if (other == MysqlxCursor.Open.OneOfMessage.getDefaultInstance()) {
                return this;
            }
            if (other.hasType()) {
                this.setType(other.getType());
            }
            if (other.hasPrepareExecute()) {
                this.mergePrepareExecute(other.getPrepareExecute());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasType()) {
                return false;
            }
            return !this.hasPrepareExecute() || this.getPrepareExecute().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCursor.Open.OneOfMessage parsedMessage = null;
            try {
                parsedMessage = (MysqlxCursor.Open.OneOfMessage)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCursor.Open.OneOfMessage)e.getUnfinishedMessage();
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
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public Type getType() {
            Type result = Type.valueOf(this.type_);
            return result == null ? Type.PREPARE_EXECUTE : result;
        }

        public Builder setType(Type value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.type_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.type_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasPrepareExecute() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxPrepare.Execute getPrepareExecute() {
            if (this.prepareExecuteBuilder_ == null) {
                return this.prepareExecute_ == null ? MysqlxPrepare.Execute.getDefaultInstance() : this.prepareExecute_;
            }
            return (MysqlxPrepare.Execute)this.prepareExecuteBuilder_.getMessage();
        }

        public Builder setPrepareExecute(MysqlxPrepare.Execute value) {
            if (this.prepareExecuteBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.prepareExecute_ = value;
                this.onChanged();
            } else {
                this.prepareExecuteBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder setPrepareExecute(MysqlxPrepare.Execute.Builder builderForValue) {
            if (this.prepareExecuteBuilder_ == null) {
                this.prepareExecute_ = builderForValue.build();
                this.onChanged();
            } else {
                this.prepareExecuteBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder mergePrepareExecute(MysqlxPrepare.Execute value) {
            if (this.prepareExecuteBuilder_ == null) {
                this.prepareExecute_ = (this.bitField0_ & 2) != 0 && this.prepareExecute_ != null && this.prepareExecute_ != MysqlxPrepare.Execute.getDefaultInstance() ? MysqlxPrepare.Execute.newBuilder(this.prepareExecute_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.prepareExecuteBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder clearPrepareExecute() {
            if (this.prepareExecuteBuilder_ == null) {
                this.prepareExecute_ = null;
                this.onChanged();
            } else {
                this.prepareExecuteBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public MysqlxPrepare.Execute.Builder getPrepareExecuteBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (MysqlxPrepare.Execute.Builder)this.getPrepareExecuteFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxPrepare.ExecuteOrBuilder getPrepareExecuteOrBuilder() {
            if (this.prepareExecuteBuilder_ != null) {
                return (MysqlxPrepare.ExecuteOrBuilder)this.prepareExecuteBuilder_.getMessageOrBuilder();
            }
            return this.prepareExecute_ == null ? MysqlxPrepare.Execute.getDefaultInstance() : this.prepareExecute_;
        }

        private SingleFieldBuilderV3<MysqlxPrepare.Execute, MysqlxPrepare.Execute.Builder, MysqlxPrepare.ExecuteOrBuilder> getPrepareExecuteFieldBuilder() {
            if (this.prepareExecuteBuilder_ == null) {
                this.prepareExecuteBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getPrepareExecute(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.prepareExecute_ = null;
            }
            return this.prepareExecuteBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Type implements ProtocolMessageEnum
    {
        PREPARE_EXECUTE(0);

        public static final int PREPARE_EXECUTE_VALUE = 0;
        private static final Internal.EnumLiteMap<Type> internalValueMap;
        private static final Type[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int value) {
            return Type.forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 0: {
                    return PREPARE_EXECUTE;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Type.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Type.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxCursor.Open.OneOfMessage.getDescriptor().getEnumTypes().get(0);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Type.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Type(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Type>(){

                public Type findValueByNumber(int number) {
                    return Type.forNumber(number);
                }
            };
            VALUES = Type.values();
        }
    }
}
