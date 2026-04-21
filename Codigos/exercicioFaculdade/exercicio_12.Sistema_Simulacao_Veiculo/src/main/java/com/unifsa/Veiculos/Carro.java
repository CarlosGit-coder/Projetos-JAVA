package com.unifsa.Veiculos;

public class Carro extends Veiculo {

    public Carro(String moodelo, String marca) {
        super(moodelo, marca, 200, 250, "OVW-1512", 0);
    }
    // @Overload
    public Carro(String moodelo, String marca, double velocidadeMax, int qntCavalos, String placa, double velocidadeInicial) {
        super(moodelo, marca, velocidadeMax, qntCavalos, placa, velocidadeInicial);
    }

    public void acelerar() {
        setVelocidadeInicial(getVelocidadeInicial() + 10);
    }
    // @Overload
    public void acelerar(int incremento) {
        setVelocidadeInicial( getVelocidadeInicial() + incremento);
    }

    public void frear() {
        if (getVelocidadeInicial() > 10) {
            setVelocidadeInicial(getVelocidadeInicial() - 10);
        } else {
            setVelocidadeInicial(0);
        }

    }
    // @Overload
    public void frear(int incremento) {
        if (getVelocidadeInicial() > incremento) {
            setVelocidadeInicial(getVelocidadeInicial() - incremento);
        } else {
            setVelocidadeInicial(0);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
