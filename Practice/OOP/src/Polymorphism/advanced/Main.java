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

