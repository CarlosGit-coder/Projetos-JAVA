package com.unifsa.Cine;

public class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP (double p, double valorAdicional) {
        super(p);
        this.valorAdicional = valorAdicional;
    }
    public void ValorVIP(Ingresso i, double valorAdicional) {
        i.valor += valorAdicional;
        System.out.println("O valor do ingresso é: " + i.valor);
    }

}

