public class Employee {
    String name;
    int age;
    String department;

//    Employee(){} //Default constructor no need to create this because it automatically create
// Parameter constructor ---> short cut -alt + insert

    public Employee(String name, int age, String department) { //parameterized constructor
        this.name = name;
        this.age = age;
        this.department = department;

    }

    public Employee() {
        this.name="Employee";
        this.age=25;
        this.department="IT";
    }
}
