package Inheritance;

// Superclass (Parent Class)
class Animal {
     public static void eat() {
        System.out.println("This animal eats.");
    }

    public static void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Subclass (Child Class)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal class
        dog.bark(); // Method from Dog class
    }
}

