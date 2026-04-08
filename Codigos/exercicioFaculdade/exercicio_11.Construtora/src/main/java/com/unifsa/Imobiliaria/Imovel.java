package com.unifsa.Imobiliaria;

public class Imovel {
    protected String endereco;
    protected double valorVenda;

    public Imovel(String endereco, double valorVenda) {
        this.endereco = endereco;
        this.valorVenda = valorVenda;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void imprimeImovel() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor de venda: R$ " + valorVenda);
    }
}
