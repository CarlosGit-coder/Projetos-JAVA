/* Usando o while faça um programa que leia números inteiros até que um zero seja inserido. Ao final mostra a soma
dos números lidos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");

        int numero = sc.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero;11
            numero = sc.nextInt();

        }

        System.out.println("A soma é : " + soma);

        sc.close();

    }
}