import * as jspb from 'google-protobuf'

import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb';


export class User extends jspb.Message {
  getName(): string;
  setName(value: string): User;

  getAge(): number;
  setAge(value: number): User;

  getBirthday(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setBirthday(value?: google_protobuf_timestamp_pb.Timestamp): User;
  hasBirthday(): boolean;
  clearBirthday(): User;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): User.AsObject;
  static toObject(includeInstance: boolean, msg: User): User.AsObject;
  static serializeBinaryToWriter(message: User, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): User;
  static deserializeBinaryFromReader(message: User, reader: jspb.BinaryReader): User;
}

export namespace User {
  export type AsObject = {
    name: string,
    age: number,
    birthday?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

