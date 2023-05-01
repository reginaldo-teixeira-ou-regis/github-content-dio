package intermediary.collections.ofPairsMap;

// Dadas as seguintes informações sobre meus livros favoritos e seus autores,
// crie um dicionário e ordene este dicionário:
// exibindo (Nome Autor - Nome Livro);
// Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
// Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
// Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432

import java.util.*;

public class ExampleOrderMap {
  public static void main(String[] args) {
    System.out.println("\n\n--\tOrdem aleatória\t--");
    Map<String, Book> myBooks = new HashMap<>() {
      {
        put(" Hawking, Stephen", new Book(
            "Uma Breve História do Tempo", 256));
        put(" Duhigg, Charles", new Book(
            "O Poder do Hábito", 408));
        put(" Harari, Yuval Noah", new Book(
            "21 Lições Para o Século 21", 432));
      }
    };
    for (Map.Entry<String, Book> book : myBooks.entrySet())
      System.out.println(book.getKey() + " - " + book.getValue().getName());

    System.out.println("\n\n");

    System.out.println("--\tOrdem Inserção\t--");
    Map<String, Book> myBooks1 = new LinkedHashMap<>() {
      {
        put(" Hawking, Stephen", new Book(
            "Uma Breve História do Tempo", 256));
        put(" Duhigg, Charles", new Book(
            "O Poder do Hábito", 408));
        put(" Harari, Yuval Noah", new Book(
            "21 Lições Para o Século 21", 432));
      }
    };
    for (Map.Entry<String, Book> book : myBooks1.entrySet())
      System.out.println(book.getKey() + " - " + book.getValue().getName());

    System.out.println("\n\n");

    System.out.println("--\tOrdem alfabética autores\t--");
    Map<String, Book> myBooks2 = new TreeMap<>(myBooks1);
    for (Map.Entry<String, Book> book : myBooks2.entrySet())
      System.out.println(book.getKey() + " - " + book.getValue().getName());

    System.out.println("\n\n");

    System.out.println("--\tOrdem alfabética nomes dos livros\t--");
    Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new ComparatorName());
    myBooks3.addAll(myBooks.entrySet());
    for (Map.Entry<String, Book> book : myBooks3)
      System.out.println(book.getKey() + " - " + book.getValue().getName());

    System.out.println("\n\n");

    // System.out.println("--\tOrdem número de página\t--"); //Pra você
  }
}

class Book {
  private String name;
  private Integer pages;

  public Book(String name, Integer pages) {
    this.name = name;
    this.pages = pages;
  }

  public String getName() {
    return name;
  }

  public Integer getPages() {
    return pages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Book book = (Book) o;
    return name.equals(book.name) && pages.equals(book.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pages);
  }

  @Override
  public String toString() {
    return "Livro{" +
        "nome='" + name + '\'' +
        ", paginas=" + pages +
        '}';
  }
}

class ComparatorName implements Comparator<Map.Entry<String, Book>> {

  @Override
  public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
    return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
  }
}