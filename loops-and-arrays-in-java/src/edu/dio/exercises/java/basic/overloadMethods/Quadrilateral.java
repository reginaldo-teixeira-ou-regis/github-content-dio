package edu.dio.exercises.java.basic.overloadMethods;

public class Quadrilateral {
  public static void area(double side) {

    System.out.println("Área do quadrado:" + side * side);
  }

  public static void area(double side1, double side2) {

    System.out.println("Área do retângulo:" + side1 * side2);
  }

  public static void area(double majorBase, double minorBase, double height) {

    System.out.println(
        "Área do trapézio:" + ((majorBase + minorBase) * height) / 2
      );
  }

  public static void area(float diagonal1, float diagonal2) {

    System.out.println("Área do losango:" + (diagonal1 * diagonal2) / 2);
  }

}
