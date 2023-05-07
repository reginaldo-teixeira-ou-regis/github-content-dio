import javax.swing.*;

public class CustomException_2 {
  public static void main(String[] args) {
    int[] numbered = { 4, 5, 8, 10 };
    int[] denominator = { 2, 4, 0, 2, 8 };

    for (int i = 0; i < denominator.length; i++) {
      try {
        if (numbered[i] % 2 != 0)
          throw new DivisionNotExactException(
              "Divisão não exata!", numbered[i], denominator[i]);

        int result = numbered[i] / denominator[i];
        System.out.println(result);
      } catch (
          DivisionNotExactException
          | ArithmeticException
            | ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
      }
    }

    System.out.println("O programa continua...");
  }
}