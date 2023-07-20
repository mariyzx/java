package com.veiculos.classes;

public class Carro extends Veiculo {
    public void acelerar() {
        System.out.println("Método acelerar da classe Carro");
    }

    public void mostrar() {
        super.abastecer();
        this.acelerar();
    }
}
