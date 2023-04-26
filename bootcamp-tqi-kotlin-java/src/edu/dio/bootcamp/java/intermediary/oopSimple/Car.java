package intermediary.oopSimple;

public class Car {
  String color;
  String model;
  int capacityTank;

  Car() {

  }

  Car(String color, String model, int capacityTank) {
    this.color = color;
    this.model = model;
    this.capacityTank = capacityTank;
  }

  void setColor(String color) {
    this.color = color;
  }

  String getColor() {
    return color;
  }

  void setModel(String model) {
    this.model = model;
  }

  String getModel() {
    return model;
  }

  void setCapacityTank(int capacityTank) {
    this.capacityTank = capacityTank;
  }

  int getCapacityTank() {
    return capacityTank;
  }

  double totalTankValue(double fuelValue) {
    return capacityTank * fuelValue;
  }
}
