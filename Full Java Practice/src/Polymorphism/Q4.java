package Polymorphism;

/**
 * Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager
 * and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
 */
public class Q4 {
    public static void main(String[] args) {

    }
}
class Employee{
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role=role;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
    public double calcSalary(){
        return 0;
    }
}
class Manager extends Employee{
    private double salary;
    private double bonus;

    public Manager(String name,double salary, double bonus) {
        super(name,"Manager");
        this.salary = salary;
        this.bonus = bonus;
    }
    public double getSalary(){
        return salary+bonus;
    }

}
