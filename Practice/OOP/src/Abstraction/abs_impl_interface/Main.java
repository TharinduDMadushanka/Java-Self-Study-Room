package Abstraction.abs_impl_interface;

interface Swimmable {
    void swim();

    public void bark();
}

abstract class Fish implements Swimmable {
    // Abstract method from the interface
    public abstract void swim();

    // Concrete method
    public void eat() {
        System.out.println("This fish eats.");
    }
}

class Shark extends Fish {
    @Override
    public void swim() {
        System.out.println("Shark swims fast.");
    }

    @Override
    public void bark() {

    }
}

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.swim(); // Shark swims fast.
        shark.eat();  // This fish eats.
    }
}
