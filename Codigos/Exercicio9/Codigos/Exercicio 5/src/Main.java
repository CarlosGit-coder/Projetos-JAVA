/*  Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
segundo semestres de uma disciplina anual.Em seguida,mostrar a nota final que o
 aluno obteve no ano juntamente com um texto explicativo.Caso a nota final do aluno
 seja igual ou inferior a 6.0, mostrar a mensagem "REPROVADO", conforme exemplos.Todos
 os valores devem ter uma casa decimal. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira as duas notas referente ao primeiro semestre : ");

        double nota1_semestre1 = sc.nextDouble();
        double nota2_semestre1 = sc.nextDouble();

        System.out.print("Insira as duas notas referentes ao segundo semestre : ");

        double nota1_semestre2 = sc.nextDouble();
        double nota2_semestre2 = sc.nextDouble();

        double nota_final = (nota1_semestre1 + nota2_semestre1 + nota1_semestre2 + nota2_semestre2) / 4;

        if (nota_final < 6.0) {
            System.out.printf("Reprovado %.1f%n", nota_final);

        } else {
            System.out.printf("Aprovado %.1f%n", nota_final);
        }

        sc.close();
    }
}