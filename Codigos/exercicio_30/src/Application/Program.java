/* Faça um programa que leia um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em um
vetor. Em seguida, mostre o preço médio dos produtos.
 */

package Application;

import Entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de produtos a serem cadastrados: ");

        int quantidadeProdutos = sc.nextInt();
        Product[] vet = new Product[quantidadeProdutos];

        for (int inicio = 0; inicio < vet.length; inicio++) {
            sc.nextLine();

            System.out.print("Insira o nome do produto "+ (inicio + 1) + "°: ");
            String nome = sc.nextLine();

            System.out.print("Insira o preço do produto "+ (inicio + 1) + "° R$ ");
            double preco = sc.nextDouble();
            vet[inicio] = new Product(nome, preco);
        }

        double soma = 0.0;
        for (int inicio = 0; inicio < vet.length; inicio++) {
            soma+= vet[inicio].getPreco();
        }

        double media = soma / vet.length;

        System.out.printf("A media dos preços dos produtos é: %.2f%n", media);

        sc.close();
    }
}
