package Inheritance.Super.basic;

class Animal {
    public void eat() {
        System.out.println("This animal eats.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        super.eat(); // Calls the eat method of Animal class
        System.out.println("The dog eats dog food.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Calls the overridden eat method
        /**
         * This animal eats.
         * The dog eats dog food.
         */
    }
}
