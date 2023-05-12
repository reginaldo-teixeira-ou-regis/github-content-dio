import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionalTest {

  @Test
  @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
  void validateSomethingOnlyInTheUserReginaldoTeixeira() {
    Assertions.assertEquals(10, 5 + 5);
  }
}
