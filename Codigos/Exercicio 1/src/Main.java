import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double area,valor;
     Scanner sc = new Scanner(System.in);
     System.out.println("Insira a medida de um lado do terreno");
     double a = sc.nextDouble();
     System.out.println("Insira a medida do outro lado do terreno");
     double b = sc.nextDouble();
     System.out.println("Insira o valor do metro quadrado do terreno");
     double r = sc.nextDouble();
     area = a * b;
     valor = area * r;
     System.out.printf("A área do seu terreno é: %.2f%n", area);
     System.out.printf("O preço do seu terreno é: " + "R$ %.2f%n",  valor);
     sc.close();
    }
}