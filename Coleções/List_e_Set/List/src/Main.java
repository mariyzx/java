import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> notas = Arrays.asList(1, 2, 3, 4, 5); // cria uma lista de inteiros cujos valores são mutáveis,
    // porém, não podemos adicionar ou remover elementos dela

    // var notas2 = List.of(1, 2, 3, 4, 5); cria uma lista IMUTÁVEL
    // System.out.println(notas.get(2));  recupera o elemento de índice 2

    notas.set(0, 7); // altera o valor de uma posição da lista MUTÁVEL

    var notas2 = new ArrayList<>(notas); // agora é possível adicionar ou remover elementos da lista
    notas2.add(76);
    System.out.println(notas2);
  }
}