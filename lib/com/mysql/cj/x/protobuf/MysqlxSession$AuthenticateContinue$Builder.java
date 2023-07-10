/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxSession;
import java.io.IOException;

public static final class MysqlxSession.AuthenticateContinue.Builder
extends GeneratedMessageV3.Builder<MysqlxSession.AuthenticateContinue.Builder>
implements MysqlxSession.AuthenticateContinueOrBuilder {
    private int bitField0_;
    private ByteString authData_ = ByteString.EMPTY;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Session_AuthenticateContinue_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_AuthenticateContinue_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateContinue.class, MysqlxSession.AuthenticateContinue.Builder.class);
    }

    private MysqlxSession.AuthenticateContinue.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSession.AuthenticateContinue.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxSession.AuthenticateContinue.Builder clear() {
        super.clear();
        this.authData_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Session_AuthenticateContinue_descriptor;
    }

    public MysqlxSession.AuthenticateContinue getDefaultInstanceForType() {
        return MysqlxSession.AuthenticateContinue.getDefaultInstance();
    }

    public MysqlxSession.AuthenticateContinue build() {
        MysqlxSession.AuthenticateContinue result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSession.AuthenticateContinue.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSession.AuthenticateContinue buildPartial() {
        MysqlxSession.AuthenticateContinue result = new MysqlxSession.AuthenticateContinue(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.authData_ = this.authData_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxSession.AuthenticateContinue.Builder clone() {
        return (MysqlxSession.AuthenticateContinue.Builder)super.clone();
    }

    public MysqlxSession.AuthenticateContinue.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.setField(field, value);
    }

    public MysqlxSession.AuthenticateContinue.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.clearField(field);
    }

    public MysqlxSession.AuthenticateContinue.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.clearOneof(oneof);
    }

    public MysqlxSession.AuthenticateContinue.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSession.AuthenticateContinue.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSession.AuthenticateContinue.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSession.AuthenticateContinue) {
            return this.mergeFrom((MysqlxSession.AuthenticateContinue)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSession.AuthenticateContinue.Builder mergeFrom(MysqlxSession.AuthenticateContinue other) {
        if (other == MysqlxSession.AuthenticateContinue.getDefaultInstance()) {
            return this;
        }
        if (other.hasAuthData()) {
            this.setAuthData(other.getAuthData());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasAuthData();
    }

    public MysqlxSession.AuthenticateContinue.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSession.AuthenticateContinue parsedMessage = null;
        try {
            parsedMessage = (MysqlxSession.AuthenticateContinue)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSession.AuthenticateContinue)e.getUnfinishedMessage();
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
    public boolean hasAuthData() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public ByteString getAuthData() {
        return this.authData_;
    }

    public MysqlxSession.AuthenticateContinue.Builder setAuthData(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.authData_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSession.AuthenticateContinue.Builder clearAuthData() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.authData_ = MysqlxSession.AuthenticateContinue.getDefaultInstance().getAuthData();
        this.onChanged();
        return this;
    }

    public final MysqlxSession.AuthenticateContinue.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSession.AuthenticateContinue.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.AuthenticateContinue.Builder)super.mergeUnknownFields(unknownFields);
    }
}
