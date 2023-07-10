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

public static final class MysqlxSession.AuthenticateOk.Builder
extends GeneratedMessageV3.Builder<MysqlxSession.AuthenticateOk.Builder>
implements MysqlxSession.AuthenticateOkOrBuilder {
    private int bitField0_;
    private ByteString authData_ = ByteString.EMPTY;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Session_AuthenticateOk_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_AuthenticateOk_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateOk.class, MysqlxSession.AuthenticateOk.Builder.class);
    }

    private MysqlxSession.AuthenticateOk.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSession.AuthenticateOk.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxSession.AuthenticateOk.Builder clear() {
        super.clear();
        this.authData_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Session_AuthenticateOk_descriptor;
    }

    public MysqlxSession.AuthenticateOk getDefaultInstanceForType() {
        return MysqlxSession.AuthenticateOk.getDefaultInstance();
    }

    public MysqlxSession.AuthenticateOk build() {
        MysqlxSession.AuthenticateOk result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSession.AuthenticateOk.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSession.AuthenticateOk buildPartial() {
        MysqlxSession.AuthenticateOk result = new MysqlxSession.AuthenticateOk(this, null);
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

    public MysqlxSession.AuthenticateOk.Builder clone() {
        return (MysqlxSession.AuthenticateOk.Builder)super.clone();
    }

    public MysqlxSession.AuthenticateOk.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.AuthenticateOk.Builder)super.setField(field, value);
    }

    public MysqlxSession.AuthenticateOk.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSession.AuthenticateOk.Builder)super.clearField(field);
    }

    public MysqlxSession.AuthenticateOk.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSession.AuthenticateOk.Builder)super.clearOneof(oneof);
    }

    public MysqlxSession.AuthenticateOk.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSession.AuthenticateOk.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSession.AuthenticateOk.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.AuthenticateOk.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSession.AuthenticateOk.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSession.AuthenticateOk) {
            return this.mergeFrom((MysqlxSession.AuthenticateOk)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSession.AuthenticateOk.Builder mergeFrom(MysqlxSession.AuthenticateOk other) {
        if (other == MysqlxSession.AuthenticateOk.getDefaultInstance()) {
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
        return true;
    }

    public MysqlxSession.AuthenticateOk.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSession.AuthenticateOk parsedMessage = null;
        try {
            parsedMessage = (MysqlxSession.AuthenticateOk)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSession.AuthenticateOk)e.getUnfinishedMessage();
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

    public MysqlxSession.AuthenticateOk.Builder setAuthData(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.authData_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSession.AuthenticateOk.Builder clearAuthData() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.authData_ = MysqlxSession.AuthenticateOk.getDefaultInstance().getAuthData();
        this.onChanged();
        return this;
    }

    public final MysqlxSession.AuthenticateOk.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.AuthenticateOk.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSession.AuthenticateOk.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.AuthenticateOk.Builder)super.mergeUnknownFields(unknownFields);
    }
}
