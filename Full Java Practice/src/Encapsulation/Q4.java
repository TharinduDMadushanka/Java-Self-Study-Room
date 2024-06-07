package Encapsulation;

/**
 * Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and
 * employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a
 * getter method for the salary variable that returns a formatted string.
 */
public class Q4 {
    public static void main(String[] args) {

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
}