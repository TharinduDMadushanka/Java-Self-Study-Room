package Polymorphism.advanced;

class Animal {
    public Animal getAnimal() {
        return this;
    }
}

class Dog extends Animal {
    @Override
    public Dog getAnimal() {
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog returnedDog = dog.getAnimal();
        System.out.println("Dog returned: " + returnedDog);
    }
}

/**
 * When overriding a method, the return type can be a subclass of the return type declared in the superclass method.
 * Explanation: The getAnimal() method in the Dog class returns a Dog object, demonstrating covariant return types.
 */