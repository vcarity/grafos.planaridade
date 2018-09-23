import java.io.*;
import java.util.*;

public class Grafo {

  public int numeroDeVertices = 0;
  public int numeroDeArestas = 0;

  public Grafo(String arg) throws FileNotFoundException {

    lerEntrada(arg);

  }

  public void lerEntrada(String arg) throws FileNotFoundException {

    File entrada = new File(arg);

    Scanner scanner = new Scanner(entrada);
    String linha = scanner.nextLine();
    String[] coluna = linha.split(" ");
    this.numeroDeVertices = coluna.length;

    scanner = new Scanner(entrada);
    while(scanner.hasNextLine()) {

      linha = scanner.nextLine();
      coluna = linha.split(" ");

      for (int j = 0; j < coluna.length; j++) {

        if(Integer.parseInt(coluna[j]) != 0) {

          this.numeroDeArestas += 1;

        }

      }

    }

  }

}
