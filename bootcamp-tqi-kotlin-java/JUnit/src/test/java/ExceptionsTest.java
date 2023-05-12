import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

  @Test
  void validateTransferExceptionScenario() {
    Account originAccount = new Account("123456", 0);
    Account destinationAccount = new Account("456548", 100);

    TransferBetweenAccounts transferBetweenAccounts = new TransferBetweenAccounts();

    Assertions.assertDoesNotThrow(() -> transferBetweenAccounts
        .transfer(originAccount, destinationAccount, 20));
  }
}