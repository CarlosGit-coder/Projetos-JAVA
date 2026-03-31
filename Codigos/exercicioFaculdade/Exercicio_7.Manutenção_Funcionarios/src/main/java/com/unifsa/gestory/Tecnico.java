package com.unifsa.gestory;

public class Tecnico extends Assistente{

    public double bonus;

    @Override
    public double ganhoAnual() {
        double total = super.ganhoAnual();
        total += bonus;

        return total;
    }
}
