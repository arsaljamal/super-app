/**
 * @fileoverview gRPC-Web generated client stub for service.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.4.2
// 	protoc              v3.21.12
// source: service/v1/user_profile_service.proto


/* eslint-disable */
// @ts-nocheck


import * as grpcWeb from 'grpc-web';

import * as service_v1_user_profile_service_pb from '../../service/v1/user_profile_service_pb';


export class UserProfileServiceClient {
  client_: grpcWeb.AbstractClientBase;
  hostname_: string;
  credentials_: null | { [index: string]: string; };
  options_: null | { [index: string]: any; };

  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; }) {
    if (!options) options = {};
    if (!credentials) credentials = {};
    options['format'] = 'text';

    this.client_ = new grpcWeb.GrpcWebClientBase(options);
    this.hostname_ = hostname.replace(/\/+$/, '');
    this.credentials_ = credentials;
    this.options_ = options;
  }

  methodDescriptorCreateUserProfile = new grpcWeb.MethodDescriptor(
    '/service.v1.UserProfileService/CreateUserProfile',
    grpcWeb.MethodType.UNARY,
    service_v1_user_profile_service_pb.CreateUserProfileRequest,
    service_v1_user_profile_service_pb.CreateUserProfileResponse,
    (request: service_v1_user_profile_service_pb.CreateUserProfileRequest) => {
      return request.serializeBinary();
    },
    service_v1_user_profile_service_pb.CreateUserProfileResponse.deserializeBinary
  );

  createUserProfile(
    request: service_v1_user_profile_service_pb.CreateUserProfileRequest,
    metadata: grpcWeb.Metadata | null): Promise<service_v1_user_profile_service_pb.CreateUserProfileResponse>;

  createUserProfile(
    request: service_v1_user_profile_service_pb.CreateUserProfileRequest,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.RpcError,
               response: service_v1_user_profile_service_pb.CreateUserProfileResponse) => void): grpcWeb.ClientReadableStream<service_v1_user_profile_service_pb.CreateUserProfileResponse>;

  createUserProfile(
    request: service_v1_user_profile_service_pb.CreateUserProfileRequest,
    metadata: grpcWeb.Metadata | null,
    callback?: (err: grpcWeb.RpcError,
               response: service_v1_user_profile_service_pb.CreateUserProfileResponse) => void) {
    if (callback !== undefined) {
      return this.client_.rpcCall(
        this.hostname_ +
          '/service.v1.UserProfileService/CreateUserProfile',
        request,
        metadata || {},
        this.methodDescriptorCreateUserProfile,
        callback);
    }
    return this.client_.unaryCall(
    this.hostname_ +
      '/service.v1.UserProfileService/CreateUserProfile',
    request,
    metadata || {},
    this.methodDescriptorCreateUserProfile);
  }

}

