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
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxConnection.CapabilitiesGet
extends GeneratedMessageV3
implements MysqlxConnection.CapabilitiesGetOrBuilder {
    private static final long serialVersionUID = 0L;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxConnection.CapabilitiesGet DEFAULT_INSTANCE = new MysqlxConnection.CapabilitiesGet();
    @Deprecated
    public static final Parser<MysqlxConnection.CapabilitiesGet> PARSER = new AbstractParser<MysqlxConnection.CapabilitiesGet>(){

        public MysqlxConnection.CapabilitiesGet parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxConnection.CapabilitiesGet(input, extensionRegistry);
        }
    };

    private MysqlxConnection.CapabilitiesGet(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxConnection.CapabilitiesGet() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxConnection.CapabilitiesGet();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxConnection.CapabilitiesGet(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block9: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block9;
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
        return internal_static_Mysqlx_Connection_CapabilitiesGet_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_CapabilitiesGet_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.CapabilitiesGet.class, Builder.class);
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
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxConnection.CapabilitiesGet)) {
            return super.equals(obj);
        }
        MysqlxConnection.CapabilitiesGet other = (MysqlxConnection.CapabilitiesGet)obj;
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxConnection.CapabilitiesGet.getDescriptor().hashCode();
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesGet)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesGet)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesGet)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesGet)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesGet)PARSER.parseFrom(data);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxConnection.CapabilitiesGet)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(InputStream input) throws IOException {
        return (MysqlxConnection.CapabilitiesGet)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.CapabilitiesGet)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesGet parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxConnection.CapabilitiesGet)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxConnection.CapabilitiesGet parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.CapabilitiesGet)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxConnection.CapabilitiesGet)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxConnection.CapabilitiesGet parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxConnection.CapabilitiesGet)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxConnection.CapabilitiesGet.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxConnection.CapabilitiesGet prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxConnection.CapabilitiesGet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxConnection.CapabilitiesGet> parser() {
        return PARSER;
    }

    public Parser<MysqlxConnection.CapabilitiesGet> getParserForType() {
        return PARSER;
    }

    public MysqlxConnection.CapabilitiesGet getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxConnection.CapabilitiesGetOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Connection_CapabilitiesGet_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Connection_CapabilitiesGet_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.CapabilitiesGet.class, Builder.class);
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
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Connection_CapabilitiesGet_descriptor;
        }

        public MysqlxConnection.CapabilitiesGet getDefaultInstanceForType() {
            return MysqlxConnection.CapabilitiesGet.getDefaultInstance();
        }

        public MysqlxConnection.CapabilitiesGet build() {
            MysqlxConnection.CapabilitiesGet result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxConnection.CapabilitiesGet buildPartial() {
            MysqlxConnection.CapabilitiesGet result = new MysqlxConnection.CapabilitiesGet(this);
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
            if (other instanceof MysqlxConnection.CapabilitiesGet) {
                return this.mergeFrom((MysqlxConnection.CapabilitiesGet)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxConnection.CapabilitiesGet other) {
            if (other == MysqlxConnection.CapabilitiesGet.getDefaultInstance()) {
                return this;
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxConnection.CapabilitiesGet parsedMessage = null;
            try {
                parsedMessage = (MysqlxConnection.CapabilitiesGet)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxConnection.CapabilitiesGet)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
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
