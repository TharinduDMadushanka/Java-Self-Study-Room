package Inheritance;

/**
 * Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee,
 * with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary,
 * and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.
 */

public class Q10 {
    public static void main(String[] args) {

    }
}
class Employee{
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name,String address,double salary,String jobTitle){
        this.name=name;
        this.address=address;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return  address;
    }
    public double getSalary(){
        return  salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double calculateBonus() {
        // Default implementation for bonus calculation
        return 0.0;
    }

    public String generatePerformanceReport() {
        // Default implementation for performance report
        return "No performance report available.";
    }
}
class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name,String address,double salary,String jobTitle,int numberOfSubordinates){
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates=numberOfSubordinates;
    }
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

}
