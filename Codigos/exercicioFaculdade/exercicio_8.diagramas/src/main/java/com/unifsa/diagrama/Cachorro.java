package com.unifsa.diagrama;

public class Cachorro extends Animal {

    public Cachorro(String n) {
        super(n);
    }

    public String late() {
        return getNome() + " diz: Au au!";
    }
}
