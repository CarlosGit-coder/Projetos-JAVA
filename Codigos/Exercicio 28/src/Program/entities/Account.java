package Program.entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder,  double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        double total = amount + 5.0;

        if (balance >= total) {
            balance -= total;
            return  true;

        } else {
            return false;
        }
    }

    public String toString() {
        return "Number account " + accountNumber
                + "\nHolder: " + accountHolder
                + "\nBalance: $ " + String.format("%.2f", balance);

    }

}
