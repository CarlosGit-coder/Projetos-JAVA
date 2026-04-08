package com.unifsa.Supermaket;

public class Perecivel extends Produto {
    private String dataValidade;

    public Perecivel(String n, double p, int e, String data) {
        super(n, p, e);
        this.dataValidade = data;
    }
    @Override
    public void Vender(int qnt) {
        System.out.println("Verificando validade... \n" +
                "Validade verficada !!!\n" +
                "Produto disponivel para vender");
        if (estoque < qnt) {
            System.out.println("Não foi possivel realizar essa venda \n " +
                    "Quantidade de produtos invalida");
            this.estoque = getEstoque();
        } else {
            System.out.println("Venda realizada com sucesso !!!");
            estoque -= qnt;
        }
    }

    public String getDataValidade() {
        return dataValidade;
    }
}

