package Inheritance.exception_handle;

import java.io.IOException;

class Animal {
    public void makeSound() throws Exception {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() throws IOException { // Can throw fewer or more specific exceptions
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Animal animal = new Dog();
            animal.makeSound();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
