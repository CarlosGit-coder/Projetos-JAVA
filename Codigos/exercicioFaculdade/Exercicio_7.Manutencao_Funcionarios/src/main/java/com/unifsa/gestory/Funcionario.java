package com.unifsa.gestory;

public class Funcionario {
    public String nome;
    private double salario;

    public double addAumento(double valor, Funcionario f) {
        f.salario += valor;
        return f.salario;
    }
    public double ganhoAnual() {
        return this.salario * 13;
    }
    public void exibirDados() {
        System.out.println(this.toString());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome do Funcionário: " + this.nome +
                "Salario: " + this.salario +
                "Ganho anual: " + ganhoAnual();

    }
}
