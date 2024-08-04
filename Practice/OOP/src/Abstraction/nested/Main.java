package Abstraction.nested;

class OuterClass {
    abstract static class InnerAbstractClass {
        public abstract void display();
    }

    static class ConcreteClass extends InnerAbstractClass {
        @Override
        public void display() {
            System.out.println("Display method in ConcreteClass.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.ConcreteClass obj = new OuterClass.ConcreteClass();
        obj.display(); // Display method in ConcreteClass.
    }
}
