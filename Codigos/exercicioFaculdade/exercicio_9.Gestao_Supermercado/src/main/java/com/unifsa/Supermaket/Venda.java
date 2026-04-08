package com.unifsa.Supermaket;

public class Venda {

    public void processarItem(Produto p, int qnt) {
        double valorTotal = qnt * p.preco;
        System.out.println("O valor total deu: R$ " + valorTotal);
    }
}
