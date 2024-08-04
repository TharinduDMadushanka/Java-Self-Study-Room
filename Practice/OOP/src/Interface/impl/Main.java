package Interface.impl;

interface Animal {
    void makeSound(); // Abstract method

    String name = "aa";

    default void eat() {
        System.out.println("eat");
    }

    private void dance() {
        System.out.println("dance");
    }

    void walk();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void walk() {

    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Dog barks.
        dog.eat();
        System.out.println(Animal.name);
    }
}
