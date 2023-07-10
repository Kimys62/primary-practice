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
import com.mysql.cj.x.protobuf.MysqlxSession;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxSession.Reset
extends GeneratedMessageV3
implements MysqlxSession.ResetOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int KEEP_OPEN_FIELD_NUMBER = 1;
    private boolean keepOpen_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxSession.Reset DEFAULT_INSTANCE = new MysqlxSession.Reset();
    @Deprecated
    public static final Parser<MysqlxSession.Reset> PARSER = new AbstractParser<MysqlxSession.Reset>(){

        public MysqlxSession.Reset parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxSession.Reset(input, extensionRegistry);
        }
    };

    private MysqlxSession.Reset(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxSession.Reset() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxSession.Reset();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxSession.Reset(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.keepOpen_ = input.readBool();
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
        return internal_static_Mysqlx_Session_Reset_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_Reset_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.Reset.class, Builder.class);
    }

    @Override
    public boolean hasKeepOpen() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public boolean getKeepOpen() {
        return this.keepOpen_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.keepOpen_);
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
            size += CodedOutputStream.computeBoolSize((int)1, (boolean)this.keepOpen_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxSession.Reset)) {
            return super.equals(obj);
        }
        MysqlxSession.Reset other = (MysqlxSession.Reset)obj;
        if (this.hasKeepOpen() != other.hasKeepOpen()) {
            return false;
        }
        if (this.hasKeepOpen() && this.getKeepOpen() != other.getKeepOpen()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxSession.Reset.getDescriptor().hashCode();
        if (this.hasKeepOpen()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean((boolean)this.getKeepOpen());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxSession.Reset parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxSession.Reset)PARSER.parseFrom(data);
    }

    public static MysqlxSession.Reset parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.Reset)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.Reset parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxSession.Reset)PARSER.parseFrom(data);
    }

    public static MysqlxSession.Reset parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.Reset)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.Reset parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxSession.Reset)PARSER.parseFrom(data);
    }

    public static MysqlxSession.Reset parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxSession.Reset)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxSession.Reset parseFrom(InputStream input) throws IOException {
        return (MysqlxSession.Reset)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxSession.Reset parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.Reset)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxSession.Reset parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxSession.Reset)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxSession.Reset parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.Reset)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxSession.Reset parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxSession.Reset)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxSession.Reset parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxSession.Reset)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxSession.Reset.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxSession.Reset prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxSession.Reset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxSession.Reset> parser() {
        return PARSER;
    }

    public Parser<MysqlxSession.Reset> getParserForType() {
        return PARSER;
    }

    public MysqlxSession.Reset getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxSession.ResetOrBuilder {
        private int bitField0_;
        private boolean keepOpen_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Session_Reset_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Session_Reset_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.Reset.class, Builder.class);
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
            this.keepOpen_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Session_Reset_descriptor;
        }

        public MysqlxSession.Reset getDefaultInstanceForType() {
            return MysqlxSession.Reset.getDefaultInstance();
        }

        public MysqlxSession.Reset build() {
            MysqlxSession.Reset result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxSession.Reset buildPartial() {
            MysqlxSession.Reset result = new MysqlxSession.Reset(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.keepOpen_ = this.keepOpen_;
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
            if (other instanceof MysqlxSession.Reset) {
                return this.mergeFrom((MysqlxSession.Reset)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxSession.Reset other) {
            if (other == MysqlxSession.Reset.getDefaultInstance()) {
                return this;
            }
            if (other.hasKeepOpen()) {
                this.setKeepOpen(other.getKeepOpen());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxSession.Reset parsedMessage = null;
            try {
                parsedMessage = (MysqlxSession.Reset)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxSession.Reset)e.getUnfinishedMessage();
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
        public boolean hasKeepOpen() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public boolean getKeepOpen() {
            return this.keepOpen_;
        }

        public Builder setKeepOpen(boolean value) {
            this.bitField0_ |= 1;
            this.keepOpen_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearKeepOpen() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.keepOpen_ = false;
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
