/* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da
conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial,
entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito
inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
IMPORTANTE: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do
titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma
taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque ou pagar
 a taxa.
 */
package Program.aplication;

import Program.entities.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Insert account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Insert account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("You will make an initial deposit (Y/N)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            System.out.println("Insert the value of the initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        char continueOperation;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1  -  Deposit");
            System.out.println("2  =  Withdraw");
            System.out.println("3  =  Change name of holder");
            System.out.println("Choose an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;


                case 2:
                    System.out.print("Withdraw amount: ");
                    double withdraw = sc.nextDouble();

                    if (account.withdraw(withdraw)) {
                        System.out.println("\nWithdraw successful.");

                    } else {
                        System.out.println("\nInsufficient balance. Withdraw not allowed. ");
                    }
                    break;

                case 3:
                    System.out.print("New name of the holder: ");
                    String newNameHolder = sc.nextLine();
                    account.setAccountHolder(newNameHolder);
                    break;

                default:
                    System.out.println("invalidates option");
            }

            System.out.println("\nUpdated account data:");
            System.out.println(account);

            System.out.print("\nWould you like to do another operation (Y/N)? ");
            continueOperation = sc.next().charAt(0);

        } while (continueOperation == 'Y' || continueOperation == 'y');

        System.out.println("\nProgram finished");

        sc.close();
    }
}