/* Faça um programa que leia dois números inteiros positivos M e N, depois leia uma matriz de M linha e N colunas
contendo números inteiros. Em seguida mostrar na tela a matriz lida conforme exemplo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de linhas da sua matriz : ");

        int linhas = sc.nextInt();

        System.out.print("Insira o número de colunas da sua matriz : ");

        int colunas = sc.nextInt();

        int [][] Matriz;
        Matriz = new int [colunas][linhas];

        for (int inicio_linhas = 0; inicio_linhas < linhas; inicio_linhas++) {
            for (int inicio_colunas = 0; inicio_colunas < colunas; inicio_colunas++) {
                System.out.print("Insira o numero na posição " + (inicio_colunas + 1) +","+ (inicio_linhas + 1) + " :");
                Matriz[inicio_colunas][inicio_linhas] = sc.nextInt();
            }
        }

        for (int inicio_linhas = 0; inicio_linhas < linhas; inicio_linhas++) {
            for (int inicio_colunas = 0 ;inicio_colunas < colunas; inicio_colunas++) {
                System.out.print(Matriz[inicio_colunas][inicio_linhas] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}