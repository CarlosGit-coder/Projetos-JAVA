package com.unifsa.Imobiliaria;

public class ImovelAntigo extends  Imovel {
    private double desconto;

    public ImovelAntigo(String endereco, double valorVenda, double desconto) {
        super(endereco, valorVenda);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorFinal() {
        return valorVenda - desconto;
    }

    public void imprimeImovelAntigo() {
        System.out.println("Imóvel Antigo");
        System.out.println("Endereço: " + endereco);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + getValorFinal());
    }
}
