/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
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
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.Mysqlx;
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxConnection.Compression
extends GeneratedMessageV3
implements MysqlxConnection.CompressionOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int UNCOMPRESSED_SIZE_FIELD_NUMBER = 1;
    private long uncompressedSize_;
    public static final int SERVER_MESSAGES_FIELD_NUMBER = 2;
    private int serverMessages_;
    public static final int CLIENT_MESSAGES_FIELD_NUMBER = 3;
    private int clientMessages_;
    public static final int PAYLOAD_FIELD_NUMBER = 4;
    private ByteString payload_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxConnection.Compression DEFAULT_INSTANCE = new MysqlxConnection.Compression();
    @Deprecated
    public static final Parser<MysqlxConnection.Compression> PARSER = new AbstractParser<MysqlxConnection.Compression>(){

        public MysqlxConnection.Compression parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxConnection.Compression(input, extensionRegistry);
        }
    };

    private MysqlxConnection.Compression(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxConnection.Compression() {
        this.serverMessages_ = 0;
        this.clientMessages_ = 1;
        this.payload_ = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxConnection.Compression();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxConnection.Compression(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.uncompressedSize_ = input.readUInt64();
                        continue block13;
                    }
                    case 16: {
                        int rawValue = input.readEnum();
                        Enum value = Mysqlx.ServerMessages.Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(2, rawValue);
                            continue block13;
                        }
                        this.bitField0_ |= 2;
                        this.serverMessages_ = rawValue;
                        continue block13;
                    }
                    case 24: {
                        int rawValue = input.readEnum();
                        Enum value = Mysqlx.ClientMessages.Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(3, rawValue);
                            continue block13;
                        }
                        this.bitField0_ |= 4;
                        this.clientMessages_ = rawValue;
                        continue block13;
                    }
                    case 34: {
                        this.bitField0_ |= 8;
                        this.payload_ = input.readBytes();
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
        return internal_static_Mysqlx_Connection_Compression_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_Compression_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Compression.class, Builder.class);
    }

    @Override
    public boolean hasUncompressedSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public long getUncompressedSize() {
        return this.uncompressedSize_;
    }

    @Override
    public boolean hasServerMessages() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public Mysqlx.ServerMessages.Type getServerMessages() {
        Mysqlx.ServerMessages.Type result = Mysqlx.ServerMessages.Type.valueOf(this.serverMessages_);
        return result == null ? Mysqlx.ServerMessages.Type.OK : result;
    }

    @Override
    public boolean hasClientMessages() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public Mysqlx.ClientMessages.Type getClientMessages() {
        Mysqlx.ClientMessages.Type result = Mysqlx.ClientMessages.Type.valueOf(this.clientMessages_);
        return result == null ? Mysqlx.ClientMessages.Type.CON_CAPABILITIES_GET : result;
    }

    @Override
    public boolean hasPayload() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public ByteString getPayload() {
        return this.payload_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasPayload()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt64(1, this.uncompressedSize_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.serverMessages_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.clientMessages_);
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.payload_);
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
            size += CodedOutputStream.computeUInt64Size((int)1, (long)this.uncompressedSize_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)2, (int)this.serverMessages_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeEnumSize((int)3, (int)this.clientMessages_);
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeBytesSize((int)4, (ByteString)this.payload_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxConnection.Compression)) {
            return super.equals(obj);
        }
        MysqlxConnection.Compression other = (MysqlxConnection.Compression)obj;
        if (this.hasUncompressedSize() != other.hasUncompressedSize()) {
            return false;
        }
        if (this.hasUncompressedSize() && this.getUncompressedSize() != other.getUncompressedSize()) {
            return false;
        }
        if (this.hasServerMessages() != other.hasServerMessages()) {
            return false;
        }
        if (this.hasServerMessages() && this.serverMessages_ != other.serverMessages_) {
            return false;
        }
        if (this.hasClientMessages() != other.hasClientMessages()) {
            return false;
        }
        if (this.hasClientMessages() && this.clientMessages_ != other.clientMessages_) {
            return false;
        }
        if (this.hasPayload() != other.hasPayload()) {
            return false;
        }
        if (this.hasPayload() && !this.getPayload().equals((Object)other.getPayload())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxConnection.Compression.getDescriptor().hashCode();
        if (this.hasUncompressedSize()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashLong((long)this.getUncompressedSize());
        }
        if (this.hasServerMessages()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.serverMessages_;
        }
        if (this.hasClientMessages()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.clientMessages_;
        }
        if (this.hasPayload()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getPayload().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxConnection.Compression parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Compression)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.Compression parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Compression)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.Compression parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Compression)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.Compression parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Compression)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.Compression parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Compression)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.Compression parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.Compression)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.Compression parseFrom(InputStream input) throws IOException {
        return (MysqlxConnection.Compression)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.Compression parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.Compression)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.Compression parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxConnection.Compression)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.Compression parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.Compression)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.Compression parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxConnection.Compression)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxConnection.Compression parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.Compression)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxConnection.Compression.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxConnection.Compression prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxConnection.Compression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxConnection.Compression> parser() {
        return PARSER;
    }

    public Parser<MysqlxConnection.Compression> getParserForType() {
        return PARSER;
    }

    public MysqlxConnection.Compression getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxConnection.CompressionOrBuilder {
        private int bitField0_;
        private long uncompressedSize_;
        private int serverMessages_ = 0;
        private int clientMessages_ = 1;
        private ByteString payload_ = ByteString.EMPTY;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Connection_Compression_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Connection_Compression_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Compression.class, Builder.class);
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
            this.uncompressedSize_ = 0L;
            this.bitField0_ &= 0xFFFFFFFE;
            this.serverMessages_ = 0;
            this.bitField0_ &= 0xFFFFFFFD;
            this.clientMessages_ = 1;
            this.bitField0_ &= 0xFFFFFFFB;
            this.payload_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Connection_Compression_descriptor;
        }

        public MysqlxConnection.Compression getDefaultInstanceForType() {
            return MysqlxConnection.Compression.getDefaultInstance();
        }

        public MysqlxConnection.Compression build() {
            MysqlxConnection.Compression result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxConnection.Compression buildPartial() {
            MysqlxConnection.Compression result = new MysqlxConnection.Compression(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.uncompressedSize_ = this.uncompressedSize_;
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.serverMessages_ = this.serverMessages_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.clientMessages_ = this.clientMessages_;
            if ((from_bitField0_ & 8) != 0) {
                to_bitField0_ |= 8;
            }
            result.payload_ = this.payload_;
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
            if (other instanceof MysqlxConnection.Compression) {
                return this.mergeFrom((MysqlxConnection.Compression)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxConnection.Compression other) {
            if (other == MysqlxConnection.Compression.getDefaultInstance()) {
                return this;
            }
            if (other.hasUncompressedSize()) {
                this.setUncompressedSize(other.getUncompressedSize());
            }
            if (other.hasServerMessages()) {
                this.setServerMessages(other.getServerMessages());
            }
            if (other.hasClientMessages()) {
                this.setClientMessages(other.getClientMessages());
            }
            if (other.hasPayload()) {
                this.setPayload(other.getPayload());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasPayload();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxConnection.Compression parsedMessage = null;
            try {
                parsedMessage = (MysqlxConnection.Compression)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxConnection.Compression)e.getUnfinishedMessage();
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
        public boolean hasUncompressedSize() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public long getUncompressedSize() {
            return this.uncompressedSize_;
        }

        public Builder setUncompressedSize(long value) {
            this.bitField0_ |= 1;
            this.uncompressedSize_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearUncompressedSize() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.uncompressedSize_ = 0L;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasServerMessages() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public Mysqlx.ServerMessages.Type getServerMessages() {
            Mysqlx.ServerMessages.Type result = Mysqlx.ServerMessages.Type.valueOf(this.serverMessages_);
            return result == null ? Mysqlx.ServerMessages.Type.OK : result;
        }

        public Builder setServerMessages(Mysqlx.ServerMessages.Type value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.serverMessages_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearServerMessages() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.serverMessages_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasClientMessages() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public Mysqlx.ClientMessages.Type getClientMessages() {
            Mysqlx.ClientMessages.Type result = Mysqlx.ClientMessages.Type.valueOf(this.clientMessages_);
            return result == null ? Mysqlx.ClientMessages.Type.CON_CAPABILITIES_GET : result;
        }

        public Builder setClientMessages(Mysqlx.ClientMessages.Type value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.clientMessages_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearClientMessages() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.clientMessages_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasPayload() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public ByteString getPayload() {
            return this.payload_;
        }

        public Builder setPayload(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 8;
            this.payload_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearPayload() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.payload_ = MysqlxConnection.Compression.getDefaultInstance().getPayload();
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
}
