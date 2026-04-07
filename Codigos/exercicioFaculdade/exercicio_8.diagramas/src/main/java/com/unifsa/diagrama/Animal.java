package com.unifsa.diagrama;

public class Animal {
    private String nome;
    private String raca;

    public Animal(String nome) {

    }

    public Animal(Animal a) {
        this.nome = a.nome;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public String caminha() {
        return nome + " está caminhando.";
    }
}
