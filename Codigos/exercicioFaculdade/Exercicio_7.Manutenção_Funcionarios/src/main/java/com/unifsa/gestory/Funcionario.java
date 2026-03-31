package com.unifsa.gestory;

public class Funcionario {
    public String nome;
    public double salario;

    public double addAumento(Funcionario f) {
        f.salario +=  (f.salario * 20) / 100;
        return f.salario;
    }
    public double ganhoAnual() {
        return this.salario * 13;
    }
    public void exibirDados() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Nome do Funcionário: " + this.nome +
                "Salario: " + this.salario +
                "Ganho anual: " + ganhoAnual();
    }
}
