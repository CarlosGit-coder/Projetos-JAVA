package com.unifsa.gestory;

public class Administrativo extends Assistente{

    public boolean turno;
    public double adicionalNoturno;

    @Override
    public double ganhoAnual() {
        double total = super.ganhoAnual();

        if (turno) {
            total += adicionalNoturno;
        }
        return total;
    }
}
