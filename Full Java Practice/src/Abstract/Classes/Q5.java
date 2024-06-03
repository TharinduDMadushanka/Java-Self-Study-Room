package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager
 * and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
 */
public class Q5 {
    public static void main(String[] args) {

    }
}
abstract class Employee{
    protected String name;
    protected double baseSalary;

    public Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public abstract double calcSalary();
    public abstract void displayInfo();
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name,double baseSalary,double bonus){
        super(name, baseSalary);
        this.bonus=bonus;
    }

    @Override
    public double calcSalary() {
        return baseSalary+bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calcSalary());
    }
}