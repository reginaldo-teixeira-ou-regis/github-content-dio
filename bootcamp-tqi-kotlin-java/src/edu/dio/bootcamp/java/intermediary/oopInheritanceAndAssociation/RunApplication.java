package intermediary.oopInheritanceAndAssociation;

public class RunApplication {
  public static void main(String[] args) {
    Boss[] classes = new Boss[] { new Employee1(), new Employee2(), new Boss() };

    for (Boss classe : classes) {
      classe.method1();
    }

    System.out.println("");

    for (Boss classe : classes) {
      classe.method2();
    }

    System.out.println("");

    Employee2 Employee2 = new Employee2();
    Employee2.method2();
  }
}
