package via.sep3.logicserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: MemberService.proto")
public final class MemberServiceGrpc {

  private MemberServiceGrpc() {}

  public static final String SERVICE_NAME = "MemberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.LoginCreateObject,
      via.sep3.logicserver.protobuf.MemberObj> getCreateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createMember",
      requestType = via.sep3.logicserver.protobuf.LoginCreateObject.class,
      responseType = via.sep3.logicserver.protobuf.MemberObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.LoginCreateObject,
      via.sep3.logicserver.protobuf.MemberObj> getCreateMemberMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.LoginCreateObject, via.sep3.logicserver.protobuf.MemberObj> getCreateMemberMethod;
    if ((getCreateMemberMethod = MemberServiceGrpc.getCreateMemberMethod) == null) {
      synchronized (MemberServiceGrpc.class) {
        if ((getCreateMemberMethod = MemberServiceGrpc.getCreateMemberMethod) == null) {
          MemberServiceGrpc.getCreateMemberMethod = getCreateMemberMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.LoginCreateObject, via.sep3.logicserver.protobuf.MemberObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.LoginCreateObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.MemberObj.getDefaultInstance()))
              .setSchemaDescriptor(new MemberServiceMethodDescriptorSupplier("createMember"))
              .build();
        }
      }
    }
    return getCreateMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.LoginCreateObject,
      via.sep3.logicserver.protobuf.MemberObj> getLoginMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "loginMember",
      requestType = via.sep3.logicserver.protobuf.LoginCreateObject.class,
      responseType = via.sep3.logicserver.protobuf.MemberObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.LoginCreateObject,
      via.sep3.logicserver.protobuf.MemberObj> getLoginMemberMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.LoginCreateObject, via.sep3.logicserver.protobuf.MemberObj> getLoginMemberMethod;
    if ((getLoginMemberMethod = MemberServiceGrpc.getLoginMemberMethod) == null) {
      synchronized (MemberServiceGrpc.class) {
        if ((getLoginMemberMethod = MemberServiceGrpc.getLoginMemberMethod) == null) {
          MemberServiceGrpc.getLoginMemberMethod = getLoginMemberMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.LoginCreateObject, via.sep3.logicserver.protobuf.MemberObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "loginMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.LoginCreateObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.MemberObj.getDefaultInstance()))
              .setSchemaDescriptor(new MemberServiceMethodDescriptorSupplier("loginMember"))
              .build();
        }
      }
    }
    return getLoginMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.MemberObj,
      via.sep3.logicserver.protobuf.StringObj> getEditMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editMember",
      requestType = via.sep3.logicserver.protobuf.MemberObj.class,
      responseType = via.sep3.logicserver.protobuf.StringObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.MemberObj,
      via.sep3.logicserver.protobuf.StringObj> getEditMemberMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.MemberObj, via.sep3.logicserver.protobuf.StringObj> getEditMemberMethod;
    if ((getEditMemberMethod = MemberServiceGrpc.getEditMemberMethod) == null) {
      synchronized (MemberServiceGrpc.class) {
        if ((getEditMemberMethod = MemberServiceGrpc.getEditMemberMethod) == null) {
          MemberServiceGrpc.getEditMemberMethod = getEditMemberMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.MemberObj, via.sep3.logicserver.protobuf.StringObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "editMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.MemberObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setSchemaDescriptor(new MemberServiceMethodDescriptorSupplier("editMember"))
              .build();
        }
      }
    }
    return getEditMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj,
      via.sep3.logicserver.protobuf.Members> getGetMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMembers",
      requestType = via.sep3.logicserver.protobuf.StringObj.class,
      responseType = via.sep3.logicserver.protobuf.Members.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj,
      via.sep3.logicserver.protobuf.Members> getGetMembersMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj, via.sep3.logicserver.protobuf.Members> getGetMembersMethod;
    if ((getGetMembersMethod = MemberServiceGrpc.getGetMembersMethod) == null) {
      synchronized (MemberServiceGrpc.class) {
        if ((getGetMembersMethod = MemberServiceGrpc.getGetMembersMethod) == null) {
          MemberServiceGrpc.getGetMembersMethod = getGetMembersMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.StringObj, via.sep3.logicserver.protobuf.Members>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.Members.getDefaultInstance()))
              .setSchemaDescriptor(new MemberServiceMethodDescriptorSupplier("getMembers"))
              .build();
        }
      }
    }
    return getGetMembersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceStub>() {
        @java.lang.Override
        public MemberServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceStub(channel, callOptions);
        }
      };
    return MemberServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceBlockingStub>() {
        @java.lang.Override
        public MemberServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceBlockingStub(channel, callOptions);
        }
      };
    return MemberServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceFutureStub>() {
        @java.lang.Override
        public MemberServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceFutureStub(channel, callOptions);
        }
      };
    return MemberServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MemberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createMember(via.sep3.logicserver.protobuf.LoginCreateObject request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.MemberObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMemberMethod(), responseObserver);
    }

    /**
     */
    public void loginMember(via.sep3.logicserver.protobuf.LoginCreateObject request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.MemberObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMemberMethod(), responseObserver);
    }

    /**
     */
    public void editMember(via.sep3.logicserver.protobuf.MemberObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditMemberMethod(), responseObserver);
    }

    /**
     */
    public void getMembers(via.sep3.logicserver.protobuf.StringObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Members> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMembersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.LoginCreateObject,
                via.sep3.logicserver.protobuf.MemberObj>(
                  this, METHODID_CREATE_MEMBER)))
          .addMethod(
            getLoginMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.LoginCreateObject,
                via.sep3.logicserver.protobuf.MemberObj>(
                  this, METHODID_LOGIN_MEMBER)))
          .addMethod(
            getEditMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.MemberObj,
                via.sep3.logicserver.protobuf.StringObj>(
                  this, METHODID_EDIT_MEMBER)))
          .addMethod(
            getGetMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.StringObj,
                via.sep3.logicserver.protobuf.Members>(
                  this, METHODID_GET_MEMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class MemberServiceStub extends io.grpc.stub.AbstractAsyncStub<MemberServiceStub> {
    private MemberServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMember(via.sep3.logicserver.protobuf.LoginCreateObject request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.MemberObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginMember(via.sep3.logicserver.protobuf.LoginCreateObject request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.MemberObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editMember(via.sep3.logicserver.protobuf.MemberObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMembers(via.sep3.logicserver.protobuf.StringObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Members> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMembersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MemberServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MemberServiceBlockingStub> {
    private MemberServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.MemberObj createMember(via.sep3.logicserver.protobuf.LoginCreateObject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.MemberObj loginMember(via.sep3.logicserver.protobuf.LoginCreateObject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.StringObj editMember(via.sep3.logicserver.protobuf.MemberObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.Members getMembers(via.sep3.logicserver.protobuf.StringObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMembersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MemberServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MemberServiceFutureStub> {
    private MemberServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.MemberObj> createMember(
        via.sep3.logicserver.protobuf.LoginCreateObject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.MemberObj> loginMember(
        via.sep3.logicserver.protobuf.LoginCreateObject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.StringObj> editMember(
        via.sep3.logicserver.protobuf.MemberObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.Members> getMembers(
        via.sep3.logicserver.protobuf.StringObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMembersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MEMBER = 0;
  private static final int METHODID_LOGIN_MEMBER = 1;
  private static final int METHODID_EDIT_MEMBER = 2;
  private static final int METHODID_GET_MEMBERS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MemberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MemberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MEMBER:
          serviceImpl.createMember((via.sep3.logicserver.protobuf.LoginCreateObject) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.MemberObj>) responseObserver);
          break;
        case METHODID_LOGIN_MEMBER:
          serviceImpl.loginMember((via.sep3.logicserver.protobuf.LoginCreateObject) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.MemberObj>) responseObserver);
          break;
        case METHODID_EDIT_MEMBER:
          serviceImpl.editMember((via.sep3.logicserver.protobuf.MemberObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj>) responseObserver);
          break;
        case METHODID_GET_MEMBERS:
          serviceImpl.getMembers((via.sep3.logicserver.protobuf.StringObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Members>) responseObserver);
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

  private static abstract class MemberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MemberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.logicserver.protobuf.MemberServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MemberService");
    }
  }

  private static final class MemberServiceFileDescriptorSupplier
      extends MemberServiceBaseDescriptorSupplier {
    MemberServiceFileDescriptorSupplier() {}
  }

  private static final class MemberServiceMethodDescriptorSupplier
      extends MemberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MemberServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MemberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberServiceFileDescriptorSupplier())
              .addMethod(getCreateMemberMethod())
              .addMethod(getLoginMemberMethod())
              .addMethod(getEditMemberMethod())
              .addMethod(getGetMembersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
