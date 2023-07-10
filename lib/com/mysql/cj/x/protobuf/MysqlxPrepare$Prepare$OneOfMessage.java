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
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolMessageEnum
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import com.mysql.cj.x.protobuf.MysqlxSql;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxPrepare.Prepare.OneOfMessage
extends GeneratedMessageV3
implements MysqlxPrepare.Prepare.OneOfMessageOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int FIND_FIELD_NUMBER = 2;
    private MysqlxCrud.Find find_;
    public static final int INSERT_FIELD_NUMBER = 3;
    private MysqlxCrud.Insert insert_;
    public static final int UPDATE_FIELD_NUMBER = 4;
    private MysqlxCrud.Update update_;
    public static final int DELETE_FIELD_NUMBER = 5;
    private MysqlxCrud.Delete delete_;
    public static final int STMT_EXECUTE_FIELD_NUMBER = 6;
    private MysqlxSql.StmtExecute stmtExecute_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxPrepare.Prepare.OneOfMessage DEFAULT_INSTANCE = new MysqlxPrepare.Prepare.OneOfMessage();
    @Deprecated
    public static final Parser<MysqlxPrepare.Prepare.OneOfMessage> PARSER = new AbstractParser<MysqlxPrepare.Prepare.OneOfMessage>(){

        public MysqlxPrepare.Prepare.OneOfMessage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxPrepare.Prepare.OneOfMessage(input, extensionRegistry);
        }
    };

    private MysqlxPrepare.Prepare.OneOfMessage(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxPrepare.Prepare.OneOfMessage() {
        this.type_ = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxPrepare.Prepare.OneOfMessage();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxPrepare.Prepare.OneOfMessage(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
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
                    case 8: {
                        int rawValue = input.readEnum();
                        Type value = Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block15;
                        }
                        this.bitField0_ |= 1;
                        this.type_ = rawValue;
                        continue block15;
                    }
                    case 18: {
                        MysqlxCrud.Find.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                            subBuilder = this.find_.toBuilder();
                        }
                        this.find_ = (MysqlxCrud.Find)input.readMessage(MysqlxCrud.Find.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.find_);
                            this.find_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 2;
                        continue block15;
                    }
                    case 26: {
                        MysqlxCrud.Insert.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                            subBuilder = this.insert_.toBuilder();
                        }
                        this.insert_ = (MysqlxCrud.Insert)input.readMessage(MysqlxCrud.Insert.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.insert_);
                            this.insert_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 4;
                        continue block15;
                    }
                    case 34: {
                        MysqlxCrud.Update.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                            subBuilder = this.update_.toBuilder();
                        }
                        this.update_ = (MysqlxCrud.Update)input.readMessage(MysqlxCrud.Update.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.update_);
                            this.update_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 8;
                        continue block15;
                    }
                    case 42: {
                        MysqlxCrud.Delete.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x10) != 0) {
                            subBuilder = this.delete_.toBuilder();
                        }
                        this.delete_ = (MysqlxCrud.Delete)input.readMessage(MysqlxCrud.Delete.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.delete_);
                            this.delete_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x10;
                        continue block15;
                    }
                    case 50: {
                        MysqlxSql.StmtExecute.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x20) != 0) {
                            subBuilder = this.stmtExecute_.toBuilder();
                        }
                        this.stmtExecute_ = (MysqlxSql.StmtExecute)input.readMessage(MysqlxSql.StmtExecute.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.stmtExecute_);
                            this.stmtExecute_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x20;
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
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Prepare.OneOfMessage.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Type getType() {
        Type result = Type.valueOf(this.type_);
        return result == null ? Type.FIND : result;
    }

    @Override
    public boolean hasFind() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.Find getFind() {
        return this.find_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.find_;
    }

    @Override
    public MysqlxCrud.FindOrBuilder getFindOrBuilder() {
        return this.find_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.find_;
    }

    @Override
    public boolean hasInsert() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxCrud.Insert getInsert() {
        return this.insert_ == null ? MysqlxCrud.Insert.getDefaultInstance() : this.insert_;
    }

    @Override
    public MysqlxCrud.InsertOrBuilder getInsertOrBuilder() {
        return this.insert_ == null ? MysqlxCrud.Insert.getDefaultInstance() : this.insert_;
    }

    @Override
    public boolean hasUpdate() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.Update getUpdate() {
        return this.update_ == null ? MysqlxCrud.Update.getDefaultInstance() : this.update_;
    }

    @Override
    public MysqlxCrud.UpdateOrBuilder getUpdateOrBuilder() {
        return this.update_ == null ? MysqlxCrud.Update.getDefaultInstance() : this.update_;
    }

    @Override
    public boolean hasDelete() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxCrud.Delete getDelete() {
        return this.delete_ == null ? MysqlxCrud.Delete.getDefaultInstance() : this.delete_;
    }

    @Override
    public MysqlxCrud.DeleteOrBuilder getDeleteOrBuilder() {
        return this.delete_ == null ? MysqlxCrud.Delete.getDefaultInstance() : this.delete_;
    }

    @Override
    public boolean hasStmtExecute() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public MysqlxSql.StmtExecute getStmtExecute() {
        return this.stmtExecute_ == null ? MysqlxSql.StmtExecute.getDefaultInstance() : this.stmtExecute_;
    }

    @Override
    public MysqlxSql.StmtExecuteOrBuilder getStmtExecuteOrBuilder() {
        return this.stmtExecute_ == null ? MysqlxSql.StmtExecute.getDefaultInstance() : this.stmtExecute_;
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
        if (this.hasFind() && !this.getFind().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasInsert() && !this.getInsert().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasUpdate() && !this.getUpdate().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasDelete() && !this.getDelete().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasStmtExecute() && !this.getStmtExecute().isInitialized()) {
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
            output.writeMessage(2, (MessageLite)this.getFind());
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, (MessageLite)this.getInsert());
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, (MessageLite)this.getUpdate());
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeMessage(5, (MessageLite)this.getDelete());
        }
        if ((this.bitField0_ & 0x20) != 0) {
            output.writeMessage(6, (MessageLite)this.getStmtExecute());
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
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getFind());
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getInsert());
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getUpdate());
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.getDelete());
        }
        if ((this.bitField0_ & 0x20) != 0) {
            size += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.getStmtExecute());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxPrepare.Prepare.OneOfMessage)) {
            return super.equals(obj);
        }
        MysqlxPrepare.Prepare.OneOfMessage other = (MysqlxPrepare.Prepare.OneOfMessage)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.type_ != other.type_) {
            return false;
        }
        if (this.hasFind() != other.hasFind()) {
            return false;
        }
        if (this.hasFind() && !this.getFind().equals(other.getFind())) {
            return false;
        }
        if (this.hasInsert() != other.hasInsert()) {
            return false;
        }
        if (this.hasInsert() && !this.getInsert().equals(other.getInsert())) {
            return false;
        }
        if (this.hasUpdate() != other.hasUpdate()) {
            return false;
        }
        if (this.hasUpdate() && !this.getUpdate().equals(other.getUpdate())) {
            return false;
        }
        if (this.hasDelete() != other.hasDelete()) {
            return false;
        }
        if (this.hasDelete() && !this.getDelete().equals(other.getDelete())) {
            return false;
        }
        if (this.hasStmtExecute() != other.hasStmtExecute()) {
            return false;
        }
        if (this.hasStmtExecute() && !this.getStmtExecute().equals(other.getStmtExecute())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxPrepare.Prepare.OneOfMessage.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
        }
        if (this.hasFind()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getFind().hashCode();
        }
        if (this.hasInsert()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getInsert().hashCode();
        }
        if (this.hasUpdate()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getUpdate().hashCode();
        }
        if (this.hasDelete()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getDelete().hashCode();
        }
        if (this.hasStmtExecute()) {
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getStmtExecute().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parseFrom(data);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(InputStream input) throws IOException {
        return (MysqlxPrepare.Prepare.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Prepare.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxPrepare.Prepare.OneOfMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Prepare.OneOfMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxPrepare.Prepare.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxPrepare.Prepare.OneOfMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxPrepare.Prepare.OneOfMessage)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxPrepare.Prepare.OneOfMessage.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxPrepare.Prepare.OneOfMessage prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxPrepare.Prepare.OneOfMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxPrepare.Prepare.OneOfMessage> parser() {
        return PARSER;
    }

    public Parser<MysqlxPrepare.Prepare.OneOfMessage> getParserForType() {
        return PARSER;
    }

    public MysqlxPrepare.Prepare.OneOfMessage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxPrepare.Prepare.OneOfMessageOrBuilder {
        private int bitField0_;
        private int type_ = 0;
        private MysqlxCrud.Find find_;
        private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> findBuilder_;
        private MysqlxCrud.Insert insert_;
        private SingleFieldBuilderV3<MysqlxCrud.Insert, MysqlxCrud.Insert.Builder, MysqlxCrud.InsertOrBuilder> insertBuilder_;
        private MysqlxCrud.Update update_;
        private SingleFieldBuilderV3<MysqlxCrud.Update, MysqlxCrud.Update.Builder, MysqlxCrud.UpdateOrBuilder> updateBuilder_;
        private MysqlxCrud.Delete delete_;
        private SingleFieldBuilderV3<MysqlxCrud.Delete, MysqlxCrud.Delete.Builder, MysqlxCrud.DeleteOrBuilder> deleteBuilder_;
        private MysqlxSql.StmtExecute stmtExecute_;
        private SingleFieldBuilderV3<MysqlxSql.StmtExecute, MysqlxSql.StmtExecute.Builder, MysqlxSql.StmtExecuteOrBuilder> stmtExecuteBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Prepare.OneOfMessage.class, Builder.class);
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
                this.getFindFieldBuilder();
                this.getInsertFieldBuilder();
                this.getUpdateFieldBuilder();
                this.getDeleteFieldBuilder();
                this.getStmtExecuteFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            if (this.findBuilder_ == null) {
                this.find_ = null;
            } else {
                this.findBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.insertBuilder_ == null) {
                this.insert_ = null;
            } else {
                this.insertBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            if (this.updateBuilder_ == null) {
                this.update_ = null;
            } else {
                this.updateBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            if (this.deleteBuilder_ == null) {
                this.delete_ = null;
            } else {
                this.deleteBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFEF;
            if (this.stmtExecuteBuilder_ == null) {
                this.stmtExecute_ = null;
            } else {
                this.stmtExecuteBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_descriptor;
        }

        public MysqlxPrepare.Prepare.OneOfMessage getDefaultInstanceForType() {
            return MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance();
        }

        public MysqlxPrepare.Prepare.OneOfMessage build() {
            MysqlxPrepare.Prepare.OneOfMessage result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxPrepare.Prepare.OneOfMessage buildPartial() {
            MysqlxPrepare.Prepare.OneOfMessage result = new MysqlxPrepare.Prepare.OneOfMessage(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
                if (this.findBuilder_ == null) {
                    result.find_ = this.find_;
                } else {
                    result.find_ = (MysqlxCrud.Find)this.findBuilder_.build();
                }
                to_bitField0_ |= 2;
            }
            if ((from_bitField0_ & 4) != 0) {
                if (this.insertBuilder_ == null) {
                    result.insert_ = this.insert_;
                } else {
                    result.insert_ = (MysqlxCrud.Insert)this.insertBuilder_.build();
                }
                to_bitField0_ |= 4;
            }
            if ((from_bitField0_ & 8) != 0) {
                if (this.updateBuilder_ == null) {
                    result.update_ = this.update_;
                } else {
                    result.update_ = (MysqlxCrud.Update)this.updateBuilder_.build();
                }
                to_bitField0_ |= 8;
            }
            if ((from_bitField0_ & 0x10) != 0) {
                if (this.deleteBuilder_ == null) {
                    result.delete_ = this.delete_;
                } else {
                    result.delete_ = (MysqlxCrud.Delete)this.deleteBuilder_.build();
                }
                to_bitField0_ |= 0x10;
            }
            if ((from_bitField0_ & 0x20) != 0) {
                if (this.stmtExecuteBuilder_ == null) {
                    result.stmtExecute_ = this.stmtExecute_;
                } else {
                    result.stmtExecute_ = (MysqlxSql.StmtExecute)this.stmtExecuteBuilder_.build();
                }
                to_bitField0_ |= 0x20;
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
            if (other instanceof MysqlxPrepare.Prepare.OneOfMessage) {
                return this.mergeFrom((MysqlxPrepare.Prepare.OneOfMessage)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxPrepare.Prepare.OneOfMessage other) {
            if (other == MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance()) {
                return this;
            }
            if (other.hasType()) {
                this.setType(other.getType());
            }
            if (other.hasFind()) {
                this.mergeFind(other.getFind());
            }
            if (other.hasInsert()) {
                this.mergeInsert(other.getInsert());
            }
            if (other.hasUpdate()) {
                this.mergeUpdate(other.getUpdate());
            }
            if (other.hasDelete()) {
                this.mergeDelete(other.getDelete());
            }
            if (other.hasStmtExecute()) {
                this.mergeStmtExecute(other.getStmtExecute());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasType()) {
                return false;
            }
            if (this.hasFind() && !this.getFind().isInitialized()) {
                return false;
            }
            if (this.hasInsert() && !this.getInsert().isInitialized()) {
                return false;
            }
            if (this.hasUpdate() && !this.getUpdate().isInitialized()) {
                return false;
            }
            if (this.hasDelete() && !this.getDelete().isInitialized()) {
                return false;
            }
            return !this.hasStmtExecute() || this.getStmtExecute().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxPrepare.Prepare.OneOfMessage parsedMessage = null;
            try {
                parsedMessage = (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxPrepare.Prepare.OneOfMessage)e.getUnfinishedMessage();
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
        public Type getType() {
            Type result = Type.valueOf(this.type_);
            return result == null ? Type.FIND : result;
        }

        public Builder setType(Type value) {
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
            this.type_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasFind() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxCrud.Find getFind() {
            if (this.findBuilder_ == null) {
                return this.find_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.find_;
            }
            return (MysqlxCrud.Find)this.findBuilder_.getMessage();
        }

        public Builder setFind(MysqlxCrud.Find value) {
            if (this.findBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.find_ = value;
                this.onChanged();
            } else {
                this.findBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder setFind(MysqlxCrud.Find.Builder builderForValue) {
            if (this.findBuilder_ == null) {
                this.find_ = builderForValue.build();
                this.onChanged();
            } else {
                this.findBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder mergeFind(MysqlxCrud.Find value) {
            if (this.findBuilder_ == null) {
                this.find_ = (this.bitField0_ & 2) != 0 && this.find_ != null && this.find_ != MysqlxCrud.Find.getDefaultInstance() ? MysqlxCrud.Find.newBuilder(this.find_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.findBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder clearFind() {
            if (this.findBuilder_ == null) {
                this.find_ = null;
                this.onChanged();
            } else {
                this.findBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public MysqlxCrud.Find.Builder getFindBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (MysqlxCrud.Find.Builder)this.getFindFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.FindOrBuilder getFindOrBuilder() {
            if (this.findBuilder_ != null) {
                return (MysqlxCrud.FindOrBuilder)this.findBuilder_.getMessageOrBuilder();
            }
            return this.find_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.find_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> getFindFieldBuilder() {
            if (this.findBuilder_ == null) {
                this.findBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getFind(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.find_ = null;
            }
            return this.findBuilder_;
        }

        @Override
        public boolean hasInsert() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public MysqlxCrud.Insert getInsert() {
            if (this.insertBuilder_ == null) {
                return this.insert_ == null ? MysqlxCrud.Insert.getDefaultInstance() : this.insert_;
            }
            return (MysqlxCrud.Insert)this.insertBuilder_.getMessage();
        }

        public Builder setInsert(MysqlxCrud.Insert value) {
            if (this.insertBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.insert_ = value;
                this.onChanged();
            } else {
                this.insertBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder setInsert(MysqlxCrud.Insert.Builder builderForValue) {
            if (this.insertBuilder_ == null) {
                this.insert_ = builderForValue.build();
                this.onChanged();
            } else {
                this.insertBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder mergeInsert(MysqlxCrud.Insert value) {
            if (this.insertBuilder_ == null) {
                this.insert_ = (this.bitField0_ & 4) != 0 && this.insert_ != null && this.insert_ != MysqlxCrud.Insert.getDefaultInstance() ? MysqlxCrud.Insert.newBuilder(this.insert_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.insertBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder clearInsert() {
            if (this.insertBuilder_ == null) {
                this.insert_ = null;
                this.onChanged();
            } else {
                this.insertBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public MysqlxCrud.Insert.Builder getInsertBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (MysqlxCrud.Insert.Builder)this.getInsertFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.InsertOrBuilder getInsertOrBuilder() {
            if (this.insertBuilder_ != null) {
                return (MysqlxCrud.InsertOrBuilder)this.insertBuilder_.getMessageOrBuilder();
            }
            return this.insert_ == null ? MysqlxCrud.Insert.getDefaultInstance() : this.insert_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Insert, MysqlxCrud.Insert.Builder, MysqlxCrud.InsertOrBuilder> getInsertFieldBuilder() {
            if (this.insertBuilder_ == null) {
                this.insertBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getInsert(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.insert_ = null;
            }
            return this.insertBuilder_;
        }

        @Override
        public boolean hasUpdate() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public MysqlxCrud.Update getUpdate() {
            if (this.updateBuilder_ == null) {
                return this.update_ == null ? MysqlxCrud.Update.getDefaultInstance() : this.update_;
            }
            return (MysqlxCrud.Update)this.updateBuilder_.getMessage();
        }

        public Builder setUpdate(MysqlxCrud.Update value) {
            if (this.updateBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.update_ = value;
                this.onChanged();
            } else {
                this.updateBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder setUpdate(MysqlxCrud.Update.Builder builderForValue) {
            if (this.updateBuilder_ == null) {
                this.update_ = builderForValue.build();
                this.onChanged();
            } else {
                this.updateBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder mergeUpdate(MysqlxCrud.Update value) {
            if (this.updateBuilder_ == null) {
                this.update_ = (this.bitField0_ & 8) != 0 && this.update_ != null && this.update_ != MysqlxCrud.Update.getDefaultInstance() ? MysqlxCrud.Update.newBuilder(this.update_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.updateBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder clearUpdate() {
            if (this.updateBuilder_ == null) {
                this.update_ = null;
                this.onChanged();
            } else {
                this.updateBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public MysqlxCrud.Update.Builder getUpdateBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (MysqlxCrud.Update.Builder)this.getUpdateFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.UpdateOrBuilder getUpdateOrBuilder() {
            if (this.updateBuilder_ != null) {
                return (MysqlxCrud.UpdateOrBuilder)this.updateBuilder_.getMessageOrBuilder();
            }
            return this.update_ == null ? MysqlxCrud.Update.getDefaultInstance() : this.update_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Update, MysqlxCrud.Update.Builder, MysqlxCrud.UpdateOrBuilder> getUpdateFieldBuilder() {
            if (this.updateBuilder_ == null) {
                this.updateBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getUpdate(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.update_ = null;
            }
            return this.updateBuilder_;
        }

        @Override
        public boolean hasDelete() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public MysqlxCrud.Delete getDelete() {
            if (this.deleteBuilder_ == null) {
                return this.delete_ == null ? MysqlxCrud.Delete.getDefaultInstance() : this.delete_;
            }
            return (MysqlxCrud.Delete)this.deleteBuilder_.getMessage();
        }

        public Builder setDelete(MysqlxCrud.Delete value) {
            if (this.deleteBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.delete_ = value;
                this.onChanged();
            } else {
                this.deleteBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder setDelete(MysqlxCrud.Delete.Builder builderForValue) {
            if (this.deleteBuilder_ == null) {
                this.delete_ = builderForValue.build();
                this.onChanged();
            } else {
                this.deleteBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder mergeDelete(MysqlxCrud.Delete value) {
            if (this.deleteBuilder_ == null) {
                this.delete_ = (this.bitField0_ & 0x10) != 0 && this.delete_ != null && this.delete_ != MysqlxCrud.Delete.getDefaultInstance() ? MysqlxCrud.Delete.newBuilder(this.delete_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.deleteBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder clearDelete() {
            if (this.deleteBuilder_ == null) {
                this.delete_ = null;
                this.onChanged();
            } else {
                this.deleteBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }

        public MysqlxCrud.Delete.Builder getDeleteBuilder() {
            this.bitField0_ |= 0x10;
            this.onChanged();
            return (MysqlxCrud.Delete.Builder)this.getDeleteFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.DeleteOrBuilder getDeleteOrBuilder() {
            if (this.deleteBuilder_ != null) {
                return (MysqlxCrud.DeleteOrBuilder)this.deleteBuilder_.getMessageOrBuilder();
            }
            return this.delete_ == null ? MysqlxCrud.Delete.getDefaultInstance() : this.delete_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Delete, MysqlxCrud.Delete.Builder, MysqlxCrud.DeleteOrBuilder> getDeleteFieldBuilder() {
            if (this.deleteBuilder_ == null) {
                this.deleteBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getDelete(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.delete_ = null;
            }
            return this.deleteBuilder_;
        }

        @Override
        public boolean hasStmtExecute() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public MysqlxSql.StmtExecute getStmtExecute() {
            if (this.stmtExecuteBuilder_ == null) {
                return this.stmtExecute_ == null ? MysqlxSql.StmtExecute.getDefaultInstance() : this.stmtExecute_;
            }
            return (MysqlxSql.StmtExecute)this.stmtExecuteBuilder_.getMessage();
        }

        public Builder setStmtExecute(MysqlxSql.StmtExecute value) {
            if (this.stmtExecuteBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.stmtExecute_ = value;
                this.onChanged();
            } else {
                this.stmtExecuteBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder setStmtExecute(MysqlxSql.StmtExecute.Builder builderForValue) {
            if (this.stmtExecuteBuilder_ == null) {
                this.stmtExecute_ = builderForValue.build();
                this.onChanged();
            } else {
                this.stmtExecuteBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder mergeStmtExecute(MysqlxSql.StmtExecute value) {
            if (this.stmtExecuteBuilder_ == null) {
                this.stmtExecute_ = (this.bitField0_ & 0x20) != 0 && this.stmtExecute_ != null && this.stmtExecute_ != MysqlxSql.StmtExecute.getDefaultInstance() ? MysqlxSql.StmtExecute.newBuilder(this.stmtExecute_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.stmtExecuteBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder clearStmtExecute() {
            if (this.stmtExecuteBuilder_ == null) {
                this.stmtExecute_ = null;
                this.onChanged();
            } else {
                this.stmtExecuteBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }

        public MysqlxSql.StmtExecute.Builder getStmtExecuteBuilder() {
            this.bitField0_ |= 0x20;
            this.onChanged();
            return (MysqlxSql.StmtExecute.Builder)this.getStmtExecuteFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxSql.StmtExecuteOrBuilder getStmtExecuteOrBuilder() {
            if (this.stmtExecuteBuilder_ != null) {
                return (MysqlxSql.StmtExecuteOrBuilder)this.stmtExecuteBuilder_.getMessageOrBuilder();
            }
            return this.stmtExecute_ == null ? MysqlxSql.StmtExecute.getDefaultInstance() : this.stmtExecute_;
        }

        private SingleFieldBuilderV3<MysqlxSql.StmtExecute, MysqlxSql.StmtExecute.Builder, MysqlxSql.StmtExecuteOrBuilder> getStmtExecuteFieldBuilder() {
            if (this.stmtExecuteBuilder_ == null) {
                this.stmtExecuteBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getStmtExecute(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.stmtExecute_ = null;
            }
            return this.stmtExecuteBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Type implements ProtocolMessageEnum
    {
        FIND(0),
        INSERT(1),
        UPDATE(2),
        DELETE(4),
        STMT(5);

        public static final int FIND_VALUE = 0;
        public static final int INSERT_VALUE = 1;
        public static final int UPDATE_VALUE = 2;
        public static final int DELETE_VALUE = 4;
        public static final int STMT_VALUE = 5;
        private static final Internal.EnumLiteMap<Type> internalValueMap;
        private static final Type[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int value) {
            return Type.forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 0: {
                    return FIND;
                }
                case 1: {
                    return INSERT;
                }
                case 2: {
                    return UPDATE;
                }
                case 4: {
                    return DELETE;
                }
                case 5: {
                    return STMT;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Type.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Type.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxPrepare.Prepare.OneOfMessage.getDescriptor().getEnumTypes().get(0);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Type.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Type(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Type>(){

                public Type findValueByNumber(int number) {
                    return Type.forNumber(number);
                }
            };
            VALUES = Type.values();
        }
    }
}
