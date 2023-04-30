package intermediary.collections.iterationsOrded.lists;

// Dadas as seguintes informações sobre meus gatos, crie uma lista

// e ordene esta lista exibindo:
// (nome - idade - cor);
// Gato 1 = nome: Jon, idade: 18, cor: preto
// Gato 2 = nome: Simba, idade: 6, cor: tigrado
// Gato 3 = nome: Jon, idade: 12, cor: amarelo

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleOrderList {
  public static void main(String[] args) {

    List<Cat> myCats = new ArrayList<>() {
      {
        add(new Cat("Jon", 12, "preto"));
        add(new Cat("Simba", 6, "tigrado"));
        add(new Cat("Jon", 18, "amarelo"));
      }
    };
    myCats.sort(Comparator.comparing(Cat::getName));

    System.out.println("\n\n");

    System.out.println("--\tOrdem de Inserção\t---");
    System.out.println(myCats);

    System.out.println("\n\n");

    System.out.println("--\tOrdem aleatória\t---");
    Collections.shuffle(myCats);
    System.out.println(myCats);

    System.out.println("\n\n");

    System.out.println("--\tOrdem Natural (Nome)\t---");
    Collections.sort(myCats);
    System.out.println(myCats);

    System.out.println("\n\n");

    System.out.println("--\tOrdem Idade\t---");
    // Collections.sort(myCats, new ComparatorAge());
    myCats.sort(new ComparatorAge());
    System.out.println(myCats);

    System.out.println("\n\n");

    System.out.println("--\tOrdem cor\t---");
    // Collections.sort(myCats, new ComparatorCollor());
    myCats.sort(new ComparatorCollor());
    System.out.println(myCats);

    System.out.println("\n\n");

    System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    // Collections.sort(myCats, new ComparatorNameCollorAge());
    myCats.sort(new ComparatorNameCollorAge());
    System.out.println(myCats);

    System.out.println("\n\n");
  }
}

class Cat implements Comparable<Cat> {
  private String name;
  private Integer age;
  private String collor;

  public Cat(String name, Integer age, String collor) {
    this.name = name;
    this.age = age;
    this.collor = collor;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getCollor() {
    return collor;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + name + '\'' +
        ", idade=" + age +
        ", cor='" + collor + '\'' +
        '}';
  }

  @Override
  public int compareTo(Cat cat) {
    return this.getName().compareToIgnoreCase(cat.getName());
  }
}

class ComparatorAge implements Comparator<Cat> {
  @Override
  public int compare(Cat g1, Cat g2) {
    return Integer.compare(g1.getAge(), g2.getAge());
  }
}

class ComparatorCollor implements Comparator<Cat> {

  @Override
  public int compare(Cat g1, Cat g2) {
    return g1.getCollor().compareToIgnoreCase(g2.getCollor());
  }
}

class ComparatorNameCollorAge implements Comparator<Cat> {

  @Override
  public int compare(Cat g1, Cat g2) {
    int name = g1.getName().compareToIgnoreCase(g2.getName());
    if (name != 0)
      return name;

    int collor = g1.getCollor().compareToIgnoreCase(g2.getCollor());
    if (collor != 0)
      return collor;

    return Integer.compare(g1.getAge(), g2.getAge());

  }
}
