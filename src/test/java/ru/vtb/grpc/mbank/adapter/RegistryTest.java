package ru.vtb.grpc.mbank.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.mockito.Mockito.verify;

import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import io.grpc.ManagedChannel;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;

public class RegistryTest {

  @Rule
  public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

  private final RegistryGrpc.RegistryImplBase serviceImpl =
      mock(RegistryGrpc.RegistryImplBase.class, delegatesTo(
          new RegistryGrpc.RegistryImplBase() {
            @Override
            public void getAccount(AccountRequest request, StreamObserver<AccountReply> respObserver) {
              respObserver.onNext(AccountReply.getDefaultInstance());
              respObserver.onCompleted();
            }

            @Override
            public void deleteAccount(AccountRequest request, StreamObserver<AccountReply> respObserver) {
              respObserver.onNext(AccountReply.getDefaultInstance());
              respObserver.onCompleted();
            }
          }));

  private RegistryGrpc.RegistryBlockingStub blockingStub;

  @Before
  public void setUp() throws Exception {
    String serverName = InProcessServerBuilder.generateName();

    grpcCleanup.register(
        InProcessServerBuilder
            .forName(serverName)
            .directExecutor()
            .addService(serviceImpl)
            .build()
            .start()
    );

    ManagedChannel channel = grpcCleanup.register(
        InProcessChannelBuilder
            .forName(serverName)
            .directExecutor()
            .build()
    );

    blockingStub = RegistryGrpc.newBlockingStub(channel);
  }

  private AccountRequest getTestAccountRequest() {
    return AccountRequest.newBuilder()
        .setId("test id")
        .setId("test inn")
        .setId("test kpp")
        .setName("test name")
        .setAccount(
            Account.newBuilder()
                .setBic("test bic")
                .setBic("test kpp")
                .setBic("test settlement_account")
                .setBic("test correspondent_account")
                .build()
        )
        .build();
  }

  /**
   * TODO есть вопросы к такому тестированию (принцип взят из оф документации grpc)
   * получается, что тестируем код библиотеки
   * передаем данные для отправки в getAccount -> проверяем, верно ли передались поля данных
   * нашего кода тут нет
   */
  @Test
  @DisplayName("exchange with mock server")
  public void testGetAccount() {
    ArgumentCaptor<AccountRequest> requestCaptor = ArgumentCaptor
        .forClass(AccountRequest.class);

    AccountRequest req = getTestAccountRequest();

    blockingStub.getAccount(req);

    verify(serviceImpl).getAccount(
        requestCaptor.capture(),
        ArgumentMatchers.<StreamObserver<AccountReply>>any());

    assertEquals(req.getName(), requestCaptor.getValue().getName());
  }
}
