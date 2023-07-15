package main;

import com.imobiliaria.classes.Aluguel;
import com.imobiliaria.classes.Venda;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Aluguel apto1 = new Aluguel("rua teste", LocalDate.now(), 120.0);
        System.out.println("Endereço: " + apto1.getEndereco());
        System.out.println("Valor aluguel: " + apto1.getValorAluguel());

        Venda apto2 = new Venda("Rua teste, 2", LocalDate.now(), 5000);
        System.out.println("Endereço: " + apto2.getEndereco());
        System.out.println("Valor aluguel: " + apto2.getValorVenda());

        apto1.alugar();

        System.out.println(apto1.isAlugado()); // não efetiva pois não está ativo

        apto1.ativarCadastro();
        apto1.alugar();

        System.out.println(apto1.isAlugado());
    }
}
