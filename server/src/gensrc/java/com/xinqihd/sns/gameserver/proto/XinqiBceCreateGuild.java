// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceCreateGuild.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceCreateGuild {
  private XinqiBceCreateGuild() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceCreateGuildOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string guildName = 1 [default = ""];
    boolean hasGuildName();
    String getGuildName();
    
    // optional string announcements = 2;
    boolean hasAnnouncements();
    String getAnnouncements();
  }
  public static final class BceCreateGuild extends
      com.google.protobuf.GeneratedMessage
      implements BceCreateGuildOrBuilder {
    // Use BceCreateGuild.newBuilder() to construct.
    private BceCreateGuild(Builder builder) {
      super(builder);
    }
    private BceCreateGuild(boolean noInit) {}
    
    private static final BceCreateGuild defaultInstance;
    public static BceCreateGuild getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceCreateGuild getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string guildName = 1 [default = ""];
    public static final int GUILDNAME_FIELD_NUMBER = 1;
    private java.lang.Object guildName_;
    public boolean hasGuildName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getGuildName() {
      java.lang.Object ref = guildName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          guildName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGuildNameBytes() {
      java.lang.Object ref = guildName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        guildName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string announcements = 2;
    public static final int ANNOUNCEMENTS_FIELD_NUMBER = 2;
    private java.lang.Object announcements_;
    public boolean hasAnnouncements() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getAnnouncements() {
      java.lang.Object ref = announcements_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          announcements_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAnnouncementsBytes() {
      java.lang.Object ref = announcements_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        announcements_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      guildName_ = "";
      announcements_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getGuildNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getAnnouncementsBytes());
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
          .computeBytesSize(1, getGuildNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getAnnouncementsBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuildOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild.newBuilder()
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
        guildName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        announcements_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild result = new com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guildName_ = guildName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.announcements_ = announcements_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild.getDefaultInstance()) return this;
        if (other.hasGuildName()) {
          setGuildName(other.getGuildName());
        }
        if (other.hasAnnouncements()) {
          setAnnouncements(other.getAnnouncements());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
            case 10: {
              bitField0_ |= 0x00000001;
              guildName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              announcements_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string guildName = 1 [default = ""];
      private java.lang.Object guildName_ = "";
      public boolean hasGuildName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getGuildName() {
        java.lang.Object ref = guildName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          guildName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGuildName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        guildName_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guildName_ = getDefaultInstance().getGuildName();
        onChanged();
        return this;
      }
      void setGuildName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        guildName_ = value;
        onChanged();
      }
      
      // optional string announcements = 2;
      private java.lang.Object announcements_ = "";
      public boolean hasAnnouncements() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getAnnouncements() {
        java.lang.Object ref = announcements_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          announcements_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAnnouncements(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        announcements_ = value;
        onChanged();
        return this;
      }
      public Builder clearAnnouncements() {
        bitField0_ = (bitField0_ & ~0x00000002);
        announcements_ = getDefaultInstance().getAnnouncements();
        onChanged();
        return this;
      }
      void setAnnouncements(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        announcements_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceCreateGuild)
    }
    
    static {
      defaultInstance = new BceCreateGuild(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceCreateGuild)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BceCreateGuild.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"<\n\016BceCreateGuild\022\023\n\tgu" +
      "ildName\030\001 \001(\t:\000\022\025\n\rannouncements\030\002 \001(\tB\025" +
      "B\023XinqiBceCreateGuild"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceCreateGuild_descriptor,
              new java.lang.String[] { "GuildName", "Announcements", },
              com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceCreateGuild.BceCreateGuild.Builder.class);
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