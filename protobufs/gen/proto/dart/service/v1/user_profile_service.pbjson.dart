///
//  Generated code. Do not modify.
//  source: service/v1/user_profile_service.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;
@$core.Deprecated('Use createUserProfileRequestDescriptor instead')
const CreateUserProfileRequest$json = const {
  '1': 'CreateUserProfileRequest',
  '2': const [
    const {'1': 'user_profile', '3': 1, '4': 1, '5': 11, '6': '.service.v1.UserProfile', '10': 'userProfile'},
  ],
};

/// Descriptor for `CreateUserProfileRequest`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List createUserProfileRequestDescriptor = $convert.base64Decode('ChhDcmVhdGVVc2VyUHJvZmlsZVJlcXVlc3QSOgoMdXNlcl9wcm9maWxlGAEgASgLMhcuc2VydmljZS52MS5Vc2VyUHJvZmlsZVILdXNlclByb2ZpbGU=');
@$core.Deprecated('Use createUserProfileResponseDescriptor instead')
const CreateUserProfileResponse$json = const {
  '1': 'CreateUserProfileResponse',
  '2': const [
    const {'1': 'response_message', '3': 1, '4': 1, '5': 9, '10': 'responseMessage'},
  ],
};

/// Descriptor for `CreateUserProfileResponse`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List createUserProfileResponseDescriptor = $convert.base64Decode('ChlDcmVhdGVVc2VyUHJvZmlsZVJlc3BvbnNlEikKEHJlc3BvbnNlX21lc3NhZ2UYASABKAlSD3Jlc3BvbnNlTWVzc2FnZQ==');
@$core.Deprecated('Use userProfileDescriptor instead')
const UserProfile$json = const {
  '1': 'UserProfile',
  '2': const [
    const {'1': 'name', '3': 1, '4': 1, '5': 9, '10': 'name'},
    const {'1': 'age', '3': 2, '4': 1, '5': 5, '10': 'age'},
    const {'1': 'birthday', '3': 3, '4': 1, '5': 11, '6': '.google.protobuf.Timestamp', '10': 'birthday'},
  ],
};

/// Descriptor for `UserProfile`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List userProfileDescriptor = $convert.base64Decode('CgtVc2VyUHJvZmlsZRISCgRuYW1lGAEgASgJUgRuYW1lEhAKA2FnZRgCIAEoBVIDYWdlEjYKCGJpcnRoZGF5GAMgASgLMhouZ29vZ2xlLnByb3RvYnVmLlRpbWVzdGFtcFIIYmlydGhkYXk=');
