package Inheritance.constructor_chaining;

class Animal {
    public Animal() {
        System.out.println("An animal is created.");
    }
}

class Dog extends Animal {
    public Dog() {
        super(); // Calls the constructor of Animal class
        System.out.println("A dog is created.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Triggers constructor chaining
    }
}

