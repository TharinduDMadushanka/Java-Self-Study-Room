package Core;

// Get user input and pass them in to the parameter of object

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("What is your name:");
        String name=input.next();
        System.out.print("What is your age:");
        int age=input.nextInt();

        User p1=new User(name,age);
        p1.printInfo();

    }
}
class User1{
    private String name;
    private int age;

    public User1(String name, int age){
        this.name=name;
        this.age=age;
    }
    public  String getName(String name){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age=age;
    }

    public void printInfo(){
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }
}
