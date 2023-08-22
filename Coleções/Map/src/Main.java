import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    // Map é a interface Java que define objetos que contêm mapeamentos estilo chave/valor.
    var estudantes = new HashMap<String, String>();
    estudantes.put("ABC", "João");
    estudantes.put("DEF", "Maria");
    System.out.println(estudantes);
  }
}