package util;

public class Elevator {

    private int andarAtual;
    private int totalAndares;

    public Elevator(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Limite superior atingido.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Limite inferior atingido.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }
}
