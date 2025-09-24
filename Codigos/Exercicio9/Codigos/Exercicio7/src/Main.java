/* Faça um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentro os três números lidos.
Em caso de empate, mostrar apenas uma vez.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    System.out.println("Insira três números : ");

    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    int numero3 = sc.nextInt();

    if (numero1 < numero2 && numero1 < numero3) {
        System.out.print("Entre os números " + numero1 +", " + numero2 + " e " + numero3 + " o menor número é : " + numero1);

    } else if (numero2 < numero1 && numero2 < numero3) {
        System.out.print("Entre os números " + numero1 +", " + numero2 + " e " + numero3 + " o menor número é : " + numero2);

    } else  {
        System.out.print("Entre os números " + numero1 +", " + numero2 + " e " + numero3 + " o menor número é : " + numero3);

    }

    }
}