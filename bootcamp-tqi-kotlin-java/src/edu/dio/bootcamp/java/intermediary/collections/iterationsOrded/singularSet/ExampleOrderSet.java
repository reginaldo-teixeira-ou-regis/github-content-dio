package intermediary.collections.iterationsOrded.singularSet;

// Dadas as seguintes informações sobre minhas séries favoritas,

// crie um conjunto e ordene este conjunto exibindo:
// (nome - genero - tempo de episódio);
// Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
// Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
// Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25

import java.util.*;

public class ExampleOrderSet {
  public static void main(String[] args) {

    System.out.println("\n\n");

    System.out.println("--\tOrdem aleatória\t--");
    Set<Serie> mySeries = new HashSet<>() {
      {
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
      }
    };
    for (Serie serie : mySeries)
      System.out.println(serie.getName()
          + " - " + serie.getGender()
          + " - " + serie.getTimeEpisode());

    System.out.println("\n\n");

    System.out.println("--\tOrdem inserção\t--");
    Set<Serie> mySeries1 = new LinkedHashSet<>() {
      {
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
      }
    };
    for (Serie serie : mySeries1)
      System.out.println(serie.getName() +
          " - " + serie.getGender() +
          " - " + serie.getTimeEpisode());

    System.out.println("\n\n");

    System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
    Set<Serie> mySeries2 = new TreeSet<>(mySeries1);
    for (Serie serie : mySeries2)
      System.out.println(serie.getName()
          + " - " + serie.getGender()
          + " - " + serie.getTimeEpisode());

    System.out.println("\n\n");

    System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
    Set<Serie> mySeries3 = new TreeSet<>(new ComparatorNameGenderTimeEpisode());
    mySeries3.addAll(mySeries);
    for (Serie serie : mySeries3)
      System.out.println(serie.getName()
          + " - " + serie.getGender()
          + " - " + serie.getTimeEpisode());

    System.out.println("\n\n");

    // Pra você
    // System.out.println("--\tOrdem gênero\t--");
    // System.out.println("--\tOrdem Tempo Episódio\t--");
    // System.out.println("\n\n");
  }
}

class Serie implements Comparable<Serie> {
  private String name;
  private String gender;
  private Integer timeEpisode;

  public Serie(String name, String gender, Integer timeEpisode) {
    this.name = name;
    this.gender = gender;
    this.timeEpisode = timeEpisode;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public Integer getTimeEpisode() {
    return timeEpisode;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + name + '\'' +
        ", genero='" + gender + '\'' +
        ", tempoEpisodio=" + timeEpisode +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Serie serie = (Serie) o;
    return name.equals(serie.name) && gender.equals(serie.gender)
        && timeEpisode.equals(serie.timeEpisode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, gender, timeEpisode);
  }

  @Override
  public int compareTo(Serie serie) {
    int timeEpisode = Integer.compare(this.getTimeEpisode(), serie.getTimeEpisode());
    if (timeEpisode != 0)
      return timeEpisode;

    return this.getGender().compareTo(serie.getGender());
  }
}

class ComparatorNameGenderTimeEpisode implements Comparator<Serie> {

  @Override
  public int compare(Serie s1, Serie s2) {
    int name = s1.getName().compareTo(s2.getName());
    if (name != 0)
      return name;

    int gender = s1.getGender().compareTo(s2.getGender());
    if (gender != 0)
      return gender;

    return Integer.compare(s1.getTimeEpisode(), s2.getTimeEpisode());
  }
}
