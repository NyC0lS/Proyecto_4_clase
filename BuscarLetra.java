
import java.util.*;


public class c {

    public static void buscarLetra(String s, char letra) {
        LinkedList<Integer> lista = new LinkedList<>();
        s = s.toLowerCase();
        letra = Character.toLowerCase(letra);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letra) {
            lista.add(i);
            }
        }
        if (lista.isEmpty()) {
            System.out.println("La letra " + letra + " no se encuentra en el string.");
        } else {
            int primera = lista.getFirst();
            int ultima = lista.getLast();
            System.out.println(lista);
            System.out.println("La primera ocurrencia de la letra " + letra + " está en la posición " + primera + ".");
            System.out.println("La última ocurrencia de la letra " + letra + " está en la posición " + ultima + ".");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido al mini menú de buscador de letras.\n ingresa una palabra y luego la letra que quieras buscar");
            System.out.println("Escribe un string para analizar o escribe \"salir\" para terminar el programa.");
            String entrada = sc.nextLine();
            System.out.println("ok ahora la letra");
            String letra = sc.nextLine();
            if (entrada.equals("salir")) {
                salir = true;
                System.out.println("Gracias por usar el programa. Adiós.");
            } else {
                buscarLetra(entrada,letra.charAt(0));
            }
        }
        sc.close();
    }
}
