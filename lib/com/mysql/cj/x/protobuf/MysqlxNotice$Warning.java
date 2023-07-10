/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

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
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxNotice.Warning
extends GeneratedMessageV3
implements MysqlxNotice.WarningOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private int level_;
    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    public static final int MSG_FIELD_NUMBER = 3;
    private volatile Object msg_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxNotice.Warning DEFAULT_INSTANCE = new MysqlxNotice.Warning();
    @Deprecated
    public static final Parser<MysqlxNotice.Warning> PARSER = new AbstractParser<MysqlxNotice.Warning>(){

        public MysqlxNotice.Warning parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxNotice.Warning(input, extensionRegistry);
        }
    };

    private MysqlxNotice.Warning(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxNotice.Warning() {
        this.level_ = 2;
        this.msg_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxNotice.Warning();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxNotice.Warning(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block12: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block12;
                    }
                    case 8: {
                        int rawValue = input.readEnum();
                        Level value = Level.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block12;
                        }
                        this.bitField0_ |= 1;
                        this.level_ = rawValue;
                        continue block12;
                    }
                    case 16: {
                        this.bitField0_ |= 2;
                        this.code_ = input.readUInt32();
                        continue block12;
                    }
                    case 26: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.msg_ = bs;
                        continue block12;
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
        return internal_static_Mysqlx_Notice_Warning_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_Warning_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.Warning.class, Builder.class);
    }

    @Override
    public boolean hasLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Level getLevel() {
        Level result = Level.valueOf(this.level_);
        return result == null ? Level.WARNING : result;
    }

    @Override
    public boolean hasCode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public int getCode() {
        return this.code_;
    }

    @Override
    public boolean hasMsg() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getMsg() {
        Object ref = this.msg_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.msg_ = s;
        }
        return s;
    }

    @Override
    public ByteString getMsgBytes() {
        Object ref = this.msg_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.msg_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.hasMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.level_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeUInt32(2, this.code_);
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)3, (Object)this.msg_);
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.level_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)2, (int)this.code_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)3, (Object)this.msg_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxNotice.Warning)) {
            return super.equals(obj);
        }
        MysqlxNotice.Warning other = (MysqlxNotice.Warning)obj;
        if (this.hasLevel() != other.hasLevel()) {
            return false;
        }
        if (this.hasLevel() && this.level_ != other.level_) {
            return false;
        }
        if (this.hasCode() != other.hasCode()) {
            return false;
        }
        if (this.hasCode() && this.getCode() != other.getCode()) {
            return false;
        }
        if (this.hasMsg() != other.hasMsg()) {
            return false;
        }
        if (this.hasMsg() && !this.getMsg().equals(other.getMsg())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxNotice.Warning.getDescriptor().hashCode();
        if (this.hasLevel()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.level_;
        }
        if (this.hasCode()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCode();
        }
        if (this.hasMsg()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMsg().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxNotice.Warning parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Warning)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.Warning parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Warning)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.Warning parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Warning)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.Warning parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Warning)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.Warning parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Warning)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.Warning parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Warning)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.Warning parseFrom(InputStream input) throws IOException {
        return (MysqlxNotice.Warning)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.Warning parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.Warning)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.Warning parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxNotice.Warning)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.Warning parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.Warning)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.Warning parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxNotice.Warning)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxNotice.Warning parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.Warning)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxNotice.Warning.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxNotice.Warning prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxNotice.Warning getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxNotice.Warning> parser() {
        return PARSER;
    }

    public Parser<MysqlxNotice.Warning> getParserForType() {
        return PARSER;
    }

    public MysqlxNotice.Warning getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxNotice.WarningOrBuilder {
        private int bitField0_;
        private int level_ = 2;
        private int code_;
        private Object msg_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Notice_Warning_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Notice_Warning_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.Warning.class, Builder.class);
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
                // empty if block
            }
        }

        public Builder clear() {
            super.clear();
            this.level_ = 2;
            this.bitField0_ &= 0xFFFFFFFE;
            this.code_ = 0;
            this.bitField0_ &= 0xFFFFFFFD;
            this.msg_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Notice_Warning_descriptor;
        }

        public MysqlxNotice.Warning getDefaultInstanceForType() {
            return MysqlxNotice.Warning.getDefaultInstance();
        }

        public MysqlxNotice.Warning build() {
            MysqlxNotice.Warning result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxNotice.Warning buildPartial() {
            MysqlxNotice.Warning result = new MysqlxNotice.Warning(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.level_ = this.level_;
            if ((from_bitField0_ & 2) != 0) {
                result.code_ = this.code_;
                to_bitField0_ |= 2;
            }
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.msg_ = this.msg_;
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
            if (other instanceof MysqlxNotice.Warning) {
                return this.mergeFrom((MysqlxNotice.Warning)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxNotice.Warning other) {
            if (other == MysqlxNotice.Warning.getDefaultInstance()) {
                return this;
            }
            if (other.hasLevel()) {
                this.setLevel(other.getLevel());
            }
            if (other.hasCode()) {
                this.setCode(other.getCode());
            }
            if (other.hasMsg()) {
                this.bitField0_ |= 4;
                this.msg_ = other.msg_;
                this.onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasCode()) {
                return false;
            }
            return this.hasMsg();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxNotice.Warning parsedMessage = null;
            try {
                parsedMessage = (MysqlxNotice.Warning)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxNotice.Warning)e.getUnfinishedMessage();
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
        public boolean hasLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public Level getLevel() {
            Level result = Level.valueOf(this.level_);
            return result == null ? Level.WARNING : result;
        }

        public Builder setLevel(Level value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.level_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearLevel() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.level_ = 2;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public int getCode() {
            return this.code_;
        }

        public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearCode() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.code_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasMsg() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public String getMsg() {
            Object ref = this.msg_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.msg_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getMsgBytes() {
            Object ref = this.msg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.msg_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setMsg(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.msg_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearMsg() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.msg_ = MysqlxNotice.Warning.getDefaultInstance().getMsg();
            this.onChanged();
            return this;
        }

        public Builder setMsgBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.msg_ = value;
            this.onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Level implements ProtocolMessageEnum
    {
        NOTE(1),
        WARNING(2),
        ERROR(3);

        public static final int NOTE_VALUE = 1;
        public static final int WARNING_VALUE = 2;
        public static final int ERROR_VALUE = 3;
        private static final Internal.EnumLiteMap<Level> internalValueMap;
        private static final Level[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Level valueOf(int value) {
            return Level.forNumber(value);
        }

        public static Level forNumber(int value) {
            switch (value) {
                case 1: {
                    return NOTE;
                }
                case 2: {
                    return WARNING;
                }
                case 3: {
                    return ERROR;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Level> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Level.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Level.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxNotice.Warning.getDescriptor().getEnumTypes().get(0);
        }

        public static Level valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Level.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Level(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Level>(){

                public Level findValueByNumber(int number) {
                    return Level.forNumber(number);
                }
            };
            VALUES = Level.values();
        }
    }
}
