/* Faça um programa que leia um número inteiro N e depois os dados(id, nome e salário) de N funcionários. Não deve haver
repetição de id. Além disso o sistema deve efetuar um aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostre uma mensagem e aborte a operação.
Ao final mostrar a listagem atualizado dos funcionários
 */
package Application;

import Entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados: ");
        int quantityEmployees = sc.nextInt();

        for (int begin = 0; begin < quantityEmployees; begin++) {

            System.out.println();
            System.out.println((begin + 1) + "° Funcionário: ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }

        System.out.println();
        System.out.print("Insira o ID do funcionário a colocar o aumento: ");
        Integer idIncrease = sc.nextInt();
        Integer result = thereId(list, idIncrease);

        if (result == null) {
            System.out.println("Esse ID não existe! ");

        } else {
            System.out.println();
            System.out.print("Insira a porcentagem a ser aumentada: ");
            double percent = sc.nextDouble();
            list.get(result).increseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        System.out.println();
        for (Employee employee : list) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static Integer thereId(List<Employee> list, int id) {
        for (int begin = 0; begin < list.size(); begin++) {
            if (list.get(begin).getId() == id) {
                return begin;
            }
        }

        return null;

    }
}
