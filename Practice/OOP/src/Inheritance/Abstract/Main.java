package Inheritance.Abstract;

abstract class Animal {
    public void sound() // Abstract method
    {
        System.out.println("aaa");
    }

    public void eat() {
        System.out.println("This animal eats.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Error: Cannot instantiate abstract class
        Animal dog = new Dog();
        dog.sound(); // Dog barks.
        dog.eat();   // This animal eats.
    }
}
