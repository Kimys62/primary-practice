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
import com.mysql.cj.x.protobuf.MysqlxCursor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxCursor.Fetch
extends GeneratedMessageV3
implements MysqlxCursor.FetchOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int CURSOR_ID_FIELD_NUMBER = 1;
    private int cursorId_;
    public static final int FETCH_ROWS_FIELD_NUMBER = 5;
    private long fetchRows_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCursor.Fetch DEFAULT_INSTANCE = new MysqlxCursor.Fetch();
    @Deprecated
    public static final Parser<MysqlxCursor.Fetch> PARSER = new AbstractParser<MysqlxCursor.Fetch>(){

        public MysqlxCursor.Fetch parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCursor.Fetch(input, extensionRegistry);
        }
    };

    private MysqlxCursor.Fetch(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCursor.Fetch() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCursor.Fetch();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCursor.Fetch(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 8: {
                        this.bitField0_ |= 1;
                        this.cursorId_ = input.readUInt32();
                        continue block11;
                    }
                    case 40: {
                        this.bitField0_ |= 2;
                        this.fetchRows_ = input.readUInt64();
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
        return internal_static_Mysqlx_Cursor_Fetch_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Cursor_Fetch_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Fetch.class, Builder.class);
    }

    @Override
    public boolean hasCursorId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getCursorId() {
        return this.cursorId_;
    }

    @Override
    public boolean hasFetchRows() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getFetchRows() {
        return this.fetchRows_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasCursorId()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt32(1, this.cursorId_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeUInt64(5, this.fetchRows_);
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
            size += CodedOutputStream.computeUInt32Size((int)1, (int)this.cursorId_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeUInt64Size((int)5, (long)this.fetchRows_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCursor.Fetch)) {
            return super.equals(obj);
        }
        MysqlxCursor.Fetch other = (MysqlxCursor.Fetch)obj;
        if (this.hasCursorId() != other.hasCursorId()) {
            return false;
        }
        if (this.hasCursorId() && this.getCursorId() != other.getCursorId()) {
            return false;
        }
        if (this.hasFetchRows() != other.hasFetchRows()) {
            return false;
        }
        if (this.hasFetchRows() && this.getFetchRows() != other.getFetchRows()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCursor.Fetch.getDescriptor().hashCode();
        if (this.hasCursorId()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCursorId();
        }
        if (this.hasFetchRows()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong((long)this.getFetchRows());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCursor.Fetch parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Fetch)PARSER.parseFrom(data);
    }

    public static MysqlxCursor.Fetch parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Fetch)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCursor.Fetch parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Fetch)PARSER.parseFrom(data);
    }

    public static MysqlxCursor.Fetch parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Fetch)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCursor.Fetch parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Fetch)PARSER.parseFrom(data);
    }

    public static MysqlxCursor.Fetch parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCursor.Fetch)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCursor.Fetch parseFrom(InputStream input) throws IOException {
        return (MysqlxCursor.Fetch)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCursor.Fetch parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCursor.Fetch)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCursor.Fetch parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCursor.Fetch)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCursor.Fetch parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCursor.Fetch)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCursor.Fetch parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCursor.Fetch)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCursor.Fetch parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCursor.Fetch)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCursor.Fetch.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCursor.Fetch prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCursor.Fetch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCursor.Fetch> parser() {
        return PARSER;
    }

    public Parser<MysqlxCursor.Fetch> getParserForType() {
        return PARSER;
    }

    public MysqlxCursor.Fetch getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCursor.FetchOrBuilder {
        private int bitField0_;
        private int cursorId_;
        private long fetchRows_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Cursor_Fetch_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Cursor_Fetch_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Fetch.class, Builder.class);
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
            this.cursorId_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            this.fetchRows_ = 0L;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Cursor_Fetch_descriptor;
        }

        public MysqlxCursor.Fetch getDefaultInstanceForType() {
            return MysqlxCursor.Fetch.getDefaultInstance();
        }

        public MysqlxCursor.Fetch build() {
            MysqlxCursor.Fetch result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCursor.Fetch buildPartial() {
            MysqlxCursor.Fetch result = new MysqlxCursor.Fetch(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.cursorId_ = this.cursorId_;
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                result.fetchRows_ = this.fetchRows_;
                to_bitField0_ |= 2;
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
            if (other instanceof MysqlxCursor.Fetch) {
                return this.mergeFrom((MysqlxCursor.Fetch)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCursor.Fetch other) {
            if (other == MysqlxCursor.Fetch.getDefaultInstance()) {
                return this;
            }
            if (other.hasCursorId()) {
                this.setCursorId(other.getCursorId());
            }
            if (other.hasFetchRows()) {
                this.setFetchRows(other.getFetchRows());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasCursorId();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCursor.Fetch parsedMessage = null;
            try {
                parsedMessage = (MysqlxCursor.Fetch)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCursor.Fetch)e.getUnfinishedMessage();
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
        public boolean hasCursorId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public int getCursorId() {
            return this.cursorId_;
        }

        public Builder setCursorId(int value) {
            this.bitField0_ |= 1;
            this.cursorId_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearCursorId() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.cursorId_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasFetchRows() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public long getFetchRows() {
            return this.fetchRows_;
        }

        public Builder setFetchRows(long value) {
            this.bitField0_ |= 2;
            this.fetchRows_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearFetchRows() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.fetchRows_ = 0L;
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
