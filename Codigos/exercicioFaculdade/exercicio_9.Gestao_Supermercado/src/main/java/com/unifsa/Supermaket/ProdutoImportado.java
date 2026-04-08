package com.unifsa.Supermaket;

public class ProdutoImportado extends Produto {

    private double taxaImportacao;

    public ProdutoImportado(String n, double p, int e, double taxa) {
        super(n, p, e);
        this.taxaImportacao = taxa;
    }

    @Override
    public void Vender(int qnt) {
        if (getEstoque() < qnt) {
            System.out.println("Não foi possível realizar essa venda\nQuantidade de produtos inválida");
        } else {
            System.out.println("Venda realizada com sucesso!!!");
            estoque =(getEstoque() - qnt);
            double valorFinal = (getPreco() *qnt )+ taxaImportacao;
            System.out.println("Valor do produto com taxa de importação: R$ " + valorFinal);
        }
    }
}
