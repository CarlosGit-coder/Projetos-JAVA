import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero a ser convertido : ");

         int numero = sc.nextInt();

         int  horas = numero / 3600;

         int resto = numero % 3600;

         int minutos = resto / 60;

         int segundos = resto % 60;

         System.out.print(horas + ":" + minutos + ":" + segundos);

         sc.close();

        }
    }
