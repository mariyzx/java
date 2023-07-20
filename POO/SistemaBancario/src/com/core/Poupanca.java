package com.core;

public class Poupanca extends Conta {
    // o método sacar da poupança desconta 2 reais
    @Override
    public void sacar(double valor) {
        this.saldo -= valor + 2;
    }

    public void simularRendimento() {
        saldo += 0.05;
    }

    public void simularRendimento(double taxa) {
        saldo += taxa;
    }
}
