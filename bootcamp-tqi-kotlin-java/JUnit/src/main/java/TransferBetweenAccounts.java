public class TransferBetweenAccounts {

  public void transfer(
      Account originAccount,
      Account destinationAccount,
      int value) {
    if (value <= 0) {
      throw new IllegalArgumentException("Valor deve ser maior que zero");
    }

    destinationAccount.launchCredit(value);
    originAccount.launchDebit(value);
  }
}
