package Encapsulation;

public class Bank {

    private int accountNumber;
    private int balance;
    private String accountName;

    public Bank(int accountNumber, int balance,String accountName){
        this.accountName=accountName;
        this.balance=balance;
        this.accountName=accountName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        if (balance>0){
            this.balance=balance;
        }else {
            System.out.println("You don't have balance");
        }
    }

    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public static void main(String[] args) {

    }
}
