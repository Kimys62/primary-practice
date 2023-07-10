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
import com.mysql.cj.x.protobuf.Mysqlx;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class Mysqlx.Ok
extends GeneratedMessageV3
implements Mysqlx.OkOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int MSG_FIELD_NUMBER = 1;
    private volatile Object msg_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final Mysqlx.Ok DEFAULT_INSTANCE = new Mysqlx.Ok();
    @Deprecated
    public static final Parser<Mysqlx.Ok> PARSER = new AbstractParser<Mysqlx.Ok>(){

        public Mysqlx.Ok parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Mysqlx.Ok(input, extensionRegistry);
        }
    };

    private Mysqlx.Ok(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Mysqlx.Ok() {
        this.msg_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Mysqlx.Ok();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Mysqlx.Ok(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.msg_ = bs;
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
        return internal_static_Mysqlx_Ok_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Ok_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.Ok.class, Builder.class);
    }

    @Override
    public boolean hasMsg() {
        return (this.bitField0_ & 1) != 0;
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
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.msg_);
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
            size += GeneratedMessageV3.computeStringSize((int)1, (Object)this.msg_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mysqlx.Ok)) {
            return super.equals(obj);
        }
        Mysqlx.Ok other = (Mysqlx.Ok)obj;
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
        hash = 19 * hash + Mysqlx.Ok.getDescriptor().hashCode();
        if (this.hasMsg()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMsg().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static Mysqlx.Ok parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Mysqlx.Ok)PARSER.parseFrom(data);
    }

    public static Mysqlx.Ok parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.Ok)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.Ok parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Mysqlx.Ok)PARSER.parseFrom(data);
    }

    public static Mysqlx.Ok parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.Ok)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.Ok parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Mysqlx.Ok)PARSER.parseFrom(data);
    }

    public static Mysqlx.Ok parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.Ok)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.Ok parseFrom(InputStream input) throws IOException {
        return (Mysqlx.Ok)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.Ok parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.Ok)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.Ok parseDelimitedFrom(InputStream input) throws IOException {
        return (Mysqlx.Ok)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.Ok parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.Ok)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.Ok parseFrom(CodedInputStream input) throws IOException {
        return (Mysqlx.Ok)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static Mysqlx.Ok parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.Ok)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return Mysqlx.Ok.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Mysqlx.Ok prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static Mysqlx.Ok getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Mysqlx.Ok> parser() {
        return PARSER;
    }

    public Parser<Mysqlx.Ok> getParserForType() {
        return PARSER;
    }

    public Mysqlx.Ok getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements Mysqlx.OkOrBuilder {
        private int bitField0_;
        private Object msg_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Ok_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Ok_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.Ok.class, Builder.class);
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
            this.msg_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Ok_descriptor;
        }

        public Mysqlx.Ok getDefaultInstanceForType() {
            return Mysqlx.Ok.getDefaultInstance();
        }

        public Mysqlx.Ok build() {
            Mysqlx.Ok result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public Mysqlx.Ok buildPartial() {
            Mysqlx.Ok result = new Mysqlx.Ok(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
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
            if (other instanceof Mysqlx.Ok) {
                return this.mergeFrom((Mysqlx.Ok)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Mysqlx.Ok other) {
            if (other == Mysqlx.Ok.getDefaultInstance()) {
                return this;
            }
            if (other.hasMsg()) {
                this.bitField0_ |= 1;
                this.msg_ = other.msg_;
                this.onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Mysqlx.Ok parsedMessage = null;
            try {
                parsedMessage = (Mysqlx.Ok)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (Mysqlx.Ok)e.getUnfinishedMessage();
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
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.msg_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearMsg() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.msg_ = Mysqlx.Ok.getDefaultInstance().getMsg();
            this.onChanged();
            return this;
        }

        public Builder setMsgBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
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
}
