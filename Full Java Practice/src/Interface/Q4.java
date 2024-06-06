package Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount.
 * The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit,
 * withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and
 * have their own unique methods.
 */
public class Q4 {
    public static void main(String[] args) {

        Bank bank = new Bank();
        SavingsAccount savingsAccount =new SavingsAccount(1000,1.25);
        System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");

        CurrentAccount currentAccount=new CurrentAccount(5000,1000);
        System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00");

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nNow deposit $100 to Savings Account.");

    }
}
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += balance * interestRate/100;
    }
}
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
class Bank {
    // Declare a private list to store accounts
    private List accounts;

    // Constructor for initializing the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the list of accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to remove an account from the list of accounts
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Method to deposit a specified amount into an account
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    // Method to withdraw a specified amount from an account
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    // Method to print the balances of all accounts in the bank
    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}