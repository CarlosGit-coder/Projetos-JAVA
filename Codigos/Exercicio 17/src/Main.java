/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostar na tela todos os números
negativos lidos
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números a serem lidos : ");

        int numero = sc.nextInt();
        int[] vetor = new int[10];

        System.out.println("Insira os números a serem armazenados : ");

        for (int inicio = 0; inicio < numero; inicio++) {

            vetor[inicio] = sc.nextInt();

        }

        System.out.println("Os valores armazenados foram : ");

        for (int inicio = 0; inicio < numero; inicio++) {


            if (vetor[inicio] < 0) {

                System.out.println(vetor[inicio]);

            } else {

            }

        }

        sc.close();

    }
}