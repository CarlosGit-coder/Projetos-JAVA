/* Faça um programa que leia uma quantidade de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique
se estes valores foram digitados em ordem crescente e decrescente. A leitura deve ser encerrado ao ser fornecido
valores iguais para X e Y. Para cada caso de teste imprima "Crescente" ou "Decrescente" se os valores forem digitados
em uma dessas duas ordens.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de X : ");

        int valor_x = sc.nextInt();

        System.out.println("Insira o valor de Y : ");

        int valor_y = sc.nextInt();

        while (valor_x != valor_y) {
             if (valor_x < valor_y) {
                System.out.println("Crescente");

             } else
                System.out.println("Decrescente");

            valor_x = sc.nextInt();
            valor_y = sc.nextInt();

        }


        sc.close();

    }
}