import Pessoa.Pessoa;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    try {
      //Integer resultado = 2 / 0;
      Integer resultado = 2 / 2;
      System.out.println("Deu certo?");
      System.out.println(resultado);
    } catch (ArithmeticException e) {
      System.out.println("Não é possível dividir por 0");
    }

    Pessoa pessoa = new Pessoa("Mari");
    Optional<Pessoa> optional = Optional.ofNullable(pessoa); // Verifica se de fato existe algo dentro de pessoa
    if (optional.isPresent()) {
      System.out.println("Pessoa existe");
    } else {
      System.out.println("Pessoa não existe");
    }
  }
}
