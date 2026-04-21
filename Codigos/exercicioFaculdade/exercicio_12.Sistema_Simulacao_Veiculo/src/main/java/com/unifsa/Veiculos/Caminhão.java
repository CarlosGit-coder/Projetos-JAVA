package com.unifsa.Veiculos;

public class Caminhão extends Veiculo {

    public Caminhão(String modelo, String marca) {
        super(modelo, marca, 120, 400, "ZZZ-0000", 0);
    }

    @Override
    public double calcularConsumo() {
        return 3;
    }

    public void interagir(Caminhão c) {
        System.out.println("Interação entre caminhões!");
    }
}