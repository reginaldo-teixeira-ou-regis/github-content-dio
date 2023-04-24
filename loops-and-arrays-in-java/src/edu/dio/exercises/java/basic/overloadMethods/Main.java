package edu.dio.exercises.java.basic.overloadMethods;

public class Main {
  public static void main(String[] args) {
    System.out.println("Exercício Quadrilátero");
    Quadrilateral.area(3);
    Quadrilateral.area(5d, 5d);
    Quadrilateral.area(7, 8, 9);
    Quadrilateral.area(5f, 5f);
  }
}
