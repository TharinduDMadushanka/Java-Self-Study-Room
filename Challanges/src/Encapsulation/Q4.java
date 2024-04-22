package Encapsulation;

import java.util.Scanner;

/*
Bank Account:
Create a BankAccount class with private instance variables for account number and balance.
Add public methods to deposit and withdraw money from the account.
*/
public class Q4 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        Account a1=new Account();

        System.out.println("Welcome simple banking system!");
        System.out.println("\t1.Deposit\n\t2.Withdraw");
        System.out.print("What is your choice:");
        int choice=input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Now you can Deposit money.");
                System.out.print("Enter money for deposit:");
                double depo=input.nextDouble();
                a1.deposit(depo);
                a1.printBalance();
                break;

            case 2:
                System.out.println("Now you can Withdraw money.");
                System.out.print("Enter money for withdraw:");
                double with=input.nextDouble();
                a1.withdraw(with);
                a1.printBalance();
                break;

            default:
                System.out.println("Please Enter a valid choice.");
        }

    }
}
class Account{
    Scanner input=new Scanner(System.in);
    private String name;
    private int accountNb;
    private double balance=5000;

    public String getName(){
        return name;
    }

    public int getAccountNb(){
        return accountNb;
    }

    public double getBalance(){
        return balance;
    }

    public void printInfo(String name, int accountNb, double balance){
        this.name=name;
        this.accountNb=accountNb;
        this.balance=balance;
    }

    public void deposit(double depo){

        this.balance+=depo;
    }

    public void withdraw(double with){
        this.balance-=with;
    }

    public void printBalance(){
        System.out.println("Available balance is:"+balance);
    }
}