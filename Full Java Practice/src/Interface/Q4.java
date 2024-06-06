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
class Bank{
    private List accounts;

    public Bank() {
        accounts =new ArrayList();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
}