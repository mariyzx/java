package com.controle_frota.core;

public class Caminhao extends Veiculo{
    public Caminhao(String placa, int anoFabricacao) {
        super(placa, anoFabricacao);
        this.setCombustivel("Diesel");
    }

    @Override
    public void abastecer(String local, String motorista, double valor) {
        this.abasteccimentos.add(String.format("Local: base, Motorista: %s, valor: R$ %.2f"
                , motorista, valor));
    }
}
