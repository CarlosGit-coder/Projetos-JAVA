
package com.unifsa.logitech;

class Veiculo {
    public String placa;
    public String modelo;
    public double capacidadeCarga;
    public double autonomiaKmPorLitro;
    public boolean emManutencao;
    public Motorista condutor; // Associação com a classe Motorista

    public boolean concluirManutencao(boolean emManutencao) {
        if (emManutencao == true) {
            System.out.println("Manutenção concluida");
            System.out.println("veiculo sainda da manutenção");
            emManutencao = false;

        } else {
            System.out.println("Veiculo precisando de manutenção");
            System.out.println("Manutenção iniciada");
            emManutencao = true;

        } return emManutencao;
    }
}


