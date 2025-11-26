import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa : ");

          String nome1 = sc.next();

        System.out.print("Insira a idade da primeira pessoa : ");

          int idade1 = sc.nextInt();

        System.out.print("Digite o nome da segunda pessoa : ");

          String nome2 = sc.next();

         System.out.print("Insira a idade da segunda pessoa : ");

          int idade2 = sc.nextInt();

        double media = (double)(idade1 + idade2) /2;

        System.out.printf("A idade media de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();
        }
    }