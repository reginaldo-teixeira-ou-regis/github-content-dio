public class Calculate implements MathematicalOperation {
  @Override
  public void sum(double num1, double num2) {
    System.out.println("Soma: " + (num1 + num2));
  }

  @Override
  public void subtraction(double num1, double num2) {
    System.out.println("Subtracao: " + (num1 - num2));
  }

  @Override
  public void multiplication(double num1, double num2) {
    System.out.println("multiplicacao: " + (num1 * num2));
  }

  @Override
  public void division(double num1, double num2) {
    System.out.println("multiplicacao: " + (num1 / num2));
  }
}