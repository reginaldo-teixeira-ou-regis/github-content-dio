package basic.loops;

import java.util.Scanner;

// Faça um programa que calcule o fatorial 
// de um número inteiro fornecido pelo usuário.
// Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)

public class Factorial {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);

      System.out.println("Fatorial: ");
      int factorial = scan.nextInt();

      int multiplication = 1;

      System.out.print(factorial + "! = ");
      for (int i = factorial; i >= 1; i--) {
        multiplication = multiplication * i;
      }

      System.out.println(multiplication);
      
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
