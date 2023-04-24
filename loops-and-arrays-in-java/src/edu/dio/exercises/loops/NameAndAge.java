package edu.dio.exercises.loops;

import java.util.Scanner;

// Faça um programa que leia conjuntos de dois valores,
// o primeiro representando o nome do aluno 
// e o segundo representando a sua idade.
// (Pare o programa inserindo o valor 0 no campo nome)

public class NameAndAge {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);
      String name;
      int age;
      
      while (true) {
        System.out.println("Nome: ");
        name = scan.next();
        if (name.equals("0"))
          break;

        System.out.println("Idade: ");
        age = scan.nextInt();
        
        System.out.println("Nome: " + name + ", Idade: " + age);
      }
  
      System.out.println("Programa Finalizado");
      
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
