import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTest {

  @BeforeAll
  static void configConnection() {
    DatabaseConnectionManager.startConnection();
  }

  @BeforeEach
  void insertDataForTest() {
    DatabaseConnectionManager.insertData(new Person(
        "João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
  }

  @AfterEach
  void removeDadaDoForTest() {
    DatabaseConnectionManager.removeData(new Person(
        "João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
  }

  @Test
  void validateReturnData1() {
    Assertions.assertTrue(true);
  }

  @Test
  void validateReturnData2() {
    Assertions.assertNull(null);
  }

  @AfterAll
  static void finallyConnection() {
    DatabaseConnectionManager.endConnection();
  }
}
