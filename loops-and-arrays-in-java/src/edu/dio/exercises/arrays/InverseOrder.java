package edu.dio.exercises.arrays;

// Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.

public class InverseOrder {
  public static void main(String[] args) {
    int[] vector = { -5, -6, 15, 50, 8, 4 };

    System.out.print("Vetor: ");
    int count = 0;
    while (count < (vector.length)) {
      System.out.print(vector[count] + " ");
      count++;
    }

    System.out.print("\nVetor: ");
    for (int i = (vector.length - 1); i >= 0; i--) {
      System.out.print(vector[i] + " ");
    }
  }
}
