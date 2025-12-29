package Entitis;

public class Retangule {

    public Double alturaRetangulo;
    public Double baseRetangulo;

    public Double areaRetangulo() {
        return alturaRetangulo * baseRetangulo;
    }

    public  Double perimetroRetangulo() {
        return 2 * (alturaRetangulo + baseRetangulo);
    }

    public Double diagonalRetangulo() {
        return Math.sqrt(Math.pow(alturaRetangulo, 2) + Math.pow(baseRetangulo, 2));
    }
}
