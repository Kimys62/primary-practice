/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxCrud.DropView
extends GeneratedMessageV3
implements MysqlxCrud.DropViewOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private MysqlxCrud.Collection collection_;
    public static final int IF_EXISTS_FIELD_NUMBER = 2;
    private boolean ifExists_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.DropView DEFAULT_INSTANCE = new MysqlxCrud.DropView();
    @Deprecated
    public static final Parser<MysqlxCrud.DropView> PARSER = new AbstractParser<MysqlxCrud.DropView>(){

        public MysqlxCrud.DropView parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.DropView(input, extensionRegistry);
        }
    };

    private MysqlxCrud.DropView(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.DropView() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.DropView();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.DropView(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MysqlxCrud.Collection.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                            subBuilder = this.collection_.toBuilder();
                        }
                        this.collection_ = (MysqlxCrud.Collection)input.readMessage(MysqlxCrud.Collection.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.collection_);
                            this.collection_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block11;
                    }
                    case 16: {
                        this.bitField0_ |= 2;
                        this.ifExists_ = input.readBool();
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
        return internal_static_Mysqlx_Crud_DropView_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_DropView_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.DropView.class, Builder.class);
    }

    @Override
    public boolean hasCollection() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxCrud.Collection getCollection() {
        return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
    }

    @Override
    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
    }

    @Override
    public boolean hasIfExists() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public boolean getIfExists() {
        return this.ifExists_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasCollection()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getCollection().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.ifExists_);
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
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeBoolSize((int)2, (boolean)this.ifExists_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.DropView)) {
            return super.equals(obj);
        }
        MysqlxCrud.DropView other = (MysqlxCrud.DropView)obj;
        if (this.hasCollection() != other.hasCollection()) {
            return false;
        }
        if (this.hasCollection() && !this.getCollection().equals(other.getCollection())) {
            return false;
        }
        if (this.hasIfExists() != other.hasIfExists()) {
            return false;
        }
        if (this.hasIfExists() && this.getIfExists() != other.getIfExists()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.DropView.getDescriptor().hashCode();
        if (this.hasCollection()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCollection().hashCode();
        }
        if (this.hasIfExists()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean((boolean)this.getIfExists());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.DropView parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.DropView)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.DropView parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.DropView)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.DropView parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.DropView)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.DropView parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.DropView)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.DropView parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.DropView)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.DropView parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.DropView)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.DropView parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.DropView)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.DropView parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.DropView)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.DropView parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.DropView)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.DropView parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.DropView)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.DropView parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.DropView)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.DropView parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.DropView)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.DropView.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.DropView prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.DropView getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.DropView> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.DropView> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.DropView getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.DropViewOrBuilder {
        private int bitField0_;
        private MysqlxCrud.Collection collection_;
        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
        private boolean ifExists_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_DropView_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_DropView_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.DropView.class, Builder.class);
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
                this.getCollectionFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.collectionBuilder_ == null) {
                this.collection_ = null;
            } else {
                this.collectionBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            this.ifExists_ = false;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_DropView_descriptor;
        }

        public MysqlxCrud.DropView getDefaultInstanceForType() {
            return MysqlxCrud.DropView.getDefaultInstance();
        }

        public MysqlxCrud.DropView build() {
            MysqlxCrud.DropView result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.DropView buildPartial() {
            MysqlxCrud.DropView result = new MysqlxCrud.DropView(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.collectionBuilder_ == null) {
                    result.collection_ = this.collection_;
                } else {
                    result.collection_ = (MysqlxCrud.Collection)this.collectionBuilder_.build();
                }
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                result.ifExists_ = this.ifExists_;
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
            if (other instanceof MysqlxCrud.DropView) {
                return this.mergeFrom((MysqlxCrud.DropView)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.DropView other) {
            if (other == MysqlxCrud.DropView.getDefaultInstance()) {
                return this;
            }
            if (other.hasCollection()) {
                this.mergeCollection(other.getCollection());
            }
            if (other.hasIfExists()) {
                this.setIfExists(other.getIfExists());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasCollection()) {
                return false;
            }
            return this.getCollection().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.DropView parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.DropView)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.DropView)e.getUnfinishedMessage();
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
        public boolean hasCollection() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public MysqlxCrud.Collection getCollection() {
            if (this.collectionBuilder_ == null) {
                return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
            }
            return (MysqlxCrud.Collection)this.collectionBuilder_.getMessage();
        }

        public Builder setCollection(MysqlxCrud.Collection value) {
            if (this.collectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.collection_ = value;
                this.onChanged();
            } else {
                this.collectionBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
            if (this.collectionBuilder_ == null) {
                this.collection_ = builderForValue.build();
                this.onChanged();
            } else {
                this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeCollection(MysqlxCrud.Collection value) {
            if (this.collectionBuilder_ == null) {
                this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.collectionBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearCollection() {
            if (this.collectionBuilder_ == null) {
                this.collection_ = null;
                this.onChanged();
            } else {
                this.collectionBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public MysqlxCrud.Collection.Builder getCollectionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxCrud.Collection.Builder)this.getCollectionFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
            if (this.collectionBuilder_ != null) {
                return (MysqlxCrud.CollectionOrBuilder)this.collectionBuilder_.getMessageOrBuilder();
            }
            return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> getCollectionFieldBuilder() {
            if (this.collectionBuilder_ == null) {
                this.collectionBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getCollection(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.collection_ = null;
            }
            return this.collectionBuilder_;
        }

        @Override
        public boolean hasIfExists() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public boolean getIfExists() {
            return this.ifExists_;
        }

        public Builder setIfExists(boolean value) {
            this.bitField0_ |= 2;
            this.ifExists_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearIfExists() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.ifExists_ = false;
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
