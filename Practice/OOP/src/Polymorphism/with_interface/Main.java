package Polymorphism.with_interface;

interface Animal {
    void makeSound();

    default void eat(){
        System.out.println("eat");
    }

//    void walk();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat implements Animal {
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

