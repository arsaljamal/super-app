///
//  Generated code. Do not modify.
//  source: service/v1/user_profile_service.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'user_profile_service.pb.dart' as $1;
export 'user_profile_service.pb.dart';

class UserProfileServiceClient extends $grpc.Client {
  static final _$createUserProfile = $grpc.ClientMethod<
          $1.CreateUserProfileRequest, $1.CreateUserProfileResponse>(
      '/service.v1.UserProfileService/CreateUserProfile',
      ($1.CreateUserProfileRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) =>
          $1.CreateUserProfileResponse.fromBuffer(value));

  UserProfileServiceClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$1.CreateUserProfileResponse> createUserProfile(
      $1.CreateUserProfileRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$createUserProfile, request, options: options);
  }
}

abstract class UserProfileServiceBase extends $grpc.Service {
  $core.String get $name => 'service.v1.UserProfileService';

  UserProfileServiceBase() {
    $addMethod($grpc.ServiceMethod<$1.CreateUserProfileRequest,
            $1.CreateUserProfileResponse>(
        'CreateUserProfile',
        createUserProfile_Pre,
        false,
        false,
        ($core.List<$core.int> value) =>
            $1.CreateUserProfileRequest.fromBuffer(value),
        ($1.CreateUserProfileResponse value) => value.writeToBuffer()));
  }

  $async.Future<$1.CreateUserProfileResponse> createUserProfile_Pre(
      $grpc.ServiceCall call,
      $async.Future<$1.CreateUserProfileRequest> request) async {
    return createUserProfile(call, await request);
  }

  $async.Future<$1.CreateUserProfileResponse> createUserProfile(
      $grpc.ServiceCall call, $1.CreateUserProfileRequest request);
}
