import java.io.*;

public class Planar {

  public void verificarPlanaridade(String arg) throws FileNotFoundException {

      Grafo grafo = new Grafo(arg);
      int aresta = 0;

      for (int i = 0; i < grafo.numeroDeArestas; i++) {

        aresta += 1;

      }

      if (aresta > (3 * grafo.numeroDeVertices)) {

        System.out.println("Não é planar");

      } else {

        System.out.println("É planar");

      }

  }

}
