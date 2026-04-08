package com.unifsa.Supermaket;

public class Produto {
    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(String n, double p, int e) {
        this.nome = n;
        this.preco = p;
        this.estoque = e;
    }

    public void AdicionarEstoque(int qnt) {
        this.estoque += qnt;
    }

    public void Vender(int qnt) {
        if (estoque > qnt) {
            System.out.println("Não foi possivel realizar essa venda \n " +
                    "Quantidade de produtos invalida");
            this.estoque = getEstoque();
        } else {
            System.out.println("Venda realizada com sucesso !!!");
            estoque -= qnt;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
