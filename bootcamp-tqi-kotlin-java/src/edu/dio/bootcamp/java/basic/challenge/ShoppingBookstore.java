package basic.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingBookstore {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Book> books = new ArrayList<>();

    for (int i = 1; i <= 2; i++) {
      System.out.println("Informe os dados do livro " + i + ":");
      System.out.print("Nome: ");
      String name = scanner.nextLine();

      double price = 0.0;
      boolean validPrice = false;
      do {
        System.out.print("Preço: ");
        String inputPrice = scanner.nextLine();
        if (inputPrice.matches("\\d+(\\.\\d{2})?")) {
          price = Double.parseDouble(inputPrice);
          validPrice = true;
        } else {
          System.out.println(
              "O preço deve ser um número com até duas casas decimais. Exemplo: 50,00");
        }
      } while (!validPrice);

      int quantity = 0;
      boolean validQuantity = false;
      do {
        System.out.print("Quantidade: ");
        String inputQuantity = scanner.nextLine();
        if (inputQuantity.matches("\\d+")) {
          quantity = Integer.parseInt(inputQuantity);
          validQuantity = true;
        } else {
          System.out.println("A quantidade deve ser um número inteiro. Exemplo: 3");
        }
      } while (!validQuantity);

      books.add(new Book(name, price, quantity));
    }

    double valueTotal = 0.0;
    int numBooks = 0;
    for (Book book : books) {
      valueTotal += book.getPrice() * book.getQuantity();
      numBooks += book.getQuantity();
    }

    System.out.printf("Valor total da compra: R$ %.2f\n", valueTotal);
    System.out.println("Número de livros comprados: " + numBooks);
    System.out.println("Obrigado por comprar na nossa livraria!");

    scanner.close();
  }

  static class Book {
    private String name;
    private double price;
    private int quantity;

    Book(String name, double price, int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
    }

    public String getName() {
      return name;
    }

    public double getPrice() {
      return price;
    }

    public int getQuantity() {
      return quantity;
    }
  }
}
