import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double delta,x1,x2;


        System.out.println("Vamos resolver equações ?");
        System.out.println("Digite o valor do numero elevado a potencia na questão");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Digite o valor da potencia");

         int p = sc.nextInt();

        System.out.println("Digite o valor do numero acompanhado do X");

         int b = sc.nextInt();

        System.out.println("Digite o valor do numero sozinho");

         int c = sc.nextInt();

         delta = (Math.pow(b, p) - 4 * a * c);
         x1 = (-b + Math.sqrt(delta)) / (2 * a);
         x2 = (-b - Math.sqrt(delta)) / (2 * a);

         System.out.println("O delta é:" + delta);
         System.out.println("O primeiro valor de X é :" + x1);
         System.out.println("O segunfo valor de X é :" + x2);

         sc.close();


    }
}
