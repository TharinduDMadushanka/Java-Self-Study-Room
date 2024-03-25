//Static ---> no depend on object(depend on class) , they will apply all objects
public class Employee {
    String name;
    int age;
    static String department; // depend on class
    static int Salary;

    static {
        Salary =50000; // we can declare static like this
        System.out.println("in static block");
    }

    public Employee(){
        Employee.department="It"; // It will apply all objects
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(name+" "+age+" " +department+" "+Salary);
    }
}
