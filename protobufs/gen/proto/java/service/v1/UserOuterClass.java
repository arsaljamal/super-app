// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/v1/user.proto

package service.v1;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:service.v1.User)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();

    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     * @return Whether the birthday field is set.
     */
    boolean hasBirthday();
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     * @return The birthday.
     */
    com.google.protobuf.Timestamp getBirthday();
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     */
    com.google.protobuf.TimestampOrBuilder getBirthdayOrBuilder();
  }
  /**
   * Protobuf type {@code service.v1.User}
   */
  public static final class User extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:service.v1.User)
      UserOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private User() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new User();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return service.v1.UserOuterClass.internal_static_service_v1_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return service.v1.UserOuterClass.internal_static_service_v1_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              service.v1.UserOuterClass.User.class, service.v1.UserOuterClass.User.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_ = 0;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }

    public static final int BIRTHDAY_FIELD_NUMBER = 3;
    private com.google.protobuf.Timestamp birthday_;
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     * @return Whether the birthday field is set.
     */
    @java.lang.Override
    public boolean hasBirthday() {
      return birthday_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     * @return The birthday.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getBirthday() {
      return birthday_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : birthday_;
    }
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getBirthdayOrBuilder() {
      return birthday_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : birthday_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      if (birthday_ != null) {
        output.writeMessage(3, getBirthday());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (birthday_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getBirthday());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof service.v1.UserOuterClass.User)) {
        return super.equals(obj);
      }
      service.v1.UserOuterClass.User other = (service.v1.UserOuterClass.User) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (hasBirthday() != other.hasBirthday()) return false;
      if (hasBirthday()) {
        if (!getBirthday()
            .equals(other.getBirthday())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      if (hasBirthday()) {
        hash = (37 * hash) + BIRTHDAY_FIELD_NUMBER;
        hash = (53 * hash) + getBirthday().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static service.v1.UserOuterClass.User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static service.v1.UserOuterClass.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static service.v1.UserOuterClass.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static service.v1.UserOuterClass.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static service.v1.UserOuterClass.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static service.v1.UserOuterClass.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(service.v1.UserOuterClass.User prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code service.v1.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:service.v1.User)
        service.v1.UserOuterClass.UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return service.v1.UserOuterClass.internal_static_service_v1_User_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return service.v1.UserOuterClass.internal_static_service_v1_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                service.v1.UserOuterClass.User.class, service.v1.UserOuterClass.User.Builder.class);
      }

      // Construct using service.v1.UserOuterClass.User.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        age_ = 0;
        birthday_ = null;
        if (birthdayBuilder_ != null) {
          birthdayBuilder_.dispose();
          birthdayBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return service.v1.UserOuterClass.internal_static_service_v1_User_descriptor;
      }

      @java.lang.Override
      public service.v1.UserOuterClass.User getDefaultInstanceForType() {
        return service.v1.UserOuterClass.User.getDefaultInstance();
      }

      @java.lang.Override
      public service.v1.UserOuterClass.User build() {
        service.v1.UserOuterClass.User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public service.v1.UserOuterClass.User buildPartial() {
        service.v1.UserOuterClass.User result = new service.v1.UserOuterClass.User(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(service.v1.UserOuterClass.User result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.age_ = age_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.birthday_ = birthdayBuilder_ == null
              ? birthday_
              : birthdayBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof service.v1.UserOuterClass.User) {
          return mergeFrom((service.v1.UserOuterClass.User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(service.v1.UserOuterClass.User other) {
        if (other == service.v1.UserOuterClass.User.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (other.hasBirthday()) {
          mergeBirthday(other.getBirthday());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                age_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                input.readMessage(
                    getBirthdayFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Timestamp birthday_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> birthdayBuilder_;
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       * @return Whether the birthday field is set.
       */
      public boolean hasBirthday() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       * @return The birthday.
       */
      public com.google.protobuf.Timestamp getBirthday() {
        if (birthdayBuilder_ == null) {
          return birthday_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : birthday_;
        } else {
          return birthdayBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      public Builder setBirthday(com.google.protobuf.Timestamp value) {
        if (birthdayBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          birthday_ = value;
        } else {
          birthdayBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      public Builder setBirthday(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (birthdayBuilder_ == null) {
          birthday_ = builderForValue.build();
        } else {
          birthdayBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      public Builder mergeBirthday(com.google.protobuf.Timestamp value) {
        if (birthdayBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            birthday_ != null &&
            birthday_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
            getBirthdayBuilder().mergeFrom(value);
          } else {
            birthday_ = value;
          }
        } else {
          birthdayBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      public Builder clearBirthday() {
        bitField0_ = (bitField0_ & ~0x00000004);
        birthday_ = null;
        if (birthdayBuilder_ != null) {
          birthdayBuilder_.dispose();
          birthdayBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      public com.google.protobuf.Timestamp.Builder getBirthdayBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getBirthdayFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getBirthdayOrBuilder() {
        if (birthdayBuilder_ != null) {
          return birthdayBuilder_.getMessageOrBuilder();
        } else {
          return birthday_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : birthday_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp birthday = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getBirthdayFieldBuilder() {
        if (birthdayBuilder_ == null) {
          birthdayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getBirthday(),
                  getParentForChildren(),
                  isClean());
          birthday_ = null;
        }
        return birthdayBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:service.v1.User)
    }

    // @@protoc_insertion_point(class_scope:service.v1.User)
    private static final service.v1.UserOuterClass.User DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new service.v1.UserOuterClass.User();
    }

    public static service.v1.UserOuterClass.User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<User>
        PARSER = new com.google.protobuf.AbstractParser<User>() {
      @java.lang.Override
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<User> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public service.v1.UserOuterClass.User getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_v1_User_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_v1_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025service/v1/user.proto\022\nservice.v1\032\037goo" +
      "gle/protobuf/timestamp.proto\"O\n\004User\022\014\n\004" +
      "name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022,\n\010birthday\030\003 \001(" +
      "\0132\032.google.protobuf.TimestampB2Z0github." +
      "com/super-app/protobufs/protos/service/v" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_service_v1_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service_v1_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_v1_User_descriptor,
        new java.lang.String[] { "Name", "Age", "Birthday", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
