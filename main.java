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
