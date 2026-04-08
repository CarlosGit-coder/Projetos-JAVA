package com.unifsa.diagrama;

public class Gato extends Animal {

    public Gato(String n) {
        super(n);
    }

    public String mia() {
        return getNome() + " diz: Miau!";
    }
}
