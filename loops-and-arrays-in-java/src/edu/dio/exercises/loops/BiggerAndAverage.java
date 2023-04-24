package edu.dio.exercises.loops;

import java.util.Scanner;

// Faça um programa que leia 5 número e informe 
// o maior número e a média desses números.

public class BiggerAndAverage {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);
      int numero;
      int maior = 0;
      int soma = 0;

      int count = 0;
      do {
        System.out.println("Número: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if (numero > maior)
          maior = numero;

        count = count + 1;
      } while (count < 5);

      System.out.println("Maior: " + maior);
      System.out.println("Média: " + (soma / 5));
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}