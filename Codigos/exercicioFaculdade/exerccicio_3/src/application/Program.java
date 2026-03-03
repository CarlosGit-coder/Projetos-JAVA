package application;

import util.Elevator;

public class Program {

    public static void main(String[] args) {

        Elevator elevador = new Elevator(5);

        for (int i = 0; i < 7; i++) {
            elevador.subir();
        }

        for (int i = 0; i < 7; i++) {
            elevador.descer();
        }

        System.out.println("Andar atual: " + elevador.getAndarAtual());
    }
}