package com.unifsa.gestory;

public class Assistente extends Funcionario{
    private String numeroMatricula;

    private String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibirDados() {
        System.out.println(this);;

    }

    @Override
    public String toString() {
        return "Nome do Functionary: " + this.nome +
                "Salario: " + getSalario() +
                "Número da matricula: " + this.numeroMatricula +
                "Ganho anual: " + ganhoAnual();
    }


}
