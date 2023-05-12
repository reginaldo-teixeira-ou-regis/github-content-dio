import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Classe apresentando mais detalhes das asserções

public class AccountTest {

  @Test
  void validaSaldo() {
    Account account = new Account("123456", 100);
    Assertions.assertNotNull(account);

    account.launchCredit(50);

    Assertions.assertEquals(150, account.getBalance());

    account.launchDebit(50);

    Assertions.assertEquals(100, account.getBalance());

    Assertions.assertNotEquals(101, account.getBalance());

    account = null;
    Assertions.assertNull(account);
  }
}