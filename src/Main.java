/* Faça um programa que leia um número inteiro positivo N, depois leia N números quaisquer e armazene-os em um vetor.
Em seguida mostre na tela todos os elementos do vetor
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números a serem armazenados : ");

        int numero = sc.nextInt();
        double[] vetor_A = new double[numero];

        System.out.println("Insira os números a serem armazenados : ");

        for (int inicio = 0; inicio < numero; inicio++) {

            vetor_A[inicio] = sc.nextDouble();

        }

        for (int inicio = 0; inicio < numero; inicio++) {

            System.out.printf("%.2f%n" , vetor_A[inicio]);

        }

        sc.close();

    }
}