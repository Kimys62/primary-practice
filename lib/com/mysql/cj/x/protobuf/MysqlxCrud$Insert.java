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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageOrBuilder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Insert
extends GeneratedMessageV3
implements MysqlxCrud.InsertOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private MysqlxCrud.Collection collection_;
    public static final int DATA_MODEL_FIELD_NUMBER = 2;
    private int dataModel_;
    public static final int PROJECTION_FIELD_NUMBER = 3;
    private List<MysqlxCrud.Column> projection_;
    public static final int ROW_FIELD_NUMBER = 4;
    private List<TypedRow> row_;
    public static final int ARGS_FIELD_NUMBER = 5;
    private List<MysqlxDatatypes.Scalar> args_;
    public static final int UPSERT_FIELD_NUMBER = 6;
    private boolean upsert_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Insert DEFAULT_INSTANCE = new MysqlxCrud.Insert();
    @Deprecated
    public static final Parser<MysqlxCrud.Insert> PARSER = new AbstractParser<MysqlxCrud.Insert>(){

        public MysqlxCrud.Insert parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Insert(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Insert(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Insert() {
        this.dataModel_ = 1;
        this.projection_ = Collections.emptyList();
        this.row_ = Collections.emptyList();
        this.args_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Insert();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Insert(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block15: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block15;
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
                        continue block15;
                    }
                    case 16: {
                        int rawValue = input.readEnum();
                        MysqlxCrud.DataModel value = MysqlxCrud.DataModel.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(2, rawValue);
                            continue block15;
                        }
                        this.bitField0_ |= 2;
                        this.dataModel_ = rawValue;
                        continue block15;
                    }
                    case 26: {
                        if ((mutable_bitField0_ & 4) == 0) {
                            this.projection_ = new ArrayList<MysqlxCrud.Column>();
                            mutable_bitField0_ |= 4;
                        }
                        this.projection_.add((MysqlxCrud.Column)input.readMessage(MysqlxCrud.Column.PARSER, extensionRegistry));
                        continue block15;
                    }
                    case 34: {
                        if ((mutable_bitField0_ & 8) == 0) {
                            this.row_ = new ArrayList<TypedRow>();
                            mutable_bitField0_ |= 8;
                        }
                        this.row_.add((TypedRow)input.readMessage(TypedRow.PARSER, extensionRegistry));
                        continue block15;
                    }
                    case 42: {
                        if ((mutable_bitField0_ & 0x10) == 0) {
                            this.args_ = new ArrayList<MysqlxDatatypes.Scalar>();
                            mutable_bitField0_ |= 0x10;
                        }
                        this.args_.add((MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry));
                        continue block15;
                    }
                    case 48: {
                        this.bitField0_ |= 4;
                        this.upsert_ = input.readBool();
                        continue block15;
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
                this.projection_ = Collections.unmodifiableList(this.projection_);
            }
            if ((mutable_bitField0_ & 8) != 0) {
                this.row_ = Collections.unmodifiableList(this.row_);
            }
            if ((mutable_bitField0_ & 0x10) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Insert_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Insert_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Insert.class, Builder.class);
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
    public boolean hasDataModel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.DataModel getDataModel() {
        MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
        return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
    }

    @Override
    public List<MysqlxCrud.Column> getProjectionList() {
        return this.projection_;
    }

    @Override
    public List<? extends MysqlxCrud.ColumnOrBuilder> getProjectionOrBuilderList() {
        return this.projection_;
    }

    @Override
    public int getProjectionCount() {
        return this.projection_.size();
    }

    @Override
    public MysqlxCrud.Column getProjection(int index) {
        return this.projection_.get(index);
    }

    @Override
    public MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(int index) {
        return this.projection_.get(index);
    }

    @Override
    public List<TypedRow> getRowList() {
        return this.row_;
    }

    @Override
    public List<? extends TypedRowOrBuilder> getRowOrBuilderList() {
        return this.row_;
    }

    @Override
    public int getRowCount() {
        return this.row_.size();
    }

    @Override
    public TypedRow getRow(int index) {
        return this.row_.get(index);
    }

    @Override
    public TypedRowOrBuilder getRowOrBuilder(int index) {
        return this.row_.get(index);
    }

    @Override
    public List<MysqlxDatatypes.Scalar> getArgsList() {
        return this.args_;
    }

    @Override
    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
        return this.args_;
    }

    @Override
    public int getArgsCount() {
        return this.args_.size();
    }

    @Override
    public MysqlxDatatypes.Scalar getArgs(int index) {
        return this.args_.get(index);
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
        return this.args_.get(index);
    }

    @Override
    public boolean hasUpsert() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public boolean getUpsert() {
        return this.upsert_;
    }

    public final boolean isInitialized() {
        int i;
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
        for (i = 0; i < this.getProjectionCount(); ++i) {
            if (this.getProjection(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getRowCount(); ++i) {
            if (this.getRow(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        int i;
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.dataModel_);
        }
        for (i = 0; i < this.projection_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.projection_.get(i));
        }
        for (i = 0; i < this.row_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.row_.get(i));
        }
        for (i = 0; i < this.args_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.args_.get(i));
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeBool(6, this.upsert_);
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int i;
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if ((this.bitField0_ & 1) != 0) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)2, (int)this.dataModel_);
        }
        for (i = 0; i < this.projection_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.projection_.get(i)));
        }
        for (i = 0; i < this.row_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.row_.get(i)));
        }
        for (i = 0; i < this.args_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.args_.get(i)));
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeBoolSize((int)6, (boolean)this.upsert_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Insert)) {
            return super.equals(obj);
        }
        MysqlxCrud.Insert other = (MysqlxCrud.Insert)obj;
        if (this.hasCollection() != other.hasCollection()) {
            return false;
        }
        if (this.hasCollection() && !this.getCollection().equals(other.getCollection())) {
            return false;
        }
        if (this.hasDataModel() != other.hasDataModel()) {
            return false;
        }
        if (this.hasDataModel() && this.dataModel_ != other.dataModel_) {
            return false;
        }
        if (!this.getProjectionList().equals(other.getProjectionList())) {
            return false;
        }
        if (!this.getRowList().equals(other.getRowList())) {
            return false;
        }
        if (!this.getArgsList().equals(other.getArgsList())) {
            return false;
        }
        if (this.hasUpsert() != other.hasUpsert()) {
            return false;
        }
        if (this.hasUpsert() && this.getUpsert() != other.getUpsert()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Insert.getDescriptor().hashCode();
        if (this.hasCollection()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCollection().hashCode();
        }
        if (this.hasDataModel()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.dataModel_;
        }
        if (this.getProjectionCount() > 0) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getProjectionList().hashCode();
        }
        if (this.getRowCount() > 0) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRowList().hashCode();
        }
        if (this.getArgsCount() > 0) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getArgsList().hashCode();
        }
        if (this.hasUpsert()) {
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean((boolean)this.getUpsert());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Insert parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Insert parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Insert parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Insert parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Insert parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Insert parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Insert parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Insert)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Insert parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Insert)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Insert parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Insert)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Insert parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Insert)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Insert parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Insert)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Insert parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Insert)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Insert.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Insert prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Insert getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Insert> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Insert> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Insert getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.InsertOrBuilder {
        private int bitField0_;
        private MysqlxCrud.Collection collection_;
        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
        private int dataModel_ = 1;
        private List<MysqlxCrud.Column> projection_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxCrud.Column, MysqlxCrud.Column.Builder, MysqlxCrud.ColumnOrBuilder> projectionBuilder_;
        private List<TypedRow> row_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<TypedRow, TypedRow.Builder, TypedRowOrBuilder> rowBuilder_;
        private List<MysqlxDatatypes.Scalar> args_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;
        private boolean upsert_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Insert_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Insert_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Insert.class, Builder.class);
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
                this.getProjectionFieldBuilder();
                this.getRowFieldBuilder();
                this.getArgsFieldBuilder();
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
            this.dataModel_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.projectionBuilder_ == null) {
                this.projection_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFB;
            } else {
                this.projectionBuilder_.clear();
            }
            if (this.rowBuilder_ == null) {
                this.row_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFF7;
            } else {
                this.rowBuilder_.clear();
            }
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFEF;
            } else {
                this.argsBuilder_.clear();
            }
            this.upsert_ = false;
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Insert_descriptor;
        }

        public MysqlxCrud.Insert getDefaultInstanceForType() {
            return MysqlxCrud.Insert.getDefaultInstance();
        }

        public MysqlxCrud.Insert build() {
            MysqlxCrud.Insert result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Insert buildPartial() {
            MysqlxCrud.Insert result = new MysqlxCrud.Insert(this);
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
                to_bitField0_ |= 2;
            }
            result.dataModel_ = this.dataModel_;
            if (this.projectionBuilder_ == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.projection_ = Collections.unmodifiableList(this.projection_);
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.projection_ = this.projection_;
            } else {
                result.projection_ = this.projectionBuilder_.build();
            }
            if (this.rowBuilder_ == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.row_ = Collections.unmodifiableList(this.row_);
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.row_ = this.row_;
            } else {
                result.row_ = this.rowBuilder_.build();
            }
            if (this.argsBuilder_ == null) {
                if ((this.bitField0_ & 0x10) != 0) {
                    this.args_ = Collections.unmodifiableList(this.args_);
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.args_ = this.args_;
            } else {
                result.args_ = this.argsBuilder_.build();
            }
            if ((from_bitField0_ & 0x20) != 0) {
                result.upsert_ = this.upsert_;
                to_bitField0_ |= 4;
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
            if (other instanceof MysqlxCrud.Insert) {
                return this.mergeFrom((MysqlxCrud.Insert)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Insert other) {
            if (other == MysqlxCrud.Insert.getDefaultInstance()) {
                return this;
            }
            if (other.hasCollection()) {
                this.mergeCollection(other.getCollection());
            }
            if (other.hasDataModel()) {
                this.setDataModel(other.getDataModel());
            }
            if (this.projectionBuilder_ == null) {
                if (!other.projection_.isEmpty()) {
                    if (this.projection_.isEmpty()) {
                        this.projection_ = other.projection_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    } else {
                        this.ensureProjectionIsMutable();
                        this.projection_.addAll(other.projection_);
                    }
                    this.onChanged();
                }
            } else if (!other.projection_.isEmpty()) {
                if (this.projectionBuilder_.isEmpty()) {
                    this.projectionBuilder_.dispose();
                    this.projectionBuilder_ = null;
                    this.projection_ = other.projection_;
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.projectionBuilder_ = alwaysUseFieldBuilders ? this.getProjectionFieldBuilder() : null;
                } else {
                    this.projectionBuilder_.addAllMessages((Iterable)other.projection_);
                }
            }
            if (this.rowBuilder_ == null) {
                if (!other.row_.isEmpty()) {
                    if (this.row_.isEmpty()) {
                        this.row_ = other.row_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    } else {
                        this.ensureRowIsMutable();
                        this.row_.addAll(other.row_);
                    }
                    this.onChanged();
                }
            } else if (!other.row_.isEmpty()) {
                if (this.rowBuilder_.isEmpty()) {
                    this.rowBuilder_.dispose();
                    this.rowBuilder_ = null;
                    this.row_ = other.row_;
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.rowBuilder_ = alwaysUseFieldBuilders ? this.getRowFieldBuilder() : null;
                } else {
                    this.rowBuilder_.addAllMessages((Iterable)other.row_);
                }
            }
            if (this.argsBuilder_ == null) {
                if (!other.args_.isEmpty()) {
                    if (this.args_.isEmpty()) {
                        this.args_ = other.args_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    } else {
                        this.ensureArgsIsMutable();
                        this.args_.addAll(other.args_);
                    }
                    this.onChanged();
                }
            } else if (!other.args_.isEmpty()) {
                if (this.argsBuilder_.isEmpty()) {
                    this.argsBuilder_.dispose();
                    this.argsBuilder_ = null;
                    this.args_ = other.args_;
                    this.bitField0_ &= 0xFFFFFFEF;
                    this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
                } else {
                    this.argsBuilder_.addAllMessages((Iterable)other.args_);
                }
            }
            if (other.hasUpsert()) {
                this.setUpsert(other.getUpsert());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            int i;
            if (!this.hasCollection()) {
                return false;
            }
            if (!this.getCollection().isInitialized()) {
                return false;
            }
            for (i = 0; i < this.getProjectionCount(); ++i) {
                if (this.getProjection(i).isInitialized()) continue;
                return false;
            }
            for (i = 0; i < this.getRowCount(); ++i) {
                if (this.getRow(i).isInitialized()) continue;
                return false;
            }
            for (i = 0; i < this.getArgsCount(); ++i) {
                if (this.getArgs(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Insert parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Insert)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Insert)e.getUnfinishedMessage();
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
        public boolean hasDataModel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxCrud.DataModel getDataModel() {
            MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
            return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
        }

        public Builder setDataModel(MysqlxCrud.DataModel value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.dataModel_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearDataModel() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.dataModel_ = 1;
            this.onChanged();
            return this;
        }

        private void ensureProjectionIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.projection_ = new ArrayList<MysqlxCrud.Column>(this.projection_);
                this.bitField0_ |= 4;
            }
        }

        @Override
        public List<MysqlxCrud.Column> getProjectionList() {
            if (this.projectionBuilder_ == null) {
                return Collections.unmodifiableList(this.projection_);
            }
            return this.projectionBuilder_.getMessageList();
        }

        @Override
        public int getProjectionCount() {
            if (this.projectionBuilder_ == null) {
                return this.projection_.size();
            }
            return this.projectionBuilder_.getCount();
        }

        @Override
        public MysqlxCrud.Column getProjection(int index) {
            if (this.projectionBuilder_ == null) {
                return this.projection_.get(index);
            }
            return (MysqlxCrud.Column)this.projectionBuilder_.getMessage(index);
        }

        public Builder setProjection(int index, MysqlxCrud.Column value) {
            if (this.projectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureProjectionIsMutable();
                this.projection_.set(index, value);
                this.onChanged();
            } else {
                this.projectionBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setProjection(int index, MysqlxCrud.Column.Builder builderForValue) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.projectionBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addProjection(MysqlxCrud.Column value) {
            if (this.projectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureProjectionIsMutable();
                this.projection_.add(value);
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addProjection(int index, MysqlxCrud.Column value) {
            if (this.projectionBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureProjectionIsMutable();
                this.projection_.add(index, value);
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addProjection(MysqlxCrud.Column.Builder builderForValue) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addProjection(int index, MysqlxCrud.Column.Builder builderForValue) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.projectionBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllProjection(Iterable<? extends MysqlxCrud.Column> values) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.projection_);
                this.onChanged();
            } else {
                this.projectionBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearProjection() {
            if (this.projectionBuilder_ == null) {
                this.projection_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
            } else {
                this.projectionBuilder_.clear();
            }
            return this;
        }

        public Builder removeProjection(int index) {
            if (this.projectionBuilder_ == null) {
                this.ensureProjectionIsMutable();
                this.projection_.remove(index);
                this.onChanged();
            } else {
                this.projectionBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxCrud.Column.Builder getProjectionBuilder(int index) {
            return (MysqlxCrud.Column.Builder)this.getProjectionFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(int index) {
            if (this.projectionBuilder_ == null) {
                return this.projection_.get(index);
            }
            return (MysqlxCrud.ColumnOrBuilder)this.projectionBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxCrud.ColumnOrBuilder> getProjectionOrBuilderList() {
            if (this.projectionBuilder_ != null) {
                return this.projectionBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.projection_);
        }

        public MysqlxCrud.Column.Builder addProjectionBuilder() {
            return (MysqlxCrud.Column.Builder)this.getProjectionFieldBuilder().addBuilder((AbstractMessage)MysqlxCrud.Column.getDefaultInstance());
        }

        public MysqlxCrud.Column.Builder addProjectionBuilder(int index) {
            return (MysqlxCrud.Column.Builder)this.getProjectionFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxCrud.Column.getDefaultInstance());
        }

        public List<MysqlxCrud.Column.Builder> getProjectionBuilderList() {
            return this.getProjectionFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxCrud.Column, MysqlxCrud.Column.Builder, MysqlxCrud.ColumnOrBuilder> getProjectionFieldBuilder() {
            if (this.projectionBuilder_ == null) {
                this.projectionBuilder_ = new RepeatedFieldBuilderV3(this.projection_, (this.bitField0_ & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.projection_ = null;
            }
            return this.projectionBuilder_;
        }

        private void ensureRowIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.row_ = new ArrayList<TypedRow>(this.row_);
                this.bitField0_ |= 8;
            }
        }

        @Override
        public List<TypedRow> getRowList() {
            if (this.rowBuilder_ == null) {
                return Collections.unmodifiableList(this.row_);
            }
            return this.rowBuilder_.getMessageList();
        }

        @Override
        public int getRowCount() {
            if (this.rowBuilder_ == null) {
                return this.row_.size();
            }
            return this.rowBuilder_.getCount();
        }

        @Override
        public TypedRow getRow(int index) {
            if (this.rowBuilder_ == null) {
                return this.row_.get(index);
            }
            return (TypedRow)this.rowBuilder_.getMessage(index);
        }

        public Builder setRow(int index, TypedRow value) {
            if (this.rowBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureRowIsMutable();
                this.row_.set(index, value);
                this.onChanged();
            } else {
                this.rowBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setRow(int index, TypedRow.Builder builderForValue) {
            if (this.rowBuilder_ == null) {
                this.ensureRowIsMutable();
                this.row_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.rowBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addRow(TypedRow value) {
            if (this.rowBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureRowIsMutable();
                this.row_.add(value);
                this.onChanged();
            } else {
                this.rowBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addRow(int index, TypedRow value) {
            if (this.rowBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureRowIsMutable();
                this.row_.add(index, value);
                this.onChanged();
            } else {
                this.rowBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addRow(TypedRow.Builder builderForValue) {
            if (this.rowBuilder_ == null) {
                this.ensureRowIsMutable();
                this.row_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.rowBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addRow(int index, TypedRow.Builder builderForValue) {
            if (this.rowBuilder_ == null) {
                this.ensureRowIsMutable();
                this.row_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.rowBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllRow(Iterable<? extends TypedRow> values) {
            if (this.rowBuilder_ == null) {
                this.ensureRowIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.row_);
                this.onChanged();
            } else {
                this.rowBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearRow() {
            if (this.rowBuilder_ == null) {
                this.row_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
            } else {
                this.rowBuilder_.clear();
            }
            return this;
        }

        public Builder removeRow(int index) {
            if (this.rowBuilder_ == null) {
                this.ensureRowIsMutable();
                this.row_.remove(index);
                this.onChanged();
            } else {
                this.rowBuilder_.remove(index);
            }
            return this;
        }

        public TypedRow.Builder getRowBuilder(int index) {
            return (TypedRow.Builder)this.getRowFieldBuilder().getBuilder(index);
        }

        @Override
        public TypedRowOrBuilder getRowOrBuilder(int index) {
            if (this.rowBuilder_ == null) {
                return this.row_.get(index);
            }
            return (TypedRowOrBuilder)this.rowBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends TypedRowOrBuilder> getRowOrBuilderList() {
            if (this.rowBuilder_ != null) {
                return this.rowBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.row_);
        }

        public TypedRow.Builder addRowBuilder() {
            return (TypedRow.Builder)this.getRowFieldBuilder().addBuilder((AbstractMessage)TypedRow.getDefaultInstance());
        }

        public TypedRow.Builder addRowBuilder(int index) {
            return (TypedRow.Builder)this.getRowFieldBuilder().addBuilder(index, (AbstractMessage)TypedRow.getDefaultInstance());
        }

        public List<TypedRow.Builder> getRowBuilderList() {
            return this.getRowFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<TypedRow, TypedRow.Builder, TypedRowOrBuilder> getRowFieldBuilder() {
            if (this.rowBuilder_ == null) {
                this.rowBuilder_ = new RepeatedFieldBuilderV3(this.row_, (this.bitField0_ & 8) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.row_ = null;
            }
            return this.rowBuilder_;
        }

        private void ensureArgsIsMutable() {
            if ((this.bitField0_ & 0x10) == 0) {
                this.args_ = new ArrayList<MysqlxDatatypes.Scalar>(this.args_);
                this.bitField0_ |= 0x10;
            }
        }

        @Override
        public List<MysqlxDatatypes.Scalar> getArgsList() {
            if (this.argsBuilder_ == null) {
                return Collections.unmodifiableList(this.args_);
            }
            return this.argsBuilder_.getMessageList();
        }

        @Override
        public int getArgsCount() {
            if (this.argsBuilder_ == null) {
                return this.args_.size();
            }
            return this.argsBuilder_.getCount();
        }

        @Override
        public MysqlxDatatypes.Scalar getArgs(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.Scalar)this.argsBuilder_.getMessage(index);
        }

        public Builder setArgs(int index, MysqlxDatatypes.Scalar value) {
            if (this.argsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgsIsMutable();
                this.args_.set(index, value);
                this.onChanged();
            } else {
                this.argsBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(MysqlxDatatypes.Scalar value) {
            if (this.argsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgsIsMutable();
                this.args_.add(value);
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addArgs(int index, MysqlxDatatypes.Scalar value) {
            if (this.argsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgsIsMutable();
                this.args_.add(index, value);
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addArgs(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Scalar> values) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.args_);
                this.onChanged();
            } else {
                this.argsBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearArgs() {
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
            } else {
                this.argsBuilder_.clear();
            }
            return this;
        }

        public Builder removeArgs(int index) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.remove(index);
                this.onChanged();
            } else {
                this.argsBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxDatatypes.Scalar.Builder getArgsBuilder(int index) {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.ScalarOrBuilder)this.argsBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
            if (this.argsBuilder_ != null) {
                return this.argsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.args_);
        }

        public MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
        }

        public MysqlxDatatypes.Scalar.Builder addArgsBuilder(int index) {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
        }

        public List<MysqlxDatatypes.Scalar.Builder> getArgsBuilderList() {
            return this.getArgsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getArgsFieldBuilder() {
            if (this.argsBuilder_ == null) {
                this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 0x10) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.args_ = null;
            }
            return this.argsBuilder_;
        }

        @Override
        public boolean hasUpsert() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public boolean getUpsert() {
            return this.upsert_;
        }

        public Builder setUpsert(boolean value) {
            this.bitField0_ |= 0x20;
            this.upsert_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearUpsert() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.upsert_ = false;
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

    public static final class TypedRow
    extends GeneratedMessageV3
    implements TypedRowOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int FIELD_FIELD_NUMBER = 1;
        private List<MysqlxExpr.Expr> field_;
        private byte memoizedIsInitialized = (byte)-1;
        private static final TypedRow DEFAULT_INSTANCE = new TypedRow();
        @Deprecated
        public static final Parser<TypedRow> PARSER = new AbstractParser<TypedRow>(){

            public TypedRow parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new TypedRow(input, extensionRegistry);
            }
        };

        private TypedRow(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TypedRow() {
            this.field_ = Collections.emptyList();
        }

        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
            return new TypedRow();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TypedRow(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.field_ = new ArrayList<MysqlxExpr.Expr>();
                                mutable_bitField0_ |= true;
                            }
                            this.field_.add((MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry));
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
            return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable.ensureFieldAccessorsInitialized(TypedRow.class, Builder.class);
        }

        @Override
        public List<MysqlxExpr.Expr> getFieldList() {
            return this.field_;
        }

        @Override
        public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList() {
            return this.field_;
        }

        @Override
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override
        public MysqlxExpr.Expr getField(int index) {
            return this.field_.get(index);
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int index) {
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
            for (int i = 0; i < this.getFieldCount(); ++i) {
                if (this.getField(i).isInitialized()) continue;
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            for (int i = 0; i < this.field_.size(); ++i) {
                output.writeMessage(1, (MessageLite)this.field_.get(i));
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (int i = 0; i < this.field_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.field_.get(i)));
            }
            this.memoizedSize = size += this.unknownFields.getSerializedSize();
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TypedRow)) {
                return super.equals(obj);
            }
            TypedRow other = (TypedRow)obj;
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
            hash = 19 * hash + TypedRow.getDescriptor().hashCode();
            if (this.getFieldCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getFieldList().hashCode();
            }
            this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
            return hash;
        }

        public static TypedRow parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TypedRow)PARSER.parseFrom(data);
        }

        public static TypedRow parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TypedRow)PARSER.parseFrom(data, extensionRegistry);
        }

        public static TypedRow parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TypedRow)PARSER.parseFrom(data);
        }

        public static TypedRow parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TypedRow)PARSER.parseFrom(data, extensionRegistry);
        }

        public static TypedRow parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TypedRow)PARSER.parseFrom(data);
        }

        public static TypedRow parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TypedRow)PARSER.parseFrom(data, extensionRegistry);
        }

        public static TypedRow parseFrom(InputStream input) throws IOException {
            return (TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
        }

        public static TypedRow parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static TypedRow parseDelimitedFrom(InputStream input) throws IOException {
            return (TypedRow)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
        }

        public static TypedRow parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TypedRow)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static TypedRow parseFrom(CodedInputStream input) throws IOException {
            return (TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
        }

        public static TypedRow parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public Builder newBuilderForType() {
            return TypedRow.newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(TypedRow prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static TypedRow getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TypedRow> parser() {
            return PARSER;
        }

        public Parser<TypedRow> getParserForType() {
            return PARSER;
        }

        public TypedRow getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder
        extends GeneratedMessageV3.Builder<Builder>
        implements TypedRowOrBuilder {
            private int bitField0_;
            private List<MysqlxExpr.Expr> field_ = Collections.emptyList();
            private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> fieldBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
            }

            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable.ensureFieldAccessorsInitialized(TypedRow.class, Builder.class);
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
                    this.getFieldFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                if (this.fieldBuilder_ == null) {
                    this.field_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                } else {
                    this.fieldBuilder_.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
            }

            public TypedRow getDefaultInstanceForType() {
                return TypedRow.getDefaultInstance();
            }

            public TypedRow build() {
                TypedRow result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw Builder.newUninitializedMessageException((Message)result);
                }
                return result;
            }

            public TypedRow buildPartial() {
                TypedRow result = new TypedRow(this);
                int from_bitField0_ = this.bitField0_;
                if (this.fieldBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.field_ = Collections.unmodifiableList(this.field_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.field_ = this.field_;
                } else {
                    result.field_ = this.fieldBuilder_.build();
                }
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
                if (other instanceof TypedRow) {
                    return this.mergeFrom((TypedRow)other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(TypedRow other) {
                if (other == TypedRow.getDefaultInstance()) {
                    return this;
                }
                if (this.fieldBuilder_ == null) {
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
                } else if (!other.field_.isEmpty()) {
                    if (this.fieldBuilder_.isEmpty()) {
                        this.fieldBuilder_.dispose();
                        this.fieldBuilder_ = null;
                        this.field_ = other.field_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.fieldBuilder_ = alwaysUseFieldBuilders ? this.getFieldFieldBuilder() : null;
                    } else {
                        this.fieldBuilder_.addAllMessages((Iterable)other.field_);
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < this.getFieldCount(); ++i) {
                    if (this.getField(i).isInitialized()) continue;
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                TypedRow parsedMessage = null;
                try {
                    parsedMessage = (TypedRow)PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TypedRow)e.getUnfinishedMessage();
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
                    this.field_ = new ArrayList<MysqlxExpr.Expr>(this.field_);
                    this.bitField0_ |= 1;
                }
            }

            @Override
            public List<MysqlxExpr.Expr> getFieldList() {
                if (this.fieldBuilder_ == null) {
                    return Collections.unmodifiableList(this.field_);
                }
                return this.fieldBuilder_.getMessageList();
            }

            @Override
            public int getFieldCount() {
                if (this.fieldBuilder_ == null) {
                    return this.field_.size();
                }
                return this.fieldBuilder_.getCount();
            }

            @Override
            public MysqlxExpr.Expr getField(int index) {
                if (this.fieldBuilder_ == null) {
                    return this.field_.get(index);
                }
                return (MysqlxExpr.Expr)this.fieldBuilder_.getMessage(index);
            }

            public Builder setField(int index, MysqlxExpr.Expr value) {
                if (this.fieldBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFieldIsMutable();
                    this.field_.set(index, value);
                    this.onChanged();
                } else {
                    this.fieldBuilder_.setMessage(index, (AbstractMessage)value);
                }
                return this;
            }

            public Builder setField(int index, MysqlxExpr.Expr.Builder builderForValue) {
                if (this.fieldBuilder_ == null) {
                    this.ensureFieldIsMutable();
                    this.field_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.fieldBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
                }
                return this;
            }

            public Builder addField(MysqlxExpr.Expr value) {
                if (this.fieldBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFieldIsMutable();
                    this.field_.add(value);
                    this.onChanged();
                } else {
                    this.fieldBuilder_.addMessage((AbstractMessage)value);
                }
                return this;
            }

            public Builder addField(int index, MysqlxExpr.Expr value) {
                if (this.fieldBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFieldIsMutable();
                    this.field_.add(index, value);
                    this.onChanged();
                } else {
                    this.fieldBuilder_.addMessage(index, (AbstractMessage)value);
                }
                return this;
            }

            public Builder addField(MysqlxExpr.Expr.Builder builderForValue) {
                if (this.fieldBuilder_ == null) {
                    this.ensureFieldIsMutable();
                    this.field_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.fieldBuilder_.addMessage((AbstractMessage)builderForValue.build());
                }
                return this;
            }

            public Builder addField(int index, MysqlxExpr.Expr.Builder builderForValue) {
                if (this.fieldBuilder_ == null) {
                    this.ensureFieldIsMutable();
                    this.field_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.fieldBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
                }
                return this;
            }

            public Builder addAllField(Iterable<? extends MysqlxExpr.Expr> values) {
                if (this.fieldBuilder_ == null) {
                    this.ensureFieldIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.field_);
                    this.onChanged();
                } else {
                    this.fieldBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearField() {
                if (this.fieldBuilder_ == null) {
                    this.field_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                } else {
                    this.fieldBuilder_.clear();
                }
                return this;
            }

            public Builder removeField(int index) {
                if (this.fieldBuilder_ == null) {
                    this.ensureFieldIsMutable();
                    this.field_.remove(index);
                    this.onChanged();
                } else {
                    this.fieldBuilder_.remove(index);
                }
                return this;
            }

            public MysqlxExpr.Expr.Builder getFieldBuilder(int index) {
                return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().getBuilder(index);
            }

            @Override
            public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int index) {
                if (this.fieldBuilder_ == null) {
                    return this.field_.get(index);
                }
                return (MysqlxExpr.ExprOrBuilder)this.fieldBuilder_.getMessageOrBuilder(index);
            }

            @Override
            public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList() {
                if (this.fieldBuilder_ != null) {
                    return this.fieldBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.field_);
            }

            public MysqlxExpr.Expr.Builder addFieldBuilder() {
                return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
            }

            public MysqlxExpr.Expr.Builder addFieldBuilder(int index) {
                return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
            }

            public List<MysqlxExpr.Expr.Builder> getFieldBuilderList() {
                return this.getFieldFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getFieldFieldBuilder() {
                if (this.fieldBuilder_ == null) {
                    this.fieldBuilder_ = new RepeatedFieldBuilderV3(this.field_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                    this.field_ = null;
                }
                return this.fieldBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public static interface TypedRowOrBuilder
    extends MessageOrBuilder {
        public List<MysqlxExpr.Expr> getFieldList();

        public MysqlxExpr.Expr getField(int var1);

        public int getFieldCount();

        public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList();

        public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int var1);
    }
}
