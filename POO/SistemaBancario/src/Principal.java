import com.core.Corrente;
import com.core.Poupanca;

public class Principal {
    public static void main(String[] args) {
        Corrente cc = new Corrente();
        cc.depositar(100);
        System.out.println("O saldo inicial da conta corrente é: " + cc.getSaldo());

        cc.sacar(20);
        System.out.println("O saldo atual da conta corrente é: " + cc.getSaldo());

        Poupanca pp = new Poupanca();
        pp.depositar(100);
        System.out.println("O saldo inicial da conta corrente é: " + pp.getSaldo());

        pp.sacar(20);
        System.out.println("O saldo atual da conta corrente é: " + pp.getSaldo());
    }
}