package intermediary.collections.iterationsOrded.singularSet;

import java.util.*;

public class ExampleSet {
  public static void main(String[] args) {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

    // * antes do java 5
    // Set schoolGrades = new HashSet();
    // HashSet<Double> schoolGrades = new HashSet<>();
    // * Generics(jdk 5) - Diamont Operator(jdk 7)
    // Set<Double> schoolGrades = new HashSet<>();

    // Set<Double> schoolGrades = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    // schoolGrades.add(1d);
    // schoolGrades.remove(5d);
    // System.out.println(schoolGrades);

    System.out.println("\n\nCrie um conjunto e adicione as notas: ");
    Set<Double> schoolGrades = new HashSet<>(
        Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(schoolGrades.toString() + "\n\n");

    // System.out.println("Exiba a posição da nota 5.0: ");

    // System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

    // System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

    System.out.println(
        "Confira se a nota 5.0 está no conjunto: "
            + schoolGrades.contains(5d) + "\n\n");

    // System.out.println("Exiba a terceira nota adicionada: ");

    System.out.println(
      "Exiba a menor nota: " + Collections.min(schoolGrades) + "\n\n");

    System.out.println(
      "Exiba a maior nota: " + Collections.max(schoolGrades) + "\n\n");

    Iterator<Double> iterator = schoolGrades.iterator();
    Double sum = 0.0;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      sum += next;
    }
    System.out.println("Exiba a soma dos valores: " + sum + "\n\n");

    System.out.println(
      "Exiba a média das notas: " + (sum / schoolGrades.size()) + "\n\n");

    System.out.println("Remova a nota 0: ");
    schoolGrades.remove(0d);
    System.out.println(schoolGrades + "\n\n");

    // System.out.println("Remova a nota da posição 0");

    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator1 = schoolGrades.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }
    System.out.println(schoolGrades + "\n\n");

    System.out.println("Exiba todas as notas na ordem em que foram informados: ");
    Set<Double> schoolGrades2 = new LinkedHashSet<>();
    schoolGrades2.add(7d);
    schoolGrades2.add(8.5);
    schoolGrades2.add(9.3);
    schoolGrades2.add(5d);
    schoolGrades2.add(7d);
    schoolGrades2.add(0d);
    schoolGrades2.add(3.6);
    System.out.println(schoolGrades2 + "\n\n");

    System.out.println("Exiba todas as notas na ordem crescente: ");
    Set<Double> schoolGrades3 = new TreeSet<>(schoolGrades2);
    System.out.println(schoolGrades3 + "\n\n");

    System.out.println("Apague todo o conjunto");
    schoolGrades.clear();

    System.out.println(
        "Confira se o conjunto está vazio: " + schoolGrades.isEmpty());

    System.out.println(
        "Confira se o conjunto 2 está vazio: " + schoolGrades2.isEmpty());

    System.out.println(
        "Confira se o conjunto 3 está vazio: " + schoolGrades3.isEmpty() + "\n\n");
  }
}
