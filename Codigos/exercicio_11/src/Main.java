/* Faça um programa ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que
não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
indivíduos. Se for entrado um valor negativo na primeira vez, mostar a mensagem "impossivel calcular".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade : ");

        int idade = sc.nextInt();
        int soma = 0;
        int contador = 0;


        if (idade < 0) {

            System.out.println("Impossivel calcular");

        } else {

            while (idade >= 0) {
                soma += idade;
                contador += + 1;
                idade = sc.nextInt();

            }

            double media =  (double) soma / contador;
            System.out.println("A media de idade é : " + media);

        }

     sc.close();

    }
}