package intermediary.collections.ofPairsMap;

import java.util.*;

// Dada a população estimada de alguns estados do nordeste brasileiro, faça:
//  Estado = PE - população = 9.616.621
//  Estado = AL - população = 3.351.543
//  Estado = CE - população  = 9.187.103
//  Estado = RN - população = 3.534.265

public class EstimatedPopulationNortheastBr {
  public static void main(String[] args) {
    System.out.println(
        "\n\nCrie um dicionário que relacione os estados "
            + "e suas respectivas populações: ");
    Map<String, Integer> populationStatesNE = new HashMap<>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }
    };
    System.out.println(populationStatesNE + "\n\n");

    System.out.println("Substitua a população do estado RN por : 3.534.165");
    populationStatesNE.put("RN", 3534165);
    System.out.println(populationStatesNE + "\n\n");

    System.out.println(
        "Confira se o estado da Paraíba (PB) tucson está no dicionário, "
            + "caso não, adicione "
            + "PB - 4.039.277: ");
    populationStatesNE.put("PB", 4039277);
    System.out.println(populationStatesNE + "\n\n");

    System.out.println("Exiba a população do estado PE: "
        + populationStatesNE.get("PE") + "\n\n");

    System.out.println(
        "Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
    Map<String, Integer> populationStatesNE2 = new LinkedHashMap<>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
      }
    };
    System.out.println(populationStatesNE2 + "\n\n");

    System.out.println(
        "Exiba todos os estados e suas populações na ordem alfabética: ");
    Map<String, Integer> populationStatesNE3 = new TreeMap<>(populationStatesNE);
    System.out.println(populationStatesNE3);

    Collection<Integer> population = populationStatesNE.values();
    String stateMajorPopulation = "";
    String stateMinorPopulation = "";
    for (Map.Entry<String, Integer> entry : populationStatesNE.entrySet()) {
      if (entry.getValue().equals(Collections.max(population)))
        stateMajorPopulation = entry.getKey();
      if (entry.getValue().equals(Collections.min(population)))
        stateMinorPopulation = entry.getKey();
    }

    System.out.println("\n\n");

    System.out.printf(
        "Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
        stateMinorPopulation, Collections.min(population));

    System.out.println("\n\n");

    System.out.printf(
        "Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
        stateMajorPopulation, Collections.max(population));

    System.out.println("\n\n");

    int sum = 0;
    Iterator<Integer> iterator = populationStatesNE.values().iterator();
    while (iterator.hasNext()) {
      sum += iterator.next();
    }
    System.out.println("Exiba a soma da população desses estados: " + sum + "\n\n");

    // int sum2 = 0;
    // for (Map.Entry<String, Integer> entry : populationStatesNE.entrySet()) {
    // sum2 += entry.getValue();
    // }

    System.out.println("Exiba a média da população deste dicionário de estados: "
        + (sum / populationStatesNE.size()) + "\n\n");

    System.out.println("Remova os estados com a população menor que 4.000.000: ");
    Iterator<Integer> iterator1 = populationStatesNE.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next() <= 4000000)
        iterator1.remove();
    }
    System.out.println(populationStatesNE + "\n\n");

    System.out.println(
        "Apague o dicionario de estados com suas respectivas populações estimadas: ");
    populationStatesNE.clear();
    System.out.println(populationStatesNE + "\n\n");

    System.out.println("Confira se a lista está vazia: "
        + populationStatesNE.isEmpty() + "\n\n");

  }
}
