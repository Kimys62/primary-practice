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
import com.mysql.cj.x.protobuf.Mysqlx;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class Mysqlx.ServerMessages
extends GeneratedMessageV3
implements Mysqlx.ServerMessagesOrBuilder {
    private static final long serialVersionUID = 0L;
    private byte memoizedIsInitialized = (byte)-1;
    private static final Mysqlx.ServerMessages DEFAULT_INSTANCE = new Mysqlx.ServerMessages();
    @Deprecated
    public static final Parser<Mysqlx.ServerMessages> PARSER = new AbstractParser<Mysqlx.ServerMessages>(){

        public Mysqlx.ServerMessages parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Mysqlx.ServerMessages(input, extensionRegistry);
        }
    };

    private Mysqlx.ServerMessages(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Mysqlx.ServerMessages() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Mysqlx.ServerMessages();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Mysqlx.ServerMessages(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block9: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block9;
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
        return internal_static_Mysqlx_ServerMessages_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_ServerMessages_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.ServerMessages.class, Builder.class);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mysqlx.ServerMessages)) {
            return super.equals(obj);
        }
        Mysqlx.ServerMessages other = (Mysqlx.ServerMessages)obj;
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + Mysqlx.ServerMessages.getDescriptor().hashCode();
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static Mysqlx.ServerMessages parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Mysqlx.ServerMessages)PARSER.parseFrom(data);
    }

    public static Mysqlx.ServerMessages parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.ServerMessages)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.ServerMessages parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Mysqlx.ServerMessages)PARSER.parseFrom(data);
    }

    public static Mysqlx.ServerMessages parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.ServerMessages)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.ServerMessages parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Mysqlx.ServerMessages)PARSER.parseFrom(data);
    }

    public static Mysqlx.ServerMessages parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.ServerMessages)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.ServerMessages parseFrom(InputStream input) throws IOException {
        return (Mysqlx.ServerMessages)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.ServerMessages parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.ServerMessages)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.ServerMessages parseDelimitedFrom(InputStream input) throws IOException {
        return (Mysqlx.ServerMessages)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.ServerMessages parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.ServerMessages)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.ServerMessages parseFrom(CodedInputStream input) throws IOException {
        return (Mysqlx.ServerMessages)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static Mysqlx.ServerMessages parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.ServerMessages)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return Mysqlx.ServerMessages.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Mysqlx.ServerMessages prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static Mysqlx.ServerMessages getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Mysqlx.ServerMessages> parser() {
        return PARSER;
    }

    public Parser<Mysqlx.ServerMessages> getParserForType() {
        return PARSER;
    }

    public Mysqlx.ServerMessages getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements Mysqlx.ServerMessagesOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_ServerMessages_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_ServerMessages_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.ServerMessages.class, Builder.class);
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
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_ServerMessages_descriptor;
        }

        public Mysqlx.ServerMessages getDefaultInstanceForType() {
            return Mysqlx.ServerMessages.getDefaultInstance();
        }

        public Mysqlx.ServerMessages build() {
            Mysqlx.ServerMessages result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public Mysqlx.ServerMessages buildPartial() {
            Mysqlx.ServerMessages result = new Mysqlx.ServerMessages(this);
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
            if (other instanceof Mysqlx.ServerMessages) {
                return this.mergeFrom((Mysqlx.ServerMessages)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Mysqlx.ServerMessages other) {
            if (other == Mysqlx.ServerMessages.getDefaultInstance()) {
                return this;
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Mysqlx.ServerMessages parsedMessage = null;
            try {
                parsedMessage = (Mysqlx.ServerMessages)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (Mysqlx.ServerMessages)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
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
        OK(0),
        ERROR(1),
        CONN_CAPABILITIES(2),
        SESS_AUTHENTICATE_CONTINUE(3),
        SESS_AUTHENTICATE_OK(4),
        NOTICE(11),
        RESULTSET_COLUMN_META_DATA(12),
        RESULTSET_ROW(13),
        RESULTSET_FETCH_DONE(14),
        RESULTSET_FETCH_SUSPENDED(15),
        RESULTSET_FETCH_DONE_MORE_RESULTSETS(16),
        SQL_STMT_EXECUTE_OK(17),
        RESULTSET_FETCH_DONE_MORE_OUT_PARAMS(18),
        COMPRESSION(19);

        public static final int OK_VALUE = 0;
        public static final int ERROR_VALUE = 1;
        public static final int CONN_CAPABILITIES_VALUE = 2;
        public static final int SESS_AUTHENTICATE_CONTINUE_VALUE = 3;
        public static final int SESS_AUTHENTICATE_OK_VALUE = 4;
        public static final int NOTICE_VALUE = 11;
        public static final int RESULTSET_COLUMN_META_DATA_VALUE = 12;
        public static final int RESULTSET_ROW_VALUE = 13;
        public static final int RESULTSET_FETCH_DONE_VALUE = 14;
        public static final int RESULTSET_FETCH_SUSPENDED_VALUE = 15;
        public static final int RESULTSET_FETCH_DONE_MORE_RESULTSETS_VALUE = 16;
        public static final int SQL_STMT_EXECUTE_OK_VALUE = 17;
        public static final int RESULTSET_FETCH_DONE_MORE_OUT_PARAMS_VALUE = 18;
        public static final int COMPRESSION_VALUE = 19;
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
                    return OK;
                }
                case 1: {
                    return ERROR;
                }
                case 2: {
                    return CONN_CAPABILITIES;
                }
                case 3: {
                    return SESS_AUTHENTICATE_CONTINUE;
                }
                case 4: {
                    return SESS_AUTHENTICATE_OK;
                }
                case 11: {
                    return NOTICE;
                }
                case 12: {
                    return RESULTSET_COLUMN_META_DATA;
                }
                case 13: {
                    return RESULTSET_ROW;
                }
                case 14: {
                    return RESULTSET_FETCH_DONE;
                }
                case 15: {
                    return RESULTSET_FETCH_SUSPENDED;
                }
                case 16: {
                    return RESULTSET_FETCH_DONE_MORE_RESULTSETS;
                }
                case 17: {
                    return SQL_STMT_EXECUTE_OK;
                }
                case 18: {
                    return RESULTSET_FETCH_DONE_MORE_OUT_PARAMS;
                }
                case 19: {
                    return COMPRESSION;
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
            return (Descriptors.EnumDescriptor)Mysqlx.ServerMessages.getDescriptor().getEnumTypes().get(0);
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
