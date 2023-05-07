import java.util.Scanner;

// Desenvolva um gerador de tabuada,
// capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuário deve informar de qual numero ele deseja ver a tabuada.
// A saída deve ser conforme o exemplo abaixo:

// Tabuada de 5:
// 5 X 1 = 5
// 5 X 2 = 10
// ...
// 5 X 10 = 50

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);

      System.out.println("Tabuada: ");
      int multiplicationTable = scan.nextInt();

      while (multiplicationTable < 1 | multiplicationTable > 10) {
        System.out.println("Numero Inválido! Digite um numero entre 1 a 10: ");
        multiplicationTable = scan.nextInt();
      }

      System.out.println("Tabuada de " + multiplicationTable);
      for (int i = 1; i <= 10; i = i + 1) {
        System.out.println(multiplicationTable + " X " + i + " = " + (multiplicationTable * i));
      }
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
