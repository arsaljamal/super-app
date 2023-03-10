//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: service/v1/address.proto

package service.v1;

@kotlin.jvm.JvmName("-initializeperson")
public inline fun person(block: service.v1.PersonKt.Dsl.() -> kotlin.Unit): service.v1.Address.Person =
  service.v1.PersonKt.Dsl._create(service.v1.Address.Person.newBuilder()).apply { block() }._build()
public object PersonKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: service.v1.Address.Person.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: service.v1.Address.Person.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): service.v1.Address.Person = _builder.build()

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
     * <pre>
     * Unique ID number for this person.
     * </pre>
     *
     * <code>int32 id = 2;</code>
     */
    public var id: kotlin.Int
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * Unique ID number for this person.
     * </pre>
     *
     * <code>int32 id = 2;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string email = 3;</code>
     */
    public var email: kotlin.String
      @JvmName("getEmail")
      get() = _builder.getEmail()
      @JvmName("setEmail")
      set(value) {
        _builder.setEmail(value)
      }
    /**
     * <code>string email = 3;</code>
     */
    public fun clearEmail() {
      _builder.clearEmail()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PhonesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     */
     public val phones: com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPhonesList()
      )
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     * @param value The phones to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPhones")
    public fun com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>.add(value: service.v1.Address.Person.PhoneNumber) {
      _builder.addPhones(value)
    }
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     * @param value The phones to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPhones")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>.plusAssign(value: service.v1.Address.Person.PhoneNumber) {
      add(value)
    }
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     * @param values The phones to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPhones")
    public fun com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>.addAll(values: kotlin.collections.Iterable<service.v1.Address.Person.PhoneNumber>) {
      _builder.addAllPhones(values)
    }
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     * @param values The phones to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPhones")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>.plusAssign(values: kotlin.collections.Iterable<service.v1.Address.Person.PhoneNumber>) {
      addAll(values)
    }
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     * @param index The index to set the value at.
     * @param value The phones to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPhones")
    public operator fun com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>.set(index: kotlin.Int, value: service.v1.Address.Person.PhoneNumber) {
      _builder.setPhones(index, value)
    }
    /**
     * <code>repeated .service.v1.Person.PhoneNumber phones = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPhones")
    public fun com.google.protobuf.kotlin.DslList<service.v1.Address.Person.PhoneNumber, PhonesProxy>.clear() {
      _builder.clearPhones()
    }


    /**
     * <code>.google.protobuf.Timestamp last_updated = 5;</code>
     */
    public var lastUpdated: com.google.protobuf.Timestamp
      @JvmName("getLastUpdated")
      get() = _builder.getLastUpdated()
      @JvmName("setLastUpdated")
      set(value) {
        _builder.setLastUpdated(value)
      }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5;</code>
     */
    public fun clearLastUpdated() {
      _builder.clearLastUpdated()
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5;</code>
     * @return Whether the lastUpdated field is set.
     */
    public fun hasLastUpdated(): kotlin.Boolean {
      return _builder.hasLastUpdated()
    }
  }
  @kotlin.jvm.JvmName("-initializephoneNumber")
  public inline fun phoneNumber(block: service.v1.PersonKt.PhoneNumberKt.Dsl.() -> kotlin.Unit): service.v1.Address.Person.PhoneNumber =
    service.v1.PersonKt.PhoneNumberKt.Dsl._create(service.v1.Address.Person.PhoneNumber.newBuilder()).apply { block() }._build()
  public object PhoneNumberKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: service.v1.Address.Person.PhoneNumber.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: service.v1.Address.Person.PhoneNumber.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): service.v1.Address.Person.PhoneNumber = _builder.build()

      /**
       * <code>string number = 1;</code>
       */
      public var number: kotlin.String
        @JvmName("getNumber")
        get() = _builder.getNumber()
        @JvmName("setNumber")
        set(value) {
          _builder.setNumber(value)
        }
      /**
       * <code>string number = 1;</code>
       */
      public fun clearNumber() {
        _builder.clearNumber()
      }

      /**
       * <code>.service.v1.Person.PhoneType type = 2;</code>
       */
      public var type: service.v1.Address.Person.PhoneType
        @JvmName("getType")
        get() = _builder.getType()
        @JvmName("setType")
        set(value) {
          _builder.setType(value)
        }
      /**
       * <code>.service.v1.Person.PhoneType type = 2;</code>
       */
      public fun clearType() {
        _builder.clearType()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun service.v1.Address.Person.copy(block: service.v1.PersonKt.Dsl.() -> kotlin.Unit): service.v1.Address.Person =
  service.v1.PersonKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun service.v1.Address.Person.PhoneNumber.copy(block: service.v1.PersonKt.PhoneNumberKt.Dsl.() -> kotlin.Unit): service.v1.Address.Person.PhoneNumber =
  service.v1.PersonKt.PhoneNumberKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val service.v1.Address.PersonOrBuilder.lastUpdatedOrNull: com.google.protobuf.Timestamp?
  get() = if (hasLastUpdated()) getLastUpdated() else null

