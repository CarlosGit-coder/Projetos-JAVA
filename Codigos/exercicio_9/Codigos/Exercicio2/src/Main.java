import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Insira a base desse retangulo ");

         double base = sc.nextDouble();

        System.out.println("Insira a altura desse retangulo");

         double altura = sc.nextDouble();

        double area = (base * altura);

        double perimetro = (2 * base) + (2 * altura);

        double diagonal = Math.sqrt(Math.pow(base, 2.0)) + (Math.pow(altura, 2.0));

        System.out.printf("Sua area é: %.4f%n", area);
        System.out.printf("Seu perimetro é: %.4f%n", perimetro);
        System.out.printf("A diagonal é: %.4f%n", diagonal);

        sc.close();
    }
}