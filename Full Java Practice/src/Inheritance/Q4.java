package Inheritance;

/**
 *  Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass
 *  called HRManager that overrides the work() method and adds a new method called addEmployee().
 */
//public class Q4 {
//    public static void main(String[] args) {
//
//        Employee e =new Employee(100,20);
//        System.out.println("Employee salary: " +e.getSalary()+" "+ e.getAge());
//
//        HRManager h=new HRManager(200,22);
//        System.out.println("Manager salary: " + h.getSalary()+" "+h.getAge());
//        h.addEmployee();
//
//    }
//}
//class Employee{
//    private int salary;
//    private int age;
//
//    public Employee(int salary,int age){
//        this.salary=salary;
//        this.age=age;
//    }
//    public void work(){
//        System.out.println("working as an employee!");
//    }
//
//    public double getSalary(){
//        return salary;
//    }
//
//    public int getAge(){
//        return age;
//    }
//}
//class HRManager extends Employee{
//
//    public HRManager(int salary,int age){
//        super(salary, age);
//    }
//
//    public void work() {
//        System.out.println("\nManaging employees");
//    }
//
//    public void addEmployee() {
//        System.out.println("\nAdding new employee!");
//    }
//}
