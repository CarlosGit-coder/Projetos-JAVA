/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida imprima todos os elementos do vetor
e mostre na tela a soma e a média dos elementos do vetor
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números a serem armazenados : ");

        int numero = sc.nextInt();
        double[] vetor = new double[numero];
        double soma = 0;

        System.out.println("Insira os valores a serem armazenados :");

        for (int inicio = 0; inicio < numero; inicio++) {

            vetor[inicio] = sc.nextDouble();
            soma += vetor[inicio];
        }

        System.out.println("Esses são os valores armazenados : ");

        for (int inicio = 0; inicio < numero; inicio++) {

            System.out.println(vetor[inicio]);

        }

        double media = soma / numero;

        System.out.println("Esse é a soma e a media respectivamente :");
        System.out.println(soma);
        System.out.println(media);

        sc.close();

    }
}