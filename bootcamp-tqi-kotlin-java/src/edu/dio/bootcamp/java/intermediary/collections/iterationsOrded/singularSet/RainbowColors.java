package intermediary.collections.iterationsOrded.singularSet;

import java.util.*;

// Crie uma conjunto contendo as cores do arco-íris e:
// a) Exiba todas as cores o arco-íris uma abaixo da outra;
// b) A quantidade de cores que o arco-íris tem;
// c) Exiba as cores em ordem alfabética;
// d) Exiba as cores na ordem inversa da que foi informada;
// e) Exiba todas as cores que começam com a letra ”v”;
// f) Remova todas as cores que não começam com a letra “v”;
// g) Limpe o conjunto;
// h) Confira se o conjunto está vazio;

public class RainbowColors {
  public static void main(String[] args) {
    System.out.println("\n\nCrie uma conjunto contendo as cores do arco-íris: ");
    Set<String> colorsRainbow = new HashSet<>();
    colorsRainbow.add("violeta");
    colorsRainbow.add("anil");
    colorsRainbow.add("azul");
    colorsRainbow.add("verde");
    colorsRainbow.add("amarelo");
    colorsRainbow.add("laranja");
    colorsRainbow.add("vermelho");
    System.out.println(colorsRainbow + "\n\n");

    System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
    for (String color : colorsRainbow) {
      System.out.println(color);
    }
    
    System.out.println("\n\n");

    System.out.println(
      "A quantidade de cores que o arco-íris tem: " + colorsRainbow.size() + "\n\n");

    System.out.println("Exiba as cores em ordem alfabética: ");
    Set<String> colorsRainbow2 = new TreeSet<>(colorsRainbow);
    System.out.println(colorsRainbow2 + "\n\n");

    System.out.println("Exiba as cores na ordem inversa da que foi informada ");
    Set<String> colorsRainbow3 = new LinkedHashSet<>(Arrays.asList(
      "violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
    System.out.println(colorsRainbow3 + "\n\n");

    List<String> colorsRainbowList = new ArrayList<>(colorsRainbow3);
    Collections.reverse(colorsRainbowList);
    System.out.println(colorsRainbowList + "\n\n");

    System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
    for (String color : colorsRainbow) {
      if (color.startsWith("v"))
        System.out.println(color);
    }

    System.out.println("\n\n");

    System.out.println("Remova todas as cores que não começam com a letra “v”: ");
    Iterator<String> iterator2 = colorsRainbow.iterator();
    while (iterator2.hasNext()) {
      if (!iterator2.next().startsWith("v"))
        iterator2.remove();
    }
    System.out.println(colorsRainbow + "\n\n");

    System.out.println("Limpe o conjunto: ");
    colorsRainbow.clear();

    System.out.println(
      "Confira se o conjunto está vazio: " + colorsRainbow.isEmpty() + "\n\n");
  }
}
