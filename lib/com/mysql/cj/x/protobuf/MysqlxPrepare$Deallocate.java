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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxPrepare.Deallocate
extends GeneratedMessageV3
implements MysqlxPrepare.DeallocateOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int STMT_ID_FIELD_NUMBER = 1;
    private int stmtId_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxPrepare.Deallocate DEFAULT_INSTANCE = new MysqlxPrepare.Deallocate();
    @Deprecated
    public static final Parser<MysqlxPrepare.Deallocate> PARSER = new AbstractParser<MysqlxPrepare.Deallocate>(){

        public MysqlxPrepare.Deallocate parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxPrepare.Deallocate(input, extensionRegistry);
        }
    };

    private MysqlxPrepare.Deallocate(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxPrepare.Deallocate() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxPrepare.Deallocate();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxPrepare.Deallocate(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block10: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block10;
                    }
                    case 8: {
                        this.bitField0_ |= 1;
                        this.stmtId_ = input.readUInt32();
                        continue block10;
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
        return internal_static_Mysqlx_Prepare_Deallocate_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Prepare_Deallocate_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Deallocate.class, Builder.class);
    }

    @Override
    public boolean hasStmtId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getStmtId() {
        return this.stmtId_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasStmtId()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt32(1, this.stmtId_);
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
            size += CodedOutputStream.computeUInt32Size((int)1, (int)this.stmtId_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxPrepare.Deallocate)) {
            return super.equals(obj);
        }
        MysqlxPrepare.Deallocate other = (MysqlxPrepare.Deallocate)obj;
        if (this.hasStmtId() != other.hasStmtId()) {
            return false;
        }
        if (this.hasStmtId() && this.getStmtId() != other.getStmtId()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxPrepare.Deallocate.getDescriptor().hashCode();
        if (this.hasStmtId()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getStmtId();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxPrepare.Deallocate parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Deallocate)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Deallocate parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Deallocate)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Deallocate parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Deallocate)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Deallocate parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Deallocate)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Deallocate parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Deallocate)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Deallocate parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Deallocate)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Deallocate parseFrom(InputStream input) throws IOException {
        return (MysqlxPrepare.Deallocate)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxPrepare.Deallocate parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Deallocate)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxPrepare.Deallocate parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxPrepare.Deallocate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxPrepare.Deallocate parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Deallocate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxPrepare.Deallocate parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxPrepare.Deallocate)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxPrepare.Deallocate parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Deallocate)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxPrepare.Deallocate.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxPrepare.Deallocate prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxPrepare.Deallocate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxPrepare.Deallocate> parser() {
        return PARSER;
    }

    public Parser<MysqlxPrepare.Deallocate> getParserForType() {
        return PARSER;
    }

    public MysqlxPrepare.Deallocate getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxPrepare.DeallocateOrBuilder {
        private int bitField0_;
        private int stmtId_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Prepare_Deallocate_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Prepare_Deallocate_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Deallocate.class, Builder.class);
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
            this.stmtId_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Prepare_Deallocate_descriptor;
        }

        public MysqlxPrepare.Deallocate getDefaultInstanceForType() {
            return MysqlxPrepare.Deallocate.getDefaultInstance();
        }

        public MysqlxPrepare.Deallocate build() {
            MysqlxPrepare.Deallocate result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxPrepare.Deallocate buildPartial() {
            MysqlxPrepare.Deallocate result = new MysqlxPrepare.Deallocate(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.stmtId_ = this.stmtId_;
                to_bitField0_ |= 1;
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
            if (other instanceof MysqlxPrepare.Deallocate) {
                return this.mergeFrom((MysqlxPrepare.Deallocate)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxPrepare.Deallocate other) {
            if (other == MysqlxPrepare.Deallocate.getDefaultInstance()) {
                return this;
            }
            if (other.hasStmtId()) {
                this.setStmtId(other.getStmtId());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasStmtId();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxPrepare.Deallocate parsedMessage = null;
            try {
                parsedMessage = (MysqlxPrepare.Deallocate)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxPrepare.Deallocate)e.getUnfinishedMessage();
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
        public boolean hasStmtId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public int getStmtId() {
            return this.stmtId_;
        }

        public Builder setStmtId(int value) {
            this.bitField0_ |= 1;
            this.stmtId_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearStmtId() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.stmtId_ = 0;
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
