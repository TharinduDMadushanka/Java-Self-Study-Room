package Interface;

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
