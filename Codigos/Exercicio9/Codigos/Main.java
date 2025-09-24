import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     System.out.println("Digite sua primeira nota");

     Scanner sc = new Scanner(System.in);

     double a,b,c,m;
     int p1,p2,p3;

     a = sc.nextDouble();

     System.out.println("Digite sua segunda nota");

     b = sc.nextDouble();

     System.out.println("Digite sua ultima nota");

     c = sc.nextDouble();

     System.out.println("Digite o peso da primeira nota");

     p1 = sc.nextInt();

     System.out.println("Digite o peso da segunda nota");

     p2 = sc.nextInt();

     System.out.println("Digite o peso da ultima nota");

     p3 = sc.nextInt();

     m = (a * p1 + b * p2 + c * p3)  / (p1 + p2 + p3);

     System.out.println("Sua media é :" + m);

        }
    }
