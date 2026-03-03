/* Faça um programa que leia um quantidade N representando o número de estudantes que vão alugar quartos (10 quartos
existentes). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (0 a 9). Suponha que seja escolhido um quarto vago. Ao final deve
imprimir um relatório de todas as ocupações do pensionato, por ordem de quarto.
 */
package Application;

import Entities.Rent;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vet = new Rent[10];

        System.out.print("Insira a quantidade de quartos que serão alugados: ");

        int quantityRooms = sc.nextInt();

        for (int begin = 0; begin < quantityRooms; begin++) {

            System.out.println();

            System.out.println("Hospede " + (begin + 1) + "°:");

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Número do quarto: ");
            int roomNumber = sc.nextInt();

            vet[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");

        for (int begin = 0; begin < 10; begin++) {
            if (vet[begin] != null) {
                System.out.println("Quarto "+ begin + ": " + vet[begin]);
            }
        }



        sc.close();
    }
}
