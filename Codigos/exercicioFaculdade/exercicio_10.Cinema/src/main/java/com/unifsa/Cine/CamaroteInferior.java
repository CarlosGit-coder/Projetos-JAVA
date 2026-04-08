package com.unifsa.Cine;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public CamaroteInferior(double v, double vAdicional, String localizacao) {
        super(v, vAdicional);
        this.localizacao = localizacao;

    }

    public void imprimeLocalizacap() {
        System.out.println("Localização do camarote: " + localizacao);
    }
}
