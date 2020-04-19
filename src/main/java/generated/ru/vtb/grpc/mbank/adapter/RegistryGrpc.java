package ru.vtb.grpc.mbank.adapter;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: registry-service.proto")
public final class RegistryGrpc {

  private RegistryGrpc() {}

  public static final String SERVICE_NAME = "Registry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.vtb.grpc.mbank.adapter.AccountRequest,
      ru.vtb.grpc.mbank.adapter.AccountReply> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = ru.vtb.grpc.mbank.adapter.AccountRequest.class,
      responseType = ru.vtb.grpc.mbank.adapter.AccountReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.vtb.grpc.mbank.adapter.AccountRequest,
      ru.vtb.grpc.mbank.adapter.AccountReply> getGetAccountMethod() {
    io.grpc.MethodDescriptor<ru.vtb.grpc.mbank.adapter.AccountRequest, ru.vtb.grpc.mbank.adapter.AccountReply> getGetAccountMethod;
    if ((getGetAccountMethod = RegistryGrpc.getGetAccountMethod) == null) {
      synchronized (RegistryGrpc.class) {
        if ((getGetAccountMethod = RegistryGrpc.getGetAccountMethod) == null) {
          RegistryGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<ru.vtb.grpc.mbank.adapter.AccountRequest, ru.vtb.grpc.mbank.adapter.AccountReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.vtb.grpc.mbank.adapter.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.vtb.grpc.mbank.adapter.AccountReply.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.vtb.grpc.mbank.adapter.AccountRequest,
      ru.vtb.grpc.mbank.adapter.AccountReply> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = ru.vtb.grpc.mbank.adapter.AccountRequest.class,
      responseType = ru.vtb.grpc.mbank.adapter.AccountReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.vtb.grpc.mbank.adapter.AccountRequest,
      ru.vtb.grpc.mbank.adapter.AccountReply> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<ru.vtb.grpc.mbank.adapter.AccountRequest, ru.vtb.grpc.mbank.adapter.AccountReply> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = RegistryGrpc.getDeleteAccountMethod) == null) {
      synchronized (RegistryGrpc.class) {
        if ((getDeleteAccountMethod = RegistryGrpc.getDeleteAccountMethod) == null) {
          RegistryGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<ru.vtb.grpc.mbank.adapter.AccountRequest, ru.vtb.grpc.mbank.adapter.AccountReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.vtb.grpc.mbank.adapter.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.vtb.grpc.mbank.adapter.AccountReply.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryMethodDescriptorSupplier("DeleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryStub>() {
        @java.lang.Override
        public RegistryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryStub(channel, callOptions);
        }
      };
    return RegistryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryBlockingStub>() {
        @java.lang.Override
        public RegistryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryBlockingStub(channel, callOptions);
        }
      };
    return RegistryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryFutureStub>() {
        @java.lang.Override
        public RegistryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryFutureStub(channel, callOptions);
        }
      };
    return RegistryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RegistryImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAccount(ru.vtb.grpc.mbank.adapter.AccountRequest request,
        io.grpc.stub.StreamObserver<ru.vtb.grpc.mbank.adapter.AccountReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void deleteAccount(ru.vtb.grpc.mbank.adapter.AccountRequest request,
        io.grpc.stub.StreamObserver<ru.vtb.grpc.mbank.adapter.AccountReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.vtb.grpc.mbank.adapter.AccountRequest,
                ru.vtb.grpc.mbank.adapter.AccountReply>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getDeleteAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.vtb.grpc.mbank.adapter.AccountRequest,
                ru.vtb.grpc.mbank.adapter.AccountReply>(
                  this, METHODID_DELETE_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class RegistryStub extends io.grpc.stub.AbstractAsyncStub<RegistryStub> {
    private RegistryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryStub(channel, callOptions);
    }

    /**
     */
    public void getAccount(ru.vtb.grpc.mbank.adapter.AccountRequest request,
        io.grpc.stub.StreamObserver<ru.vtb.grpc.mbank.adapter.AccountReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(ru.vtb.grpc.mbank.adapter.AccountRequest request,
        io.grpc.stub.StreamObserver<ru.vtb.grpc.mbank.adapter.AccountReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistryBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegistryBlockingStub> {
    private RegistryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.vtb.grpc.mbank.adapter.AccountReply getAccount(ru.vtb.grpc.mbank.adapter.AccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.vtb.grpc.mbank.adapter.AccountReply deleteAccount(ru.vtb.grpc.mbank.adapter.AccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistryFutureStub extends io.grpc.stub.AbstractFutureStub<RegistryFutureStub> {
    private RegistryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.vtb.grpc.mbank.adapter.AccountReply> getAccount(
        ru.vtb.grpc.mbank.adapter.AccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.vtb.grpc.mbank.adapter.AccountReply> deleteAccount(
        ru.vtb.grpc.mbank.adapter.AccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_DELETE_ACCOUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((ru.vtb.grpc.mbank.adapter.AccountRequest) request,
              (io.grpc.stub.StreamObserver<ru.vtb.grpc.mbank.adapter.AccountReply>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((ru.vtb.grpc.mbank.adapter.AccountRequest) request,
              (io.grpc.stub.StreamObserver<ru.vtb.grpc.mbank.adapter.AccountReply>) responseObserver);
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

  private static abstract class RegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.vtb.grpc.mbank.adapter.RegistryService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Registry");
    }
  }

  private static final class RegistryFileDescriptorSupplier
      extends RegistryBaseDescriptorSupplier {
    RegistryFileDescriptorSupplier() {}
  }

  private static final class RegistryMethodDescriptorSupplier
      extends RegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistryMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistryFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getDeleteAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
