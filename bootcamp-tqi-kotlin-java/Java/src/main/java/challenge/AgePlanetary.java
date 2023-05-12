import java.util.Scanner;

public class AgePlanetary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double ageTerrestrial = 0;
    while (true) {
      System.out.print("Digite a sua idade em anos terrestres: ");
      try {
        ageTerrestrial = Double.parseDouble(scanner.next());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Valor invalido. Por favor, digite novamente.");
      }
    }

    System.out.print("Digite o planeta desejado (Marte, Venus ou Jupiter): ");
    String planet = scanner.next();

    double agePlanet = 0;
    switch (planet) {
      case "Marte":
        agePlanet = ageTerrestrial / 1.88;
        break;
      case "Venus":
        agePlanet = ageTerrestrial / 0.62;
        break;
      case "Jupiter":
        agePlanet = ageTerrestrial / 11.86;
        break;
      default:
        System.out.println("Planeta invalido.");
        System.exit(0);
    }

    System.out.printf("Idade equivalente em %s: %.2f anos", planet, agePlanet);

    scanner.close();
  }
}
