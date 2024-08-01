package Inheritance.Super.basic.field;

class Animal {
    protected String name = "Unnamed Animal";
}

class Dog extends Animal {
    public void printName() {
        System.out.println("Animal name: " + super.name); // Accesses the name field of Animal class
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printName();
    }
}
