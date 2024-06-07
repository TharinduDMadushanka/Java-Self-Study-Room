package Polymorphism;

/**
 * Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager
 * and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
 */
public class Q4 {
    public static void main(String[] args) {

        Employee e1 =new Manager("Tharindu",7500,1500);
        Employee e2 =new Developer("Madushanka",7500,2000);

        System.out.println("Manager "+e1.getName()+" "+e1.getRole()+" salary: "+e1.calcSalary());
        System.out.println("Developer "+e2.getName()+" "+e2.getRole()+" salary: "+e2.calcSalary());
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
class Developer extends Employee{
    private double salary;
    private double ot;

    public Developer(String name,double salary, double bonus) {
        super(name,"Developer");
        this.salary = salary;
        this.ot=bonus;
    }
    public double getSalary(){
        return salary+ot;
    }
}