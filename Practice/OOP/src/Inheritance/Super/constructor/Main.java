package Inheritance.Super.constructor;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Calls the constructor of Animal class
        this.breed = breed;
    }

    public void display() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}

