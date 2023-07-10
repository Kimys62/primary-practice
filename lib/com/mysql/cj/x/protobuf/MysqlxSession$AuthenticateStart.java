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

public static final class MysqlxSession.AuthenticateStart
extends GeneratedMessageV3
implements MysqlxSession.AuthenticateStartOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int MECH_NAME_FIELD_NUMBER = 1;
    private volatile Object mechName_;
    public static final int AUTH_DATA_FIELD_NUMBER = 2;
    private ByteString authData_;
    public static final int INITIAL_RESPONSE_FIELD_NUMBER = 3;
    private ByteString initialResponse_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxSession.AuthenticateStart DEFAULT_INSTANCE = new MysqlxSession.AuthenticateStart();
    @Deprecated
    public static final Parser<MysqlxSession.AuthenticateStart> PARSER = new AbstractParser<MysqlxSession.AuthenticateStart>(){

        public MysqlxSession.AuthenticateStart parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxSession.AuthenticateStart(input, extensionRegistry);
        }
    };

    private MysqlxSession.AuthenticateStart(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxSession.AuthenticateStart() {
        this.mechName_ = "";
        this.authData_ = ByteString.EMPTY;
        this.initialResponse_ = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxSession.AuthenticateStart();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxSession.AuthenticateStart(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 10: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.mechName_ = bs;
                        continue block12;
                    }
                    case 18: {
                        this.bitField0_ |= 2;
                        this.authData_ = input.readBytes();
                        continue block12;
                    }
                    case 26: {
                        this.bitField0_ |= 4;
                        this.initialResponse_ = input.readBytes();
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
        return internal_static_Mysqlx_Session_AuthenticateStart_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_AuthenticateStart_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateStart.class, Builder.class);
    }

    @Override
    public boolean hasMechName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getMechName() {
        Object ref = this.mechName_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.mechName_ = s;
        }
        return s;
    }

    @Override
    public ByteString getMechNameBytes() {
        Object ref = this.mechName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.mechName_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    @Override
    public boolean hasAuthData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getAuthData() {
        return this.authData_;
    }

    @Override
    public boolean hasInitialResponse() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ByteString getInitialResponse() {
        return this.initialResponse_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasMechName()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.mechName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.authData_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.initialResponse_);
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
            size += GeneratedMessageV3.computeStringSize((int)1, (Object)this.mechName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.authData_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeBytesSize((int)3, (ByteString)this.initialResponse_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxSession.AuthenticateStart)) {
            return super.equals(obj);
        }
        MysqlxSession.AuthenticateStart other = (MysqlxSession.AuthenticateStart)obj;
        if (this.hasMechName() != other.hasMechName()) {
            return false;
        }
        if (this.hasMechName() && !this.getMechName().equals(other.getMechName())) {
            return false;
        }
        if (this.hasAuthData() != other.hasAuthData()) {
            return false;
        }
        if (this.hasAuthData() && !this.getAuthData().equals((Object)other.getAuthData())) {
            return false;
        }
        if (this.hasInitialResponse() != other.hasInitialResponse()) {
            return false;
        }
        if (this.hasInitialResponse() && !this.getInitialResponse().equals((Object)other.getInitialResponse())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxSession.AuthenticateStart.getDescriptor().hashCode();
        if (this.hasMechName()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMechName().hashCode();
        }
        if (this.hasAuthData()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getAuthData().hashCode();
        }
        if (this.hasInitialResponse()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getInitialResponse().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxSession.AuthenticateStart parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateStart)PARSER.parseFrom(data);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateStart)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateStart)PARSER.parseFrom(data);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateStart)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateStart)PARSER.parseFrom(data);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.AuthenticateStart)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(InputStream input) throws IOException {
        return (MysqlxSession.AuthenticateStart)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.AuthenticateStart)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxSession.AuthenticateStart parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxSession.AuthenticateStart)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxSession.AuthenticateStart parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.AuthenticateStart)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxSession.AuthenticateStart)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxSession.AuthenticateStart parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.AuthenticateStart)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxSession.AuthenticateStart.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxSession.AuthenticateStart prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxSession.AuthenticateStart getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxSession.AuthenticateStart> parser() {
        return PARSER;
    }

    public Parser<MysqlxSession.AuthenticateStart> getParserForType() {
        return PARSER;
    }

    public MysqlxSession.AuthenticateStart getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxSession.AuthenticateStartOrBuilder {
        private int bitField0_;
        private Object mechName_ = "";
        private ByteString authData_ = ByteString.EMPTY;
        private ByteString initialResponse_ = ByteString.EMPTY;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Session_AuthenticateStart_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Session_AuthenticateStart_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateStart.class, Builder.class);
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
            this.mechName_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            this.authData_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFD;
            this.initialResponse_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Session_AuthenticateStart_descriptor;
        }

        public MysqlxSession.AuthenticateStart getDefaultInstanceForType() {
            return MysqlxSession.AuthenticateStart.getDefaultInstance();
        }

        public MysqlxSession.AuthenticateStart build() {
            MysqlxSession.AuthenticateStart result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxSession.AuthenticateStart buildPartial() {
            MysqlxSession.AuthenticateStart result = new MysqlxSession.AuthenticateStart(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.mechName_ = this.mechName_;
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.authData_ = this.authData_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.initialResponse_ = this.initialResponse_;
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
            if (other instanceof MysqlxSession.AuthenticateStart) {
                return this.mergeFrom((MysqlxSession.AuthenticateStart)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxSession.AuthenticateStart other) {
            if (other == MysqlxSession.AuthenticateStart.getDefaultInstance()) {
                return this;
            }
            if (other.hasMechName()) {
                this.bitField0_ |= 1;
                this.mechName_ = other.mechName_;
                this.onChanged();
            }
            if (other.hasAuthData()) {
                this.setAuthData(other.getAuthData());
            }
            if (other.hasInitialResponse()) {
                this.setInitialResponse(other.getInitialResponse());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasMechName();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxSession.AuthenticateStart parsedMessage = null;
            try {
                parsedMessage = (MysqlxSession.AuthenticateStart)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxSession.AuthenticateStart)e.getUnfinishedMessage();
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
        public boolean hasMechName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public String getMechName() {
            Object ref = this.mechName_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.mechName_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getMechNameBytes() {
            Object ref = this.mechName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.mechName_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setMechName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.mechName_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearMechName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.mechName_ = MysqlxSession.AuthenticateStart.getDefaultInstance().getMechName();
            this.onChanged();
            return this;
        }

        public Builder setMechNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.mechName_ = value;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasAuthData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public ByteString getAuthData() {
            return this.authData_;
        }

        public Builder setAuthData(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.authData_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearAuthData() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.authData_ = MysqlxSession.AuthenticateStart.getDefaultInstance().getAuthData();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasInitialResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public ByteString getInitialResponse() {
            return this.initialResponse_;
        }

        public Builder setInitialResponse(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.initialResponse_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearInitialResponse() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.initialResponse_ = MysqlxSession.AuthenticateStart.getDefaultInstance().getInitialResponse();
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
