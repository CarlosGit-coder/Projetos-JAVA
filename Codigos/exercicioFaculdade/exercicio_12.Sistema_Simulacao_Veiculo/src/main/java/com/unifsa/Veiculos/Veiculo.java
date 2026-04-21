package com.unifsa.Veiculos;

public class Veiculo {

    private String modelo;
    private String marca;
    private double velocidadeMax;
    private int qntCavalos;
    private String placa;
    private double velocidadeAtual;

    public Veiculo(String modelo, String marca, double velocidadeMax, int qntCavalos, String placa, double velocidadeAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
        this.qntCavalos = qntCavalos;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 5;
    }

    public void frear() {
        if (velocidadeAtual > 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public void exibirStatus() {
        System.out.println("Veículo: " + marca + " " + modelo);
    }

    public void ligar() {
        System.out.println("Veículo ligado!");
    }

    public void interagir(Veiculo outro) {
        System.out.println("Interagindo com outro veículo...");
    }

    public void abastecer(double litros) {
        System.out.println("Abastecendo " + litros + " litros");
    }

    public void abastecer(double litros, String tipo) {
        System.out.println("Abastecendo " + litros + "L de " + tipo);
    }

    public double calcularConsumo() {
        return 10;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Veiculo)) return false;

        Veiculo v = (Veiculo) obj;
        return placa.equals(v.placa);
    }

    @Override
    public int hashCode() {
        return placa.hashCode();
    }
}