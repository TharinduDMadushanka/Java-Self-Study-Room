package Encapsulation;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Employee1 e1 =new Employee1();

        System.out.print("What is your name:");
        String name = input.next();
        System.out.print("What is your age:");
        int age = input.nextInt();
        System.out.print("What is your salary:");
        int salary = input.nextInt();
        System.out.print("What is your department:");
        String dep = input.next();

        e1.printInfo(name,age,salary,dep);

        System.out.println("Employee Information!");
        System.out.println("Name : "+e1.getName());
        System.out.println("Age : "+e1.getAge());
        System.out.println("Salary : "+e1.getSalary());
        System.out.println("Department : "+ e1.getDepartment());
    }
}
class Employee1{
    private String name;
    private int age;
    private double salary;
    private String department;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }
    public void printInfo(String name,int age,double salary,String department){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.department=department;
    }
}
