// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseSvrUnixHour.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseSvrUnixHour {
  private XinqiBseSvrUnixHour() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseSvrUnixHourOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required uint32 unixHour = 1;
    boolean hasUnixHour();
    int getUnixHour();
    
    // optional uint32 unixMinute = 2 [default = 0];
    boolean hasUnixMinute();
    int getUnixMinute();
  }
  public static final class BseSvrUnixHour extends
      com.google.protobuf.GeneratedMessage
      implements BseSvrUnixHourOrBuilder {
    // Use BseSvrUnixHour.newBuilder() to construct.
    private BseSvrUnixHour(Builder builder) {
      super(builder);
    }
    private BseSvrUnixHour(boolean noInit) {}
    
    private static final BseSvrUnixHour defaultInstance;
    public static BseSvrUnixHour getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseSvrUnixHour getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required uint32 unixHour = 1;
    public static final int UNIXHOUR_FIELD_NUMBER = 1;
    private int unixHour_;
    public boolean hasUnixHour() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getUnixHour() {
      return unixHour_;
    }
    
    // optional uint32 unixMinute = 2 [default = 0];
    public static final int UNIXMINUTE_FIELD_NUMBER = 2;
    private int unixMinute_;
    public boolean hasUnixMinute() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getUnixMinute() {
      return unixMinute_;
    }
    
    private void initFields() {
      unixHour_ = 0;
      unixMinute_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUnixHour()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, unixHour_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, unixMinute_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unixHour_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unixMinute_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHourOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        unixHour_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        unixMinute_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour result = new com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.unixHour_ = unixHour_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.unixMinute_ = unixMinute_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour.getDefaultInstance()) return this;
        if (other.hasUnixHour()) {
          setUnixHour(other.getUnixHour());
        }
        if (other.hasUnixMinute()) {
          setUnixMinute(other.getUnixMinute());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUnixHour()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              unixHour_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              unixMinute_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required uint32 unixHour = 1;
      private int unixHour_ ;
      public boolean hasUnixHour() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getUnixHour() {
        return unixHour_;
      }
      public Builder setUnixHour(int value) {
        bitField0_ |= 0x00000001;
        unixHour_ = value;
        onChanged();
        return this;
      }
      public Builder clearUnixHour() {
        bitField0_ = (bitField0_ & ~0x00000001);
        unixHour_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 unixMinute = 2 [default = 0];
      private int unixMinute_ ;
      public boolean hasUnixMinute() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getUnixMinute() {
        return unixMinute_;
      }
      public Builder setUnixMinute(int value) {
        bitField0_ |= 0x00000002;
        unixMinute_ = value;
        onChanged();
        return this;
      }
      public Builder clearUnixMinute() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unixMinute_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseSvrUnixHour)
    }
    
    static {
      defaultInstance = new BseSvrUnixHour(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseSvrUnixHour)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BseSvrUnixHour.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"9\n\016BseSvrUnixHour\022\020\n\010un" +
      "ixHour\030\001 \002(\r\022\025\n\nunixMinute\030\002 \001(\r:\0010B\025B\023X" +
      "inqiBseSvrUnixHour"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseSvrUnixHour_descriptor,
              new java.lang.String[] { "UnixHour", "UnixMinute", },
              com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseSvrUnixHour.BseSvrUnixHour.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}