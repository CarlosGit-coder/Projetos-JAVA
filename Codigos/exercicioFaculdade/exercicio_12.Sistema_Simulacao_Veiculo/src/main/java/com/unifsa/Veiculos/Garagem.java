package com.unifsa.Veiculos;

public class Garagem {

    private Veiculo[] vagas = new Veiculo[5];

    public void estacionar(Carro c) {
        adicionar(c);
    }

    public void estacionar(Moto m) {
        adicionar(m);
    }

    private void adicionar(Veiculo v) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] == null) {
                vagas[i] = v;
                System.out.println("Veículo estacionado!");
                return;
            }
        }
        System.out.println("Garagem cheia!");
    }

    public void listar() {
        for (Veiculo v : vagas) {
            if (v != null) {
                v.exibirStatus();
            }
        }
    }
}