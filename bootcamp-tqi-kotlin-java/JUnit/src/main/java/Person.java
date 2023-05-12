import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Person {

  private String name;

  private LocalDateTime birth;

  public Person(String name, LocalDateTime birth) {
    this.name = name;
    this.birth = birth;
  }

  public int getAge() {
    return (int) ChronoUnit.YEARS.between(birth, LocalDateTime.now());
  }

  public boolean isOfLegalAge() {
    return getAge() >= 18;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Person person = (Person) o;
    return name.equals(person.name) && Objects.equals(birth, person.birth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, birth);
  }
}
