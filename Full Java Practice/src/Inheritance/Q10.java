package Inheritance;

/**
 * Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee,
 * with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary,
 * and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.
 */

public class Q10 {
    public static void main(String[] args) {

        Manager manager=new Manager("Tharindu","Galle",10000,"Manager",5);
        Developer developer=new Developer("Dilshan","Matara",20000,"Developer","Java");
        Programmer programmer=new Programmer("Madushanka","Colombo",30000,"Python");

        System.out.println("Manager's bonus: "+manager.calculateBonus());
        System.out.println("Developer's bonus: "+developer.calculateBonus());
        System.out.println("Programmer's bonus: "+programmer.calculateBonus());

        System.out.println();

        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());

        System.out.println();

        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();

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
class Programmer extends Developer{
    public Programmer(String name,String address,double salary,String programmingLanguage){
        super(name, address, salary, "Programmer",programmingLanguage);
    }
    public double calculateBonus() {
        // Default implementation for bonus calculation
        return getSalary()*0.12;
    }

    public String generatePerformanceReport() {
        // Default implementation for performance report
        return "performance report for programmer "+getName();
    }
    public void debugCode(){
        System.out.println("Programmer "+getName()+" is debugging code in "+getProgrammingLanguage());
    }
}