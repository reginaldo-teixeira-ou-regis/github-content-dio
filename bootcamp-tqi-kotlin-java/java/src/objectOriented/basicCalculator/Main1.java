public class Main1 {
  public static void main(String[] args) {
    // Criar uma instância da classe Calculator
    Calculate calculator = new Calculate();

    // Chamar os métodos da calculadora
    double num1 = 10.0;
    double num2 = 5.0;

    calculator.sum(num1, num2); // Soma: 15.0
    calculator.subtraction(num1, num2); // Subtração: 5.0
    calculator.multiplication(num1, num2); // Multiplicação: 50.0
    calculator.division(num1, num2); // Divisão: 2.0
  }
}
