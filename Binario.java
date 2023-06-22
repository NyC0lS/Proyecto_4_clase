import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binario {

  public static void imprimirBinarios(int n) {

    Queue<String> cola = new LinkedList<>();

    for (int i = 1; i <= n; i++) {

      String binario = Integer.toBinaryString(i);

      cola.add(binario);
    }

    while (!cola.isEmpty()) {

      String binario = cola.remove();

      System.out.println(binario);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    while (!salir) {
      System.out.println("Bienvenido al menú de imprimir binarios.");
      System.out.println("Escribe un número entero positivo para ver los binarios desde 1 hasta ese número o escribe \"salir\" para terminar el programa.");
      String entrada = sc.nextLine();
      if (entrada.equals("salir")) {
        salir = true;
        System.out.println("Gracias por usar el programa. Adiós.");
      } else {
        try {
          int n = Integer.parseInt(entrada);
          if (n > 0) {
            imprimirBinarios(n);
          } else {
            System.out.println("El número debe ser positivo.");
          }
        } catch (NumberFormatException e) {
          System.out.println("La entrada no es un número válido.");
        }
      }
    }
    sc.close();
  }
}
