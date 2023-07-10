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
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;

public static final class MysqlxNotice.GroupReplicationStateChanged.Builder
extends GeneratedMessageV3.Builder<MysqlxNotice.GroupReplicationStateChanged.Builder>
implements MysqlxNotice.GroupReplicationStateChangedOrBuilder {
    private int bitField0_;
    private int type_;
    private Object viewId_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.GroupReplicationStateChanged.class, MysqlxNotice.GroupReplicationStateChanged.Builder.class);
    }

    private MysqlxNotice.GroupReplicationStateChanged.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxNotice.GroupReplicationStateChanged.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder clear() {
        super.clear();
        this.type_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        this.viewId_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_descriptor;
    }

    public MysqlxNotice.GroupReplicationStateChanged getDefaultInstanceForType() {
        return MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance();
    }

    public MysqlxNotice.GroupReplicationStateChanged build() {
        MysqlxNotice.GroupReplicationStateChanged result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxNotice.GroupReplicationStateChanged.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxNotice.GroupReplicationStateChanged buildPartial() {
        MysqlxNotice.GroupReplicationStateChanged result = new MysqlxNotice.GroupReplicationStateChanged(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.type_ = this.type_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.viewId_ = this.viewId_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder clone() {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.clone();
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.setField(field, value);
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.clearField(field);
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.clearOneof(oneof);
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxNotice.GroupReplicationStateChanged) {
            return this.mergeFrom((MysqlxNotice.GroupReplicationStateChanged)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder mergeFrom(MysqlxNotice.GroupReplicationStateChanged other) {
        if (other == MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasViewId()) {
            this.bitField0_ |= 2;
            this.viewId_ = other.viewId_;
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasType();
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxNotice.GroupReplicationStateChanged parsedMessage = null;
        try {
            parsedMessage = (MysqlxNotice.GroupReplicationStateChanged)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxNotice.GroupReplicationStateChanged)e.getUnfinishedMessage();
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
    public int getType() {
        return this.type_;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder setType(int value) {
        this.bitField0_ |= 1;
        this.type_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasViewId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getViewId() {
        Object ref = this.viewId_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.viewId_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getViewIdBytes() {
        Object ref = this.viewId_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.viewId_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder setViewId(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.viewId_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder clearViewId() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.viewId_ = MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().getViewId();
        this.onChanged();
        return this;
    }

    public MysqlxNotice.GroupReplicationStateChanged.Builder setViewIdBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.viewId_ = value;
        this.onChanged();
        return this;
    }

    public final MysqlxNotice.GroupReplicationStateChanged.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxNotice.GroupReplicationStateChanged.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.GroupReplicationStateChanged.Builder)super.mergeUnknownFields(unknownFields);
    }
}
