package intermediary.handlingOfExceptions;

import javax.swing.*;

// * Fazer a divisão de 2 valores inteiros
public class UncheckedException {
  public static void main(String[] args) {

    boolean continueLooping = true;

    do {
      String a = JOptionPane.showInputDialog("Numerador: ");
      String b = JOptionPane.showInputDialog("Denominador: ");

      try {
        int result = toDivide(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + result);
        continueLooping = false;
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(
            null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
      } catch (ArithmeticException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
      } finally {
        System.out.println("Chegou no finally!");
      }
    } while (continueLooping);

    System.out.println("O código continua...");
  }

  public static int toDivide(int a, int b) {
    return a / b;
  }
}
