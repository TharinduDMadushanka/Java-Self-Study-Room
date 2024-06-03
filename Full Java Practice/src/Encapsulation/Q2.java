package Encapsulation;

/**
 * Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
 * Provide public getter and setter methods to access and modify these variables.
 */
public class Q2 {
    public static void main(String[] args) {

        BankAccount b= new BankAccount("a1",1000);
        System.out.println("Acc nb: "+b.getAccNb());
        System.out.println("Balance: "+b.getBalance());

    }
}
class BankAccount{
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
}
