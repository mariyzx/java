package com.imobiliaria.classes;

import java.time.LocalDate;

public class Aluguel extends Imovel {

    private double valorAluguel;
    private boolean alugado;
    public Aluguel(String endereco, LocalDate dataCadastro) {
        super(endereco, dataCadastro);
        this.alugado = false;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void alugar() {
        this.alugado = true;
    }
}
