package intermediary.collections.iterationsOrded.ofPairsMap;

import java.util.*;

public class ExemploMap {
  public static void main(String[] args) {

    // Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
    // modelo = gol - consumo = 14,4km/l
    // modelo = uno - consumo = 15,6 km/l
    // modelo = mobi - consumo = 16,1 km/l
    // modelo = hb20 - consumo = 14,5 km/l
    // modelo = kwid - consumo = 15,6 km/l

    // * antes do java 5
    // Map popularCars2020 = new HashMap();
    // * Generics(jdk 5) - Diamont Operator(jdk 7)
    // Map<String, Double> popularCars = new HashMap<>();
    // HashMap<String, Double> popularCars = new HashMap<>();
    // Map<String, Double> popularCars2020 = Map
    // .of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

    System.out.println(
        "\n\nCrie um dicionário que relacione os modelos e seus respectivos consumos: ");
    Map<String, Double> popularCars = new HashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
      }
    };
    System.out.println(popularCars.toString() + "\n\n");

    System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
    popularCars.put("gol", 15.2);
    System.out.println(popularCars + "\n\n");

    System.out.println(
        "Confira se o modelo tucson está no dicionário: " + popularCars
            .containsKey("tucson"));

    System.out.println("\n\n");

    System.out.println("Exiba o consumo do uno: " + popularCars.get("uno") + "\n\n");

    // System.out.println("Exiba o terceiro modelo adicionado: ");

    System.out.println("Exiba os modelos: ");
    Set<String> models = popularCars.keySet();
    System.out.println(models + "\n\n");

    System.out.println("Exiba os consumos dos carros: ");
    Collection<Double> consumptions = popularCars.values();
    System.out.println(consumptions + "\n\n");

    System.out.println("Exiba o modelo mais econômico e seu consumo: ");
    Double moreEfficientConsumption = Collections.max(popularCars.values());
    Set<Map.Entry<String, Double>> entries = popularCars.entrySet();
    String moreEfficientModel = "";
    for (Map.Entry<String, Double> entry : entries) {
      if (entry.getValue().equals(moreEfficientConsumption)) {
        moreEfficientModel = entry.getKey();
        System.out.println(
            "Modelo mais eficiente: "
                + moreEfficientModel
                + " - " + moreEfficientConsumption);
      }
    }
    System.out.println("\n\n");

    System.out.println("Exiba o modelo menos econômico e seu consumo: ");
    Double lessEfficientConsumption = Collections.min(popularCars.values());
    String leastEfficientModel = "";
    for (Map.Entry<String, Double> entry : popularCars.entrySet()) {
      if (entry.getValue().equals(lessEfficientConsumption)) {
        leastEfficientModel = entry.getKey();
        System.out.println(
            "Modelo menos eficiente: "
                + leastEfficientModel
                + " - " + lessEfficientConsumption);
      }
    }
    System.out.println("\n\n");

    Iterator<Double> iterator = popularCars.values().iterator();
    Double sum = 0d;
    while (iterator.hasNext()) {
      sum += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + sum + "\n\n");

    System.out.println(
        "Exiba a média dos consumos deste dicionário de carros: "
            + (sum / popularCars
                .size()));
    System.out.println("\n\n");

    System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
    Iterator<Double> iterator1 = popularCars.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next().equals(15.6))
        iterator1.remove();
    }
    System.out.println(popularCars + "\n\n");

    System.out.println("Exiba todos os carros na ordem em que foram informados: ");
    Map<String, Double> popularCars1 = new LinkedHashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
      }
    };
    System.out.println(popularCars1.toString() + "\n\n");

    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> popularCars2 = new TreeMap<>(popularCars1);
    System.out.println(popularCars2.toString() + "\n\n");

    System.out.println("Apague o dicionario de carros: ");
    popularCars.clear();

    System.out.println(
        "Confira se o dicionário está vazio: " + popularCars.isEmpty() + "\n\n");
  }
}
