package intermediary.collections.iterationsOrded.ofPairsMap;

import java.util.*;

// Faça um programa que simule um lançamento de dados. 
// Lance o dado 100 vezes e armazene.
// Depois, mostre quantas vezes cada valor foi conseguido.

public class DiceRoll {
  public static void main(String[] args) {
    int diceRollQuantity = 100;

    List<Integer> values = new ArrayList<>();
    Random diceRollGerador = new Random();
    for (int i = 0; i < diceRollQuantity; i++) {
      int number = diceRollGerador.nextInt(6) + 1;
      values.add(number);
    }

    Map<Integer, Integer> scrolling = new HashMap<>();
    for (Integer result : values) {
      if (scrolling.containsKey(result))
        scrolling.put(result, (scrolling.get(result) + 1));
      else
        scrolling.put(result, 1);
    }

    System.out.print("Jogando");
    // * conteúdo do for + try/cath - totalmente opcional
    for (int i = 0; i < 3; i++) {
      try {
        Thread.sleep(3000);
        System.out.print(".");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("\nValor " + " Quant. de vezes");
    for (Map.Entry<Integer, Integer> entry : scrolling.entrySet()) {
      System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
    }
  }
}
