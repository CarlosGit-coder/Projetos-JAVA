package com.unifsa.Veiculos;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String modelo, String marca, int cilindradas) {
        super(modelo, marca, 180, 100, "YYY-0000", 0);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando mais rápido!");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() +
                " | Cilindradas: " + cilindradas);
    }

    public void ligar(String modo) {
        System.out.println("Moto ligada no modo " + modo);
    }
}