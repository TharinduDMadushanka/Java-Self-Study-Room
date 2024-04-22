package Encapsulation;

import java.util.Scanner;

/*
Employee Information:
Create an Employee class with private instance variables for name, age, and salary.
Add public methods to set and get these variables.
*/
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.print("What is your name:");
        String name = input.next();
        System.out.print("What is your age:");
        int age = input.nextInt();
        System.out.print("What is your salary:");
        int salary = input.nextInt();

        e1.printInfo(name, age, salary); // Set employee information

        // Display employee information
        System.out.println("Employee information:");
        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());
        System.out.println("Salary: " + e1.getSalary());

    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

//    public void setName(String name) { // doesn't need because we get all getters by using one method
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) { // doesn't need because we get all getters by using one method
//        this.age = age;
//    }

    public int getSalary() {
        return salary;
    }

//    public void setSalary(int salary) { // doesn't need because we get all getters by using one method
//        this.salary = salary;
//    }

    public void printInfo(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
