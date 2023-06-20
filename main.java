public static void contarVocalesConsonantes(String s) {
  HashMap<Character, Integer> mapa = new HashMap<>();
  s = s.toLowerCase();
  for (char c : s.toCharArray()) {
    if (Character.isLetter(c)) {

      if (mapa.containsKey(c)) {
        mapa.put(c, mapa.get(c) + 1);
      } else {

        mapa.put(c, 1);
      }
    }
  }
  int vocales = 0;
  int consonantes = 0;
  for (char c : mapa.keySet()) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      vocales += mapa.get(c);
    } else {

      consonantes += mapa.get(c);
    }
  }
  System.out.println("El string tiene " + vocales + " vocales y " + consonantes + " consonantes.");
}
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

