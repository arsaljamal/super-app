///
//  Generated code. Do not modify.
//  source: service/v1/user_profile_service.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

import '../../google/protobuf/timestamp.pb.dart' as $2;

class CreateUserProfileRequest extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'CreateUserProfileRequest', package: const $pb.PackageName(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'service.v1'), createEmptyInstance: create)
    ..aOM<UserProfile>(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'userProfile', subBuilder: UserProfile.create)
    ..hasRequiredFields = false
  ;

  CreateUserProfileRequest._() : super();
  factory CreateUserProfileRequest({
    UserProfile? userProfile,
  }) {
    final _result = create();
    if (userProfile != null) {
      _result.userProfile = userProfile;
    }
    return _result;
  }
  factory CreateUserProfileRequest.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory CreateUserProfileRequest.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  CreateUserProfileRequest clone() => CreateUserProfileRequest()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  CreateUserProfileRequest copyWith(void Function(CreateUserProfileRequest) updates) => super.copyWith((message) => updates(message as CreateUserProfileRequest)) as CreateUserProfileRequest; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static CreateUserProfileRequest create() => CreateUserProfileRequest._();
  CreateUserProfileRequest createEmptyInstance() => create();
  static $pb.PbList<CreateUserProfileRequest> createRepeated() => $pb.PbList<CreateUserProfileRequest>();
  @$core.pragma('dart2js:noInline')
  static CreateUserProfileRequest getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<CreateUserProfileRequest>(create);
  static CreateUserProfileRequest? _defaultInstance;

  @$pb.TagNumber(1)
  UserProfile get userProfile => $_getN(0);
  @$pb.TagNumber(1)
  set userProfile(UserProfile v) { setField(1, v); }
  @$pb.TagNumber(1)
  $core.bool hasUserProfile() => $_has(0);
  @$pb.TagNumber(1)
  void clearUserProfile() => clearField(1);
  @$pb.TagNumber(1)
  UserProfile ensureUserProfile() => $_ensure(0);
}

class CreateUserProfileResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'CreateUserProfileResponse', package: const $pb.PackageName(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'service.v1'), createEmptyInstance: create)
    ..aOS(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'responseMessage')
    ..hasRequiredFields = false
  ;

  CreateUserProfileResponse._() : super();
  factory CreateUserProfileResponse({
    $core.String? responseMessage,
  }) {
    final _result = create();
    if (responseMessage != null) {
      _result.responseMessage = responseMessage;
    }
    return _result;
  }
  factory CreateUserProfileResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory CreateUserProfileResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  CreateUserProfileResponse clone() => CreateUserProfileResponse()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  CreateUserProfileResponse copyWith(void Function(CreateUserProfileResponse) updates) => super.copyWith((message) => updates(message as CreateUserProfileResponse)) as CreateUserProfileResponse; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static CreateUserProfileResponse create() => CreateUserProfileResponse._();
  CreateUserProfileResponse createEmptyInstance() => create();
  static $pb.PbList<CreateUserProfileResponse> createRepeated() => $pb.PbList<CreateUserProfileResponse>();
  @$core.pragma('dart2js:noInline')
  static CreateUserProfileResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<CreateUserProfileResponse>(create);
  static CreateUserProfileResponse? _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get responseMessage => $_getSZ(0);
  @$pb.TagNumber(1)
  set responseMessage($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasResponseMessage() => $_has(0);
  @$pb.TagNumber(1)
  void clearResponseMessage() => clearField(1);
}

class UserProfile extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'UserProfile', package: const $pb.PackageName(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'service.v1'), createEmptyInstance: create)
    ..aOS(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'name')
    ..a<$core.int>(2, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'age', $pb.PbFieldType.O3)
    ..aOM<$2.Timestamp>(3, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'birthday', subBuilder: $2.Timestamp.create)
    ..hasRequiredFields = false
  ;

  UserProfile._() : super();
  factory UserProfile({
    $core.String? name,
    $core.int? age,
    $2.Timestamp? birthday,
  }) {
    final _result = create();
    if (name != null) {
      _result.name = name;
    }
    if (age != null) {
      _result.age = age;
    }
    if (birthday != null) {
      _result.birthday = birthday;
    }
    return _result;
  }
  factory UserProfile.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory UserProfile.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  UserProfile clone() => UserProfile()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  UserProfile copyWith(void Function(UserProfile) updates) => super.copyWith((message) => updates(message as UserProfile)) as UserProfile; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static UserProfile create() => UserProfile._();
  UserProfile createEmptyInstance() => create();
  static $pb.PbList<UserProfile> createRepeated() => $pb.PbList<UserProfile>();
  @$core.pragma('dart2js:noInline')
  static UserProfile getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<UserProfile>(create);
  static UserProfile? _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get name => $_getSZ(0);
  @$pb.TagNumber(1)
  set name($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasName() => $_has(0);
  @$pb.TagNumber(1)
  void clearName() => clearField(1);

  @$pb.TagNumber(2)
  $core.int get age => $_getIZ(1);
  @$pb.TagNumber(2)
  set age($core.int v) { $_setSignedInt32(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasAge() => $_has(1);
  @$pb.TagNumber(2)
  void clearAge() => clearField(2);

  @$pb.TagNumber(3)
  $2.Timestamp get birthday => $_getN(2);
  @$pb.TagNumber(3)
  set birthday($2.Timestamp v) { setField(3, v); }
  @$pb.TagNumber(3)
  $core.bool hasBirthday() => $_has(2);
  @$pb.TagNumber(3)
  void clearBirthday() => clearField(3);
  @$pb.TagNumber(3)
  $2.Timestamp ensureBirthday() => $_ensure(2);
}

