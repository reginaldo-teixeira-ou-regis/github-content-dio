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

      int note;

      System.out.println("Nota: ");
      note = scan.nextInt();

      while (note < 0 | note > 10) {
        System.out.println("Nota Inválida! Digite novamente: ");
        note = scan.nextInt();
      }

      System.out.println("Nota: " + note);
      
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
