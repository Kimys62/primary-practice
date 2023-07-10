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
 *  com.google.protobuf.LazyStringArrayList
 *  com.google.protobuf.LazyStringList
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolStringList
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

public static final class MysqlxCrud.CreateView
extends GeneratedMessageV3
implements MysqlxCrud.CreateViewOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private MysqlxCrud.Collection collection_;
    public static final int DEFINER_FIELD_NUMBER = 2;
    private volatile Object definer_;
    public static final int ALGORITHM_FIELD_NUMBER = 3;
    private int algorithm_;
    public static final int SECURITY_FIELD_NUMBER = 4;
    private int security_;
    public static final int CHECK_FIELD_NUMBER = 5;
    private int check_;
    public static final int COLUMN_FIELD_NUMBER = 6;
    private LazyStringList column_;
    public static final int STMT_FIELD_NUMBER = 7;
    private MysqlxCrud.Find stmt_;
    public static final int REPLACE_EXISTING_FIELD_NUMBER = 8;
    private boolean replaceExisting_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.CreateView DEFAULT_INSTANCE = new MysqlxCrud.CreateView();
    @Deprecated
    public static final Parser<MysqlxCrud.CreateView> PARSER = new AbstractParser<MysqlxCrud.CreateView>(){

        public MysqlxCrud.CreateView parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.CreateView(input, extensionRegistry);
        }
    };

    private MysqlxCrud.CreateView(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.CreateView() {
        this.definer_ = "";
        this.algorithm_ = 1;
        this.security_ = 2;
        this.check_ = 1;
        this.column_ = LazyStringArrayList.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.CreateView();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.CreateView(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block17: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block17;
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
                        continue block17;
                    }
                    case 18: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.definer_ = bs;
                        continue block17;
                    }
                    case 24: {
                        int rawValue = input.readEnum();
                        Enum value = MysqlxCrud.ViewAlgorithm.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(3, rawValue);
                            continue block17;
                        }
                        this.bitField0_ |= 4;
                        this.algorithm_ = rawValue;
                        continue block17;
                    }
                    case 32: {
                        int rawValue = input.readEnum();
                        Enum value = MysqlxCrud.ViewSqlSecurity.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(4, rawValue);
                            continue block17;
                        }
                        this.bitField0_ |= 8;
                        this.security_ = rawValue;
                        continue block17;
                    }
                    case 40: {
                        int rawValue = input.readEnum();
                        Enum value = MysqlxCrud.ViewCheckOption.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(5, rawValue);
                            continue block17;
                        }
                        this.bitField0_ |= 0x10;
                        this.check_ = rawValue;
                        continue block17;
                    }
                    case 50: {
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 0x20) == 0) {
                            this.column_ = new LazyStringArrayList();
                            mutable_bitField0_ |= 0x20;
                        }
                        this.column_.add(bs);
                        continue block17;
                    }
                    case 58: {
                        MysqlxCrud.Find.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x20) != 0) {
                            subBuilder = this.stmt_.toBuilder();
                        }
                        this.stmt_ = (MysqlxCrud.Find)input.readMessage(MysqlxCrud.Find.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.stmt_);
                            this.stmt_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x20;
                        continue block17;
                    }
                    case 64: {
                        this.bitField0_ |= 0x40;
                        this.replaceExisting_ = input.readBool();
                        continue block17;
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
            if ((mutable_bitField0_ & 0x20) != 0) {
                this.column_ = this.column_.getUnmodifiableView();
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_CreateView_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_CreateView_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.CreateView.class, Builder.class);
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
    public boolean hasDefiner() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getDefiner() {
        Object ref = this.definer_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.definer_ = s;
        }
        return s;
    }

    @Override
    public ByteString getDefinerBytes() {
        Object ref = this.definer_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.definer_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    @Override
    public boolean hasAlgorithm() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxCrud.ViewAlgorithm getAlgorithm() {
        MysqlxCrud.ViewAlgorithm result = MysqlxCrud.ViewAlgorithm.valueOf(this.algorithm_);
        return result == null ? MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
    }

    @Override
    public boolean hasSecurity() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.ViewSqlSecurity getSecurity() {
        MysqlxCrud.ViewSqlSecurity result = MysqlxCrud.ViewSqlSecurity.valueOf(this.security_);
        return result == null ? MysqlxCrud.ViewSqlSecurity.DEFINER : result;
    }

    @Override
    public boolean hasCheck() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxCrud.ViewCheckOption getCheck() {
        MysqlxCrud.ViewCheckOption result = MysqlxCrud.ViewCheckOption.valueOf(this.check_);
        return result == null ? MysqlxCrud.ViewCheckOption.LOCAL : result;
    }

    public ProtocolStringList getColumnList() {
        return this.column_;
    }

    @Override
    public int getColumnCount() {
        return this.column_.size();
    }

    @Override
    public String getColumn(int index) {
        return (String)this.column_.get(index);
    }

    @Override
    public ByteString getColumnBytes(int index) {
        return this.column_.getByteString(index);
    }

    @Override
    public boolean hasStmt() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public MysqlxCrud.Find getStmt() {
        return this.stmt_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.stmt_;
    }

    @Override
    public MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
        return this.stmt_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.stmt_;
    }

    @Override
    public boolean hasReplaceExisting() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public boolean getReplaceExisting() {
        return this.replaceExisting_;
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
        if (!this.hasStmt()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getCollection().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getStmt().isInitialized()) {
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
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)2, (Object)this.definer_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.algorithm_);
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.security_);
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeEnum(5, this.check_);
        }
        for (int i = 0; i < this.column_.size(); ++i) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)6, (Object)this.column_.getRaw(i));
        }
        if ((this.bitField0_ & 0x20) != 0) {
            output.writeMessage(7, (MessageLite)this.getStmt());
        }
        if ((this.bitField0_ & 0x40) != 0) {
            output.writeBool(8, this.replaceExisting_);
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
            size += GeneratedMessageV3.computeStringSize((int)2, (Object)this.definer_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeEnumSize((int)3, (int)this.algorithm_);
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeEnumSize((int)4, (int)this.security_);
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeEnumSize((int)5, (int)this.check_);
        }
        int dataSize = 0;
        for (int i = 0; i < this.column_.size(); ++i) {
            dataSize += MysqlxCrud.CreateView.computeStringSizeNoTag((Object)this.column_.getRaw(i));
        }
        size += dataSize;
        size += 1 * this.getColumnList().size();
        if ((this.bitField0_ & 0x20) != 0) {
            size += CodedOutputStream.computeMessageSize((int)7, (MessageLite)this.getStmt());
        }
        if ((this.bitField0_ & 0x40) != 0) {
            size += CodedOutputStream.computeBoolSize((int)8, (boolean)this.replaceExisting_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.CreateView)) {
            return super.equals(obj);
        }
        MysqlxCrud.CreateView other = (MysqlxCrud.CreateView)obj;
        if (this.hasCollection() != other.hasCollection()) {
            return false;
        }
        if (this.hasCollection() && !this.getCollection().equals(other.getCollection())) {
            return false;
        }
        if (this.hasDefiner() != other.hasDefiner()) {
            return false;
        }
        if (this.hasDefiner() && !this.getDefiner().equals(other.getDefiner())) {
            return false;
        }
        if (this.hasAlgorithm() != other.hasAlgorithm()) {
            return false;
        }
        if (this.hasAlgorithm() && this.algorithm_ != other.algorithm_) {
            return false;
        }
        if (this.hasSecurity() != other.hasSecurity()) {
            return false;
        }
        if (this.hasSecurity() && this.security_ != other.security_) {
            return false;
        }
        if (this.hasCheck() != other.hasCheck()) {
            return false;
        }
        if (this.hasCheck() && this.check_ != other.check_) {
            return false;
        }
        if (!this.getColumnList().equals(other.getColumnList())) {
            return false;
        }
        if (this.hasStmt() != other.hasStmt()) {
            return false;
        }
        if (this.hasStmt() && !this.getStmt().equals(other.getStmt())) {
            return false;
        }
        if (this.hasReplaceExisting() != other.hasReplaceExisting()) {
            return false;
        }
        if (this.hasReplaceExisting() && this.getReplaceExisting() != other.getReplaceExisting()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.CreateView.getDescriptor().hashCode();
        if (this.hasCollection()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCollection().hashCode();
        }
        if (this.hasDefiner()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getDefiner().hashCode();
        }
        if (this.hasAlgorithm()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.algorithm_;
        }
        if (this.hasSecurity()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.security_;
        }
        if (this.hasCheck()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.check_;
        }
        if (this.getColumnCount() > 0) {
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getColumnList().hashCode();
        }
        if (this.hasStmt()) {
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getStmt().hashCode();
        }
        if (this.hasReplaceExisting()) {
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean((boolean)this.getReplaceExisting());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.CreateView parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.CreateView)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.CreateView parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.CreateView)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.CreateView parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.CreateView)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.CreateView parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.CreateView)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.CreateView parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.CreateView)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.CreateView parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.CreateView)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.CreateView parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.CreateView)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.CreateView parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.CreateView)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.CreateView parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.CreateView)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.CreateView parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.CreateView)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.CreateView parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.CreateView)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.CreateView parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.CreateView)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.CreateView.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.CreateView prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.CreateView getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.CreateView> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.CreateView> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.CreateView getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.CreateViewOrBuilder {
        private int bitField0_;
        private MysqlxCrud.Collection collection_;
        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
        private Object definer_ = "";
        private int algorithm_ = 1;
        private int security_ = 2;
        private int check_ = 1;
        private LazyStringList column_ = LazyStringArrayList.EMPTY;
        private MysqlxCrud.Find stmt_;
        private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> stmtBuilder_;
        private boolean replaceExisting_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_CreateView_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_CreateView_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.CreateView.class, Builder.class);
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
                this.getStmtFieldBuilder();
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
            this.definer_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            this.algorithm_ = 1;
            this.bitField0_ &= 0xFFFFFFFB;
            this.security_ = 2;
            this.bitField0_ &= 0xFFFFFFF7;
            this.check_ = 1;
            this.bitField0_ &= 0xFFFFFFEF;
            this.column_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= 0xFFFFFFDF;
            if (this.stmtBuilder_ == null) {
                this.stmt_ = null;
            } else {
                this.stmtBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFBF;
            this.replaceExisting_ = false;
            this.bitField0_ &= 0xFFFFFF7F;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_CreateView_descriptor;
        }

        public MysqlxCrud.CreateView getDefaultInstanceForType() {
            return MysqlxCrud.CreateView.getDefaultInstance();
        }

        public MysqlxCrud.CreateView build() {
            MysqlxCrud.CreateView result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.CreateView buildPartial() {
            MysqlxCrud.CreateView result = new MysqlxCrud.CreateView(this);
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
            result.definer_ = this.definer_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.algorithm_ = this.algorithm_;
            if ((from_bitField0_ & 8) != 0) {
                to_bitField0_ |= 8;
            }
            result.security_ = this.security_;
            if ((from_bitField0_ & 0x10) != 0) {
                to_bitField0_ |= 0x10;
            }
            result.check_ = this.check_;
            if ((this.bitField0_ & 0x20) != 0) {
                this.column_ = this.column_.getUnmodifiableView();
                this.bitField0_ &= 0xFFFFFFDF;
            }
            result.column_ = this.column_;
            if ((from_bitField0_ & 0x40) != 0) {
                if (this.stmtBuilder_ == null) {
                    result.stmt_ = this.stmt_;
                } else {
                    result.stmt_ = (MysqlxCrud.Find)this.stmtBuilder_.build();
                }
                to_bitField0_ |= 0x20;
            }
            if ((from_bitField0_ & 0x80) != 0) {
                result.replaceExisting_ = this.replaceExisting_;
                to_bitField0_ |= 0x40;
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
            if (other instanceof MysqlxCrud.CreateView) {
                return this.mergeFrom((MysqlxCrud.CreateView)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.CreateView other) {
            if (other == MysqlxCrud.CreateView.getDefaultInstance()) {
                return this;
            }
            if (other.hasCollection()) {
                this.mergeCollection(other.getCollection());
            }
            if (other.hasDefiner()) {
                this.bitField0_ |= 2;
                this.definer_ = other.definer_;
                this.onChanged();
            }
            if (other.hasAlgorithm()) {
                this.setAlgorithm(other.getAlgorithm());
            }
            if (other.hasSecurity()) {
                this.setSecurity(other.getSecurity());
            }
            if (other.hasCheck()) {
                this.setCheck(other.getCheck());
            }
            if (!other.column_.isEmpty()) {
                if (this.column_.isEmpty()) {
                    this.column_ = other.column_;
                    this.bitField0_ &= 0xFFFFFFDF;
                } else {
                    this.ensureColumnIsMutable();
                    this.column_.addAll((Collection)other.column_);
                }
                this.onChanged();
            }
            if (other.hasStmt()) {
                this.mergeStmt(other.getStmt());
            }
            if (other.hasReplaceExisting()) {
                this.setReplaceExisting(other.getReplaceExisting());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasCollection()) {
                return false;
            }
            if (!this.hasStmt()) {
                return false;
            }
            if (!this.getCollection().isInitialized()) {
                return false;
            }
            return this.getStmt().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.CreateView parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.CreateView)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.CreateView)e.getUnfinishedMessage();
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
        public boolean hasDefiner() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getDefiner() {
            Object ref = this.definer_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.definer_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getDefinerBytes() {
            Object ref = this.definer_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.definer_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setDefiner(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.definer_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearDefiner() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.definer_ = MysqlxCrud.CreateView.getDefaultInstance().getDefiner();
            this.onChanged();
            return this;
        }

        public Builder setDefinerBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.definer_ = value;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasAlgorithm() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public MysqlxCrud.ViewAlgorithm getAlgorithm() {
            MysqlxCrud.ViewAlgorithm result = MysqlxCrud.ViewAlgorithm.valueOf(this.algorithm_);
            return result == null ? MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
        }

        public Builder setAlgorithm(MysqlxCrud.ViewAlgorithm value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.algorithm_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearAlgorithm() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.algorithm_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasSecurity() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public MysqlxCrud.ViewSqlSecurity getSecurity() {
            MysqlxCrud.ViewSqlSecurity result = MysqlxCrud.ViewSqlSecurity.valueOf(this.security_);
            return result == null ? MysqlxCrud.ViewSqlSecurity.DEFINER : result;
        }

        public Builder setSecurity(MysqlxCrud.ViewSqlSecurity value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 8;
            this.security_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearSecurity() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.security_ = 2;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasCheck() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public MysqlxCrud.ViewCheckOption getCheck() {
            MysqlxCrud.ViewCheckOption result = MysqlxCrud.ViewCheckOption.valueOf(this.check_);
            return result == null ? MysqlxCrud.ViewCheckOption.LOCAL : result;
        }

        public Builder setCheck(MysqlxCrud.ViewCheckOption value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 0x10;
            this.check_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearCheck() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.check_ = 1;
            this.onChanged();
            return this;
        }

        private void ensureColumnIsMutable() {
            if ((this.bitField0_ & 0x20) == 0) {
                this.column_ = new LazyStringArrayList(this.column_);
                this.bitField0_ |= 0x20;
            }
        }

        public ProtocolStringList getColumnList() {
            return this.column_.getUnmodifiableView();
        }

        @Override
        public int getColumnCount() {
            return this.column_.size();
        }

        @Override
        public String getColumn(int index) {
            return (String)this.column_.get(index);
        }

        @Override
        public ByteString getColumnBytes(int index) {
            return this.column_.getByteString(index);
        }

        public Builder setColumn(int index, String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureColumnIsMutable();
            this.column_.set(index, (Object)value);
            this.onChanged();
            return this;
        }

        public Builder addColumn(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureColumnIsMutable();
            this.column_.add((Object)value);
            this.onChanged();
            return this;
        }

        public Builder addAllColumn(Iterable<String> values) {
            this.ensureColumnIsMutable();
            AbstractMessageLite.Builder.addAll(values, (List)this.column_);
            this.onChanged();
            return this;
        }

        public Builder clearColumn() {
            this.column_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= 0xFFFFFFDF;
            this.onChanged();
            return this;
        }

        public Builder addColumnBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureColumnIsMutable();
            this.column_.add(value);
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasStmt() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override
        public MysqlxCrud.Find getStmt() {
            if (this.stmtBuilder_ == null) {
                return this.stmt_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.stmt_;
            }
            return (MysqlxCrud.Find)this.stmtBuilder_.getMessage();
        }

        public Builder setStmt(MysqlxCrud.Find value) {
            if (this.stmtBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.stmt_ = value;
                this.onChanged();
            } else {
                this.stmtBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x40;
            return this;
        }

        public Builder setStmt(MysqlxCrud.Find.Builder builderForValue) {
            if (this.stmtBuilder_ == null) {
                this.stmt_ = builderForValue.build();
                this.onChanged();
            } else {
                this.stmtBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x40;
            return this;
        }

        public Builder mergeStmt(MysqlxCrud.Find value) {
            if (this.stmtBuilder_ == null) {
                this.stmt_ = (this.bitField0_ & 0x40) != 0 && this.stmt_ != null && this.stmt_ != MysqlxCrud.Find.getDefaultInstance() ? MysqlxCrud.Find.newBuilder(this.stmt_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.stmtBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x40;
            return this;
        }

        public Builder clearStmt() {
            if (this.stmtBuilder_ == null) {
                this.stmt_ = null;
                this.onChanged();
            } else {
                this.stmtBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }

        public MysqlxCrud.Find.Builder getStmtBuilder() {
            this.bitField0_ |= 0x40;
            this.onChanged();
            return (MysqlxCrud.Find.Builder)this.getStmtFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
            if (this.stmtBuilder_ != null) {
                return (MysqlxCrud.FindOrBuilder)this.stmtBuilder_.getMessageOrBuilder();
            }
            return this.stmt_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.stmt_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> getStmtFieldBuilder() {
            if (this.stmtBuilder_ == null) {
                this.stmtBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getStmt(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.stmt_ = null;
            }
            return this.stmtBuilder_;
        }

        @Override
        public boolean hasReplaceExisting() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override
        public boolean getReplaceExisting() {
            return this.replaceExisting_;
        }

        public Builder setReplaceExisting(boolean value) {
            this.bitField0_ |= 0x80;
            this.replaceExisting_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearReplaceExisting() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.replaceExisting_ = false;
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
