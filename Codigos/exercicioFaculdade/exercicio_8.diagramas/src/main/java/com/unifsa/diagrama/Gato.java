package com.unifsa.diagrama;

public class Gato extends Animal {

    public Gato() {
        super(nome);
    }

    public Gato(String nome) {
        super(nome);
    }

    public String mia() {
        return getNome() + " diz: Miau!";
    }
}
