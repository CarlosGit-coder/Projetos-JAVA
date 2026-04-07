package com.unifsa.diagrama;

public class Cachorro extends Animal {

    public Cachorro() {}

    public Cachorro(String nome) {
        super(nome);
    }

    public String late() {
        return getNome() + " diz: Au au!";
    }
}
