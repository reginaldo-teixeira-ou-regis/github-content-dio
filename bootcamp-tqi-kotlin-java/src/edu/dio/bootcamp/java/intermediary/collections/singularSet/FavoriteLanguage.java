package intermediary.collections.singularSet;

import java.util.*;

// Crie uma classe LanguageFavorite que possua os atributos nome, anoDeCriacao e IDE.
// Em seguida, crie um conjunto com 3 linguagens 
// e faça um programa que ordene esse conjunto por:
// a) Ordem de inserção;
// b) Ordem natural(nome);
// c) IDE;
// d) Ano de criação e nome;
// e) Nome, ano de criação e IDE;
// Ao final, exiba as linguagens no console, um abaixo da outra.

public class FavoriteLanguage {
  public static void main(String[] args) {
    Set<LanguageFavorite> myFavoriteLanguages = new HashSet<>();
    myFavoriteLanguages.add(new LanguageFavorite("Python", 1991, "Pycharm"));
    myFavoriteLanguages.add(new LanguageFavorite("JavaScript", 1995, "IntelliJ"));
    myFavoriteLanguages.add(new LanguageFavorite("Java", 1991, "Visual Studio Code"));

    System.out.println("\n\n");

    System.out.println("--------\tOrdem de Inserção\t--------");
    Set<LanguageFavorite> myFavoriteLanguages1 = new LinkedHashSet<>(
        Arrays.asList(
            new LanguageFavorite("Python", 1991, "Pycharm"),
            new LanguageFavorite("JavaScript", 1995, "IntelliJ"),
            new LanguageFavorite("Java", 1991, "Visual Studio Code")));
    for (LanguageFavorite language : myFavoriteLanguages1)
      System.out.println(language);

    System.out.println("\n\n");

    System.out.println("--------\tOrdem Natural: Nome\t--------");
    Set<LanguageFavorite> myFavoriteLanguages2 = new TreeSet<>(myFavoriteLanguages);
    for (LanguageFavorite language : myFavoriteLanguages2)
      System.out.println(language);

    System.out.println("\n\n");

    System.out.println("--------\tOrdem IDE\t--------");
    Set<LanguageFavorite> myFavoriteLanguages3 = new TreeSet<LanguageFavorite>(
        new ComparatorIde());
    myFavoriteLanguages3.addAll(myFavoriteLanguages);
    for (LanguageFavorite language : myFavoriteLanguages3)
      System.out.println(language);

    System.out.println("\n\n");

    System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
    Set<LanguageFavorite> myFavoriteLanguages4 = new TreeSet<LanguageFavorite>(
        new ComparatorYearCreationAndName());
    myFavoriteLanguages4.addAll(myFavoriteLanguages);
    for (LanguageFavorite language : myFavoriteLanguages4)
      System.out.println(language);

    System.out.println("\n\n");

    System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
    Set<LanguageFavorite> myFavoriteLanguages5 = new TreeSet<LanguageFavorite>(
        new ComparatorNameYearCreatedIde());
    myFavoriteLanguages5.addAll(myFavoriteLanguages3);
    for (LanguageFavorite language : myFavoriteLanguages5)
      System.out.println(language);

    System.out.println("\n\n");
  }
}

class LanguageFavorite implements Comparable<LanguageFavorite> {
  public String name;
  public Integer yearCreated;
  public String ide;

  public LanguageFavorite(String name, Integer yearCreated, String ide) {
    this.name = name;
    this.yearCreated = yearCreated;
    this.ide = ide;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + name + '\'' +
        ", anoDeCriacao=" + yearCreated +
        ", ide='" + ide + '\'' +
        '}';
  }

  @Override
  public int compareTo(LanguageFavorite LanguageFavorite) {
    return this.name.compareTo(LanguageFavorite.name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    LanguageFavorite that = (LanguageFavorite) o;
    return name.equals(that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}

class ComparatorIde implements Comparator<LanguageFavorite> {

  @Override
  public int compare(LanguageFavorite lf1, LanguageFavorite lf2) {
    return lf1.ide.compareToIgnoreCase(lf2.ide);
  }
}

class ComparatorYearCreationAndName implements Comparator<LanguageFavorite> {

  @Override
  public int compare(LanguageFavorite lf1, LanguageFavorite lf2) {
    int yearCreated = Integer.compare(lf1.yearCreated, lf2.yearCreated);
    if (yearCreated != 0)
      return yearCreated;
    return lf1.name.compareToIgnoreCase(lf2.name);
  }
}

class ComparatorNameYearCreatedIde implements Comparator<LanguageFavorite> {

  @Override
  public int compare(LanguageFavorite lf1, LanguageFavorite lf2) {
    int name = lf1.name.compareToIgnoreCase(lf2.name);
    int yearCreated = Integer.compare(lf1.yearCreated, lf2.yearCreated);
    if (name != 0)
      return name;
    if (yearCreated != 0)
      return yearCreated;
    return lf1.ide.compareToIgnoreCase(lf2.ide);
  }
}
