package intermediary.collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleStreamAPI {

  public static void main(String[] args) {
    List<String> randomNumbers = Arrays
        .asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    System.out.println("\n\nImprima todos os elementos dessa lista de String: ");
    // randomNumbers.stream().forEach(System.out::println);
    randomNumbers.forEach(System.out::println);

    System.out.println("\n\n");

    System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
    // randomNumbers.stream()
    // .limit(5)
    // .collect(Collectors.toSet())
    // .forEach(System.out::println);
    Set<String> randomNumbers5First = randomNumbers.stream()
        .limit(5)
        .collect(Collectors.toSet());
    System.out.println(randomNumbers5First);

    System.out.println("\n\n");

    System.out.println(
        "Transforme esta lista de String em uma lista de números inteiros.");
    // List<Integer> randomNumbers1 = randomNumbers.stream()
    // .map(Integer::parseInt)
    // .collect(Collectors.toList());
    // System.out.println(randomNumbers1);
    List<Integer> randomNumbersInteger = randomNumbers.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    System.out.println(randomNumbersInteger);

    System.out.println("\n\n");

    System.out.println(
        "Pegue os números pares e maiores que 2 e coloque em uma lista:");
    // randomNumbers.stream()
    // .map(Integer::parseInt)
    // .filter(i -> i % 2 == 0 && i > 2)
    // .collect(Collectors.toList())
    // .forEach(System.out::println);
    List<Integer> listPairsGreaterThan2 = randomNumbers.stream()
        .map(Integer::parseInt)
        .filter(i -> (i % 2 == 0 && i > 2))
        .collect(Collectors.toList());
    System.out.println(listPairsGreaterThan2);

    System.out.println("\n\n");

    System.out.println("Mostre a média dos números: ");
    randomNumbers.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);

    System.out.println("\n\n");

    System.out.println("Remova os valores ímpares: ");
    // List<Integer> randomNumbers1 = randomNumbers.stream()
    // .map(Integer::parseInt).collect(Collectors.toList());
    // randomNumbers1.removeIf(integer -> integer % 2 != 0);
    // System.out.println(randomNumbers1);
    randomNumbersInteger.removeIf(i -> (i % 2 != 0));
    System.out.println(randomNumbersInteger);

    System.out.println("\n\n");

    System.out.println(
        "Ignore os 3 primeiros elementos da lista e imprima o restante:");
    List<Integer> randomNumbersInteger1 = randomNumbers.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    randomNumbersInteger1.stream()
        .skip(3)
        .forEach(System.out::println);

    System.out.println("\n\n");

    long countUniqueNumbers = randomNumbers.stream()
        .distinct()
        .count();
    System.out.println(
        "Retirando os números repetidos da lista, quantos números ficam? "
            + countUniqueNumbers);

    System.out.println("\n\n");

    System.out.print("Mostre o menor valor da lista: ");
    List<Integer> randomNumbersInteger2 = randomNumbers.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    randomNumbersInteger2.stream()
        .mapToInt(Integer::intValue)
        .min()
        .ifPresent(System.out::println);

    System.out.println("\n\n");

    System.out.print("Mostre o maior valor da lista: ");
    randomNumbersInteger2.stream()
        .mapToInt(Integer::intValue)
        .max()
        .ifPresent(System.out::println);

    System.out.println("\n\n");

    int sumEvenNumbers = randomNumbersInteger2.stream()
        .filter(i -> (i % 2 == 0))
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println("Pegue apenas os números pares e some: "
        + sumEvenNumbers);

    System.out.println("\n\n");

    System.out.println("Mostre a lista na ordem númerica: ");
    List<Integer> naturalOrderNumbers = randomNumbersInteger2.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println(naturalOrderNumbers);

    System.out.println("\n\n");

    System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
    // * dica: collect(Collectors.groupingBy(new Function())
    Map<Boolean, List<Integer>> collectNumbersMultipleOf3And5 = randomNumbersInteger2
        .stream()
        .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
    System.out.println(collectNumbersMultipleOf3And5);

    System.out.println("\n\n");
  }
}