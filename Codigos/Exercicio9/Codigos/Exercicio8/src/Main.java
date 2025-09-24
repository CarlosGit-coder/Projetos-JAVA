/* Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Faça um programa que leia a quantidade de minutos que
o cliente consumiu e mostre o valor a ser pago.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de minutos utilizados");

        int minutos = sc.nextInt();
        double valor_pagar = 50.00;

        if (minutos < 100) {
            System.out.printf("O valor a pagar é : R$ %.2f%n", valor_pagar );

        } else {
            valor_pagar += (minutos - 100) * 2.00;
            System.out.printf("O valor a pagar é : R$ %.2f%n", valor_pagar);
        }

        sc.close();

    }
}