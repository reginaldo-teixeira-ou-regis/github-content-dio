package intermediary.collections.iterationsOrdedLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Faça um programa que receba a temperatura média os 6 primeiros meses do ano 
// e armazene-as em uma lista.Após isto,calcule a média semestral das temperaturas 
// e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram 
// (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).

public class Temperatures {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Double> temperatures = new ArrayList<Double>();

    // Adicionando as temperaturas na lista:
    int count = 0;
    while (true) {
      if (count == 6)
        break;

      System.out.print("Digite a temperatura: ");
      double temp = scan.nextDouble();
      temperatures.add(temp);
      count++;
    }
    System.out.println("-----------------");

    // exibindo todas as temperaturas:
    System.out.print("Todas as temperaturas: ");
    temperatures.forEach(t -> System.out.print(t + " / "));

    // calculando e exibindo a média das temperaturas:
    double average = temperatures.stream()
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0d);
    System.out.printf("\nMédia das temperaturas: %.1f\n", average);

    // exibindo as temperaturas acima da média
    System.out.print("Temperaturas acima da média: ");
    temperatures.stream()
        .filter(t -> t > average)
        .forEach(t -> System.out.printf("%.1f ", t));

    // exibindo o mês das temperaturas acima da média por extenso:
    System.out.println("\n\nMeses das temperaturas acima da média: ");
    Iterator<Double> iterator = temperatures.iterator();

    count = 0;
    while (iterator.hasNext()) {
      Double temp = iterator.next();
      if (temp > average) {
        switch (count) {
          case (0):
            System.out.printf("1 - janeiro: %.1f\n", temp);
            break;
          case (1):
            System.out.printf("2 - fevereiro: %.1f\n", temp);
            break;
          case (2):
            System.out.printf("3 - março: %.1f\n", temp);
            break;
          case (3):
            System.out.printf("4 - abril: %.1f\n", temp);
            break;
          case (4):
            System.out.printf("5 - maio: %.1f\n", temp);
            break;
          case (5):
            System.out.printf("6 - junho: %.1f\n", temp);
            break;
          default:
            System.out.println("Não houve temperatura acima da média.");
        }
      }
      count++;

      scan.close();
    }
  }
}
