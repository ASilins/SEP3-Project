package via.sep3.logicserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: LogicServer.proto")
public final class LogicServerGrpc {

  private LogicServerGrpc() {}

  public static final String SERVICE_NAME = "LogicServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.CreatedMember,
      via.sep3.logicserver.protobuf.ResponseMember> getCreateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createMember",
      requestType = via.sep3.logicserver.protobuf.CreatedMember.class,
      responseType = via.sep3.logicserver.protobuf.ResponseMember.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.CreatedMember,
      via.sep3.logicserver.protobuf.ResponseMember> getCreateMemberMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.CreatedMember, via.sep3.logicserver.protobuf.ResponseMember> getCreateMemberMethod;
    if ((getCreateMemberMethod = LogicServerGrpc.getCreateMemberMethod) == null) {
      synchronized (LogicServerGrpc.class) {
        if ((getCreateMemberMethod = LogicServerGrpc.getCreateMemberMethod) == null) {
          LogicServerGrpc.getCreateMemberMethod = getCreateMemberMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.CreatedMember, via.sep3.logicserver.protobuf.ResponseMember>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.CreatedMember.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.ResponseMember.getDefaultInstance()))
              .setSchemaDescriptor(new LogicServerMethodDescriptorSupplier("createMember"))
              .build();
        }
      }
    }
    return getCreateMemberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogicServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogicServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogicServerStub>() {
        @java.lang.Override
        public LogicServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogicServerStub(channel, callOptions);
        }
      };
    return LogicServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogicServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogicServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogicServerBlockingStub>() {
        @java.lang.Override
        public LogicServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogicServerBlockingStub(channel, callOptions);
        }
      };
    return LogicServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogicServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogicServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogicServerFutureStub>() {
        @java.lang.Override
        public LogicServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogicServerFutureStub(channel, callOptions);
        }
      };
    return LogicServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LogicServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createMember(via.sep3.logicserver.protobuf.CreatedMember request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ResponseMember> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMemberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.CreatedMember,
                via.sep3.logicserver.protobuf.ResponseMember>(
                  this, METHODID_CREATE_MEMBER)))
          .build();
    }
  }

  /**
   */
  public static final class LogicServerStub extends io.grpc.stub.AbstractAsyncStub<LogicServerStub> {
    private LogicServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogicServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogicServerStub(channel, callOptions);
    }

    /**
     */
    public void createMember(via.sep3.logicserver.protobuf.CreatedMember request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ResponseMember> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogicServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogicServerBlockingStub> {
    private LogicServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogicServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogicServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.ResponseMember createMember(via.sep3.logicserver.protobuf.CreatedMember request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMemberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogicServerFutureStub extends io.grpc.stub.AbstractFutureStub<LogicServerFutureStub> {
    private LogicServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogicServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogicServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.ResponseMember> createMember(
        via.sep3.logicserver.protobuf.CreatedMember request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MEMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogicServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogicServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MEMBER:
          serviceImpl.createMember((via.sep3.logicserver.protobuf.CreatedMember) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ResponseMember>) responseObserver);
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

  private static abstract class LogicServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogicServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.logicserver.protobuf.LogicServerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogicServer");
    }
  }

  private static final class LogicServerFileDescriptorSupplier
      extends LogicServerBaseDescriptorSupplier {
    LogicServerFileDescriptorSupplier() {}
  }

  private static final class LogicServerMethodDescriptorSupplier
      extends LogicServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogicServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogicServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogicServerFileDescriptorSupplier())
              .addMethod(getCreateMemberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
