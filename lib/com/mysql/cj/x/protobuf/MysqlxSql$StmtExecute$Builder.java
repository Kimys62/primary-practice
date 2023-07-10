/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxSql;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxSql.StmtExecute.Builder
extends GeneratedMessageV3.Builder<MysqlxSql.StmtExecute.Builder>
implements MysqlxSql.StmtExecuteOrBuilder {
    private int bitField0_;
    private Object namespace_ = "sql";
    private ByteString stmt_ = ByteString.EMPTY;
    private List<MysqlxDatatypes.Any> args_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> argsBuilder_;
    private boolean compactMetadata_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Sql_StmtExecute_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Sql_StmtExecute_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSql.StmtExecute.class, MysqlxSql.StmtExecute.Builder.class);
    }

    private MysqlxSql.StmtExecute.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSql.StmtExecute.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getArgsFieldBuilder();
        }
    }

    public MysqlxSql.StmtExecute.Builder clear() {
        super.clear();
        this.namespace_ = "sql";
        this.bitField0_ &= 0xFFFFFFFE;
        this.stmt_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
        } else {
            this.argsBuilder_.clear();
        }
        this.compactMetadata_ = false;
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Sql_StmtExecute_descriptor;
    }

    public MysqlxSql.StmtExecute getDefaultInstanceForType() {
        return MysqlxSql.StmtExecute.getDefaultInstance();
    }

    public MysqlxSql.StmtExecute build() {
        MysqlxSql.StmtExecute result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSql.StmtExecute.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSql.StmtExecute buildPartial() {
        MysqlxSql.StmtExecute result = new MysqlxSql.StmtExecute(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.namespace_ = this.namespace_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.stmt_ = this.stmt_;
        if (this.argsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
                this.bitField0_ &= 0xFFFFFFFB;
            }
            result.args_ = this.args_;
        } else {
            result.args_ = this.argsBuilder_.build();
        }
        if ((from_bitField0_ & 8) != 0) {
            result.compactMetadata_ = this.compactMetadata_;
            to_bitField0_ |= 4;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxSql.StmtExecute.Builder clone() {
        return (MysqlxSql.StmtExecute.Builder)super.clone();
    }

    public MysqlxSql.StmtExecute.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSql.StmtExecute.Builder)super.setField(field, value);
    }

    public MysqlxSql.StmtExecute.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSql.StmtExecute.Builder)super.clearField(field);
    }

    public MysqlxSql.StmtExecute.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSql.StmtExecute.Builder)super.clearOneof(oneof);
    }

    public MysqlxSql.StmtExecute.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSql.StmtExecute.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSql.StmtExecute.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSql.StmtExecute.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSql.StmtExecute.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSql.StmtExecute) {
            return this.mergeFrom((MysqlxSql.StmtExecute)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSql.StmtExecute.Builder mergeFrom(MysqlxSql.StmtExecute other) {
        if (other == MysqlxSql.StmtExecute.getDefaultInstance()) {
            return this;
        }
        if (other.hasNamespace()) {
            this.bitField0_ |= 1;
            this.namespace_ = other.namespace_;
            this.onChanged();
        }
        if (other.hasStmt()) {
            this.setStmt(other.getStmt());
        }
        if (this.argsBuilder_ == null) {
            if (!other.args_.isEmpty()) {
                if (this.args_.isEmpty()) {
                    this.args_ = other.args_;
                    this.bitField0_ &= 0xFFFFFFFB;
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
                this.bitField0_ &= 0xFFFFFFFB;
                this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
            } else {
                this.argsBuilder_.addAllMessages((Iterable)other.args_);
            }
        }
        if (other.hasCompactMetadata()) {
            this.setCompactMetadata(other.getCompactMetadata());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasStmt()) {
            return false;
        }
        for (int i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxSql.StmtExecute.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSql.StmtExecute parsedMessage = null;
        try {
            parsedMessage = (MysqlxSql.StmtExecute)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSql.StmtExecute)e.getUnfinishedMessage();
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
    public boolean hasNamespace() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getNamespace() {
        Object ref = this.namespace_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.namespace_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getNamespaceBytes() {
        Object ref = this.namespace_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.namespace_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxSql.StmtExecute.Builder setNamespace(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.namespace_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSql.StmtExecute.Builder clearNamespace() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.namespace_ = MysqlxSql.StmtExecute.getDefaultInstance().getNamespace();
        this.onChanged();
        return this;
    }

    public MysqlxSql.StmtExecute.Builder setNamespaceBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.namespace_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasStmt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getStmt() {
        return this.stmt_;
    }

    public MysqlxSql.StmtExecute.Builder setStmt(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.stmt_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSql.StmtExecute.Builder clearStmt() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.stmt_ = MysqlxSql.StmtExecute.getDefaultInstance().getStmt();
        this.onChanged();
        return this;
    }

    private void ensureArgsIsMutable() {
        if ((this.bitField0_ & 4) == 0) {
            this.args_ = new ArrayList<MysqlxDatatypes.Any>(this.args_);
            this.bitField0_ |= 4;
        }
    }

    @Override
    public List<MysqlxDatatypes.Any> getArgsList() {
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
    public MysqlxDatatypes.Any getArgs(int index) {
        if (this.argsBuilder_ == null) {
            return this.args_.get(index);
        }
        return (MysqlxDatatypes.Any)this.argsBuilder_.getMessage(index);
    }

    public MysqlxSql.StmtExecute.Builder setArgs(int index, MysqlxDatatypes.Any value) {
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

    public MysqlxSql.StmtExecute.Builder setArgs(int index, MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxSql.StmtExecute.Builder addArgs(MysqlxDatatypes.Any value) {
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

    public MysqlxSql.StmtExecute.Builder addArgs(int index, MysqlxDatatypes.Any value) {
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

    public MysqlxSql.StmtExecute.Builder addArgs(MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxSql.StmtExecute.Builder addArgs(int index, MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxSql.StmtExecute.Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Any> values) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.args_);
            this.onChanged();
        } else {
            this.argsBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxSql.StmtExecute.Builder clearArgs() {
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.argsBuilder_.clear();
        }
        return this;
    }

    public MysqlxSql.StmtExecute.Builder removeArgs(int index) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.remove(index);
            this.onChanged();
        } else {
            this.argsBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxDatatypes.Any.Builder getArgsBuilder(int index) {
        return (MysqlxDatatypes.Any.Builder)this.getArgsFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxDatatypes.AnyOrBuilder getArgsOrBuilder(int index) {
        if (this.argsBuilder_ == null) {
            return this.args_.get(index);
        }
        return (MysqlxDatatypes.AnyOrBuilder)this.argsBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxDatatypes.AnyOrBuilder> getArgsOrBuilderList() {
        if (this.argsBuilder_ != null) {
            return this.argsBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.args_);
    }

    public MysqlxDatatypes.Any.Builder addArgsBuilder() {
        return (MysqlxDatatypes.Any.Builder)this.getArgsFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Any.getDefaultInstance());
    }

    public MysqlxDatatypes.Any.Builder addArgsBuilder(int index) {
        return (MysqlxDatatypes.Any.Builder)this.getArgsFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Any.getDefaultInstance());
    }

    public List<MysqlxDatatypes.Any.Builder> getArgsBuilderList() {
        return this.getArgsFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> getArgsFieldBuilder() {
        if (this.argsBuilder_ == null) {
            this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.args_ = null;
        }
        return this.argsBuilder_;
    }

    @Override
    public boolean hasCompactMetadata() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public boolean getCompactMetadata() {
        return this.compactMetadata_;
    }

    public MysqlxSql.StmtExecute.Builder setCompactMetadata(boolean value) {
        this.bitField0_ |= 8;
        this.compactMetadata_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSql.StmtExecute.Builder clearCompactMetadata() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.compactMetadata_ = false;
        this.onChanged();
        return this;
    }

    public final MysqlxSql.StmtExecute.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSql.StmtExecute.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSql.StmtExecute.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSql.StmtExecute.Builder)super.mergeUnknownFields(unknownFields);
    }
}
