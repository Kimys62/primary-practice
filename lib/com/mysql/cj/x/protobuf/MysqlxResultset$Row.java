/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite$Builder
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

import com.google.protobuf.AbstractMessageLite;
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
import com.mysql.cj.x.protobuf.MysqlxResultset;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxResultset.Row
extends GeneratedMessageV3
implements MysqlxResultset.RowOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int FIELD_FIELD_NUMBER = 1;
    private List<ByteString> field_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxResultset.Row DEFAULT_INSTANCE = new MysqlxResultset.Row();
    @Deprecated
    public static final Parser<MysqlxResultset.Row> PARSER = new AbstractParser<MysqlxResultset.Row>(){

        public MysqlxResultset.Row parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxResultset.Row(input, extensionRegistry);
        }
    };

    private MysqlxResultset.Row(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxResultset.Row() {
        this.field_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxResultset.Row();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxResultset.Row(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if (!(mutable_bitField0_ & true)) {
                            this.field_ = new ArrayList<ByteString>();
                            mutable_bitField0_ |= true;
                        }
                        this.field_.add(input.readBytes());
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
            if (mutable_bitField0_ & true) {
                this.field_ = Collections.unmodifiableList(this.field_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_Row_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_Row_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.Row.class, Builder.class);
    }

    @Override
    public List<ByteString> getFieldList() {
        return this.field_;
    }

    @Override
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override
    public ByteString getField(int index) {
        return this.field_.get(index);
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
        for (int i = 0; i < this.field_.size(); ++i) {
            output.writeBytes(1, this.field_.get(i));
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        int dataSize = 0;
        for (int i = 0; i < this.field_.size(); ++i) {
            dataSize += CodedOutputStream.computeBytesSizeNoTag((ByteString)this.field_.get(i));
        }
        size += dataSize;
        size += 1 * this.getFieldList().size();
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxResultset.Row)) {
            return super.equals(obj);
        }
        MysqlxResultset.Row other = (MysqlxResultset.Row)obj;
        if (!this.getFieldList().equals(other.getFieldList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxResultset.Row.getDescriptor().hashCode();
        if (this.getFieldCount() > 0) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFieldList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxResultset.Row parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxResultset.Row)PARSER.parseFrom(data);
    }

    public static MysqlxResultset.Row parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxResultset.Row)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxResultset.Row parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxResultset.Row)PARSER.parseFrom(data);
    }

    public static MysqlxResultset.Row parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxResultset.Row)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxResultset.Row parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxResultset.Row)PARSER.parseFrom(data);
    }

    public static MysqlxResultset.Row parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxResultset.Row)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxResultset.Row parseFrom(InputStream input) throws IOException {
        return (MysqlxResultset.Row)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxResultset.Row parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxResultset.Row)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxResultset.Row parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxResultset.Row)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxResultset.Row parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxResultset.Row)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxResultset.Row parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxResultset.Row)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxResultset.Row parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxResultset.Row)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxResultset.Row.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxResultset.Row prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxResultset.Row getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxResultset.Row> parser() {
        return PARSER;
    }

    public Parser<MysqlxResultset.Row> getParserForType() {
        return PARSER;
    }

    public MysqlxResultset.Row getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxResultset.RowOrBuilder {
        private int bitField0_;
        private List<ByteString> field_ = Collections.emptyList();

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Resultset_Row_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Resultset_Row_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.Row.class, Builder.class);
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
            this.field_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Resultset_Row_descriptor;
        }

        public MysqlxResultset.Row getDefaultInstanceForType() {
            return MysqlxResultset.Row.getDefaultInstance();
        }

        public MysqlxResultset.Row build() {
            MysqlxResultset.Row result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxResultset.Row buildPartial() {
            MysqlxResultset.Row result = new MysqlxResultset.Row(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
                this.field_ = Collections.unmodifiableList(this.field_);
                this.bitField0_ &= 0xFFFFFFFE;
            }
            result.field_ = this.field_;
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
            if (other instanceof MysqlxResultset.Row) {
                return this.mergeFrom((MysqlxResultset.Row)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxResultset.Row other) {
            if (other == MysqlxResultset.Row.getDefaultInstance()) {
                return this;
            }
            if (!other.field_.isEmpty()) {
                if (this.field_.isEmpty()) {
                    this.field_ = other.field_;
                    this.bitField0_ &= 0xFFFFFFFE;
                } else {
                    this.ensureFieldIsMutable();
                    this.field_.addAll(other.field_);
                }
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
            MysqlxResultset.Row parsedMessage = null;
            try {
                parsedMessage = (MysqlxResultset.Row)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxResultset.Row)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureFieldIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.field_ = new ArrayList<ByteString>(this.field_);
                this.bitField0_ |= 1;
            }
        }

        @Override
        public List<ByteString> getFieldList() {
            return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.field_) : this.field_;
        }

        @Override
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override
        public ByteString getField(int index) {
            return this.field_.get(index);
        }

        public Builder setField(int index, ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFieldIsMutable();
            this.field_.set(index, value);
            this.onChanged();
            return this;
        }

        public Builder addField(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFieldIsMutable();
            this.field_.add(value);
            this.onChanged();
            return this;
        }

        public Builder addAllField(Iterable<? extends ByteString> values) {
            this.ensureFieldIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.field_);
            this.onChanged();
            return this;
        }

        public Builder clearField() {
            this.field_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
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
