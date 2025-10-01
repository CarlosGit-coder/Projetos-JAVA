/* Faça um programa que leia uma temperatura em Celsius e mostra o equivalente em Fahrenheit, na sequência o programa
deve perguntar ao usuário se ele deseja repetir (s/n). Caso o usuário digite "s", o programa deve repetir
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char resposta;

        do {
            System.out.print("Insira a temperatura em celsius : ");

            double celsius = sc.nextDouble();

            double fahrenheit = ((9 * celsius) / 5) + 32;

            System.out.printf("A temperatura em Celsius %.1fC é equivalente a %.1fF em fahrenheit.%n",celsius ,fahrenheit );

            System.out.println("Deseja converter outro número (s/n) ?");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

    }
}