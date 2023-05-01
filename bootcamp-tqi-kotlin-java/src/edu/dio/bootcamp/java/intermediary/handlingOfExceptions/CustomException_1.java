package intermediary.handlingOfExceptions;

import javax.swing.*;
import java.io.*;

public class CustomException_1 {
  public static void main(String[] args) {
    String fileName = JOptionPane.showInputDialog(
        "Nome do arquivo a ser exibido: ");

    printFileConsole(fileName);
    System.out.println("\nCom exception ou não, o programa continua...");
  }

  public static void printFileConsole(String fileName) {

    try {
      BufferedReader br = readFile(fileName);
      String line = br.readLine();
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      do {
        bw.write(line);
        bw.newLine();
        line = br.readLine();
      } while (line != null);
      bw.flush();
      br.close();
    } catch (ImpossibleOpenFileException e) {
      JOptionPane.showMessageDialog(null,
          e.getMessage());
      // e.printStackTrace();
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null,
          "Ocorreu um erro não esperado, por favor, fale com o suporte."
              + ex.getMessage());
      ex.printStackTrace();
    }
  }

  public static BufferedReader readFile(
      String fileName) throws ImpossibleOpenFileException {

    File file = new File(fileName);
    try {
      return new BufferedReader(new FileReader(fileName));
    } catch (FileNotFoundException e) {
      throw new ImpossibleOpenFileException(file.getName(), file.getPath());
    }
  }
}

class ImpossibleOpenFileException extends Exception {

  private String fileName;
  private String directory;

  public ImpossibleOpenFileException(String fileName, String directory) {
    super("O arquivo " + fileName + " não foi encontrado no diretório " + directory);
    this.fileName = fileName;
    this.directory = directory;
  }

  // @Override
  // public String toString() {
  // return "ImpossibleOpenFileException{" +
  // "fileName='" + fileName + '\'' +
  // ", directory='" + directory + '\'' +
  // '}';
  // }

  public void printValues() {
    System.out.println("fileName: " + fileName);
    System.out.println("directory: " + directory);
  }
}
