/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.Mysqlx;
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;

public static final class MysqlxConnection.Compression.Builder
extends GeneratedMessageV3.Builder<MysqlxConnection.Compression.Builder>
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
        return internal_static_Mysqlx_Connection_Compression_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Compression.class, MysqlxConnection.Compression.Builder.class);
    }

    private MysqlxConnection.Compression.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxConnection.Compression.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxConnection.Compression.Builder clear() {
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
            throw MysqlxConnection.Compression.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxConnection.Compression buildPartial() {
        MysqlxConnection.Compression result = new MysqlxConnection.Compression(this, null);
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

    public MysqlxConnection.Compression.Builder clone() {
        return (MysqlxConnection.Compression.Builder)super.clone();
    }

    public MysqlxConnection.Compression.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Compression.Builder)super.setField(field, value);
    }

    public MysqlxConnection.Compression.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxConnection.Compression.Builder)super.clearField(field);
    }

    public MysqlxConnection.Compression.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxConnection.Compression.Builder)super.clearOneof(oneof);
    }

    public MysqlxConnection.Compression.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxConnection.Compression.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxConnection.Compression.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Compression.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxConnection.Compression.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxConnection.Compression) {
            return this.mergeFrom((MysqlxConnection.Compression)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxConnection.Compression.Builder mergeFrom(MysqlxConnection.Compression other) {
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

    public MysqlxConnection.Compression.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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

    public MysqlxConnection.Compression.Builder setUncompressedSize(long value) {
        this.bitField0_ |= 1;
        this.uncompressedSize_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxConnection.Compression.Builder clearUncompressedSize() {
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

    public MysqlxConnection.Compression.Builder setServerMessages(Mysqlx.ServerMessages.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.serverMessages_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxConnection.Compression.Builder clearServerMessages() {
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

    public MysqlxConnection.Compression.Builder setClientMessages(Mysqlx.ClientMessages.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.clientMessages_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxConnection.Compression.Builder clearClientMessages() {
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

    public MysqlxConnection.Compression.Builder setPayload(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.payload_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxConnection.Compression.Builder clearPayload() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.payload_ = MysqlxConnection.Compression.getDefaultInstance().getPayload();
        this.onChanged();
        return this;
    }

    public final MysqlxConnection.Compression.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Compression.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxConnection.Compression.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Compression.Builder)super.mergeUnknownFields(unknownFields);
    }
}
