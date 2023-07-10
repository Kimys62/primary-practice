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
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Delete
extends GeneratedMessageV3
implements MysqlxCrud.DeleteOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private MysqlxCrud.Collection collection_;
    public static final int DATA_MODEL_FIELD_NUMBER = 2;
    private int dataModel_;
    public static final int CRITERIA_FIELD_NUMBER = 3;
    private MysqlxExpr.Expr criteria_;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private MysqlxCrud.Limit limit_;
    public static final int ORDER_FIELD_NUMBER = 5;
    private List<MysqlxCrud.Order> order_;
    public static final int ARGS_FIELD_NUMBER = 6;
    private List<MysqlxDatatypes.Scalar> args_;
    public static final int LIMIT_EXPR_FIELD_NUMBER = 7;
    private MysqlxCrud.LimitExpr limitExpr_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Delete DEFAULT_INSTANCE = new MysqlxCrud.Delete();
    @Deprecated
    public static final Parser<MysqlxCrud.Delete> PARSER = new AbstractParser<MysqlxCrud.Delete>(){

        public MysqlxCrud.Delete parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Delete(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Delete(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Delete() {
        this.dataModel_ = 1;
        this.order_ = Collections.emptyList();
        this.args_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Delete();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Delete(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block16: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block16;
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
                        continue block16;
                    }
                    case 16: {
                        int rawValue = input.readEnum();
                        MysqlxCrud.DataModel value = MysqlxCrud.DataModel.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(2, rawValue);
                            continue block16;
                        }
                        this.bitField0_ |= 2;
                        this.dataModel_ = rawValue;
                        continue block16;
                    }
                    case 26: {
                        MysqlxExpr.Expr.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                            subBuilder = this.criteria_.toBuilder();
                        }
                        this.criteria_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.criteria_);
                            this.criteria_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 4;
                        continue block16;
                    }
                    case 34: {
                        MysqlxCrud.Limit.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                            subBuilder = this.limit_.toBuilder();
                        }
                        this.limit_ = (MysqlxCrud.Limit)input.readMessage(MysqlxCrud.Limit.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.limit_);
                            this.limit_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 8;
                        continue block16;
                    }
                    case 42: {
                        if ((mutable_bitField0_ & 0x10) == 0) {
                            this.order_ = new ArrayList<MysqlxCrud.Order>();
                            mutable_bitField0_ |= 0x10;
                        }
                        this.order_.add((MysqlxCrud.Order)input.readMessage(MysqlxCrud.Order.PARSER, extensionRegistry));
                        continue block16;
                    }
                    case 50: {
                        if ((mutable_bitField0_ & 0x20) == 0) {
                            this.args_ = new ArrayList<MysqlxDatatypes.Scalar>();
                            mutable_bitField0_ |= 0x20;
                        }
                        this.args_.add((MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry));
                        continue block16;
                    }
                    case 58: {
                        MysqlxCrud.LimitExpr.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x10) != 0) {
                            subBuilder = this.limitExpr_.toBuilder();
                        }
                        this.limitExpr_ = (MysqlxCrud.LimitExpr)input.readMessage(MysqlxCrud.LimitExpr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.limitExpr_);
                            this.limitExpr_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x10;
                        continue block16;
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
            if ((mutable_bitField0_ & 0x10) != 0) {
                this.order_ = Collections.unmodifiableList(this.order_);
            }
            if ((mutable_bitField0_ & 0x20) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Delete_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Delete_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Delete.class, Builder.class);
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
    public boolean hasDataModel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.DataModel getDataModel() {
        MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
        return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
    }

    @Override
    public boolean hasCriteria() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxExpr.Expr getCriteria() {
        return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
        return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
    }

    @Override
    public boolean hasLimit() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.Limit getLimit() {
        return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
    }

    @Override
    public MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
        return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
    }

    @Override
    public List<MysqlxCrud.Order> getOrderList() {
        return this.order_;
    }

    @Override
    public List<? extends MysqlxCrud.OrderOrBuilder> getOrderOrBuilderList() {
        return this.order_;
    }

    @Override
    public int getOrderCount() {
        return this.order_.size();
    }

    @Override
    public MysqlxCrud.Order getOrder(int index) {
        return this.order_.get(index);
    }

    @Override
    public MysqlxCrud.OrderOrBuilder getOrderOrBuilder(int index) {
        return this.order_.get(index);
    }

    @Override
    public List<MysqlxDatatypes.Scalar> getArgsList() {
        return this.args_;
    }

    @Override
    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
        return this.args_;
    }

    @Override
    public int getArgsCount() {
        return this.args_.size();
    }

    @Override
    public MysqlxDatatypes.Scalar getArgs(int index) {
        return this.args_.get(index);
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
        return this.args_.get(index);
    }

    @Override
    public boolean hasLimitExpr() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxCrud.LimitExpr getLimitExpr() {
        return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
    }

    @Override
    public MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
        return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
    }

    public final boolean isInitialized() {
        int i;
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
        if (!this.getCollection().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasCriteria() && !this.getCriteria().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasLimit() && !this.getLimit().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getOrderCount(); ++i) {
            if (this.getOrder(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasLimitExpr() && !this.getLimitExpr().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        int i;
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.dataModel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, (MessageLite)this.getCriteria());
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, (MessageLite)this.getLimit());
        }
        for (i = 0; i < this.order_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.order_.get(i));
        }
        for (i = 0; i < this.args_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.args_.get(i));
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeMessage(7, (MessageLite)this.getLimitExpr());
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int i;
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if ((this.bitField0_ & 1) != 0) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getCollection());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)2, (int)this.dataModel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getCriteria());
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getLimit());
        }
        for (i = 0; i < this.order_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.order_.get(i)));
        }
        for (i = 0; i < this.args_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((MessageLite)this.args_.get(i)));
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeMessageSize((int)7, (MessageLite)this.getLimitExpr());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Delete)) {
            return super.equals(obj);
        }
        MysqlxCrud.Delete other = (MysqlxCrud.Delete)obj;
        if (this.hasCollection() != other.hasCollection()) {
            return false;
        }
        if (this.hasCollection() && !this.getCollection().equals(other.getCollection())) {
            return false;
        }
        if (this.hasDataModel() != other.hasDataModel()) {
            return false;
        }
        if (this.hasDataModel() && this.dataModel_ != other.dataModel_) {
            return false;
        }
        if (this.hasCriteria() != other.hasCriteria()) {
            return false;
        }
        if (this.hasCriteria() && !this.getCriteria().equals(other.getCriteria())) {
            return false;
        }
        if (this.hasLimit() != other.hasLimit()) {
            return false;
        }
        if (this.hasLimit() && !this.getLimit().equals(other.getLimit())) {
            return false;
        }
        if (!this.getOrderList().equals(other.getOrderList())) {
            return false;
        }
        if (!this.getArgsList().equals(other.getArgsList())) {
            return false;
        }
        if (this.hasLimitExpr() != other.hasLimitExpr()) {
            return false;
        }
        if (this.hasLimitExpr() && !this.getLimitExpr().equals(other.getLimitExpr())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Delete.getDescriptor().hashCode();
        if (this.hasCollection()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCollection().hashCode();
        }
        if (this.hasDataModel()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.dataModel_;
        }
        if (this.hasCriteria()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCriteria().hashCode();
        }
        if (this.hasLimit()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getLimit().hashCode();
        }
        if (this.getOrderCount() > 0) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getOrderList().hashCode();
        }
        if (this.getArgsCount() > 0) {
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getArgsList().hashCode();
        }
        if (this.hasLimitExpr()) {
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getLimitExpr().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Delete parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Delete)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Delete parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Delete)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Delete parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Delete)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Delete parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Delete)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Delete parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Delete)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Delete parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Delete)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Delete parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Delete)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Delete parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Delete)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Delete parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Delete)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Delete parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Delete)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Delete parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Delete)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Delete parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Delete)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Delete.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Delete prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Delete getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Delete> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Delete> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Delete getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.DeleteOrBuilder {
        private int bitField0_;
        private MysqlxCrud.Collection collection_;
        private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
        private int dataModel_ = 1;
        private MysqlxExpr.Expr criteria_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> criteriaBuilder_;
        private MysqlxCrud.Limit limit_;
        private SingleFieldBuilderV3<MysqlxCrud.Limit, MysqlxCrud.Limit.Builder, MysqlxCrud.LimitOrBuilder> limitBuilder_;
        private List<MysqlxCrud.Order> order_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxCrud.Order, MysqlxCrud.Order.Builder, MysqlxCrud.OrderOrBuilder> orderBuilder_;
        private List<MysqlxDatatypes.Scalar> args_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;
        private MysqlxCrud.LimitExpr limitExpr_;
        private SingleFieldBuilderV3<MysqlxCrud.LimitExpr, MysqlxCrud.LimitExpr.Builder, MysqlxCrud.LimitExprOrBuilder> limitExprBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Delete_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Delete_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Delete.class, Builder.class);
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
                this.getCriteriaFieldBuilder();
                this.getLimitFieldBuilder();
                this.getOrderFieldBuilder();
                this.getArgsFieldBuilder();
                this.getLimitExprFieldBuilder();
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
            this.dataModel_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = null;
            } else {
                this.criteriaBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            if (this.limitBuilder_ == null) {
                this.limit_ = null;
            } else {
                this.limitBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            if (this.orderBuilder_ == null) {
                this.order_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFEF;
            } else {
                this.orderBuilder_.clear();
            }
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFDF;
            } else {
                this.argsBuilder_.clear();
            }
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = null;
            } else {
                this.limitExprBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Delete_descriptor;
        }

        public MysqlxCrud.Delete getDefaultInstanceForType() {
            return MysqlxCrud.Delete.getDefaultInstance();
        }

        public MysqlxCrud.Delete build() {
            MysqlxCrud.Delete result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Delete buildPartial() {
            MysqlxCrud.Delete result = new MysqlxCrud.Delete(this);
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
            result.dataModel_ = this.dataModel_;
            if ((from_bitField0_ & 4) != 0) {
                if (this.criteriaBuilder_ == null) {
                    result.criteria_ = this.criteria_;
                } else {
                    result.criteria_ = (MysqlxExpr.Expr)this.criteriaBuilder_.build();
                }
                to_bitField0_ |= 4;
            }
            if ((from_bitField0_ & 8) != 0) {
                if (this.limitBuilder_ == null) {
                    result.limit_ = this.limit_;
                } else {
                    result.limit_ = (MysqlxCrud.Limit)this.limitBuilder_.build();
                }
                to_bitField0_ |= 8;
            }
            if (this.orderBuilder_ == null) {
                if ((this.bitField0_ & 0x10) != 0) {
                    this.order_ = Collections.unmodifiableList(this.order_);
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.order_ = this.order_;
            } else {
                result.order_ = this.orderBuilder_.build();
            }
            if (this.argsBuilder_ == null) {
                if ((this.bitField0_ & 0x20) != 0) {
                    this.args_ = Collections.unmodifiableList(this.args_);
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                result.args_ = this.args_;
            } else {
                result.args_ = this.argsBuilder_.build();
            }
            if ((from_bitField0_ & 0x40) != 0) {
                if (this.limitExprBuilder_ == null) {
                    result.limitExpr_ = this.limitExpr_;
                } else {
                    result.limitExpr_ = (MysqlxCrud.LimitExpr)this.limitExprBuilder_.build();
                }
                to_bitField0_ |= 0x10;
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
            if (other instanceof MysqlxCrud.Delete) {
                return this.mergeFrom((MysqlxCrud.Delete)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Delete other) {
            if (other == MysqlxCrud.Delete.getDefaultInstance()) {
                return this;
            }
            if (other.hasCollection()) {
                this.mergeCollection(other.getCollection());
            }
            if (other.hasDataModel()) {
                this.setDataModel(other.getDataModel());
            }
            if (other.hasCriteria()) {
                this.mergeCriteria(other.getCriteria());
            }
            if (other.hasLimit()) {
                this.mergeLimit(other.getLimit());
            }
            if (this.orderBuilder_ == null) {
                if (!other.order_.isEmpty()) {
                    if (this.order_.isEmpty()) {
                        this.order_ = other.order_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    } else {
                        this.ensureOrderIsMutable();
                        this.order_.addAll(other.order_);
                    }
                    this.onChanged();
                }
            } else if (!other.order_.isEmpty()) {
                if (this.orderBuilder_.isEmpty()) {
                    this.orderBuilder_.dispose();
                    this.orderBuilder_ = null;
                    this.order_ = other.order_;
                    this.bitField0_ &= 0xFFFFFFEF;
                    this.orderBuilder_ = alwaysUseFieldBuilders ? this.getOrderFieldBuilder() : null;
                } else {
                    this.orderBuilder_.addAllMessages((Iterable)other.order_);
                }
            }
            if (this.argsBuilder_ == null) {
                if (!other.args_.isEmpty()) {
                    if (this.args_.isEmpty()) {
                        this.args_ = other.args_;
                        this.bitField0_ &= 0xFFFFFFDF;
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
                    this.bitField0_ &= 0xFFFFFFDF;
                    this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
                } else {
                    this.argsBuilder_.addAllMessages((Iterable)other.args_);
                }
            }
            if (other.hasLimitExpr()) {
                this.mergeLimitExpr(other.getLimitExpr());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            int i;
            if (!this.hasCollection()) {
                return false;
            }
            if (!this.getCollection().isInitialized()) {
                return false;
            }
            if (this.hasCriteria() && !this.getCriteria().isInitialized()) {
                return false;
            }
            if (this.hasLimit() && !this.getLimit().isInitialized()) {
                return false;
            }
            for (i = 0; i < this.getOrderCount(); ++i) {
                if (this.getOrder(i).isInitialized()) continue;
                return false;
            }
            for (i = 0; i < this.getArgsCount(); ++i) {
                if (this.getArgs(i).isInitialized()) continue;
                return false;
            }
            return !this.hasLimitExpr() || this.getLimitExpr().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Delete parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Delete)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Delete)e.getUnfinishedMessage();
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
        public boolean hasDataModel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxCrud.DataModel getDataModel() {
            MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
            return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
        }

        public Builder setDataModel(MysqlxCrud.DataModel value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.dataModel_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearDataModel() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.dataModel_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasCriteria() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public MysqlxExpr.Expr getCriteria() {
            if (this.criteriaBuilder_ == null) {
                return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
            }
            return (MysqlxExpr.Expr)this.criteriaBuilder_.getMessage();
        }

        public Builder setCriteria(MysqlxExpr.Expr value) {
            if (this.criteriaBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.criteria_ = value;
                this.onChanged();
            } else {
                this.criteriaBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder setCriteria(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = builderForValue.build();
                this.onChanged();
            } else {
                this.criteriaBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder mergeCriteria(MysqlxExpr.Expr value) {
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = (this.bitField0_ & 4) != 0 && this.criteria_ != null && this.criteria_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.criteria_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.criteriaBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder clearCriteria() {
            if (this.criteriaBuilder_ == null) {
                this.criteria_ = null;
                this.onChanged();
            } else {
                this.criteriaBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public MysqlxExpr.Expr.Builder getCriteriaBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getCriteriaFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
            if (this.criteriaBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.criteriaBuilder_.getMessageOrBuilder();
            }
            return this.criteria_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.criteria_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getCriteriaFieldBuilder() {
            if (this.criteriaBuilder_ == null) {
                this.criteriaBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getCriteria(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.criteria_ = null;
            }
            return this.criteriaBuilder_;
        }

        @Override
        public boolean hasLimit() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public MysqlxCrud.Limit getLimit() {
            if (this.limitBuilder_ == null) {
                return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
            }
            return (MysqlxCrud.Limit)this.limitBuilder_.getMessage();
        }

        public Builder setLimit(MysqlxCrud.Limit value) {
            if (this.limitBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.limit_ = value;
                this.onChanged();
            } else {
                this.limitBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder setLimit(MysqlxCrud.Limit.Builder builderForValue) {
            if (this.limitBuilder_ == null) {
                this.limit_ = builderForValue.build();
                this.onChanged();
            } else {
                this.limitBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder mergeLimit(MysqlxCrud.Limit value) {
            if (this.limitBuilder_ == null) {
                this.limit_ = (this.bitField0_ & 8) != 0 && this.limit_ != null && this.limit_ != MysqlxCrud.Limit.getDefaultInstance() ? MysqlxCrud.Limit.newBuilder(this.limit_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.limitBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder clearLimit() {
            if (this.limitBuilder_ == null) {
                this.limit_ = null;
                this.onChanged();
            } else {
                this.limitBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public MysqlxCrud.Limit.Builder getLimitBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (MysqlxCrud.Limit.Builder)this.getLimitFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
            if (this.limitBuilder_ != null) {
                return (MysqlxCrud.LimitOrBuilder)this.limitBuilder_.getMessageOrBuilder();
            }
            return this.limit_ == null ? MysqlxCrud.Limit.getDefaultInstance() : this.limit_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.Limit, MysqlxCrud.Limit.Builder, MysqlxCrud.LimitOrBuilder> getLimitFieldBuilder() {
            if (this.limitBuilder_ == null) {
                this.limitBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getLimit(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.limit_ = null;
            }
            return this.limitBuilder_;
        }

        private void ensureOrderIsMutable() {
            if ((this.bitField0_ & 0x10) == 0) {
                this.order_ = new ArrayList<MysqlxCrud.Order>(this.order_);
                this.bitField0_ |= 0x10;
            }
        }

        @Override
        public List<MysqlxCrud.Order> getOrderList() {
            if (this.orderBuilder_ == null) {
                return Collections.unmodifiableList(this.order_);
            }
            return this.orderBuilder_.getMessageList();
        }

        @Override
        public int getOrderCount() {
            if (this.orderBuilder_ == null) {
                return this.order_.size();
            }
            return this.orderBuilder_.getCount();
        }

        @Override
        public MysqlxCrud.Order getOrder(int index) {
            if (this.orderBuilder_ == null) {
                return this.order_.get(index);
            }
            return (MysqlxCrud.Order)this.orderBuilder_.getMessage(index);
        }

        public Builder setOrder(int index, MysqlxCrud.Order value) {
            if (this.orderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureOrderIsMutable();
                this.order_.set(index, value);
                this.onChanged();
            } else {
                this.orderBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.orderBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addOrder(MysqlxCrud.Order value) {
            if (this.orderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureOrderIsMutable();
                this.order_.add(value);
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addOrder(int index, MysqlxCrud.Order value) {
            if (this.orderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureOrderIsMutable();
                this.order_.add(index, value);
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addOrder(MysqlxCrud.Order.Builder builderForValue) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addOrder(int index, MysqlxCrud.Order.Builder builderForValue) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.orderBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllOrder(Iterable<? extends MysqlxCrud.Order> values) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.order_);
                this.onChanged();
            } else {
                this.orderBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearOrder() {
            if (this.orderBuilder_ == null) {
                this.order_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
            } else {
                this.orderBuilder_.clear();
            }
            return this;
        }

        public Builder removeOrder(int index) {
            if (this.orderBuilder_ == null) {
                this.ensureOrderIsMutable();
                this.order_.remove(index);
                this.onChanged();
            } else {
                this.orderBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxCrud.Order.Builder getOrderBuilder(int index) {
            return (MysqlxCrud.Order.Builder)this.getOrderFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxCrud.OrderOrBuilder getOrderOrBuilder(int index) {
            if (this.orderBuilder_ == null) {
                return this.order_.get(index);
            }
            return (MysqlxCrud.OrderOrBuilder)this.orderBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxCrud.OrderOrBuilder> getOrderOrBuilderList() {
            if (this.orderBuilder_ != null) {
                return this.orderBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.order_);
        }

        public MysqlxCrud.Order.Builder addOrderBuilder() {
            return (MysqlxCrud.Order.Builder)this.getOrderFieldBuilder().addBuilder((AbstractMessage)MysqlxCrud.Order.getDefaultInstance());
        }

        public MysqlxCrud.Order.Builder addOrderBuilder(int index) {
            return (MysqlxCrud.Order.Builder)this.getOrderFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxCrud.Order.getDefaultInstance());
        }

        public List<MysqlxCrud.Order.Builder> getOrderBuilderList() {
            return this.getOrderFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxCrud.Order, MysqlxCrud.Order.Builder, MysqlxCrud.OrderOrBuilder> getOrderFieldBuilder() {
            if (this.orderBuilder_ == null) {
                this.orderBuilder_ = new RepeatedFieldBuilderV3(this.order_, (this.bitField0_ & 0x10) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.order_ = null;
            }
            return this.orderBuilder_;
        }

        private void ensureArgsIsMutable() {
            if ((this.bitField0_ & 0x20) == 0) {
                this.args_ = new ArrayList<MysqlxDatatypes.Scalar>(this.args_);
                this.bitField0_ |= 0x20;
            }
        }

        @Override
        public List<MysqlxDatatypes.Scalar> getArgsList() {
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
        public MysqlxDatatypes.Scalar getArgs(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.Scalar)this.argsBuilder_.getMessage(index);
        }

        public Builder setArgs(int index, MysqlxDatatypes.Scalar value) {
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

        public Builder setArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(MysqlxDatatypes.Scalar value) {
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

        public Builder addArgs(int index, MysqlxDatatypes.Scalar value) {
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

        public Builder addArgs(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Scalar> values) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.args_);
                this.onChanged();
            } else {
                this.argsBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearArgs() {
            if (this.argsBuilder_ == null) {
                this.args_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFDF;
                this.onChanged();
            } else {
                this.argsBuilder_.clear();
            }
            return this;
        }

        public Builder removeArgs(int index) {
            if (this.argsBuilder_ == null) {
                this.ensureArgsIsMutable();
                this.args_.remove(index);
                this.onChanged();
            } else {
                this.argsBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxDatatypes.Scalar.Builder getArgsBuilder(int index) {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
            if (this.argsBuilder_ == null) {
                return this.args_.get(index);
            }
            return (MysqlxDatatypes.ScalarOrBuilder)this.argsBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
            if (this.argsBuilder_ != null) {
                return this.argsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.args_);
        }

        public MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
        }

        public MysqlxDatatypes.Scalar.Builder addArgsBuilder(int index) {
            return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
        }

        public List<MysqlxDatatypes.Scalar.Builder> getArgsBuilderList() {
            return this.getArgsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getArgsFieldBuilder() {
            if (this.argsBuilder_ == null) {
                this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 0x20) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.args_ = null;
            }
            return this.argsBuilder_;
        }

        @Override
        public boolean hasLimitExpr() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override
        public MysqlxCrud.LimitExpr getLimitExpr() {
            if (this.limitExprBuilder_ == null) {
                return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
            }
            return (MysqlxCrud.LimitExpr)this.limitExprBuilder_.getMessage();
        }

        public Builder setLimitExpr(MysqlxCrud.LimitExpr value) {
            if (this.limitExprBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.limitExpr_ = value;
                this.onChanged();
            } else {
                this.limitExprBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 0x40;
            return this;
        }

        public Builder setLimitExpr(MysqlxCrud.LimitExpr.Builder builderForValue) {
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = builderForValue.build();
                this.onChanged();
            } else {
                this.limitExprBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x40;
            return this;
        }

        public Builder mergeLimitExpr(MysqlxCrud.LimitExpr value) {
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = (this.bitField0_ & 0x40) != 0 && this.limitExpr_ != null && this.limitExpr_ != MysqlxCrud.LimitExpr.getDefaultInstance() ? MysqlxCrud.LimitExpr.newBuilder(this.limitExpr_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.limitExprBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x40;
            return this;
        }

        public Builder clearLimitExpr() {
            if (this.limitExprBuilder_ == null) {
                this.limitExpr_ = null;
                this.onChanged();
            } else {
                this.limitExprBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }

        public MysqlxCrud.LimitExpr.Builder getLimitExprBuilder() {
            this.bitField0_ |= 0x40;
            this.onChanged();
            return (MysqlxCrud.LimitExpr.Builder)this.getLimitExprFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
            if (this.limitExprBuilder_ != null) {
                return (MysqlxCrud.LimitExprOrBuilder)this.limitExprBuilder_.getMessageOrBuilder();
            }
            return this.limitExpr_ == null ? MysqlxCrud.LimitExpr.getDefaultInstance() : this.limitExpr_;
        }

        private SingleFieldBuilderV3<MysqlxCrud.LimitExpr, MysqlxCrud.LimitExpr.Builder, MysqlxCrud.LimitExprOrBuilder> getLimitExprFieldBuilder() {
            if (this.limitExprBuilder_ == null) {
                this.limitExprBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getLimitExpr(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.limitExpr_ = null;
            }
            return this.limitExprBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
