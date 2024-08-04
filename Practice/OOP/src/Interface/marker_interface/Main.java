package Interface.marker_interface;

interface Serializable {
    // No methods or fields
}

class Employee implements Serializable {
    String name;
    int id;

    // Constructor, getters, setters
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        if (emp instanceof Serializable) {
            System.out.println("Employee is serializable.");
        }
    }
}
