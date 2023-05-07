package basic.challenge;

import java.util.Locale;
import java.util.Scanner;

public class MovingToIreland {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);
    
    double grossSalary = 0;
    double benefits = 0;
    boolean validInput = false;
    
    while (!validInput) {
      System.out.print("Digite o salario bruto: ");
      String grossSalaryStr = input.next();
      if (grossSalaryStr.matches("\\d+(\\.\\d{1,2})?")) {
        grossSalary = Double.parseDouble(grossSalaryStr);
        validInput = true;
      } else {
        System.out.println("Valor invalido. Por favor, digite um numero com no maximo duas casas decimais apos a virgula.");
      }
    }
    
    validInput = false;
    while (!validInput) {
      System.out.print("Digite o valor dos beneficios: ");
      String benefitsStr = input.next();
      if (benefitsStr.matches("\\d+(\\.\\d{1,2})?")) {
        benefits = Double.parseDouble(benefitsStr);
        validInput = true;
      } else {
        System.out.println("Valor invalido. Por favor, digite um numero com no maximo duas casas decimais apos a virgula.");
      }
    }
    
    double tax = 0;
    if (grossSalary <= 1100) {
      tax = grossSalary * 0.05;
    } else if (grossSalary <= 2500) {
      tax = grossSalary * 0.1;
    } else {
      tax = grossSalary * 0.15;
    }
    
    double netSalary = grossSalary - tax + benefits;
    
    System.out.printf("O salario liquido é: R$ %.2f", netSalary);

    input.close();
  }
}
