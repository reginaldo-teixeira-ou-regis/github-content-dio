import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ChoosingTestOrder {

  @DisplayName("Teste que valida se o usuário foi criado")
  @Test
  void validateFlowA() {
    Assertions.assertTrue(true);
  }

  @DisplayName("B")
  @Test
  void validateFlowB() {
    Assertions.assertTrue(true);
  }

  @DisplayName("C")
  @Test
  void validateFlowC() {
    Assertions.assertTrue(true);
  }

  @DisplayName("D")
  @Test
  void validateFlowD() {
    Assertions.assertTrue(true);
  }
}