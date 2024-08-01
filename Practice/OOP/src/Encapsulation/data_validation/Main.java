package Encapsulation.data_validation;

class Account {
    // Private field
    private double balance;

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance with validation
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
        } else {
            this.balance = balance;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000.50);

        System.out.println("Balance: " + account.getBalance());

        account.setBalance(-500);
        System.out.println("Balance: " + account.getBalance());
    }
}
