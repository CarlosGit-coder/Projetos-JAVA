package com.unifsa.Imobiliaria;

public class ImovelNovo extends  Imovel {
    private double valorAdicional;

    public ImovelNovo(String endereco, double valorVenda, double valorAdicional) {
        super(endereco, valorVenda);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double getValorFinal() {
        return valorVenda + valorAdicional;
    }

    public void imprimeImovelNovo() {
        System.out.println("Imóvel Novo");
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor adicional: R$ " + valorAdicional);
        System.out.println("Valor final: R$ " + getValorFinal());
    }
}
