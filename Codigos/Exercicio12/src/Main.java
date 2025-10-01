/* Faça um programa que leia um valor inteiro N, e depois N números inteiros. Ao final, mostra a soma dos N números.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número : ");

        int valor_inteiro = sc.nextInt();
        int soma = 0;

        for (int inicio = 0; inicio < valor_inteiro; inicio ++) {

            int numero = sc.nextInt();
            soma += numero;

        }

        System.out.println("A soma dos números é : " + soma);

        sc.close();


    }
}