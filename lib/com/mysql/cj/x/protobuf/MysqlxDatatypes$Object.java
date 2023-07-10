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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxDatatypes.Object
extends GeneratedMessageV3
implements MysqlxDatatypes.ObjectOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int FLD_FIELD_NUMBER = 1;
    private List<ObjectField> fld_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxDatatypes.Object DEFAULT_INSTANCE = new MysqlxDatatypes.Object();
    @Deprecated
    public static final Parser<MysqlxDatatypes.Object> PARSER = new AbstractParser<MysqlxDatatypes.Object>(){

        public MysqlxDatatypes.Object parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxDatatypes.Object(input, extensionRegistry);
        }
    };

    private MysqlxDatatypes.Object(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxDatatypes.Object() {
        this.fld_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxDatatypes.Object();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxDatatypes.Object(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.fld_ = new ArrayList<ObjectField>();
                            mutable_bitField0_ |= true;
                        }
                        this.fld_.add((ObjectField)input.readMessage(ObjectField.PARSER, extensionRegistry));
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
                this.fld_ = Collections.unmodifiableList(this.fld_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Object_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Object_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Object.class, Builder.class);
    }

    @Override
    public List<ObjectField> getFldList() {
        return this.fld_;
    }

    @Override
    public List<? extends ObjectFieldOrBuilder> getFldOrBuilderList() {
        return this.fld_;
    }

    @Override
    public int getFldCount() {
        return this.fld_.size();
    }

    @Override
    public ObjectField getFld(int index) {
        return this.fld_.get(index);
    }

    @Override
    public ObjectFieldOrBuilder getFldOrBuilder(int index) {
        return this.fld_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        for (int i = 0; i < this.getFldCount(); ++i) {
            if (this.getFld(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i = 0; i < this.fld_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.fld_.get(i));
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        for (int i = 0; i < this.fld_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.fld_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxDatatypes.Object)) {
            return super.equals(obj);
        }
        MysqlxDatatypes.Object other = (MysqlxDatatypes.Object)obj;
        if (!this.getFldList().equals(other.getFldList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxDatatypes.Object.getDescriptor().hashCode();
        if (this.getFldCount() > 0) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFldList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxDatatypes.Object parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Object)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Object parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Object)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Object parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Object)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Object parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Object)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Object parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Object)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Object parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Object)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Object parseFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Object)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Object parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Object)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Object parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Object)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Object parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Object)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Object parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxDatatypes.Object)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxDatatypes.Object parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Object)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxDatatypes.Object.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxDatatypes.Object prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxDatatypes.Object getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxDatatypes.Object> parser() {
        return PARSER;
    }

    public Parser<MysqlxDatatypes.Object> getParserForType() {
        return PARSER;
    }

    public MysqlxDatatypes.Object getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxDatatypes.ObjectOrBuilder {
        private int bitField0_;
        private List<ObjectField> fld_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<ObjectField, ObjectField.Builder, ObjectFieldOrBuilder> fldBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Datatypes_Object_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Object_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Object.class, Builder.class);
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
                this.getFldFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.fldBuilder_ == null) {
                this.fld_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
            } else {
                this.fldBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Datatypes_Object_descriptor;
        }

        public MysqlxDatatypes.Object getDefaultInstanceForType() {
            return MysqlxDatatypes.Object.getDefaultInstance();
        }

        public MysqlxDatatypes.Object build() {
            MysqlxDatatypes.Object result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxDatatypes.Object buildPartial() {
            MysqlxDatatypes.Object result = new MysqlxDatatypes.Object(this);
            int from_bitField0_ = this.bitField0_;
            if (this.fldBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.fld_ = Collections.unmodifiableList(this.fld_);
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.fld_ = this.fld_;
            } else {
                result.fld_ = this.fldBuilder_.build();
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
            if (other instanceof MysqlxDatatypes.Object) {
                return this.mergeFrom((MysqlxDatatypes.Object)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxDatatypes.Object other) {
            if (other == MysqlxDatatypes.Object.getDefaultInstance()) {
                return this;
            }
            if (this.fldBuilder_ == null) {
                if (!other.fld_.isEmpty()) {
                    if (this.fld_.isEmpty()) {
                        this.fld_ = other.fld_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    } else {
                        this.ensureFldIsMutable();
                        this.fld_.addAll(other.fld_);
                    }
                    this.onChanged();
                }
            } else if (!other.fld_.isEmpty()) {
                if (this.fldBuilder_.isEmpty()) {
                    this.fldBuilder_.dispose();
                    this.fldBuilder_ = null;
                    this.fld_ = other.fld_;
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.fldBuilder_ = alwaysUseFieldBuilders ? this.getFldFieldBuilder() : null;
                } else {
                    this.fldBuilder_.addAllMessages((Iterable)other.fld_);
                }
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < this.getFldCount(); ++i) {
                if (this.getFld(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxDatatypes.Object parsedMessage = null;
            try {
                parsedMessage = (MysqlxDatatypes.Object)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxDatatypes.Object)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureFldIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.fld_ = new ArrayList<ObjectField>(this.fld_);
                this.bitField0_ |= 1;
            }
        }

        @Override
        public List<ObjectField> getFldList() {
            if (this.fldBuilder_ == null) {
                return Collections.unmodifiableList(this.fld_);
            }
            return this.fldBuilder_.getMessageList();
        }

        @Override
        public int getFldCount() {
            if (this.fldBuilder_ == null) {
                return this.fld_.size();
            }
            return this.fldBuilder_.getCount();
        }

        @Override
        public ObjectField getFld(int index) {
            if (this.fldBuilder_ == null) {
                return this.fld_.get(index);
            }
            return (ObjectField)this.fldBuilder_.getMessage(index);
        }

        public Builder setFld(int index, ObjectField value) {
            if (this.fldBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureFldIsMutable();
                this.fld_.set(index, value);
                this.onChanged();
            } else {
                this.fldBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setFld(int index, ObjectField.Builder builderForValue) {
            if (this.fldBuilder_ == null) {
                this.ensureFldIsMutable();
                this.fld_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.fldBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addFld(ObjectField value) {
            if (this.fldBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureFldIsMutable();
                this.fld_.add(value);
                this.onChanged();
            } else {
                this.fldBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addFld(int index, ObjectField value) {
            if (this.fldBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureFldIsMutable();
                this.fld_.add(index, value);
                this.onChanged();
            } else {
                this.fldBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addFld(ObjectField.Builder builderForValue) {
            if (this.fldBuilder_ == null) {
                this.ensureFldIsMutable();
                this.fld_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.fldBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addFld(int index, ObjectField.Builder builderForValue) {
            if (this.fldBuilder_ == null) {
                this.ensureFldIsMutable();
                this.fld_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.fldBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllFld(Iterable<? extends ObjectField> values) {
            if (this.fldBuilder_ == null) {
                this.ensureFldIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.fld_);
                this.onChanged();
            } else {
                this.fldBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearFld() {
            if (this.fldBuilder_ == null) {
                this.fld_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
            } else {
                this.fldBuilder_.clear();
            }
            return this;
        }

        public Builder removeFld(int index) {
            if (this.fldBuilder_ == null) {
                this.ensureFldIsMutable();
                this.fld_.remove(index);
                this.onChanged();
            } else {
                this.fldBuilder_.remove(index);
            }
            return this;
        }

        public ObjectField.Builder getFldBuilder(int index) {
            return (ObjectField.Builder)this.getFldFieldBuilder().getBuilder(index);
        }

        @Override
        public ObjectFieldOrBuilder getFldOrBuilder(int index) {
            if (this.fldBuilder_ == null) {
                return this.fld_.get(index);
            }
            return (ObjectFieldOrBuilder)this.fldBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends ObjectFieldOrBuilder> getFldOrBuilderList() {
            if (this.fldBuilder_ != null) {
                return this.fldBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.fld_);
        }

        public ObjectField.Builder addFldBuilder() {
            return (ObjectField.Builder)this.getFldFieldBuilder().addBuilder((AbstractMessage)ObjectField.getDefaultInstance());
        }

        public ObjectField.Builder addFldBuilder(int index) {
            return (ObjectField.Builder)this.getFldFieldBuilder().addBuilder(index, (AbstractMessage)ObjectField.getDefaultInstance());
        }

        public List<ObjectField.Builder> getFldBuilderList() {
            return this.getFldFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ObjectField, ObjectField.Builder, ObjectFieldOrBuilder> getFldFieldBuilder() {
            if (this.fldBuilder_ == null) {
                this.fldBuilder_ = new RepeatedFieldBuilderV3(this.fld_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.fld_ = null;
            }
            return this.fldBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static final class ObjectField
    extends GeneratedMessageV3
    implements ObjectFieldOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int KEY_FIELD_NUMBER = 1;
        private volatile Object key_;
        public static final int VALUE_FIELD_NUMBER = 2;
        private MysqlxDatatypes.Any value_;
        private byte memoizedIsInitialized = (byte)-1;
        private static final ObjectField DEFAULT_INSTANCE = new ObjectField();
        @Deprecated
        public static final Parser<ObjectField> PARSER = new AbstractParser<ObjectField>(){

            public ObjectField parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ObjectField(input, extensionRegistry);
            }
        };

        private ObjectField(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ObjectField() {
            this.key_ = "";
        }

        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
            return new ObjectField();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ObjectField(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            boolean mutable_bitField0_ = false;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                block11: while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue block11;
                        }
                        case 10: {
                            ByteString bs = input.readBytes();
                            this.bitField0_ |= 1;
                            this.key_ = bs;
                            continue block11;
                        }
                        case 18: {
                            MysqlxDatatypes.Any.Builder subBuilder = null;
                            if ((this.bitField0_ & 2) != 0) {
                                subBuilder = this.value_.toBuilder();
                            }
                            this.value_ = (MysqlxDatatypes.Any)input.readMessage(MysqlxDatatypes.Any.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.value_);
                                this.value_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 2;
                            continue block11;
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
            return internal_static_Mysqlx_Datatypes_Object_ObjectField_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Object_ObjectField_fieldAccessorTable.ensureFieldAccessorsInitialized(ObjectField.class, Builder.class);
        }

        @Override
        public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public String getKey() {
            Object ref = this.key_;
            if (ref instanceof String) {
                return (String)ref;
            }
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.key_ = s;
            }
            return s;
        }

        @Override
        public ByteString getKeyBytes() {
            Object ref = this.key_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.key_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        @Override
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxDatatypes.Any getValue() {
            return this.value_ == null ? MysqlxDatatypes.Any.getDefaultInstance() : this.value_;
        }

        @Override
        public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder() {
            return this.value_ == null ? MysqlxDatatypes.Any.getDefaultInstance() : this.value_;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!this.hasKey()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!this.hasValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!this.getValue().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString((CodedOutputStream)output, (int)1, (Object)this.key_);
            }
            if ((this.bitField0_ & 2) != 0) {
                output.writeMessage(2, (MessageLite)this.getValue());
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
                size += GeneratedMessageV3.computeStringSize((int)1, (Object)this.key_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getValue());
            }
            this.memoizedSize = size += this.unknownFields.getSerializedSize();
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ObjectField)) {
                return super.equals(obj);
            }
            ObjectField other = (ObjectField)obj;
            if (this.hasKey() != other.hasKey()) {
                return false;
            }
            if (this.hasKey() && !this.getKey().equals(other.getKey())) {
                return false;
            }
            if (this.hasValue() != other.hasValue()) {
                return false;
            }
            if (this.hasValue() && !this.getValue().equals(other.getValue())) {
                return false;
            }
            return this.unknownFields.equals((Object)other.unknownFields);
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + ObjectField.getDescriptor().hashCode();
            if (this.hasKey()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getKey().hashCode();
            }
            if (this.hasValue()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getValue().hashCode();
            }
            this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
            return hash;
        }

        public static ObjectField parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ObjectField)PARSER.parseFrom(data);
        }

        public static ObjectField parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ObjectField)PARSER.parseFrom(data, extensionRegistry);
        }

        public static ObjectField parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ObjectField)PARSER.parseFrom(data);
        }

        public static ObjectField parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ObjectField)PARSER.parseFrom(data, extensionRegistry);
        }

        public static ObjectField parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ObjectField)PARSER.parseFrom(data);
        }

        public static ObjectField parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ObjectField)PARSER.parseFrom(data, extensionRegistry);
        }

        public static ObjectField parseFrom(InputStream input) throws IOException {
            return (ObjectField)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
        }

        public static ObjectField parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ObjectField)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static ObjectField parseDelimitedFrom(InputStream input) throws IOException {
            return (ObjectField)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
        }

        public static ObjectField parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ObjectField)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static ObjectField parseFrom(CodedInputStream input) throws IOException {
            return (ObjectField)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
        }

        public static ObjectField parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ObjectField)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public Builder newBuilderForType() {
            return ObjectField.newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ObjectField prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static ObjectField getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ObjectField> parser() {
            return PARSER;
        }

        public Parser<ObjectField> getParserForType() {
            return PARSER;
        }

        public ObjectField getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder
        extends GeneratedMessageV3.Builder<Builder>
        implements ObjectFieldOrBuilder {
            private int bitField0_;
            private Object key_ = "";
            private MysqlxDatatypes.Any value_;
            private SingleFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> valueBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return internal_static_Mysqlx_Datatypes_Object_ObjectField_descriptor;
            }

            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return internal_static_Mysqlx_Datatypes_Object_ObjectField_fieldAccessorTable.ensureFieldAccessorsInitialized(ObjectField.class, Builder.class);
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
                    this.getValueFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.key_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                } else {
                    this.valueBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return internal_static_Mysqlx_Datatypes_Object_ObjectField_descriptor;
            }

            public ObjectField getDefaultInstanceForType() {
                return ObjectField.getDefaultInstance();
            }

            public ObjectField build() {
                ObjectField result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw Builder.newUninitializedMessageException((Message)result);
                }
                return result;
            }

            public ObjectField buildPartial() {
                ObjectField result = new ObjectField(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) != 0) {
                    to_bitField0_ |= 1;
                }
                result.key_ = this.key_;
                if ((from_bitField0_ & 2) != 0) {
                    if (this.valueBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = (MysqlxDatatypes.Any)this.valueBuilder_.build();
                    }
                    to_bitField0_ |= 2;
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
                if (other instanceof ObjectField) {
                    return this.mergeFrom((ObjectField)other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ObjectField other) {
                if (other == ObjectField.getDefaultInstance()) {
                    return this;
                }
                if (other.hasKey()) {
                    this.bitField0_ |= 1;
                    this.key_ = other.key_;
                    this.onChanged();
                }
                if (other.hasValue()) {
                    this.mergeValue(other.getValue());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }

            public final boolean isInitialized() {
                if (!this.hasKey()) {
                    return false;
                }
                if (!this.hasValue()) {
                    return false;
                }
                return this.getValue().isInitialized();
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ObjectField parsedMessage = null;
                try {
                    parsedMessage = (ObjectField)PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ObjectField)e.getUnfinishedMessage();
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
            public boolean hasKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public String getKey() {
                Object ref = this.key_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        this.key_ = s;
                    }
                    return s;
                }
                return (String)ref;
            }

            @Override
            public ByteString getKeyBytes() {
                Object ref = this.key_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                    this.key_ = b;
                    return b;
                }
                return (ByteString)ref;
            }

            public Builder setKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.key_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearKey() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.key_ = ObjectField.getDefaultInstance().getKey();
                this.onChanged();
                return this;
            }

            public Builder setKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.key_ = value;
                this.onChanged();
                return this;
            }

            @Override
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public MysqlxDatatypes.Any getValue() {
                if (this.valueBuilder_ == null) {
                    return this.value_ == null ? MysqlxDatatypes.Any.getDefaultInstance() : this.value_;
                }
                return (MysqlxDatatypes.Any)this.valueBuilder_.getMessage();
            }

            public Builder setValue(MysqlxDatatypes.Any value) {
                if (this.valueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.valueBuilder_.setMessage((AbstractMessage)value);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setValue(MysqlxDatatypes.Any.Builder builderForValue) {
                if (this.valueBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeValue(MysqlxDatatypes.Any value) {
                if (this.valueBuilder_ == null) {
                    this.value_ = (this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != MysqlxDatatypes.Any.getDefaultInstance() ? MysqlxDatatypes.Any.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
                    this.onChanged();
                } else {
                    this.valueBuilder_.mergeFrom((AbstractMessage)value);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder clearValue() {
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                    this.onChanged();
                } else {
                    this.valueBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public MysqlxDatatypes.Any.Builder getValueBuilder() {
                this.bitField0_ |= 2;
                this.onChanged();
                return (MysqlxDatatypes.Any.Builder)this.getValueFieldBuilder().getBuilder();
            }

            @Override
            public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder() {
                if (this.valueBuilder_ != null) {
                    return (MysqlxDatatypes.AnyOrBuilder)this.valueBuilder_.getMessageOrBuilder();
                }
                return this.value_ == null ? MysqlxDatatypes.Any.getDefaultInstance() : this.value_;
            }

            private SingleFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getValue(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }
                return this.valueBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public static interface ObjectFieldOrBuilder
    extends MessageOrBuilder {
        public boolean hasKey();

        public String getKey();

        public ByteString getKeyBytes();

        public boolean hasValue();

        public MysqlxDatatypes.Any getValue();

        public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder();
    }
}
