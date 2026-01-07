package Util;

public class Calculator {

    public static double IOF = 0.06;

    public  static double valor_dolar(double dolar, double qnt_dolar){
        double valorSemImposto = dolar * qnt_dolar;
        double valorComImposto = valorSemImposto * (1 + IOF);
        return valorComImposto;
    }

}
