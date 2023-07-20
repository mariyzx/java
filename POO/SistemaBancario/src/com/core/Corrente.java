package com.core;

public class Corrente extends Conta {
    // taxa de 5% no saque;
    @Override
    public void sacar(double valor) {
        this.saldo -= valor + (valor * 0.05);
    }
}
