package intermediary.oopSimple;

public class RunApplication {
  public static void main(String[] args) {
    Car car1 = new Car();

    car1.setColor("Azul");
    car1.setModel("BMW Série 3");
    car1.setCapacityTank(59);

    System.out.println(car1.getModel());
    System.out.println(car1.getColor());
    System.out.println(car1.getCapacityTank());
    System.out.println(car1.totalTankValue(6.39));

    Car car2 = new Car("Cinza", "Mercedes-Benz Classe C ", 66);

    System.out.println(car2.getModel());
    System.out.println(car2.getColor());
    System.out.println(car2.getCapacityTank());
    System.out.println(car2.totalTankValue(6.46));
  }
}
