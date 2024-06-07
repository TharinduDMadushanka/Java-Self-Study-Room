package Encapsulation;

import java.util.Scanner;

/**
 * Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and
 * employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a
 * getter method for the salary variable that returns a formatted string.
 */
public class Q4 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        Employee e =new Employee();

        System.out.println("Enter you id: ");
        int id =input.nextInt();
        e.setId(id);

        System.out.println("Enter your name: ");
        String name=input.next();
        e.setName(name);

        System.out.println("Enter your salary: ");
        double salary=input.nextDouble();
        e.setSalary(salary);



    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}