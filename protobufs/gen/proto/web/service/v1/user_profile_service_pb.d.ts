import * as jspb from 'google-protobuf'

import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb';


export class CreateUserProfileRequest extends jspb.Message {
  getUserProfile(): UserProfile | undefined;
  setUserProfile(value?: UserProfile): CreateUserProfileRequest;
  hasUserProfile(): boolean;
  clearUserProfile(): CreateUserProfileRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateUserProfileRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateUserProfileRequest): CreateUserProfileRequest.AsObject;
  static serializeBinaryToWriter(message: CreateUserProfileRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateUserProfileRequest;
  static deserializeBinaryFromReader(message: CreateUserProfileRequest, reader: jspb.BinaryReader): CreateUserProfileRequest;
}

export namespace CreateUserProfileRequest {
  export type AsObject = {
    userProfile?: UserProfile.AsObject,
  }
}

export class CreateUserProfileResponse extends jspb.Message {
  getResponseMessage(): string;
  setResponseMessage(value: string): CreateUserProfileResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateUserProfileResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CreateUserProfileResponse): CreateUserProfileResponse.AsObject;
  static serializeBinaryToWriter(message: CreateUserProfileResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateUserProfileResponse;
  static deserializeBinaryFromReader(message: CreateUserProfileResponse, reader: jspb.BinaryReader): CreateUserProfileResponse;
}

export namespace CreateUserProfileResponse {
  export type AsObject = {
    responseMessage: string,
  }
}

export class UserProfile extends jspb.Message {
  getName(): string;
  setName(value: string): UserProfile;

  getAge(): number;
  setAge(value: number): UserProfile;

  getBirthday(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setBirthday(value?: google_protobuf_timestamp_pb.Timestamp): UserProfile;
  hasBirthday(): boolean;
  clearBirthday(): UserProfile;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserProfile.AsObject;
  static toObject(includeInstance: boolean, msg: UserProfile): UserProfile.AsObject;
  static serializeBinaryToWriter(message: UserProfile, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserProfile;
  static deserializeBinaryFromReader(message: UserProfile, reader: jspb.BinaryReader): UserProfile;
}

export namespace UserProfile {
  export type AsObject = {
    name: string,
    age: number,
    birthday?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

