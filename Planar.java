import java.io.*;

public class Planar {

  public void verificarPlanaridade(String arg) throws FileNotFoundException {

      Grafo grafo = new Grafo(arg);

      if (grafo.numeroDeArestas <= ((3 * grafo.numeroDeVertices) - 6)) {

        System.out.println("É planar");

      } else {

        System.out.println("Não é planar");

      }

  }

}
