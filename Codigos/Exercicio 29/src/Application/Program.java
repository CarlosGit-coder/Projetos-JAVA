/* Faça um programa que leia um numero inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida
mostre a altura média dessas pessoas
 */

package Application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de pessoas que deseja colocar a altura: ");
        int quantidadePessoas = sc.nextInt();
        double[] vet = new double[quantidadePessoas];

        for (int inicio = 0; inicio < quantidadePessoas; inicio++) {
            System.out.print("Insira a altura da " + (1 + inicio) +"° pessoa : ");
            vet[inicio] = sc.nextDouble();

        }

        double soma = 0.0;

        for (int inicio = 0; inicio < quantidadePessoas; inicio++) {
            soma += vet[inicio];

        }

        double media = soma/quantidadePessoas;

        System.out.printf("A media das alturas das pessoas é: %.2f%n", media);


        sc.close();
    }
}
