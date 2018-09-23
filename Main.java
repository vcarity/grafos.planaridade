import java.io.*;

public class Main {

  public static void main (String[] args) throws FileNotFoundException {

    System.out.println("[START]");

    Planar planar = new Planar();
    planar.verificarPlanaridade(args[0]);
    
    System.out.println("[END]");

  }

}
