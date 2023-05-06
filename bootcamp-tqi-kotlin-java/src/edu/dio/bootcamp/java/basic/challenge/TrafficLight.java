package basic.challenge;

import java.util.HashMap;
import java.util.Scanner;

public class TrafficLight {
  public static void main(String[] args) {
    HashMap<Integer, String> messages = new HashMap<Integer, String>();
    messages.put(1, "Pare! O sinal esta vermelho.");
    messages.put(2, "Atencao! O sinal esta amarelo.");
    messages.put(3, "Siga em frente! O sinal esta verde.");

    int color = 0;
    boolean validInput = false;
    Scanner entrada = new Scanner(System.in);
    while (!validInput) {
      System.out.print("Digite um numero correspondente a cor do semaforo \n(1 para vermelho, 2 para amarelo, 3 para verde): ");
      if (entrada.hasNextInt()) {
        color = entrada.nextInt();
        if (color >= 1 && color <= 3) {
          validInput = true;
        } else {
          System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
        }
      } else {
        entrada.next();
        System.out.println("Valor invalido! Digite um numero inteiro.");
      }
    }
    entrada.close();

    System.out.println(messages.get(color));
  }
}
