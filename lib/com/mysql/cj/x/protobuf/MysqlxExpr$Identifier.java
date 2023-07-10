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
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxExpr.Identifier
extends GeneratedMessageV3
implements MysqlxExpr.IdentifierOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    public static final int SCHEMA_NAME_FIELD_NUMBER = 2;
    private volatile Object schemaName_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpr.Identifier DEFAULT_INSTANCE = new MysqlxExpr.Identifier();
    @Deprecated
    public static final Parser<MysqlxExpr.Identifier> PARSER = new AbstractParser<MysqlxExpr.Identifier>(){

        public MysqlxExpr.Identifier parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpr.Identifier(input, extensionRegistry);
        }
    };

    private MysqlxExpr.Identifier(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpr.Identifier() {
        this.name_ = "";
        this.schemaName_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpr.Identifier();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpr.Identifier(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 10: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.name_ = bs;
                        continue block11;
                    }
                    case 18: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.schemaName_ = bs;
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
        return internal_static_Mysqlx_Expr_Identifier_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Identifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Identifier.class, Builder.class);
    }

    @Override
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getName() {
        Object ref = this.name_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.name_ = s;
        }
        return s;
    }

    @Override
    public ByteString getNameBytes() {
        Object ref = this.name_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.name_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    @Override
    public boolean hasSchemaName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getSchemaName() {
        Object ref = this.schemaName_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.schemaName_ = s;
        }
        return s;
    }

    @Override
    public ByteString getSchemaNameBytes() {
        Object ref = this.schemaName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.schemaName_ = b;
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
        if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)2, (Object)this.schemaName_);
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
            size += GeneratedMessageV3.computeStringSize((int)1, (Object)this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)2, (Object)this.schemaName_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpr.Identifier)) {
            return super.equals(obj);
        }
        MysqlxExpr.Identifier other = (MysqlxExpr.Identifier)obj;
        if (this.hasName() != other.hasName()) {
            return false;
        }
        if (this.hasName() && !this.getName().equals(other.getName())) {
            return false;
        }
        if (this.hasSchemaName() != other.hasSchemaName()) {
            return false;
        }
        if (this.hasSchemaName() && !this.getSchemaName().equals(other.getSchemaName())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxExpr.Identifier.getDescriptor().hashCode();
        if (this.hasName()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getName().hashCode();
        }
        if (this.hasSchemaName()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSchemaName().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpr.Identifier parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Identifier)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Identifier parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Identifier)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Identifier parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Identifier)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Identifier parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Identifier)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Identifier parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Identifier)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Identifier parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Identifier)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Identifier parseFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Identifier)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Identifier parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Identifier)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Identifier parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Identifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Identifier parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Identifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Identifier parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpr.Identifier)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpr.Identifier parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Identifier)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpr.Identifier.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpr.Identifier prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpr.Identifier getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpr.Identifier> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpr.Identifier> getParserForType() {
        return PARSER;
    }

    public MysqlxExpr.Identifier getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxExpr.IdentifierOrBuilder {
        private int bitField0_;
        private Object name_ = "";
        private Object schemaName_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expr_Identifier_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expr_Identifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Identifier.class, Builder.class);
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
            this.name_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            this.schemaName_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Expr_Identifier_descriptor;
        }

        public MysqlxExpr.Identifier getDefaultInstanceForType() {
            return MysqlxExpr.Identifier.getDefaultInstance();
        }

        public MysqlxExpr.Identifier build() {
            MysqlxExpr.Identifier result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpr.Identifier buildPartial() {
            MysqlxExpr.Identifier result = new MysqlxExpr.Identifier(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.name_ = this.name_;
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.schemaName_ = this.schemaName_;
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
            if (other instanceof MysqlxExpr.Identifier) {
                return this.mergeFrom((MysqlxExpr.Identifier)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpr.Identifier other) {
            if (other == MysqlxExpr.Identifier.getDefaultInstance()) {
                return this;
            }
            if (other.hasName()) {
                this.bitField0_ |= 1;
                this.name_ = other.name_;
                this.onChanged();
            }
            if (other.hasSchemaName()) {
                this.bitField0_ |= 2;
                this.schemaName_ = other.schemaName_;
                this.onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasName();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxExpr.Identifier parsedMessage = null;
            try {
                parsedMessage = (MysqlxExpr.Identifier)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxExpr.Identifier)e.getUnfinishedMessage();
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
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.name_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.name_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.name_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = MysqlxExpr.Identifier.getDefaultInstance().getName();
            this.onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.name_ = value;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasSchemaName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getSchemaName() {
            Object ref = this.schemaName_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.schemaName_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getSchemaNameBytes() {
            Object ref = this.schemaName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.schemaName_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setSchemaName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.schemaName_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearSchemaName() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.schemaName_ = MysqlxExpr.Identifier.getDefaultInstance().getSchemaName();
            this.onChanged();
            return this;
        }

        public Builder setSchemaNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.schemaName_ = value;
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
