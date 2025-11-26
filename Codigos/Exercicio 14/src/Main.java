/* Faça um programa que leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois valores inteiros : ");

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int minimo;
        int maximo;
        int soma = 0;

        if (valor1 < valor2 ) {
            minimo = valor1;
            maximo = valor2;

        } else {
            minimo = valor2;
            maximo = valor1;
        }

        for (int inicio = minimo + 1; inicio < maximo; inicio++) {

            if (inicio % 2 != 0) {
                soma += inicio;
            }
        }

        System.out.println("A soma é igual a : " + soma);


    }
}