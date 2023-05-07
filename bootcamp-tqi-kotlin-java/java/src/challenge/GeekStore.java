import java.util.Locale;
import java.util.Scanner;

public class GeekStore {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    double average = 0;
    boolean validEntry = false;

    while (!validEntry) {
      System.out.print("Digite a media de desempenho do funcionario: ");

      if(scanner.hasNextDouble()) { 
        average = scanner.nextDouble();

        if(average < 0 || average > 10) {
          System.out.println("Media invalida. Digite um valor entre 0 e 10.");
        } else {
          validEntry = true;
        }
      } else {
        System.out.println("Valor invalido. Digite um numero com no maximo duas casas decimais.");
        scanner.next();
      }
    }

    System.out.println("Classificação do funcionario: " + getClassificacao(average));

    scanner.close();
  }

  private static String getClassificacao(double average) {
    if(average < 5) {
      return "REP";
    } else if(average < 7) {
      return "MED";
    } else {
      return "APR";
    }
  }
}
