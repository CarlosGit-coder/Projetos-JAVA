package com.unifsa.gestory;

public class Assistente extends Funcionario{
    private String numeroMatricula;

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Nome do Functionary: " + this.nome +
                "Salario: " + this.salario +
                "Número da matricula: " + this.numeroMatricula +
                "Ganho anual: " + ganhoAnual();
    }
}
