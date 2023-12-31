package com.controle_frota.core;

public class Carro extends Veiculo {

    public Carro(String placa, int anoFabricacao) {
        super(placa, anoFabricacao);
        this.setCombustivel("Flex");
    }
    @Override
    public void abastecer(String local, String motorista, double valor) {
        this.abasteccimentos.add(String.format("Local: %s, Motorista: %s, valor: R$ %.2f"
                , local, motorista, valor));
    }
}
