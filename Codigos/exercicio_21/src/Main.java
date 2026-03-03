/* Faça um programa que leia um número inteiro N e uma matriz quadrada de ordem N, contendo números inteiros.
Em seguida, mostre a diagonal principal e a quantidade de valores negativos da matriz
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da sua matriz quadrada :  ");
        int numero = sc.nextInt();

        int [][] Matriz;
        Matriz = new int [numero][numero];

        for (int inicio_linhas = 0; inicio_linhas < numero; inicio_linhas++) {
            for (int inicio_colunas = 0; inicio_colunas < numero; inicio_colunas++){
                System.out.print("Insira o numero na posição " + (inicio_colunas + 1) +","+ (inicio_linhas + 1) + " :");
                Matriz[inicio_colunas][inicio_linhas] = sc.nextInt();
            }
        }

        for (int inicio_linhas = 0; inicio_linhas < numero; inicio_linhas++) {
            for (int inicio_colunas = 0; inicio_colunas < numero; inicio_colunas++){
                System.out.print(Matriz[inicio_colunas][inicio_linhas] +" ");
            }
            System.out.println();
        }
        System.out.print("A sua diagonal principal é: ");
        for (int inicio = 0; inicio < numero; inicio++) {
            System.out.print(Matriz[inicio][inicio] + " ");
        }
        System.out.println();

        int contador = 0;

        System.out.print("A quantidade de números negativos é: ");

        for (int inicio_linhas = 0; inicio_linhas < numero; inicio_linhas++){
            for (int inicio_colunas = 0; inicio_colunas < numero; inicio_colunas++) {
                if (Matriz[inicio_colunas][inicio_linhas] < 0){
                    contador ++;
                }
            }
        }
        System.out.print(contador);

        sc.close();
    }
}