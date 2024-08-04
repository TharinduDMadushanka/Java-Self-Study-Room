package Abstraction.abs_class;

abstract class Animal {
    // Abstract method (does not have a body)
    protected abstract void makeSound();

//    public abstract void sleep();

    // Regular method
    public void eat() {
        System.out.println("This animal eats.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Dog barks.
        dog.eat();       // This animal eats.
    }
}
