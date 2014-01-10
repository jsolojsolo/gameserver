// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseRecentlyMessageList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseRecentlyMessageList {
  private XinqiBseRecentlyMessageList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseRecentlyMessageListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .com.xinqihd.sns.gameserver.proto.LeaveMessage messages = 1;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage> 
        getMessagesList();
    com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage getMessages(int index);
    int getMessagesCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder> 
        getMessagesOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder getMessagesOrBuilder(
        int index);
  }
  public static final class BseRecentlyMessageList extends
      com.google.protobuf.GeneratedMessage
      implements BseRecentlyMessageListOrBuilder {
    // Use BseRecentlyMessageList.newBuilder() to construct.
    private BseRecentlyMessageList(Builder builder) {
      super(builder);
    }
    private BseRecentlyMessageList(boolean noInit) {}
    
    private static final BseRecentlyMessageList defaultInstance;
    public static BseRecentlyMessageList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseRecentlyMessageList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_fieldAccessorTable;
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.LeaveMessage messages = 1;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage> messages_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage> getMessagesList() {
      return messages_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder> 
        getMessagesOrBuilderList() {
      return messages_;
    }
    public int getMessagesCount() {
      return messages_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage getMessages(int index) {
      return messages_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder getMessagesOrBuilder(
        int index) {
      return messages_.get(index);
    }
    
    private void initFields() {
      messages_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getMessagesCount(); i++) {
        if (!getMessages(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < messages_.size(); i++) {
        output.writeMessage(1, messages_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < messages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, messages_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getMessagesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (messagesBuilder_ == null) {
          messages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          messagesBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList result = new com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList(this);
        int from_bitField0_ = bitField0_;
        if (messagesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            messages_ = java.util.Collections.unmodifiableList(messages_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.messages_ = messages_;
        } else {
          result.messages_ = messagesBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList.getDefaultInstance()) return this;
        if (messagesBuilder_ == null) {
          if (!other.messages_.isEmpty()) {
            if (messages_.isEmpty()) {
              messages_ = other.messages_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMessagesIsMutable();
              messages_.addAll(other.messages_);
            }
            onChanged();
          }
        } else {
          if (!other.messages_.isEmpty()) {
            if (messagesBuilder_.isEmpty()) {
              messagesBuilder_.dispose();
              messagesBuilder_ = null;
              messages_ = other.messages_;
              bitField0_ = (bitField0_ & ~0x00000001);
              messagesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMessagesFieldBuilder() : null;
            } else {
              messagesBuilder_.addAllMessages(other.messages_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getMessagesCount(); i++) {
          if (!getMessages(i).isInitialized()) {
            
            return false;
          }
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
              com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addMessages(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .com.xinqihd.sns.gameserver.proto.LeaveMessage messages = 1;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage> messages_ =
        java.util.Collections.emptyList();
      private void ensureMessagesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          messages_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage>(messages_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder> messagesBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage> getMessagesList() {
        if (messagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(messages_);
        } else {
          return messagesBuilder_.getMessageList();
        }
      }
      public int getMessagesCount() {
        if (messagesBuilder_ == null) {
          return messages_.size();
        } else {
          return messagesBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage getMessages(int index) {
        if (messagesBuilder_ == null) {
          return messages_.get(index);
        } else {
          return messagesBuilder_.getMessage(index);
        }
      }
      public Builder setMessages(
          int index, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage value) {
        if (messagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessagesIsMutable();
          messages_.set(index, value);
          onChanged();
        } else {
          messagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setMessages(
          int index, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder builderForValue) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.set(index, builderForValue.build());
          onChanged();
        } else {
          messagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addMessages(com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage value) {
        if (messagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessagesIsMutable();
          messages_.add(value);
          onChanged();
        } else {
          messagesBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addMessages(
          int index, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage value) {
        if (messagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessagesIsMutable();
          messages_.add(index, value);
          onChanged();
        } else {
          messagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addMessages(
          com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder builderForValue) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.add(builderForValue.build());
          onChanged();
        } else {
          messagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addMessages(
          int index, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder builderForValue) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.add(index, builderForValue.build());
          onChanged();
        } else {
          messagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllMessages(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage> values) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          super.addAll(values, messages_);
          onChanged();
        } else {
          messagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearMessages() {
        if (messagesBuilder_ == null) {
          messages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          messagesBuilder_.clear();
        }
        return this;
      }
      public Builder removeMessages(int index) {
        if (messagesBuilder_ == null) {
          ensureMessagesIsMutable();
          messages_.remove(index);
          onChanged();
        } else {
          messagesBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder getMessagesBuilder(
          int index) {
        return getMessagesFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder getMessagesOrBuilder(
          int index) {
        if (messagesBuilder_ == null) {
          return messages_.get(index);  } else {
          return messagesBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder> 
           getMessagesOrBuilderList() {
        if (messagesBuilder_ != null) {
          return messagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(messages_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder addMessagesBuilder() {
        return getMessagesFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder addMessagesBuilder(
          int index) {
        return getMessagesFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder> 
           getMessagesBuilderList() {
        return getMessagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder> 
          getMessagesFieldBuilder() {
        if (messagesBuilder_ == null) {
          messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessage.Builder, com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.LeaveMessageOrBuilder>(
                  messages_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          messages_ = null;
        }
        return messagesBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseRecentlyMessageList)
    }
    
    static {
      defaultInstance = new BseRecentlyMessageList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseRecentlyMessageList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BseRecentlyMessageList.proto\022 com.xinq" +
      "ihd.sns.gameserver.proto\032\022LeaveMessage.p" +
      "roto\"Z\n\026BseRecentlyMessageList\022@\n\010messag" +
      "es\030\001 \003(\0132..com.xinqihd.sns.gameserver.pr" +
      "oto.LeaveMessageB\035B\033XinqiBseRecentlyMess" +
      "ageList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseRecentlyMessageList_descriptor,
              new java.lang.String[] { "Messages", },
              com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseRecentlyMessageList.BseRecentlyMessageList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiLeaveMessage.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}