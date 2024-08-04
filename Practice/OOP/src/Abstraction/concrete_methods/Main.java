package Abstraction.concrete_methods;

abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("This animal sleeps.");
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
        dog.sleep();     // This animal sleeps.
    }
}
