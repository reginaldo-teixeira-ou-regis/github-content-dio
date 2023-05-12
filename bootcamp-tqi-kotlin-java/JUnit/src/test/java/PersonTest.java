import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PersonTest {

  @Test
  void mustCalculateAgeCorrectly() {
    Person jessica = new Person("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    Assertions.assertEquals(23, jessica.getAge());
  }

  @Test
  void mustReturnIfHeIsOfLegalAge() {
    Person jessica = new Person("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    Assertions.assertTrue(jessica.isOfLegalAge());

    Person joao = new Person("João", LocalDateTime.now());
    Assertions.assertFalse(joao.isOfLegalAge());
  }

  @Test
  void validatesEquality() {
    Person person = new Person("Pessoa 1", LocalDateTime.now());
    Assertions.assertSame(person, person);
  }
}
