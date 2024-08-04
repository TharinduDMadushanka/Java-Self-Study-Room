package Interface.multiple_inheritance_conflicts;

interface InterfaceA {
    default void display() {
        System.out.println("Interface A");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Interface B");
    }
}

class Test implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        InterfaceA.super.display(); // Resolve conflict
        InterfaceB.super.display(); // Resolve conflict
        System.out.println("Test class");
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        // Interface A
        // Interface B
        // Test class
    }
}
