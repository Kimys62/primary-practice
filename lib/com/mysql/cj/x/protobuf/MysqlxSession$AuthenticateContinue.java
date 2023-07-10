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
import com.mysql.cj.x.protobuf.MysqlxSession;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxSession.AuthenticateContinue
extends GeneratedMessageV3
implements MysqlxSession.AuthenticateContinueOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int AUTH_DATA_FIELD_NUMBER = 1;
    private ByteString authData_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxSession.AuthenticateContinue DEFAULT_INSTANCE = new MysqlxSession.AuthenticateContinue();
    @Deprecated
    public static final Parser<MysqlxSession.AuthenticateContinue> PARSER = new AbstractParser<MysqlxSession.AuthenticateContinue>(){

        public MysqlxSession.AuthenticateContinue parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxSession.AuthenticateContinue(input, extensionRegistry);
        }
    };

    private MysqlxSession.AuthenticateContinue(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxSession.AuthenticateContinue() {
        this.authData_ = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxSession.AuthenticateContinue();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxSession.AuthenticateContinue(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 10: {
                        this.bitField0_ |= 1;
                        this.authData_ = input.readBytes();
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
        return internal_static_Mysqlx_Session_AuthenticateContinue_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_AuthenticateContinue_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateContinue.class, Builder.class);
    }

    @Override
    public boolean hasAuthData() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public ByteString getAuthData() {
        return this.authData_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasAuthData()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.authData_);
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
            size += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.authData_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxSession.AuthenticateContinue)) {
            return super.equals(obj);
        }
        MysqlxSession.AuthenticateContinue other = (MysqlxSession.AuthenticateContinue)obj;
        if (this.hasAuthData() != other.hasAuthData()) {
            return false;
        }
        if (this.hasAuthData() && !this.getAuthData().equals((Object)other.getAuthData())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxSession.AuthenticateContinue.getDescriptor().hashCode();
        if (this.hasAuthData()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAuthData().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateContinue)PARSER.parseFrom(data);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateContinue)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateContinue)PARSER.parseFrom(data);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateContinue)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateContinue)PARSER.parseFrom(data);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateContinue)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(InputStream input) throws IOException {
        return (MysqlxSession.AuthenticateContinue)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.AuthenticateContinue)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxSession.AuthenticateContinue parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxSession.AuthenticateContinue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxSession.AuthenticateContinue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.AuthenticateContinue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxSession.AuthenticateContinue)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxSession.AuthenticateContinue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.AuthenticateContinue)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxSession.AuthenticateContinue.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxSession.AuthenticateContinue prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxSession.AuthenticateContinue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxSession.AuthenticateContinue> parser() {
        return PARSER;
    }

    public Parser<MysqlxSession.AuthenticateContinue> getParserForType() {
        return PARSER;
    }

    public MysqlxSession.AuthenticateContinue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxSession.AuthenticateContinueOrBuilder {
        private int bitField0_;
        private ByteString authData_ = ByteString.EMPTY;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Session_AuthenticateContinue_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Session_AuthenticateContinue_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateContinue.class, Builder.class);
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
            this.authData_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Session_AuthenticateContinue_descriptor;
        }

        public MysqlxSession.AuthenticateContinue getDefaultInstanceForType() {
            return MysqlxSession.AuthenticateContinue.getDefaultInstance();
        }

        public MysqlxSession.AuthenticateContinue build() {
            MysqlxSession.AuthenticateContinue result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxSession.AuthenticateContinue buildPartial() {
            MysqlxSession.AuthenticateContinue result = new MysqlxSession.AuthenticateContinue(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.authData_ = this.authData_;
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
            if (other instanceof MysqlxSession.AuthenticateContinue) {
                return this.mergeFrom((MysqlxSession.AuthenticateContinue)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxSession.AuthenticateContinue other) {
            if (other == MysqlxSession.AuthenticateContinue.getDefaultInstance()) {
                return this;
            }
            if (other.hasAuthData()) {
                this.setAuthData(other.getAuthData());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasAuthData();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxSession.AuthenticateContinue parsedMessage = null;
            try {
                parsedMessage = (MysqlxSession.AuthenticateContinue)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxSession.AuthenticateContinue)e.getUnfinishedMessage();
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
        public boolean hasAuthData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public ByteString getAuthData() {
            return this.authData_;
        }

        public Builder setAuthData(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.authData_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearAuthData() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.authData_ = MysqlxSession.AuthenticateContinue.getDefaultInstance().getAuthData();
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
