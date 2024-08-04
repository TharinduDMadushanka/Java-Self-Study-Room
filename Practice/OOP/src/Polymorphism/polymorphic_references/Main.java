package Polymorphism.polymorphic_references;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound(); // Dog barks.

        myAnimal = new Cat();
        myAnimal.makeSound(); // Cat meows.
    }
}

/**
 * Explanation: The myAnimal reference variable of type Animal can refer to Dog or Cat objects, demonstrating polymorphism.
 */