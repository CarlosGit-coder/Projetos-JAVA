/* Faça um programa para ler a cotação do dólar, e depois um valor em dólares
a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar
pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor
em dólar. Criar uma classe CurrencyConverter para ser responsavel pelos calculos.
 */

package Application;

import Util.Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor atual do dólar: ");
        double dolar = sc.nextDouble();

        System.out.print("Insira a qauntidade de dólares que deseja comprar: ");
        double qnt_dolar = sc.nextDouble();

        System.out.printf("O valor a ser pago é: %.2f%n", Calculator.valor_dolar(dolar,qnt_dolar));

    }
}
