package Polymorphism.casting;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Dog barks.

        Dog myDog = (Dog) myAnimal; // Down casting
        myDog.bark(); // Dog barks.
    }
}
