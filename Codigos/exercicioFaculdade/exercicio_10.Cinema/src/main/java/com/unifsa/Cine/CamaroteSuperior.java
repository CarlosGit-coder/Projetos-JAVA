package com.unifsa.Cine;

public class CamaroteSuperior extends  VIP {
    private double valorAdicionalS;

    public double getValorAdicionalS() {
        return valorAdicionalS;
    }

    public CamaroteSuperior(double v, double vAdicional, double valorAdicionalS) {
        super(v,vAdicional);
        this.valorAdicionalS = valorAdicionalS;

    }

    public double valorIngressoS(double valor, double valorAdicionalS) {
        return valor + valorAdicional + valorAdicionalS;
    }

}
