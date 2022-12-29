package service.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: service/v1/user_profile_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserProfileServiceGrpc {

  private UserProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "service.v1.UserProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest,
      service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse> getCreateUserProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserProfile",
      requestType = service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest.class,
      responseType = service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest,
      service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse> getCreateUserProfileMethod() {
    io.grpc.MethodDescriptor<service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest, service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse> getCreateUserProfileMethod;
    if ((getCreateUserProfileMethod = UserProfileServiceGrpc.getCreateUserProfileMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getCreateUserProfileMethod = UserProfileServiceGrpc.getCreateUserProfileMethod) == null) {
          UserProfileServiceGrpc.getCreateUserProfileMethod = getCreateUserProfileMethod =
              io.grpc.MethodDescriptor.<service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest, service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("CreateUserProfile"))
              .build();
        }
      }
    }
    return getCreateUserProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceStub>() {
        @java.lang.Override
        public UserProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceStub(channel, callOptions);
        }
      };
    return UserProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceBlockingStub>() {
        @java.lang.Override
        public UserProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return UserProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceFutureStub>() {
        @java.lang.Override
        public UserProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceFutureStub(channel, callOptions);
        }
      };
    return UserProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserProfileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUserProfile(service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest request,
        io.grpc.stub.StreamObserver<service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest,
                service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse>(
                  this, METHODID_CREATE_USER_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class UserProfileServiceStub extends io.grpc.stub.AbstractAsyncStub<UserProfileServiceStub> {
    private UserProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUserProfile(service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest request,
        io.grpc.stub.StreamObserver<service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserProfileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserProfileServiceBlockingStub> {
    private UserProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse createUserProfile(service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserProfileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserProfileServiceFutureStub> {
    private UserProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse> createUserProfile(
        service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER_PROFILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER_PROFILE:
          serviceImpl.createUserProfile((service.v1.UserProfileServiceOuterClass.CreateUserProfileRequest) request,
              (io.grpc.stub.StreamObserver<service.v1.UserProfileServiceOuterClass.CreateUserProfileResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.v1.UserProfileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserProfileService");
    }
  }

  private static final class UserProfileServiceFileDescriptorSupplier
      extends UserProfileServiceBaseDescriptorSupplier {
    UserProfileServiceFileDescriptorSupplier() {}
  }

  private static final class UserProfileServiceMethodDescriptorSupplier
      extends UserProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserProfileServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserProfileServiceFileDescriptorSupplier())
              .addMethod(getCreateUserProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
