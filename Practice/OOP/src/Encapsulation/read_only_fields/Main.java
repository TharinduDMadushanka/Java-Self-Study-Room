package Encapsulation.read_only_fields;

class Employee {
    // Private field
    private final String employeeId;

    // Constructor
    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    // Public getter for employeeId (no setter)
    public String getEmployeeId() {
        return employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("E12345");

        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
