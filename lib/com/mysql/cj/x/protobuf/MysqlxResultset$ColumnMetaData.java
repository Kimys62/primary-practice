/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolMessageEnum
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxResultset;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxResultset.ColumnMetaData
extends GeneratedMessageV3
implements MysqlxResultset.ColumnMetaDataOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int NAME_FIELD_NUMBER = 2;
    private ByteString name_;
    public static final int ORIGINAL_NAME_FIELD_NUMBER = 3;
    private ByteString originalName_;
    public static final int TABLE_FIELD_NUMBER = 4;
    private ByteString table_;
    public static final int ORIGINAL_TABLE_FIELD_NUMBER = 5;
    private ByteString originalTable_;
    public static final int SCHEMA_FIELD_NUMBER = 6;
    private ByteString schema_;
    public static final int CATALOG_FIELD_NUMBER = 7;
    private ByteString catalog_;
    public static final int COLLATION_FIELD_NUMBER = 8;
    private long collation_;
    public static final int FRACTIONAL_DIGITS_FIELD_NUMBER = 9;
    private int fractionalDigits_;
    public static final int LENGTH_FIELD_NUMBER = 10;
    private int length_;
    public static final int FLAGS_FIELD_NUMBER = 11;
    private int flags_;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 12;
    private int contentType_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxResultset.ColumnMetaData DEFAULT_INSTANCE = new MysqlxResultset.ColumnMetaData();
    @Deprecated
    public static final Parser<MysqlxResultset.ColumnMetaData> PARSER = new AbstractParser<MysqlxResultset.ColumnMetaData>(){

        public MysqlxResultset.ColumnMetaData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxResultset.ColumnMetaData(input, extensionRegistry);
        }
    };

    private MysqlxResultset.ColumnMetaData(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxResultset.ColumnMetaData() {
        this.type_ = 1;
        this.name_ = ByteString.EMPTY;
        this.originalName_ = ByteString.EMPTY;
        this.table_ = ByteString.EMPTY;
        this.originalTable_ = ByteString.EMPTY;
        this.schema_ = ByteString.EMPTY;
        this.catalog_ = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxResultset.ColumnMetaData();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxResultset.ColumnMetaData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block21: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block21;
                    }
                    case 8: {
                        int rawValue = input.readEnum();
                        FieldType value = FieldType.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block21;
                        }
                        this.bitField0_ |= 1;
                        this.type_ = rawValue;
                        continue block21;
                    }
                    case 18: {
                        this.bitField0_ |= 2;
                        this.name_ = input.readBytes();
                        continue block21;
                    }
                    case 26: {
                        this.bitField0_ |= 4;
                        this.originalName_ = input.readBytes();
                        continue block21;
                    }
                    case 34: {
                        this.bitField0_ |= 8;
                        this.table_ = input.readBytes();
                        continue block21;
                    }
                    case 42: {
                        this.bitField0_ |= 0x10;
                        this.originalTable_ = input.readBytes();
                        continue block21;
                    }
                    case 50: {
                        this.bitField0_ |= 0x20;
                        this.schema_ = input.readBytes();
                        continue block21;
                    }
                    case 58: {
                        this.bitField0_ |= 0x40;
                        this.catalog_ = input.readBytes();
                        continue block21;
                    }
                    case 64: {
                        this.bitField0_ |= 0x80;
                        this.collation_ = input.readUInt64();
                        continue block21;
                    }
                    case 72: {
                        this.bitField0_ |= 0x100;
                        this.fractionalDigits_ = input.readUInt32();
                        continue block21;
                    }
                    case 80: {
                        this.bitField0_ |= 0x200;
                        this.length_ = input.readUInt32();
                        continue block21;
                    }
                    case 88: {
                        this.bitField0_ |= 0x400;
                        this.flags_ = input.readUInt32();
                        continue block21;
                    }
                    case 96: {
                        this.bitField0_ |= 0x800;
                        this.contentType_ = input.readUInt32();
                        continue block21;
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
        return internal_static_Mysqlx_Resultset_ColumnMetaData_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_ColumnMetaData_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.ColumnMetaData.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public FieldType getType() {
        FieldType result = FieldType.valueOf(this.type_);
        return result == null ? FieldType.SINT : result;
    }

    @Override
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getName() {
        return this.name_;
    }

    @Override
    public boolean hasOriginalName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ByteString getOriginalName() {
        return this.originalName_;
    }

    @Override
    public boolean hasTable() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public ByteString getTable() {
        return this.table_;
    }

    @Override
    public boolean hasOriginalTable() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public ByteString getOriginalTable() {
        return this.originalTable_;
    }

    @Override
    public boolean hasSchema() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public ByteString getSchema() {
        return this.schema_;
    }

    @Override
    public boolean hasCatalog() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public ByteString getCatalog() {
        return this.catalog_;
    }

    @Override
    public boolean hasCollation() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public long getCollation() {
        return this.collation_;
    }

    @Override
    public boolean hasFractionalDigits() {
        return (this.bitField0_ & 0x100) != 0;
    }

    @Override
    public int getFractionalDigits() {
        return this.fractionalDigits_;
    }

    @Override
    public boolean hasLength() {
        return (this.bitField0_ & 0x200) != 0;
    }

    @Override
    public int getLength() {
        return this.length_;
    }

    @Override
    public boolean hasFlags() {
        return (this.bitField0_ & 0x400) != 0;
    }

    @Override
    public int getFlags() {
        return this.flags_;
    }

    @Override
    public boolean hasContentType() {
        return (this.bitField0_ & 0x800) != 0;
    }

    @Override
    public int getContentType() {
        return this.contentType_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.name_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.originalName_);
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.table_);
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeBytes(5, this.originalTable_);
        }
        if ((this.bitField0_ & 0x20) != 0) {
            output.writeBytes(6, this.schema_);
        }
        if ((this.bitField0_ & 0x40) != 0) {
            output.writeBytes(7, this.catalog_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            output.writeUInt64(8, this.collation_);
        }
        if ((this.bitField0_ & 0x100) != 0) {
            output.writeUInt32(9, this.fractionalDigits_);
        }
        if ((this.bitField0_ & 0x200) != 0) {
            output.writeUInt32(10, this.length_);
        }
        if ((this.bitField0_ & 0x400) != 0) {
            output.writeUInt32(11, this.flags_);
        }
        if ((this.bitField0_ & 0x800) != 0) {
            output.writeUInt32(12, this.contentType_);
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.name_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeBytesSize((int)3, (ByteString)this.originalName_);
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeBytesSize((int)4, (ByteString)this.table_);
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeBytesSize((int)5, (ByteString)this.originalTable_);
        }
        if ((this.bitField0_ & 0x20) != 0) {
            size += CodedOutputStream.computeBytesSize((int)6, (ByteString)this.schema_);
        }
        if ((this.bitField0_ & 0x40) != 0) {
            size += CodedOutputStream.computeBytesSize((int)7, (ByteString)this.catalog_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            size += CodedOutputStream.computeUInt64Size((int)8, (long)this.collation_);
        }
        if ((this.bitField0_ & 0x100) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)9, (int)this.fractionalDigits_);
        }
        if ((this.bitField0_ & 0x200) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)10, (int)this.length_);
        }
        if ((this.bitField0_ & 0x400) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)11, (int)this.flags_);
        }
        if ((this.bitField0_ & 0x800) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)12, (int)this.contentType_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxResultset.ColumnMetaData)) {
            return super.equals(obj);
        }
        MysqlxResultset.ColumnMetaData other = (MysqlxResultset.ColumnMetaData)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.type_ != other.type_) {
            return false;
        }
        if (this.hasName() != other.hasName()) {
            return false;
        }
        if (this.hasName() && !this.getName().equals((Object)other.getName())) {
            return false;
        }
        if (this.hasOriginalName() != other.hasOriginalName()) {
            return false;
        }
        if (this.hasOriginalName() && !this.getOriginalName().equals((Object)other.getOriginalName())) {
            return false;
        }
        if (this.hasTable() != other.hasTable()) {
            return false;
        }
        if (this.hasTable() && !this.getTable().equals((Object)other.getTable())) {
            return false;
        }
        if (this.hasOriginalTable() != other.hasOriginalTable()) {
            return false;
        }
        if (this.hasOriginalTable() && !this.getOriginalTable().equals((Object)other.getOriginalTable())) {
            return false;
        }
        if (this.hasSchema() != other.hasSchema()) {
            return false;
        }
        if (this.hasSchema() && !this.getSchema().equals((Object)other.getSchema())) {
            return false;
        }
        if (this.hasCatalog() != other.hasCatalog()) {
            return false;
        }
        if (this.hasCatalog() && !this.getCatalog().equals((Object)other.getCatalog())) {
            return false;
        }
        if (this.hasCollation() != other.hasCollation()) {
            return false;
        }
        if (this.hasCollation() && this.getCollation() != other.getCollation()) {
            return false;
        }
        if (this.hasFractionalDigits() != other.hasFractionalDigits()) {
            return false;
        }
        if (this.hasFractionalDigits() && this.getFractionalDigits() != other.getFractionalDigits()) {
            return false;
        }
        if (this.hasLength() != other.hasLength()) {
            return false;
        }
        if (this.hasLength() && this.getLength() != other.getLength()) {
            return false;
        }
        if (this.hasFlags() != other.hasFlags()) {
            return false;
        }
        if (this.hasFlags() && this.getFlags() != other.getFlags()) {
            return false;
        }
        if (this.hasContentType() != other.hasContentType()) {
            return false;
        }
        if (this.hasContentType() && this.getContentType() != other.getContentType()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxResultset.ColumnMetaData.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
        }
        if (this.hasName()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getName().hashCode();
        }
        if (this.hasOriginalName()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getOriginalName().hashCode();
        }
        if (this.hasTable()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getTable().hashCode();
        }
        if (this.hasOriginalTable()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getOriginalTable().hashCode();
        }
        if (this.hasSchema()) {
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSchema().hashCode();
        }
        if (this.hasCatalog()) {
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getCatalog().hashCode();
        }
        if (this.hasCollation()) {
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashLong((long)this.getCollation());
        }
        if (this.hasFractionalDigits()) {
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getFractionalDigits();
        }
        if (this.hasLength()) {
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getLength();
        }
        if (this.hasFlags()) {
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getFlags();
        }
        if (this.hasContentType()) {
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getContentType();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxResultset.ColumnMetaData)PARSER.parseFrom(data);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxResultset.ColumnMetaData)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxResultset.ColumnMetaData)PARSER.parseFrom(data);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxResultset.ColumnMetaData)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxResultset.ColumnMetaData)PARSER.parseFrom(data);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxResultset.ColumnMetaData)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(InputStream input) throws IOException {
        return (MysqlxResultset.ColumnMetaData)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxResultset.ColumnMetaData)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxResultset.ColumnMetaData parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxResultset.ColumnMetaData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxResultset.ColumnMetaData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxResultset.ColumnMetaData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxResultset.ColumnMetaData)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxResultset.ColumnMetaData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxResultset.ColumnMetaData)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxResultset.ColumnMetaData.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxResultset.ColumnMetaData prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxResultset.ColumnMetaData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxResultset.ColumnMetaData> parser() {
        return PARSER;
    }

    public Parser<MysqlxResultset.ColumnMetaData> getParserForType() {
        return PARSER;
    }

    public MysqlxResultset.ColumnMetaData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxResultset.ColumnMetaDataOrBuilder {
        private int bitField0_;
        private int type_ = 1;
        private ByteString name_ = ByteString.EMPTY;
        private ByteString originalName_ = ByteString.EMPTY;
        private ByteString table_ = ByteString.EMPTY;
        private ByteString originalTable_ = ByteString.EMPTY;
        private ByteString schema_ = ByteString.EMPTY;
        private ByteString catalog_ = ByteString.EMPTY;
        private long collation_;
        private int fractionalDigits_;
        private int length_;
        private int flags_;
        private int contentType_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Resultset_ColumnMetaData_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Resultset_ColumnMetaData_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.ColumnMetaData.class, Builder.class);
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
            this.type_ = 1;
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFD;
            this.originalName_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFB;
            this.table_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFF7;
            this.originalTable_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFEF;
            this.schema_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFDF;
            this.catalog_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFBF;
            this.collation_ = 0L;
            this.bitField0_ &= 0xFFFFFF7F;
            this.fractionalDigits_ = 0;
            this.bitField0_ &= 0xFFFFFEFF;
            this.length_ = 0;
            this.bitField0_ &= 0xFFFFFDFF;
            this.flags_ = 0;
            this.bitField0_ &= 0xFFFFFBFF;
            this.contentType_ = 0;
            this.bitField0_ &= 0xFFFFF7FF;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Resultset_ColumnMetaData_descriptor;
        }

        public MysqlxResultset.ColumnMetaData getDefaultInstanceForType() {
            return MysqlxResultset.ColumnMetaData.getDefaultInstance();
        }

        public MysqlxResultset.ColumnMetaData build() {
            MysqlxResultset.ColumnMetaData result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxResultset.ColumnMetaData buildPartial() {
            MysqlxResultset.ColumnMetaData result = new MysqlxResultset.ColumnMetaData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.name_ = this.name_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.originalName_ = this.originalName_;
            if ((from_bitField0_ & 8) != 0) {
                to_bitField0_ |= 8;
            }
            result.table_ = this.table_;
            if ((from_bitField0_ & 0x10) != 0) {
                to_bitField0_ |= 0x10;
            }
            result.originalTable_ = this.originalTable_;
            if ((from_bitField0_ & 0x20) != 0) {
                to_bitField0_ |= 0x20;
            }
            result.schema_ = this.schema_;
            if ((from_bitField0_ & 0x40) != 0) {
                to_bitField0_ |= 0x40;
            }
            result.catalog_ = this.catalog_;
            if ((from_bitField0_ & 0x80) != 0) {
                result.collation_ = this.collation_;
                to_bitField0_ |= 0x80;
            }
            if ((from_bitField0_ & 0x100) != 0) {
                result.fractionalDigits_ = this.fractionalDigits_;
                to_bitField0_ |= 0x100;
            }
            if ((from_bitField0_ & 0x200) != 0) {
                result.length_ = this.length_;
                to_bitField0_ |= 0x200;
            }
            if ((from_bitField0_ & 0x400) != 0) {
                result.flags_ = this.flags_;
                to_bitField0_ |= 0x400;
            }
            if ((from_bitField0_ & 0x800) != 0) {
                result.contentType_ = this.contentType_;
                to_bitField0_ |= 0x800;
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
            if (other instanceof MysqlxResultset.ColumnMetaData) {
                return this.mergeFrom((MysqlxResultset.ColumnMetaData)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxResultset.ColumnMetaData other) {
            if (other == MysqlxResultset.ColumnMetaData.getDefaultInstance()) {
                return this;
            }
            if (other.hasType()) {
                this.setType(other.getType());
            }
            if (other.hasName()) {
                this.setName(other.getName());
            }
            if (other.hasOriginalName()) {
                this.setOriginalName(other.getOriginalName());
            }
            if (other.hasTable()) {
                this.setTable(other.getTable());
            }
            if (other.hasOriginalTable()) {
                this.setOriginalTable(other.getOriginalTable());
            }
            if (other.hasSchema()) {
                this.setSchema(other.getSchema());
            }
            if (other.hasCatalog()) {
                this.setCatalog(other.getCatalog());
            }
            if (other.hasCollation()) {
                this.setCollation(other.getCollation());
            }
            if (other.hasFractionalDigits()) {
                this.setFractionalDigits(other.getFractionalDigits());
            }
            if (other.hasLength()) {
                this.setLength(other.getLength());
            }
            if (other.hasFlags()) {
                this.setFlags(other.getFlags());
            }
            if (other.hasContentType()) {
                this.setContentType(other.getContentType());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasType();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxResultset.ColumnMetaData parsedMessage = null;
            try {
                parsedMessage = (MysqlxResultset.ColumnMetaData)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxResultset.ColumnMetaData)e.getUnfinishedMessage();
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
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public FieldType getType() {
            FieldType result = FieldType.valueOf(this.type_);
            return result == null ? FieldType.SINT : result;
        }

        public Builder setType(FieldType value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.type_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.type_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public ByteString getName() {
            return this.name_;
        }

        public Builder setName(ByteString value) {
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
            this.name_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getName();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasOriginalName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public ByteString getOriginalName() {
            return this.originalName_;
        }

        public Builder setOriginalName(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.originalName_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearOriginalName() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.originalName_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getOriginalName();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasTable() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public ByteString getTable() {
            return this.table_;
        }

        public Builder setTable(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 8;
            this.table_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearTable() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.table_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getTable();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasOriginalTable() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public ByteString getOriginalTable() {
            return this.originalTable_;
        }

        public Builder setOriginalTable(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 0x10;
            this.originalTable_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearOriginalTable() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.originalTable_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getOriginalTable();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasSchema() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public ByteString getSchema() {
            return this.schema_;
        }

        public Builder setSchema(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 0x20;
            this.schema_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearSchema() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.schema_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getSchema();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasCatalog() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override
        public ByteString getCatalog() {
            return this.catalog_;
        }

        public Builder setCatalog(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 0x40;
            this.catalog_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearCatalog() {
            this.bitField0_ &= 0xFFFFFFBF;
            this.catalog_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getCatalog();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasCollation() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override
        public long getCollation() {
            return this.collation_;
        }

        public Builder setCollation(long value) {
            this.bitField0_ |= 0x80;
            this.collation_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearCollation() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.collation_ = 0L;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasFractionalDigits() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override
        public int getFractionalDigits() {
            return this.fractionalDigits_;
        }

        public Builder setFractionalDigits(int value) {
            this.bitField0_ |= 0x100;
            this.fractionalDigits_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearFractionalDigits() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.fractionalDigits_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasLength() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override
        public int getLength() {
            return this.length_;
        }

        public Builder setLength(int value) {
            this.bitField0_ |= 0x200;
            this.length_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearLength() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.length_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasFlags() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override
        public int getFlags() {
            return this.flags_;
        }

        public Builder setFlags(int value) {
            this.bitField0_ |= 0x400;
            this.flags_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearFlags() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.flags_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasContentType() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override
        public int getContentType() {
            return this.contentType_;
        }

        public Builder setContentType(int value) {
            this.bitField0_ |= 0x800;
            this.contentType_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearContentType() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.contentType_ = 0;
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

    public static enum FieldType implements ProtocolMessageEnum
    {
        SINT(1),
        UINT(2),
        DOUBLE(5),
        FLOAT(6),
        BYTES(7),
        TIME(10),
        DATETIME(12),
        SET(15),
        ENUM(16),
        BIT(17),
        DECIMAL(18);

        public static final int SINT_VALUE = 1;
        public static final int UINT_VALUE = 2;
        public static final int DOUBLE_VALUE = 5;
        public static final int FLOAT_VALUE = 6;
        public static final int BYTES_VALUE = 7;
        public static final int TIME_VALUE = 10;
        public static final int DATETIME_VALUE = 12;
        public static final int SET_VALUE = 15;
        public static final int ENUM_VALUE = 16;
        public static final int BIT_VALUE = 17;
        public static final int DECIMAL_VALUE = 18;
        private static final Internal.EnumLiteMap<FieldType> internalValueMap;
        private static final FieldType[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FieldType valueOf(int value) {
            return FieldType.forNumber(value);
        }

        public static FieldType forNumber(int value) {
            switch (value) {
                case 1: {
                    return SINT;
                }
                case 2: {
                    return UINT;
                }
                case 5: {
                    return DOUBLE;
                }
                case 6: {
                    return FLOAT;
                }
                case 7: {
                    return BYTES;
                }
                case 10: {
                    return TIME;
                }
                case 12: {
                    return DATETIME;
                }
                case 15: {
                    return SET;
                }
                case 16: {
                    return ENUM;
                }
                case 17: {
                    return BIT;
                }
                case 18: {
                    return DECIMAL;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<FieldType> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)FieldType.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return FieldType.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxResultset.ColumnMetaData.getDescriptor().getEnumTypes().get(0);
        }

        public static FieldType valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != FieldType.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private FieldType(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<FieldType>(){

                public FieldType findValueByNumber(int number) {
                    return FieldType.forNumber(number);
                }
            };
            VALUES = FieldType.values();
        }
    }
}
