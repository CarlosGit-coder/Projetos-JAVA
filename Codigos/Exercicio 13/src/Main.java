/* Leia um valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número : ");

        int numero = sc.nextInt();

        System.out.println("A tabuada do número " + numero + " é :");

        for (int inicial = 1; inicial <= 10; inicial++) {

            int resultado = inicial * numero;
            System.out.println(inicial + "x" + numero + "=" + resultado);

        }

        sc.close();

    }
}