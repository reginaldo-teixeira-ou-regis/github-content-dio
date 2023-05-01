package intermediary.collections.iterationsOrdedLists;

import java.util.*;

public class ExampleList {
  public static void main(String[] args) {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

    // * antes do java 5
    // List schoolGrades = new ArrayList();
    // ArrayList<Double> schoolGrades = new ArrayList<>();
    // List<Double> schoolGrades = new ArrayList<>(Arrays
    // .asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

    // List<Double> schoolGrades = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    // schoolGrades.add(10d);
    // System.out.println(schoolGrades);

    // List<Double> schoolGrades = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    // schoolGrades.add(1d);
    // schoolGrades.remove(5d);
    // System.out.println(schoolGrades);

    System.out.println("\nCrie uma lista e adicione as sete notas: ");

    // * Generics(jdk 5) - Diamond Operator(jdk 7)
    List<Double> schoolGrades = new ArrayList<Double>();
    schoolGrades.add(7.0);
    schoolGrades.add(8.5);
    schoolGrades.add(9.3);
    schoolGrades.add(5.0);
    schoolGrades.add(7.0);
    schoolGrades.add(0.0);
    schoolGrades.add(3.6);
    System.out.println(schoolGrades.toString() + "\n\n");

    System.out.println(
        "Exiba a posição da nota 5.0: " + schoolGrades.indexOf(5d) + "\n\n");

    System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
    schoolGrades.add(4, 8d);
    System.out.println(schoolGrades + "\n\n");

    System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
    schoolGrades.set(schoolGrades.indexOf(5d), 6.0);
    System.out.println(schoolGrades + "\n\n");

    System.out.println(
        "Confira se a nota 5.0 está na lista: " + schoolGrades.contains(5d) + "\n\n");

    // System.out.println("Exiba todas as notas na ordem em que foram informados:
    // ");
    // for (Double nota : notas) System.out.println(nota + "\n\n");

    System.out.println("Exiba a terceira nota adicionada: " + schoolGrades.get(2));
    System.out.println(schoolGrades.toString() + "\n\n");

    System.out.println(
        "Exiba a menor nota: " + Collections.min(schoolGrades) + "\n\n");

    System.out.println(
        "Exiba a maior nota: " + Collections.max(schoolGrades) + "\n\n");

    Iterator<Double> iterator = schoolGrades.iterator();
    Double sum = 0d;
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

    System.out.println("Remova a nota da posição 0");
    schoolGrades.remove(0);
    System.out.println(schoolGrades + "\n\n");

    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator1 = schoolGrades.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }
    System.out.println(schoolGrades + "\n\n");

    // System.out.println("Apague toda a lista");
    // notas.clear();
    // System.out.println(notas + "\n\n");

    System.out.println(
        "Confira se a lista está vazia: " + schoolGrades.isEmpty() + "\n\n");

    // Para você: Resolva esses exercícios utilizando
    // os métodos da implementação LinkedList:
    // System.out.println("Crie uma lista chamada notas2 " +
    // "e coloque todos os elementos da list Arraylist nessa nova lista: ");
    // System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
    // System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
  }
}
