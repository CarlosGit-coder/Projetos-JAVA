package com.unifsa.Supermaket;

public class Supermercado {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.50,10);
        p1.setPreco(10);
        Perecivel leite = new Perecivel("Leite", 5.0, 10, "10/05/2026");
        leite.Vender(2);
    }
}
