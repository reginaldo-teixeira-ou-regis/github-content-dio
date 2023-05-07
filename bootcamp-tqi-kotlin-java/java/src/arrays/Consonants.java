import java.util.Scanner;

// Faça um Programa que leia um vetor de 6 caracteres,
// e diga quantas consoantes foram lidas. Imprima as consoantes.

public class Consonants {
  public static void main(String[] args) {
    Scanner scan = null;
    try {
      scan = new Scanner(System.in);

      String[] consonants = new String[6];
      int quantityConsonants = 0;

      int count = 0;
      do {
        System.out.println("Letra: ");
        String letter = scan.next();
        if (!(letter.equalsIgnoreCase("a") |
            letter.equalsIgnoreCase("e") |
            letter.equalsIgnoreCase("i") |
            letter.equalsIgnoreCase("o") |
            letter.equalsIgnoreCase("u"))) {
          consonants[count] = letter;
          quantityConsonants++;
        }

        count++;

      } while (count < consonants.length);

      System.out.print("\nConsoantes: ");
      for (String consonant : consonants) {
        if (consonant != null)
          System.out.print(consonant + " ");
      }
      
      System.out.println("\nQuantidade de consoantes: " + quantityConsonants);

    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
