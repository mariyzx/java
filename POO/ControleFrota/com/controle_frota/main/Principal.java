package com.controle_frota.main;

import com.controle_frota.core.*;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro("RTF 1234", 2019);
        Caminhao c2 = new Caminhao("TRR 1234", 2015);

        c1.abastecer("Posto 1", "Atanes", 180);
        c1.abastecer("Posto 1", "Mariana", 230);
        c1.abastecer("Posto 1", "Marcelo", 100);

        c2.abastecer(null, "Atanes", 210);
        c2.abastecer(null, "Mariana", 330);
        c2.abastecer(null, "Marcelo", 150);

        c1.listaAbastecimentos();
        c2.listaAbastecimentos();
    }
}
