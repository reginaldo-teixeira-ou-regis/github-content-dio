package intermediary.handlingOfExceptions;

public class DivisionNotExactException extends Exception {

  private int numbered;
  private int denominator;

  public DivisionNotExactException(String message, int numbered, int denominator) {
    super(message);
    this.numbered = numbered;
    this.denominator = denominator;
  }

  public void printValues() {
    System.out.println("Numbered: " + numbered);
    System.out.println("Denominator: " + denominator);
  }
}