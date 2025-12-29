package Aplication;

import Entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle triangle1, triangle2;

        triangle1 = new Triangle();
        triangle2 = new Triangle();

        System.out.println("Insira as medidas dos lados do primeiro triangulo : ");

        triangle1.a = sc.nextDouble();
        triangle1.b = sc.nextDouble();
        triangle1.c = sc.nextDouble();

        System.out.println("Insira as medidas dos lados do segundo triangulo :");

        triangle2.a = sc.nextDouble();
        triangle2.b = sc.nextDouble();
        triangle2.c = sc.nextDouble();

        double areaTriangle1 = triangle1.area();

        double areaTriangle2 = triangle2.area();

       System.out.printf("A área do primeiro triangulo é: %.2f%n", areaTriangle1);
       System.out.printf("A área do segundo triangulo é: %.2f%n", areaTriangle2);

       if (areaTriangle1 > areaTriangle2) {
           System.out.print("A área do primeiro triangulo é maior");
       }
       else if (areaTriangle1 == areaTriangle2) {
           System.out.print("A área dos triangulos são iguais");
       }
       else{
           System.out.print("A área do segundo triangulo é maior");
       }
       sc.close();
    }
}
