package edu.dio.exercises.loops;

import java.util.Scanner;

// Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo
// até que o usuário informe um valor válido.

public class NoteFrom0To10 {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);

      int nota;

      System.out.println("Nota: ");
      nota = scan.nextInt();

      while (nota < 0 | nota > 10) {
        System.out.println("Nota Inválida! Digite novamente: ");
        nota = scan.nextInt();
      }

      System.out.println("Nota: " + nota);
      
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
