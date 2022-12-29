///
//  Generated code. Do not modify.
//  source: service/v1/user_profile_service.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'user_profile_service.pb.dart' as $0;
export 'user_profile_service.pb.dart';

class UserProfileServiceClient extends $grpc.Client {
  static final _$createUserProfile = $grpc.ClientMethod<
          $0.CreateUserProfileRequest, $0.CreateUserProfileResponse>(
      '/service.v1.UserProfileService/CreateUserProfile',
      ($0.CreateUserProfileRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) =>
          $0.CreateUserProfileResponse.fromBuffer(value));

  UserProfileServiceClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$0.CreateUserProfileResponse> createUserProfile(
      $0.CreateUserProfileRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$createUserProfile, request, options: options);
  }
}

abstract class UserProfileServiceBase extends $grpc.Service {
  $core.String get $name => 'service.v1.UserProfileService';

  UserProfileServiceBase() {
    $addMethod($grpc.ServiceMethod<$0.CreateUserProfileRequest,
            $0.CreateUserProfileResponse>(
        'CreateUserProfile',
        createUserProfile_Pre,
        false,
        false,
        ($core.List<$core.int> value) =>
            $0.CreateUserProfileRequest.fromBuffer(value),
        ($0.CreateUserProfileResponse value) => value.writeToBuffer()));
  }

  $async.Future<$0.CreateUserProfileResponse> createUserProfile_Pre(
      $grpc.ServiceCall call,
      $async.Future<$0.CreateUserProfileRequest> request) async {
    return createUserProfile(call, await request);
  }

  $async.Future<$0.CreateUserProfileResponse> createUserProfile(
      $grpc.ServiceCall call, $0.CreateUserProfileRequest request);
}
