// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseRoleMoveStop.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseRoleMoveStop {
  private XinqiBseRoleMoveStop() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseRoleMoveStopOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string sessionId = 1;
    boolean hasSessionId();
    String getSessionId();
    
    // required uint32 passFrames = 2;
    boolean hasPassFrames();
    int getPassFrames();
    
    // required int32 angle = 3;
    boolean hasAngle();
    int getAngle();
    
    // required int32 x = 4;
    boolean hasX();
    int getX();
    
    // required int32 y = 5;
    boolean hasY();
    int getY();
  }
  public static final class BseRoleMoveStop extends
      com.google.protobuf.GeneratedMessage
      implements BseRoleMoveStopOrBuilder {
    // Use BseRoleMoveStop.newBuilder() to construct.
    private BseRoleMoveStop(Builder builder) {
      super(builder);
    }
    private BseRoleMoveStop(boolean noInit) {}
    
    private static final BseRoleMoveStop defaultInstance;
    public static BseRoleMoveStop getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseRoleMoveStop getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string sessionId = 1;
    public static final int SESSIONID_FIELD_NUMBER = 1;
    private java.lang.Object sessionId_;
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          sessionId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required uint32 passFrames = 2;
    public static final int PASSFRAMES_FIELD_NUMBER = 2;
    private int passFrames_;
    public boolean hasPassFrames() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getPassFrames() {
      return passFrames_;
    }
    
    // required int32 angle = 3;
    public static final int ANGLE_FIELD_NUMBER = 3;
    private int angle_;
    public boolean hasAngle() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getAngle() {
      return angle_;
    }
    
    // required int32 x = 4;
    public static final int X_FIELD_NUMBER = 4;
    private int x_;
    public boolean hasX() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getX() {
      return x_;
    }
    
    // required int32 y = 5;
    public static final int Y_FIELD_NUMBER = 5;
    private int y_;
    public boolean hasY() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getY() {
      return y_;
    }
    
    private void initFields() {
      sessionId_ = "";
      passFrames_ = 0;
      angle_ = 0;
      x_ = 0;
      y_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSessionId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeBytes(1, getSessionIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, passFrames_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, angle_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, x_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, y_);
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
          .computeBytesSize(1, getSessionIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, passFrames_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, angle_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, x_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, y_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStopOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop.newBuilder()
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
        sessionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        passFrames_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        angle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop result = new com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sessionId_ = sessionId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.passFrames_ = passFrames_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.angle_ = angle_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop.getDefaultInstance()) return this;
        if (other.hasSessionId()) {
          setSessionId(other.getSessionId());
        }
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
        if (!hasSessionId()) {
          
          return false;
        }
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
            case 10: {
              bitField0_ |= 0x00000001;
              sessionId_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              passFrames_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              angle_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              x_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              y_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string sessionId = 1;
      private java.lang.Object sessionId_ = "";
      public boolean hasSessionId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getSessionId() {
        java.lang.Object ref = sessionId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          sessionId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSessionId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sessionId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionId_ = getDefaultInstance().getSessionId();
        onChanged();
        return this;
      }
      void setSessionId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        sessionId_ = value;
        onChanged();
      }
      
      // required uint32 passFrames = 2;
      private int passFrames_ ;
      public boolean hasPassFrames() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getPassFrames() {
        return passFrames_;
      }
      public Builder setPassFrames(int value) {
        bitField0_ |= 0x00000002;
        passFrames_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassFrames() {
        bitField0_ = (bitField0_ & ~0x00000002);
        passFrames_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 angle = 3;
      private int angle_ ;
      public boolean hasAngle() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getAngle() {
        return angle_;
      }
      public Builder setAngle(int value) {
        bitField0_ |= 0x00000004;
        angle_ = value;
        onChanged();
        return this;
      }
      public Builder clearAngle() {
        bitField0_ = (bitField0_ & ~0x00000004);
        angle_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 x = 4;
      private int x_ ;
      public boolean hasX() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getX() {
        return x_;
      }
      public Builder setX(int value) {
        bitField0_ |= 0x00000008;
        x_ = value;
        onChanged();
        return this;
      }
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000008);
        x_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 y = 5;
      private int y_ ;
      public boolean hasY() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getY() {
        return y_;
      }
      public Builder setY(int value) {
        bitField0_ |= 0x00000010;
        y_ = value;
        onChanged();
        return this;
      }
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000010);
        y_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseRoleMoveStop)
    }
    
    static {
      defaultInstance = new BseRoleMoveStop(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseRoleMoveStop)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BseRoleMoveStop.proto\022 com.xinqihd.sns" +
      ".gameserver.proto\"]\n\017BseRoleMoveStop\022\021\n\t" +
      "sessionId\030\001 \002(\t\022\022\n\npassFrames\030\002 \002(\r\022\r\n\005a" +
      "ngle\030\003 \002(\005\022\t\n\001x\030\004 \002(\005\022\t\n\001y\030\005 \002(\005B\026B\024Xinq" +
      "iBseRoleMoveStop"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseRoleMoveStop_descriptor,
              new java.lang.String[] { "SessionId", "PassFrames", "Angle", "X", "Y", },
              com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseRoleMoveStop.BseRoleMoveStop.Builder.class);
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