/* Faça um programa que leia dois números inteiros M e N. em seguida, leia uma matriz de M linhas e N colunas contendo
números double. Em seguida essa matriz ira gerar um vetor de modo que cada elemento do vetor seja a soma dos elementos
da linha correspondente da matriz. Mostre o valor gerado
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de linhas da sua matriz: ");

        int linhas = sc.nextInt();

        System.out.print("Insira o número de colunas da sua matriz: ");

        int colunas = sc.nextInt();

        double [][] Matriz = new double[colunas][linhas];

        for(int inicio_linhas = 0; inicio_linhas < linhas; inicio_linhas++){
            for(int inicio_colunas = 0; inicio_colunas < colunas; inicio_colunas++){
                System.out.print("Insira o elemento na posição " + (inicio_colunas + 1) + "," + (inicio_linhas + 1) + " :");
                Matriz[inicio_colunas][inicio_linhas] = sc.nextDouble();
            }
        }

        System.out.println("A sua matriz é: ");
        System.out.println();

        for(int inicio_linhas = 0; inicio_linhas < linhas; inicio_linhas++){
            for(int inicio_colunas = 0; inicio_colunas < colunas; inicio_colunas++){
                System.out.print(Matriz[inicio_colunas][inicio_linhas] + " ");
            }
            System.out.println();
        }

        double[] Soma_das_linhas = new double[linhas];
        for(int inicio_linhas = 0; inicio_linhas < linhas; inicio_linhas++){

            double soma = 0;

            for(int inicio_colunas = 0; inicio_colunas < colunas; inicio_colunas++){
                soma += Matriz[inicio_colunas][inicio_linhas];
            }

            Soma_das_linhas[inicio_linhas] = soma;

            System.out.println();

        }

        System.out.println("A soma das linhas da sua matriz é :");
        System.out.println();

        for(int inicio_linhas = 0; inicio_linhas < linhas; inicio_linhas++){
            System.out.printf("%.1f%n", Soma_das_linhas[inicio_linhas]);
        }

    }
}