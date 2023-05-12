import java.util.logging.Logger;

// "Hipotético" exemplo de uma classe que conecta com banco de dados.
// <b>DISCLAIMER</b>: <i>Não é um exemplo real/atual desse cenário, 
// serve apenas como exemplo para os testes com JUnit</i>

public class DatabaseConnectionManager {

  private static final Logger LOGGER = Logger.getLogger(
      DatabaseConnectionManager.class.getName());

  public static void startConnection() {
    // fez algo
    LOGGER.info("Iniciou conexao");
  }

  public static void endConnection() {
    // fez algo
    LOGGER.info("finalizou conexao");
  }

  public static void insertData(Person person) {
    // insere pessoa no DB
    LOGGER.info("inseriu dados");
  }

  public static void removeData(Person person) {
    // remove pessoa no DB
    LOGGER.info("removeu dados");
  }
}