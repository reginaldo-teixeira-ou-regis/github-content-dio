package main.java.arrays;

import java.util.Random;

// Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) 
// armazene-os num vetor. Ao final mostre os números e seus sucessores.

public class RandomNumbers {
  public static void main(String[] args) {
    Random random = new Random();

    int[] randomNumbers = new int[20];

    for (int i = 0; i < randomNumbers.length; i++) {
      int number = random.nextInt(100);
      randomNumbers[i] = number;
    }

    System.out.print("Numeros Aleatorios: ");
    for (int number : randomNumbers) {
      System.out.print(number + " ");
    }

    System.out.print("\nAntecessor dos Numeros Aleatorios: ");
    for (int number : randomNumbers) {
      System.out.print((number - 1) + " ");
    }

    System.out.print("\nSucessores dos Numeros Aleatorios: ");
    for (int number : randomNumbers) {
      System.out.print((number + 1) + " ");
    }
  }
}
