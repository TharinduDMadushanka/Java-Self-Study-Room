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

    public double calculateBonus() {
        // Default implementation for bonus calculation
        return getSalary()*0.15;
    }

    public String generatePerformanceReport() {
        // Default implementation for performance report
        return "performance report for manager "+getName();
    }
    public void manageProject(){
        System.out.println("Manager "+getName()+" is managing a project.");
    }
}
class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name,String address,double salary,String jobTitle, String programmingLanguage){
        super(name, address, salary, jobTitle);
        this.programmingLanguage=programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public double calculateBonus() {
        // Default implementation for bonus calculation
        return getSalary()*0.10;
    }

    public String generatePerformanceReport() {
        // Default implementation for performance report
        return "performance report for developer "+getName();
    }
    public void writeCode(){
        System.out.println("Developer "+getName()+" is writing code using "+programmingLanguage);
    }
}