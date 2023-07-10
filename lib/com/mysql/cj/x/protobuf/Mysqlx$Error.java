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
import com.mysql.cj.x.protobuf.Mysqlx;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class Mysqlx.Error
extends GeneratedMessageV3
implements Mysqlx.ErrorOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int SEVERITY_FIELD_NUMBER = 1;
    private int severity_;
    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    public static final int SQL_STATE_FIELD_NUMBER = 4;
    private volatile Object sqlState_;
    public static final int MSG_FIELD_NUMBER = 3;
    private volatile Object msg_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final Mysqlx.Error DEFAULT_INSTANCE = new Mysqlx.Error();
    @Deprecated
    public static final Parser<Mysqlx.Error> PARSER = new AbstractParser<Mysqlx.Error>(){

        public Mysqlx.Error parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Mysqlx.Error(input, extensionRegistry);
        }
    };

    private Mysqlx.Error(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Mysqlx.Error() {
        this.severity_ = 0;
        this.sqlState_ = "";
        this.msg_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Mysqlx.Error();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Mysqlx.Error(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block13: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block13;
                    }
                    case 8: {
                        int rawValue = input.readEnum();
                        Severity value = Severity.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block13;
                        }
                        this.bitField0_ |= 1;
                        this.severity_ = rawValue;
                        continue block13;
                    }
                    case 16: {
                        this.bitField0_ |= 2;
                        this.code_ = input.readUInt32();
                        continue block13;
                    }
                    case 26: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.msg_ = bs;
                        continue block13;
                    }
                    case 34: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.sqlState_ = bs;
                        continue block13;
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
        return internal_static_Mysqlx_Error_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.Error.class, Builder.class);
    }

    @Override
    public boolean hasSeverity() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Severity getSeverity() {
        Severity result = Severity.valueOf(this.severity_);
        return result == null ? Severity.ERROR : result;
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
    public boolean hasSqlState() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getSqlState() {
        Object ref = this.sqlState_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.sqlState_ = s;
        }
        return s;
    }

    @Override
    public ByteString getSqlStateBytes() {
        Object ref = this.sqlState_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.sqlState_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    @Override
    public boolean hasMsg() {
        return (this.bitField0_ & 8) != 0;
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
        if (!this.hasSqlState()) {
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
            output.writeEnum(1, this.severity_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeUInt32(2, this.code_);
        }
        if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)3, (Object)this.msg_);
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)4, (Object)this.sqlState_);
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.severity_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)2, (int)this.code_);
        }
        if ((this.bitField0_ & 8) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)3, (Object)this.msg_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)4, (Object)this.sqlState_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mysqlx.Error)) {
            return super.equals(obj);
        }
        Mysqlx.Error other = (Mysqlx.Error)obj;
        if (this.hasSeverity() != other.hasSeverity()) {
            return false;
        }
        if (this.hasSeverity() && this.severity_ != other.severity_) {
            return false;
        }
        if (this.hasCode() != other.hasCode()) {
            return false;
        }
        if (this.hasCode() && this.getCode() != other.getCode()) {
            return false;
        }
        if (this.hasSqlState() != other.hasSqlState()) {
            return false;
        }
        if (this.hasSqlState() && !this.getSqlState().equals(other.getSqlState())) {
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
        hash = 19 * hash + Mysqlx.Error.getDescriptor().hashCode();
        if (this.hasSeverity()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.severity_;
        }
        if (this.hasCode()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCode();
        }
        if (this.hasSqlState()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getSqlState().hashCode();
        }
        if (this.hasMsg()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMsg().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static Mysqlx.Error parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Mysqlx.Error)PARSER.parseFrom(data);
    }

    public static Mysqlx.Error parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.Error)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.Error parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Mysqlx.Error)PARSER.parseFrom(data);
    }

    public static Mysqlx.Error parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.Error)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.Error parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Mysqlx.Error)PARSER.parseFrom(data);
    }

    public static Mysqlx.Error parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.Error)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.Error parseFrom(InputStream input) throws IOException {
        return (Mysqlx.Error)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.Error parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.Error)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.Error parseDelimitedFrom(InputStream input) throws IOException {
        return (Mysqlx.Error)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.Error parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.Error)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.Error parseFrom(CodedInputStream input) throws IOException {
        return (Mysqlx.Error)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static Mysqlx.Error parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.Error)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return Mysqlx.Error.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Mysqlx.Error prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static Mysqlx.Error getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Mysqlx.Error> parser() {
        return PARSER;
    }

    public Parser<Mysqlx.Error> getParserForType() {
        return PARSER;
    }

    public Mysqlx.Error getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements Mysqlx.ErrorOrBuilder {
        private int bitField0_;
        private int severity_ = 0;
        private int code_;
        private Object sqlState_ = "";
        private Object msg_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Error_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.Error.class, Builder.class);
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
            this.severity_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            this.code_ = 0;
            this.bitField0_ &= 0xFFFFFFFD;
            this.sqlState_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            this.msg_ = "";
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Error_descriptor;
        }

        public Mysqlx.Error getDefaultInstanceForType() {
            return Mysqlx.Error.getDefaultInstance();
        }

        public Mysqlx.Error build() {
            Mysqlx.Error result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public Mysqlx.Error buildPartial() {
            Mysqlx.Error result = new Mysqlx.Error(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.severity_ = this.severity_;
            if ((from_bitField0_ & 2) != 0) {
                result.code_ = this.code_;
                to_bitField0_ |= 2;
            }
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.sqlState_ = this.sqlState_;
            if ((from_bitField0_ & 8) != 0) {
                to_bitField0_ |= 8;
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
            if (other instanceof Mysqlx.Error) {
                return this.mergeFrom((Mysqlx.Error)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Mysqlx.Error other) {
            if (other == Mysqlx.Error.getDefaultInstance()) {
                return this;
            }
            if (other.hasSeverity()) {
                this.setSeverity(other.getSeverity());
            }
            if (other.hasCode()) {
                this.setCode(other.getCode());
            }
            if (other.hasSqlState()) {
                this.bitField0_ |= 4;
                this.sqlState_ = other.sqlState_;
                this.onChanged();
            }
            if (other.hasMsg()) {
                this.bitField0_ |= 8;
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
            if (!this.hasSqlState()) {
                return false;
            }
            return this.hasMsg();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Mysqlx.Error parsedMessage = null;
            try {
                parsedMessage = (Mysqlx.Error)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (Mysqlx.Error)e.getUnfinishedMessage();
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
        public boolean hasSeverity() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public Severity getSeverity() {
            Severity result = Severity.valueOf(this.severity_);
            return result == null ? Severity.ERROR : result;
        }

        public Builder setSeverity(Severity value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.severity_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearSeverity() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.severity_ = 0;
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
        public boolean hasSqlState() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public String getSqlState() {
            Object ref = this.sqlState_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.sqlState_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getSqlStateBytes() {
            Object ref = this.sqlState_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.sqlState_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setSqlState(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.sqlState_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearSqlState() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.sqlState_ = Mysqlx.Error.getDefaultInstance().getSqlState();
            this.onChanged();
            return this;
        }

        public Builder setSqlStateBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.sqlState_ = value;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasMsg() {
            return (this.bitField0_ & 8) != 0;
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
            this.bitField0_ |= 8;
            this.msg_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearMsg() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.msg_ = Mysqlx.Error.getDefaultInstance().getMsg();
            this.onChanged();
            return this;
        }

        public Builder setMsgBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 8;
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

    public static enum Severity implements ProtocolMessageEnum
    {
        ERROR(0),
        FATAL(1);

        public static final int ERROR_VALUE = 0;
        public static final int FATAL_VALUE = 1;
        private static final Internal.EnumLiteMap<Severity> internalValueMap;
        private static final Severity[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Severity valueOf(int value) {
            return Severity.forNumber(value);
        }

        public static Severity forNumber(int value) {
            switch (value) {
                case 0: {
                    return ERROR;
                }
                case 1: {
                    return FATAL;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Severity> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Severity.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Severity.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)Mysqlx.Error.getDescriptor().getEnumTypes().get(0);
        }

        public static Severity valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Severity.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Severity(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Severity>(){

                public Severity findValueByNumber(int number) {
                    return Severity.forNumber(number);
                }
            };
            VALUES = Severity.values();
        }
    }
}
