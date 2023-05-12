import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

// Exemplos de asserções usando a classe
// {@link org.junit.jupiter.api.Assertions}

public class AssertionsTest {

  @Test
  void validateOperationValues() {

    // Validando soma
    int result = 10;
    assertEquals(result, (5 + 5));

    // Validando igualdade de valores
    double value = 5.0;
    double otherValue = 5.0;
    assertEquals(value, otherValue);
  }

  @Test
  void validateIfArraysAreEqual() {

    // Valida se os arrays são iguais, comparando um a um
    int[] firstLaunch = { 10, 20, 30, 40, 50 };
    int[] secondLaunch = { 10, 20, 30, 40, 50 };
    assertArrayEquals(firstLaunch, secondLaunch);

    // Utilizando arrays de diferentes tipos, começando por boolean[]
    boolean[] flags = { true, false, false };
    assertArrayEquals(new boolean[] { true, false, false }, flags);

    // Utilizando arrays de diferentes tipos, começando por double[]
    double[] values = { 5.0, 10.5, 50D, 46d };
    assertArrayEquals(new double[] { 5.0, 10.5, 50D, 46d }, values);
  }

  @Test
  void validateIfObjectIsNullOrNot() {

    Person person = null;
    assertNull(person);

    person = new Person("Luciano", LocalDateTime.now());
    assertNotNull(person);
  }

  @Test
  void validateNumbersOfDifferentTypes() {

    double value = 5.0;
    double otherValue = 5.0;

    assertEquals(value, otherValue);
  }

  @Test
  void validateThatValuesAreDifferent() {

    int x = 5;
    int y = 6;

    assertNotEquals(x, y);
  }

  @Test
  void validateThatSomeConditionIsFalse() {

    boolean condition = 5 + 6 == 12;

    assertFalse(condition);
  }

  @Test
  void validateThatSomeConditionIsTrue() {
    int x = 6;
    int y = 6;

    var condition = x + y == 12;

    assertTrue(condition);
  }
}
