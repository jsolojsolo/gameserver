// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceRoleMoveStop.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceRoleMoveStop {
  private XinqiBceRoleMoveStop() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceRoleMoveStopOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required uint32 passFrames = 1;
    boolean hasPassFrames();
    int getPassFrames();
    
    // required int32 angle = 2;
    boolean hasAngle();
    int getAngle();
    
    // required int32 x = 3;
    boolean hasX();
    int getX();
    
    // required int32 y = 4;
    boolean hasY();
    int getY();
  }
  public static final class BceRoleMoveStop extends
      com.google.protobuf.GeneratedMessage
      implements BceRoleMoveStopOrBuilder {
    // Use BceRoleMoveStop.newBuilder() to construct.
    private BceRoleMoveStop(Builder builder) {
      super(builder);
    }
    private BceRoleMoveStop(boolean noInit) {}
    
    private static final BceRoleMoveStop defaultInstance;
    public static BceRoleMoveStop getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceRoleMoveStop getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required uint32 passFrames = 1;
    public static final int PASSFRAMES_FIELD_NUMBER = 1;
    private int passFrames_;
    public boolean hasPassFrames() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPassFrames() {
      return passFrames_;
    }
    
    // required int32 angle = 2;
    public static final int ANGLE_FIELD_NUMBER = 2;
    private int angle_;
    public boolean hasAngle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getAngle() {
      return angle_;
    }
    
    // required int32 x = 3;
    public static final int X_FIELD_NUMBER = 3;
    private int x_;
    public boolean hasX() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getX() {
      return x_;
    }
    
    // required int32 y = 4;
    public static final int Y_FIELD_NUMBER = 4;
    private int y_;
    public boolean hasY() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getY() {
      return y_;
    }
    
    private void initFields() {
      passFrames_ = 0;
      angle_ = 0;
      x_ = 0;
      y_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPassFrames()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAngle()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
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
        output.writeUInt32(1, passFrames_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, angle_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, x_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, y_);
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
          .computeUInt32Size(1, passFrames_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, angle_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, x_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, y_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStopOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop.newBuilder()
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
        passFrames_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        angle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop result = new com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.passFrames_ = passFrames_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.angle_ = angle_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop.getDefaultInstance()) return this;
        if (other.hasPassFrames()) {
          setPassFrames(other.getPassFrames());
        }
        if (other.hasAngle()) {
          setAngle(other.getAngle());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPassFrames()) {
          
          return false;
        }
        if (!hasAngle()) {
          
          return false;
        }
        if (!hasX()) {
          
          return false;
        }
        if (!hasY()) {
          
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
              passFrames_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              angle_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              x_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              y_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required uint32 passFrames = 1;
      private int passFrames_ ;
      public boolean hasPassFrames() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPassFrames() {
        return passFrames_;
      }
      public Builder setPassFrames(int value) {
        bitField0_ |= 0x00000001;
        passFrames_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassFrames() {
        bitField0_ = (bitField0_ & ~0x00000001);
        passFrames_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 angle = 2;
      private int angle_ ;
      public boolean hasAngle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getAngle() {
        return angle_;
      }
      public Builder setAngle(int value) {
        bitField0_ |= 0x00000002;
        angle_ = value;
        onChanged();
        return this;
      }
      public Builder clearAngle() {
        bitField0_ = (bitField0_ & ~0x00000002);
        angle_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 x = 3;
      private int x_ ;
      public boolean hasX() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getX() {
        return x_;
      }
      public Builder setX(int value) {
        bitField0_ |= 0x00000004;
        x_ = value;
        onChanged();
        return this;
      }
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000004);
        x_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 y = 4;
      private int y_ ;
      public boolean hasY() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getY() {
        return y_;
      }
      public Builder setY(int value) {
        bitField0_ |= 0x00000008;
        y_ = value;
        onChanged();
        return this;
      }
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000008);
        y_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceRoleMoveStop)
    }
    
    static {
      defaultInstance = new BceRoleMoveStop(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceRoleMoveStop)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BceRoleMoveStop.proto\022 com.xinqihd.sns" +
      ".gameserver.proto\"J\n\017BceRoleMoveStop\022\022\n\n" +
      "passFrames\030\001 \002(\r\022\r\n\005angle\030\002 \002(\005\022\t\n\001x\030\003 \002" +
      "(\005\022\t\n\001y\030\004 \002(\005B\026B\024XinqiBceRoleMoveStop"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStop_descriptor,
              new java.lang.String[] { "PassFrames", "Angle", "X", "Y", },
              com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStop.BceRoleMoveStop.Builder.class);
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
