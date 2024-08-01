package Inheritance.covariant_return_types;

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
        System.out.println("Dog returned: " + returnedDog); // Dog returned: Inheritance.covariant_return_types.Dog@776ec8df
    }
}
