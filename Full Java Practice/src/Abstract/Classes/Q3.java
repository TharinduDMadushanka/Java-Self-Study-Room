package Abstract.Classes;

/**
 * Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses:
 * SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
 */
public class Q3 {
    public static void main(String[] args) {

    }
}
abstract class BankAccount{
    private String accNb;
    private double balance;

    public BankAccount(String accNb,double balance){
        this.accNb=accNb;
        this.balance=balance;
    }
    public String getAccNb(){
        return accNb;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingAccount{

}
