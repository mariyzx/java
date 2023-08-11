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
  }
}