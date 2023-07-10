/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.ColumnIdentifier
extends GeneratedMessageV3
implements MysqlxExpr.ColumnIdentifierOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int DOCUMENT_PATH_FIELD_NUMBER = 1;
    private List<MysqlxExpr.DocumentPathItem> documentPath_;
    public static final int NAME_FIELD_NUMBER = 2;
    private volatile Object name_;
    public static final int TABLE_NAME_FIELD_NUMBER = 3;
    private volatile Object tableName_;
    public static final int SCHEMA_NAME_FIELD_NUMBER = 4;
    private volatile Object schemaName_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpr.ColumnIdentifier DEFAULT_INSTANCE = new MysqlxExpr.ColumnIdentifier();
    @Deprecated
    public static final Parser<MysqlxExpr.ColumnIdentifier> PARSER = new AbstractParser<MysqlxExpr.ColumnIdentifier>(){

        public MysqlxExpr.ColumnIdentifier parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpr.ColumnIdentifier(input, extensionRegistry);
        }
    };

    private MysqlxExpr.ColumnIdentifier(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpr.ColumnIdentifier() {
        this.documentPath_ = Collections.emptyList();
        this.name_ = "";
        this.tableName_ = "";
        this.schemaName_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpr.ColumnIdentifier();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpr.ColumnIdentifier(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block13: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block13;
                    }
                    case 10: {
                        if (!(mutable_bitField0_ & true)) {
                            this.documentPath_ = new ArrayList<MysqlxExpr.DocumentPathItem>();
                            mutable_bitField0_ |= true;
                        }
                        this.documentPath_.add((MysqlxExpr.DocumentPathItem)input.readMessage(MysqlxExpr.DocumentPathItem.PARSER, extensionRegistry));
                        continue block13;
                    }
                    case 18: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.name_ = bs;
                        continue block13;
                    }
                    case 26: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.tableName_ = bs;
                        continue block13;
                    }
                    case 34: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.schemaName_ = bs;
                        continue block13;
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
                this.documentPath_ = Collections.unmodifiableList(this.documentPath_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_ColumnIdentifier_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_ColumnIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.ColumnIdentifier.class, Builder.class);
    }

    @Override
    public List<MysqlxExpr.DocumentPathItem> getDocumentPathList() {
        return this.documentPath_;
    }

    @Override
    public List<? extends MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathOrBuilderList() {
        return this.documentPath_;
    }

    @Override
    public int getDocumentPathCount() {
        return this.documentPath_.size();
    }

    @Override
    public MysqlxExpr.DocumentPathItem getDocumentPath(int index) {
        return this.documentPath_.get(index);
    }

    @Override
    public MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(int index) {
        return this.documentPath_.get(index);
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
    public boolean hasTableName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getTableName() {
        Object ref = this.tableName_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.tableName_ = s;
        }
        return s;
    }

    @Override
    public ByteString getTableNameBytes() {
        Object ref = this.tableName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.tableName_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    @Override
    public boolean hasSchemaName() {
        return (this.bitField0_ & 4) != 0;
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
        for (int i = 0; i < this.getDocumentPathCount(); ++i) {
            if (this.getDocumentPath(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i = 0; i < this.documentPath_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.documentPath_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)2, (Object)this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)3, (Object)this.tableName_);
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)4, (Object)this.schemaName_);
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        for (int i = 0; i < this.documentPath_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.documentPath_.get(i)));
        }
        if ((this.bitField0_ & 1) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)2, (Object)this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)3, (Object)this.tableName_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)4, (Object)this.schemaName_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpr.ColumnIdentifier)) {
            return super.equals(obj);
        }
        MysqlxExpr.ColumnIdentifier other = (MysqlxExpr.ColumnIdentifier)obj;
        if (!this.getDocumentPathList().equals(other.getDocumentPathList())) {
            return false;
        }
        if (this.hasName() != other.hasName()) {
            return false;
        }
        if (this.hasName() && !this.getName().equals(other.getName())) {
            return false;
        }
        if (this.hasTableName() != other.hasTableName()) {
            return false;
        }
        if (this.hasTableName() && !this.getTableName().equals(other.getTableName())) {
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
        hash = 19 * hash + MysqlxExpr.ColumnIdentifier.getDescriptor().hashCode();
        if (this.getDocumentPathCount() > 0) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getDocumentPathList().hashCode();
        }
        if (this.hasName()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getName().hashCode();
        }
        if (this.hasTableName()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getTableName().hashCode();
        }
        if (this.hasSchemaName()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getSchemaName().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.ColumnIdentifier)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.ColumnIdentifier)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.ColumnIdentifier)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.ColumnIdentifier)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.ColumnIdentifier)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.ColumnIdentifier)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(InputStream input) throws IOException {
        return (MysqlxExpr.ColumnIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.ColumnIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.ColumnIdentifier parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpr.ColumnIdentifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.ColumnIdentifier parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.ColumnIdentifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpr.ColumnIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpr.ColumnIdentifier parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.ColumnIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpr.ColumnIdentifier.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpr.ColumnIdentifier prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpr.ColumnIdentifier getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpr.ColumnIdentifier> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpr.ColumnIdentifier> getParserForType() {
        return PARSER;
    }

    public MysqlxExpr.ColumnIdentifier getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxExpr.ColumnIdentifierOrBuilder {
        private int bitField0_;
        private List<MysqlxExpr.DocumentPathItem> documentPath_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxExpr.DocumentPathItem, MysqlxExpr.DocumentPathItem.Builder, MysqlxExpr.DocumentPathItemOrBuilder> documentPathBuilder_;
        private Object name_ = "";
        private Object tableName_ = "";
        private Object schemaName_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expr_ColumnIdentifier_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expr_ColumnIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.ColumnIdentifier.class, Builder.class);
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
                this.getDocumentPathFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.documentPathBuilder_ == null) {
                this.documentPath_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
            } else {
                this.documentPathBuilder_.clear();
            }
            this.name_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            this.tableName_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            this.schemaName_ = "";
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Expr_ColumnIdentifier_descriptor;
        }

        public MysqlxExpr.ColumnIdentifier getDefaultInstanceForType() {
            return MysqlxExpr.ColumnIdentifier.getDefaultInstance();
        }

        public MysqlxExpr.ColumnIdentifier build() {
            MysqlxExpr.ColumnIdentifier result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpr.ColumnIdentifier buildPartial() {
            MysqlxExpr.ColumnIdentifier result = new MysqlxExpr.ColumnIdentifier(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.documentPathBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.documentPath_ = Collections.unmodifiableList(this.documentPath_);
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.documentPath_ = this.documentPath_;
            } else {
                result.documentPath_ = this.documentPathBuilder_.build();
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 1;
            }
            result.name_ = this.name_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 2;
            }
            result.tableName_ = this.tableName_;
            if ((from_bitField0_ & 8) != 0) {
                to_bitField0_ |= 4;
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
            if (other instanceof MysqlxExpr.ColumnIdentifier) {
                return this.mergeFrom((MysqlxExpr.ColumnIdentifier)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpr.ColumnIdentifier other) {
            if (other == MysqlxExpr.ColumnIdentifier.getDefaultInstance()) {
                return this;
            }
            if (this.documentPathBuilder_ == null) {
                if (!other.documentPath_.isEmpty()) {
                    if (this.documentPath_.isEmpty()) {
                        this.documentPath_ = other.documentPath_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    } else {
                        this.ensureDocumentPathIsMutable();
                        this.documentPath_.addAll(other.documentPath_);
                    }
                    this.onChanged();
                }
            } else if (!other.documentPath_.isEmpty()) {
                if (this.documentPathBuilder_.isEmpty()) {
                    this.documentPathBuilder_.dispose();
                    this.documentPathBuilder_ = null;
                    this.documentPath_ = other.documentPath_;
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.documentPathBuilder_ = alwaysUseFieldBuilders ? this.getDocumentPathFieldBuilder() : null;
                } else {
                    this.documentPathBuilder_.addAllMessages((Iterable)other.documentPath_);
                }
            }
            if (other.hasName()) {
                this.bitField0_ |= 2;
                this.name_ = other.name_;
                this.onChanged();
            }
            if (other.hasTableName()) {
                this.bitField0_ |= 4;
                this.tableName_ = other.tableName_;
                this.onChanged();
            }
            if (other.hasSchemaName()) {
                this.bitField0_ |= 8;
                this.schemaName_ = other.schemaName_;
                this.onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < this.getDocumentPathCount(); ++i) {
                if (this.getDocumentPath(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxExpr.ColumnIdentifier parsedMessage = null;
            try {
                parsedMessage = (MysqlxExpr.ColumnIdentifier)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxExpr.ColumnIdentifier)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureDocumentPathIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.documentPath_ = new ArrayList<MysqlxExpr.DocumentPathItem>(this.documentPath_);
                this.bitField0_ |= 1;
            }
        }

        @Override
        public List<MysqlxExpr.DocumentPathItem> getDocumentPathList() {
            if (this.documentPathBuilder_ == null) {
                return Collections.unmodifiableList(this.documentPath_);
            }
            return this.documentPathBuilder_.getMessageList();
        }

        @Override
        public int getDocumentPathCount() {
            if (this.documentPathBuilder_ == null) {
                return this.documentPath_.size();
            }
            return this.documentPathBuilder_.getCount();
        }

        @Override
        public MysqlxExpr.DocumentPathItem getDocumentPath(int index) {
            if (this.documentPathBuilder_ == null) {
                return this.documentPath_.get(index);
            }
            return (MysqlxExpr.DocumentPathItem)this.documentPathBuilder_.getMessage(index);
        }

        public Builder setDocumentPath(int index, MysqlxExpr.DocumentPathItem value) {
            if (this.documentPathBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureDocumentPathIsMutable();
                this.documentPath_.set(index, value);
                this.onChanged();
            } else {
                this.documentPathBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setDocumentPath(int index, MysqlxExpr.DocumentPathItem.Builder builderForValue) {
            if (this.documentPathBuilder_ == null) {
                this.ensureDocumentPathIsMutable();
                this.documentPath_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.documentPathBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addDocumentPath(MysqlxExpr.DocumentPathItem value) {
            if (this.documentPathBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureDocumentPathIsMutable();
                this.documentPath_.add(value);
                this.onChanged();
            } else {
                this.documentPathBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addDocumentPath(int index, MysqlxExpr.DocumentPathItem value) {
            if (this.documentPathBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureDocumentPathIsMutable();
                this.documentPath_.add(index, value);
                this.onChanged();
            } else {
                this.documentPathBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addDocumentPath(MysqlxExpr.DocumentPathItem.Builder builderForValue) {
            if (this.documentPathBuilder_ == null) {
                this.ensureDocumentPathIsMutable();
                this.documentPath_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.documentPathBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addDocumentPath(int index, MysqlxExpr.DocumentPathItem.Builder builderForValue) {
            if (this.documentPathBuilder_ == null) {
                this.ensureDocumentPathIsMutable();
                this.documentPath_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.documentPathBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllDocumentPath(Iterable<? extends MysqlxExpr.DocumentPathItem> values) {
            if (this.documentPathBuilder_ == null) {
                this.ensureDocumentPathIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.documentPath_);
                this.onChanged();
            } else {
                this.documentPathBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearDocumentPath() {
            if (this.documentPathBuilder_ == null) {
                this.documentPath_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
            } else {
                this.documentPathBuilder_.clear();
            }
            return this;
        }

        public Builder removeDocumentPath(int index) {
            if (this.documentPathBuilder_ == null) {
                this.ensureDocumentPathIsMutable();
                this.documentPath_.remove(index);
                this.onChanged();
            } else {
                this.documentPathBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxExpr.DocumentPathItem.Builder getDocumentPathBuilder(int index) {
            return (MysqlxExpr.DocumentPathItem.Builder)this.getDocumentPathFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(int index) {
            if (this.documentPathBuilder_ == null) {
                return this.documentPath_.get(index);
            }
            return (MysqlxExpr.DocumentPathItemOrBuilder)this.documentPathBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathOrBuilderList() {
            if (this.documentPathBuilder_ != null) {
                return this.documentPathBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.documentPath_);
        }

        public MysqlxExpr.DocumentPathItem.Builder addDocumentPathBuilder() {
            return (MysqlxExpr.DocumentPathItem.Builder)this.getDocumentPathFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.DocumentPathItem.getDefaultInstance());
        }

        public MysqlxExpr.DocumentPathItem.Builder addDocumentPathBuilder(int index) {
            return (MysqlxExpr.DocumentPathItem.Builder)this.getDocumentPathFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.DocumentPathItem.getDefaultInstance());
        }

        public List<MysqlxExpr.DocumentPathItem.Builder> getDocumentPathBuilderList() {
            return this.getDocumentPathFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxExpr.DocumentPathItem, MysqlxExpr.DocumentPathItem.Builder, MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathFieldBuilder() {
            if (this.documentPathBuilder_ == null) {
                this.documentPathBuilder_ = new RepeatedFieldBuilderV3(this.documentPath_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.documentPath_ = null;
            }
            return this.documentPathBuilder_;
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
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
            this.bitField0_ |= 2;
            this.name_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearName() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.name_ = MysqlxExpr.ColumnIdentifier.getDefaultInstance().getName();
            this.onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.name_ = value;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasTableName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public String getTableName() {
            Object ref = this.tableName_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.tableName_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getTableNameBytes() {
            Object ref = this.tableName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.tableName_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setTableName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.tableName_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearTableName() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.tableName_ = MysqlxExpr.ColumnIdentifier.getDefaultInstance().getTableName();
            this.onChanged();
            return this;
        }

        public Builder setTableNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.tableName_ = value;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasSchemaName() {
            return (this.bitField0_ & 8) != 0;
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
            this.bitField0_ |= 8;
            this.schemaName_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearSchemaName() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.schemaName_ = MysqlxExpr.ColumnIdentifier.getDefaultInstance().getSchemaName();
            this.onChanged();
            return this;
        }

        public Builder setSchemaNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 8;
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
