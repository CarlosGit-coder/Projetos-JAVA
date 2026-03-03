package Application;

import util.Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque o valor do riao : ");
        double raio = sc.nextDouble();

        double circun = Calculator.circunferencia(raio);

        double volum = Calculator.volume(raio);

        System.out.printf("Circunferencia : %.2f%n", circun);
        System.out.printf("Volume: %.2f%n", volum);
        System.out.printf("Valor do PI: %.2f%n", Calculator.PI);


        sc.close();

    }
}
