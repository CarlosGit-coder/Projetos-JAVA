package com.unifsa.Veiculos;

public class Carro extends Veiculo {

    private int portas;

    public Carro(String modelo, String marca) {
        super(modelo, marca, 200, 150, "XXX-0000", 0);
        this.portas = 4;
    }

    public Carro(String modelo, String marca, double velocidadeInicial) {
        super(modelo, marca, 200, 150, "XXX-0000", velocidadeInicial);
        this.portas = 4;
    }

    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("Carro acelerando...");
    }

    public void acelerar(int incremento) {
        for (int i = 0; i < incremento; i++) {
            super.acelerar();
        }
    }

    @Override
    public void exibirStatus() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() +
                " | Velocidade: " + getVelocidadeAtual() +
                " | Portas: " + portas);
    }

    public void ligar(String modo) {
        System.out.println("Carro ligado no modo " + modo);
    }

    @Override
    public String toString() {
        return "Carro: " + getMarca() + " " + getModelo() +
                " - Velocidade: " + getVelocidadeAtual() + " km/h";
    }
}