import java.util.Scanner;

// Faça um programa que peça N números inteiros,
// calcule e mostre a quantidade de números pares
// e a quantidade de números impares.

public class EvenAndOdd {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);
      int quantityNumbers;
      int number;
      int quantityEven = 0, quantityOdd  = 0;

      System.out.println("Quantidade de números: ");
      quantityNumbers = scan.nextInt();

      int count = 0;
      do {
        System.out.println("Número: ");
        number = scan.nextInt();

        if (number % 2 == 0)
          quantityEven++;
        else
          quantityOdd ++;

        count++;
        
      } while (count < quantityNumbers);

      System.out.println("Quantidade Par: " + quantityEven);
      System.out.println("Quantidade Ímpar: " + quantityOdd );
      
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
