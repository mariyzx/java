import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    var num = Set.of(1, 3, 2); // cria um set IMUTÁVEL
    var num2 = new HashSet<>(); // cria um set MUTÁVEL
    num2.add(1);
    num2.add(3);
    num2.add(2);
    System.out.println(num);
    System.out.println(num2);
  }
}