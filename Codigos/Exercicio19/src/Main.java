/* Faça um programa que leia um número N, depois um nome, idade e altura de N pessoas
mostre na tela a altura média das pessoas, e mostre também a porcentagem de pessoas com menos de 16 anos
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas a serem cadastradas: ");

        int numero_de_pessoas = sc.nextInt();
        String[] Nome = new String[numero_de_pessoas];
        double[] Altura = new double[numero_de_pessoas];
        int[] Idade = new int[numero_de_pessoas];

        for (int inicio = 0; inicio < numero_de_pessoas; inicio++) {
            System.out.println("Insira o Nome da pessoa numero " + (inicio + 1) + ":");
            Nome[inicio] = sc.next();
            System.out.println("Insira a altura da pessoas numero " + (inicio + 1) + ":");
            Altura[inicio] = sc.nextDouble();
            System.out.println("Insira a Idade da pessoa numero " + (inicio + 1) +":");
            Idade[inicio] = sc.nextInt();

        }

        double soma = 0;
        for (int inicio = 0; inicio < numero_de_pessoas; inicio++) {
            soma = (soma + Altura[inicio]);
        }

        double media = soma / numero_de_pessoas;
        System.out.printf("A altura media  %.2f%n", media);

        int contador = 0;
        for (int inicio = 0; inicio < numero_de_pessoas; inicio++) {
                if (Idade[inicio] < 16) {
                    contador++;
                }
        }

        double porcentagem = (contador * 100.0) / numero_de_pessoas;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

    }


}