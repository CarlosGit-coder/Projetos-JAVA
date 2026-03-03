import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double saldo = 1000.00;

        int escolha;
        do {
            System.out.print("Escolha :");
            System.out.println();
            System.out.print("1 : Sacar");
            System.out.println();
            System.out.print("2 : Depositar");
            System.out.println();
            System.out.print("3 : Consultar Saldo");
            System.out.println();
            System.out.print("4 : Sair");
            System.out.println();
            escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor que desehja sacar: ");
                    double sacar = sc.nextDouble();
                    if (sacar > saldo) {
                        System.out.println("Valor iNvalido");
                    } else {
                        saldo -= sacar;
                        System.out.println(saldo);
                    }


                    break;

                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double depositar = sc.nextDouble();
                    saldo += depositar;
                    System.out.println(saldo);

                    break;

                case 3:
                    System.out.println(saldo);

                    break;

                case 4:
                    System.out.println("Saido do sistema...");

                    break;

                default:
                    System.out.println("erro.......");

            }
        } while (escolha != 4);

    }
}
