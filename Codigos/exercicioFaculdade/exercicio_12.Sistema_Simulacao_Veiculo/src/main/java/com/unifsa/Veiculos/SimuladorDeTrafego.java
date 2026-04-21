package com.unifsa.Veiculos;

public class SimuladorDeTrafego {

    public static void main(String[] args) {

        Carro c1 = new Carro("Civic", "Honda");
        Moto m1 = new Moto("CB500", "Honda", 500);
        Caminhão cam = new Caminhão("Volvo", "Volvo");

        c1.acelerar();
        m1.acelerar();

        c1.ligar("Esportivo");
        m1.ligar("Econômico");

        c1.interagir(cam);

        Garagem g = new Garagem();
        g.estacionar(c1);
        g.estacionar(m1);

        g.listar();

        System.out.println(c1);
    }
}