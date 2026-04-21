package com.unifsa.Veiculos;

public class Veiculo {

    private String modelo;
    private String marca;
    private double velocidadeMax;
    private int qntCavalos;
    private String placa;
    private double velocidadeInicial;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        if (velocidadeMax < 1) {
            System.out.println("Quantidade inserida invalida!!! ");
            System.out.println("Insira outra velocidade por favor ");
        } else {
            this.velocidadeMax = velocidadeMax;
        }

    }

    public double getVelocidadeInicial() {
        return velocidadeInicial;
    }

    public void setVelocidadeInicial(double velocidadeInicial) {
        if (velocidadeInicial < 0 ) {
            System.out.println();
        }
        this.velocidadeInicial = velocidadeInicial;
    }

    public int getQntCavalos() {
        return qntCavalos;
    }

    public void setQntCavalos(int qntCavalos) {
        if (qntCavalos < 1) {
            System.out.println("Quantidade inserida invalida!!!");
            System.out.println("Insira outra velocidade ");
        } else {
            this.qntCavalos = qntCavalos;
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(String modelo, String marca, double velocidadeMax, int qntCavalos, String placa, double velocidadeInicial) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
        this.qntCavalos = qntCavalos;
        this.placa = placa;
        this.velocidadeInicial = velocidadeInicial;
    }
}

