package Abstraction.abs_impl_abs;

abstract class Animal {

    public Animal(int x, int y){

    }

    public Animal() {

    }

    // Abstract method
    public abstract void makeSound();

    public abstract void sleep();

    // Concrete method
    public void eat() {
        System.out.println("This animal eats.");
    }
}

abstract class Mammal extends Animal {
    public Mammal(int x, int y) {
        super(x, y);
    }

    public Mammal() {
        super();
    }

    // Additional abstract method
    public abstract void walk();
}

class Dog extends Mammal {
    public Dog(int x, int y) {
        super(x, y);
    }

    public Dog() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {
        System.out.println("Dog walks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Dog barks.
        dog.walk();      // Dog walks.
        dog.eat();       // This animal eats.
    }
}
