import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
  public static Collection<Estudante> obterEntrada() {
    return Set.of(
            new Estudante("2001", "Maria", "Computação"),
            new Estudante("2002", "João", "Computação")
    );
  }

  public static void main(String[] args) {
    Collection<Estudante> entrada = obterEntrada();
    List<String> matriculas = entrada.stream().filter(e -> "Computação".equals(e.getCurso()))
            .sorted(Comparator.comparing(Estudante::getNome))
            .map(Estudante::getMatricula)
            .collect(Collectors.toList());
    System.out.println(matriculas);
  }
}