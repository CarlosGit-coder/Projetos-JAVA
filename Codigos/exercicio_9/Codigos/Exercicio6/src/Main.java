/* Leia três valores de ponto flutuante A,B e C e calcule as raizes dessa eguação do segundo grau, casp não exista a
posibilidade de calcular as raizes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o
resultado das raizes com 5 dígitos após o ponto, com uma mensagem correspondente conforme "R1 =" e "R2 = ". */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Insira os valores de A, B e C : ");

        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double valor3 = sc.nextDouble();
        double delta = Math.pow(valor2, 2) - (4 * valor1 * valor3);

        if (delta < 0.0 || valor1 == 0) {
            System.out.print("Impossivel calcular");

        } else {
            double R1 = (-valor2 + Math.sqrt(delta)) / (2 * valor1);
            double R2 = (-valor2 - Math.sqrt(delta)) / (2 * valor1);
            System.out.println("O delta é = " + delta);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);


        }

        sc.close();

    }
}