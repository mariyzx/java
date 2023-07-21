package com.controle_frota.core;

import java.util.ArrayList;

public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;
    private String combustivel;
    protected ArrayList<String> abasteccimentos;

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.abasteccimentos = new ArrayList<>();
    }

    public abstract void abastecer(String local, String motorista, double valor);

    public void listaAbastecimentos() {
        System.out.println("*-- Lista de abastecimentos para o veículo:  " + this.placa + " --*");
        for (String abastecimento : this.abasteccimentos) {
            System.out.println("| " + abastecimento + "\t|");
        }
        System.out.println("*------------- FIM -------------");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
