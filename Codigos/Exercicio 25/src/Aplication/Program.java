/* Faça um programa que leia os valores de largura e altura de um retangulo. Em seguida, mostre na tela o valor da sua
área, perimetro e diagonal.
 */
import Entitis.Retangule;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangule retangule = new Retangule();

        System.out.print("Insira o valor da base do retangulo: ");
        retangule.baseRetangulo = sc.nextDouble();
        System.out.print("Insira o valor da altura do retangulo: ");
        retangule.alturaRetangulo = sc.nextDouble();

        System.out.printf("A área do retangulo é: %.2f%n", retangule.areaRetangulo());
        System.out.printf("O perimetro do retangulo é: %.2f%n", retangule.perimetroRetangulo());
        System.out.printf("A diagonal do retangulo é: %.2f%n", retangule.diagonalRetangulo());

        sc.close();
    }
}
