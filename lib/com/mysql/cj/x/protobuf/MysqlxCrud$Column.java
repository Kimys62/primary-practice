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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Column
extends GeneratedMessageV3
implements MysqlxCrud.ColumnOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    public static final int ALIAS_FIELD_NUMBER = 2;
    private volatile Object alias_;
    public static final int DOCUMENT_PATH_FIELD_NUMBER = 3;
    private List<MysqlxExpr.DocumentPathItem> documentPath_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Column DEFAULT_INSTANCE = new MysqlxCrud.Column();
    @Deprecated
    public static final Parser<MysqlxCrud.Column> PARSER = new AbstractParser<MysqlxCrud.Column>(){

        public MysqlxCrud.Column parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Column(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Column(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Column() {
        this.name_ = "";
        this.alias_ = "";
        this.documentPath_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Column();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Column(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
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
                        this.name_ = bs;
                        continue block12;
                    }
                    case 18: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.alias_ = bs;
                        continue block12;
                    }
                    case 26: {
                        if ((mutable_bitField0_ & 4) == 0) {
                            this.documentPath_ = new ArrayList<MysqlxExpr.DocumentPathItem>();
                            mutable_bitField0_ |= 4;
                        }
                        this.documentPath_.add((MysqlxExpr.DocumentPathItem)input.readMessage(MysqlxExpr.DocumentPathItem.PARSER, extensionRegistry));
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
            if ((mutable_bitField0_ & 4) != 0) {
                this.documentPath_ = Collections.unmodifiableList(this.documentPath_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Column_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Column_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Column.class, Builder.class);
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
    public boolean hasAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getAlias() {
        Object ref = this.alias_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.alias_ = s;
        }
        return s;
    }

    @Override
    public ByteString getAliasBytes() {
        Object ref = this.alias_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.alias_ = b;
            return b;
        }
        return (ByteString)ref;
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
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)2, (Object)this.alias_);
        }
        for (int i = 0; i < this.documentPath_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.documentPath_.get(i));
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
            size += GeneratedMessageV3.computeStringSize((int)2, (Object)this.alias_);
        }
        for (int i = 0; i < this.documentPath_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.documentPath_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Column)) {
            return super.equals(obj);
        }
        MysqlxCrud.Column other = (MysqlxCrud.Column)obj;
        if (this.hasName() != other.hasName()) {
            return false;
        }
        if (this.hasName() && !this.getName().equals(other.getName())) {
            return false;
        }
        if (this.hasAlias() != other.hasAlias()) {
            return false;
        }
        if (this.hasAlias() && !this.getAlias().equals(other.getAlias())) {
            return false;
        }
        if (!this.getDocumentPathList().equals(other.getDocumentPathList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Column.getDescriptor().hashCode();
        if (this.hasName()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getName().hashCode();
        }
        if (this.hasAlias()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getAlias().hashCode();
        }
        if (this.getDocumentPathCount() > 0) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getDocumentPathList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Column parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Column)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Column parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Column)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Column parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Column)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Column parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Column)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Column parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Column)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Column parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Column)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Column parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Column)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Column parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Column)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Column parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Column)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Column parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Column)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Column parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Column)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Column parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Column)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Column.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Column prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Column getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Column> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Column> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Column getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.ColumnOrBuilder {
        private int bitField0_;
        private Object name_ = "";
        private Object alias_ = "";
        private List<MysqlxExpr.DocumentPathItem> documentPath_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxExpr.DocumentPathItem, MysqlxExpr.DocumentPathItem.Builder, MysqlxExpr.DocumentPathItemOrBuilder> documentPathBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Column_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Column_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Column.class, Builder.class);
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
            this.name_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            this.alias_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.documentPathBuilder_ == null) {
                this.documentPath_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFB;
            } else {
                this.documentPathBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Column_descriptor;
        }

        public MysqlxCrud.Column getDefaultInstanceForType() {
            return MysqlxCrud.Column.getDefaultInstance();
        }

        public MysqlxCrud.Column build() {
            MysqlxCrud.Column result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Column buildPartial() {
            MysqlxCrud.Column result = new MysqlxCrud.Column(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.name_ = this.name_;
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.alias_ = this.alias_;
            if (this.documentPathBuilder_ == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.documentPath_ = Collections.unmodifiableList(this.documentPath_);
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.documentPath_ = this.documentPath_;
            } else {
                result.documentPath_ = this.documentPathBuilder_.build();
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
            if (other instanceof MysqlxCrud.Column) {
                return this.mergeFrom((MysqlxCrud.Column)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Column other) {
            if (other == MysqlxCrud.Column.getDefaultInstance()) {
                return this;
            }
            if (other.hasName()) {
                this.bitField0_ |= 1;
                this.name_ = other.name_;
                this.onChanged();
            }
            if (other.hasAlias()) {
                this.bitField0_ |= 2;
                this.alias_ = other.alias_;
                this.onChanged();
            }
            if (this.documentPathBuilder_ == null) {
                if (!other.documentPath_.isEmpty()) {
                    if (this.documentPath_.isEmpty()) {
                        this.documentPath_ = other.documentPath_;
                        this.bitField0_ &= 0xFFFFFFFB;
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
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.documentPathBuilder_ = alwaysUseFieldBuilders ? this.getDocumentPathFieldBuilder() : null;
                } else {
                    this.documentPathBuilder_.addAllMessages((Iterable)other.documentPath_);
                }
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
            MysqlxCrud.Column parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Column)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Column)e.getUnfinishedMessage();
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
            this.name_ = MysqlxCrud.Column.getDefaultInstance().getName();
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
        public boolean hasAlias() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getAlias() {
            Object ref = this.alias_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.alias_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getAliasBytes() {
            Object ref = this.alias_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.alias_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setAlias(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.alias_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearAlias() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.alias_ = MysqlxCrud.Column.getDefaultInstance().getAlias();
            this.onChanged();
            return this;
        }

        public Builder setAliasBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.alias_ = value;
            this.onChanged();
            return this;
        }

        private void ensureDocumentPathIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.documentPath_ = new ArrayList<MysqlxExpr.DocumentPathItem>(this.documentPath_);
                this.bitField0_ |= 4;
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
                this.bitField0_ &= 0xFFFFFFFB;
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
                this.documentPathBuilder_ = new RepeatedFieldBuilderV3(this.documentPath_, (this.bitField0_ & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.documentPath_ = null;
            }
            return this.documentPathBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
