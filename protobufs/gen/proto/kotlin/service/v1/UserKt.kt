//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: service/v1/user.proto

package service.v1;

@kotlin.jvm.JvmName("-initializeuser")
public inline fun user(block: service.v1.UserKt.Dsl.() -> kotlin.Unit): service.v1.UserOuterClass.User =
  service.v1.UserKt.Dsl._create(service.v1.UserOuterClass.User.newBuilder()).apply { block() }._build()
public object UserKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: service.v1.UserOuterClass.User.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: service.v1.UserOuterClass.User.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): service.v1.UserOuterClass.User = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>int32 age = 2;</code>
     */
    public var age: kotlin.Int
      @JvmName("getAge")
      get() = _builder.getAge()
      @JvmName("setAge")
      set(value) {
        _builder.setAge(value)
      }
    /**
     * <code>int32 age = 2;</code>
     */
    public fun clearAge() {
      _builder.clearAge()
    }

    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     */
    public var birthday: com.google.protobuf.Timestamp
      @JvmName("getBirthday")
      get() = _builder.getBirthday()
      @JvmName("setBirthday")
      set(value) {
        _builder.setBirthday(value)
      }
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     */
    public fun clearBirthday() {
      _builder.clearBirthday()
    }
    /**
     * <code>.google.protobuf.Timestamp birthday = 3;</code>
     * @return Whether the birthday field is set.
     */
    public fun hasBirthday(): kotlin.Boolean {
      return _builder.hasBirthday()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun service.v1.UserOuterClass.User.copy(block: service.v1.UserKt.Dsl.() -> kotlin.Unit): service.v1.UserOuterClass.User =
  service.v1.UserKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val service.v1.UserOuterClass.UserOrBuilder.birthdayOrNull: com.google.protobuf.Timestamp?
  get() = if (hasBirthday()) getBirthday() else null
