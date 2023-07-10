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

public static final class Mysqlx.ClientMessages
extends GeneratedMessageV3
implements Mysqlx.ClientMessagesOrBuilder {
    private static final long serialVersionUID = 0L;
    private byte memoizedIsInitialized = (byte)-1;
    private static final Mysqlx.ClientMessages DEFAULT_INSTANCE = new Mysqlx.ClientMessages();
    @Deprecated
    public static final Parser<Mysqlx.ClientMessages> PARSER = new AbstractParser<Mysqlx.ClientMessages>(){

        public Mysqlx.ClientMessages parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Mysqlx.ClientMessages(input, extensionRegistry);
        }
    };

    private Mysqlx.ClientMessages(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Mysqlx.ClientMessages() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Mysqlx.ClientMessages();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Mysqlx.ClientMessages(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
        return internal_static_Mysqlx_ClientMessages_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_ClientMessages_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.ClientMessages.class, Builder.class);
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
        if (!(obj instanceof Mysqlx.ClientMessages)) {
            return super.equals(obj);
        }
        Mysqlx.ClientMessages other = (Mysqlx.ClientMessages)obj;
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + Mysqlx.ClientMessages.getDescriptor().hashCode();
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static Mysqlx.ClientMessages parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Mysqlx.ClientMessages)PARSER.parseFrom(data);
    }

    public static Mysqlx.ClientMessages parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.ClientMessages)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.ClientMessages parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Mysqlx.ClientMessages)PARSER.parseFrom(data);
    }

    public static Mysqlx.ClientMessages parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.ClientMessages)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.ClientMessages parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Mysqlx.ClientMessages)PARSER.parseFrom(data);
    }

    public static Mysqlx.ClientMessages parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mysqlx.ClientMessages)PARSER.parseFrom(data, extensionRegistry);
    }

    public static Mysqlx.ClientMessages parseFrom(InputStream input) throws IOException {
        return (Mysqlx.ClientMessages)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.ClientMessages parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.ClientMessages)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.ClientMessages parseDelimitedFrom(InputStream input) throws IOException {
        return (Mysqlx.ClientMessages)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static Mysqlx.ClientMessages parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.ClientMessages)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static Mysqlx.ClientMessages parseFrom(CodedInputStream input) throws IOException {
        return (Mysqlx.ClientMessages)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static Mysqlx.ClientMessages parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mysqlx.ClientMessages)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return Mysqlx.ClientMessages.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Mysqlx.ClientMessages prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static Mysqlx.ClientMessages getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Mysqlx.ClientMessages> parser() {
        return PARSER;
    }

    public Parser<Mysqlx.ClientMessages> getParserForType() {
        return PARSER;
    }

    public Mysqlx.ClientMessages getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements Mysqlx.ClientMessagesOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_ClientMessages_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_ClientMessages_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.ClientMessages.class, Builder.class);
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
            return internal_static_Mysqlx_ClientMessages_descriptor;
        }

        public Mysqlx.ClientMessages getDefaultInstanceForType() {
            return Mysqlx.ClientMessages.getDefaultInstance();
        }

        public Mysqlx.ClientMessages build() {
            Mysqlx.ClientMessages result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public Mysqlx.ClientMessages buildPartial() {
            Mysqlx.ClientMessages result = new Mysqlx.ClientMessages(this);
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
            if (other instanceof Mysqlx.ClientMessages) {
                return this.mergeFrom((Mysqlx.ClientMessages)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Mysqlx.ClientMessages other) {
            if (other == Mysqlx.ClientMessages.getDefaultInstance()) {
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
            Mysqlx.ClientMessages parsedMessage = null;
            try {
                parsedMessage = (Mysqlx.ClientMessages)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (Mysqlx.ClientMessages)e.getUnfinishedMessage();
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
        CON_CAPABILITIES_GET(1),
        CON_CAPABILITIES_SET(2),
        CON_CLOSE(3),
        SESS_AUTHENTICATE_START(4),
        SESS_AUTHENTICATE_CONTINUE(5),
        SESS_RESET(6),
        SESS_CLOSE(7),
        SQL_STMT_EXECUTE(12),
        CRUD_FIND(17),
        CRUD_INSERT(18),
        CRUD_UPDATE(19),
        CRUD_DELETE(20),
        EXPECT_OPEN(24),
        EXPECT_CLOSE(25),
        CRUD_CREATE_VIEW(30),
        CRUD_MODIFY_VIEW(31),
        CRUD_DROP_VIEW(32),
        PREPARE_PREPARE(40),
        PREPARE_EXECUTE(41),
        PREPARE_DEALLOCATE(42),
        CURSOR_OPEN(43),
        CURSOR_CLOSE(44),
        CURSOR_FETCH(45),
        COMPRESSION(46);

        public static final int CON_CAPABILITIES_GET_VALUE = 1;
        public static final int CON_CAPABILITIES_SET_VALUE = 2;
        public static final int CON_CLOSE_VALUE = 3;
        public static final int SESS_AUTHENTICATE_START_VALUE = 4;
        public static final int SESS_AUTHENTICATE_CONTINUE_VALUE = 5;
        public static final int SESS_RESET_VALUE = 6;
        public static final int SESS_CLOSE_VALUE = 7;
        public static final int SQL_STMT_EXECUTE_VALUE = 12;
        public static final int CRUD_FIND_VALUE = 17;
        public static final int CRUD_INSERT_VALUE = 18;
        public static final int CRUD_UPDATE_VALUE = 19;
        public static final int CRUD_DELETE_VALUE = 20;
        public static final int EXPECT_OPEN_VALUE = 24;
        public static final int EXPECT_CLOSE_VALUE = 25;
        public static final int CRUD_CREATE_VIEW_VALUE = 30;
        public static final int CRUD_MODIFY_VIEW_VALUE = 31;
        public static final int CRUD_DROP_VIEW_VALUE = 32;
        public static final int PREPARE_PREPARE_VALUE = 40;
        public static final int PREPARE_EXECUTE_VALUE = 41;
        public static final int PREPARE_DEALLOCATE_VALUE = 42;
        public static final int CURSOR_OPEN_VALUE = 43;
        public static final int CURSOR_CLOSE_VALUE = 44;
        public static final int CURSOR_FETCH_VALUE = 45;
        public static final int COMPRESSION_VALUE = 46;
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
                case 1: {
                    return CON_CAPABILITIES_GET;
                }
                case 2: {
                    return CON_CAPABILITIES_SET;
                }
                case 3: {
                    return CON_CLOSE;
                }
                case 4: {
                    return SESS_AUTHENTICATE_START;
                }
                case 5: {
                    return SESS_AUTHENTICATE_CONTINUE;
                }
                case 6: {
                    return SESS_RESET;
                }
                case 7: {
                    return SESS_CLOSE;
                }
                case 12: {
                    return SQL_STMT_EXECUTE;
                }
                case 17: {
                    return CRUD_FIND;
                }
                case 18: {
                    return CRUD_INSERT;
                }
                case 19: {
                    return CRUD_UPDATE;
                }
                case 20: {
                    return CRUD_DELETE;
                }
                case 24: {
                    return EXPECT_OPEN;
                }
                case 25: {
                    return EXPECT_CLOSE;
                }
                case 30: {
                    return CRUD_CREATE_VIEW;
                }
                case 31: {
                    return CRUD_MODIFY_VIEW;
                }
                case 32: {
                    return CRUD_DROP_VIEW;
                }
                case 40: {
                    return PREPARE_PREPARE;
                }
                case 41: {
                    return PREPARE_EXECUTE;
                }
                case 42: {
                    return PREPARE_DEALLOCATE;
                }
                case 43: {
                    return CURSOR_OPEN;
                }
                case 44: {
                    return CURSOR_CLOSE;
                }
                case 45: {
                    return CURSOR_FETCH;
                }
                case 46: {
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
            return (Descriptors.EnumDescriptor)Mysqlx.ClientMessages.getDescriptor().getEnumTypes().get(0);
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
