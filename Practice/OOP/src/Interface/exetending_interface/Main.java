package Interface.exetending_interface;

interface Animal {
    void makeSound();
}

interface Pet extends Animal {
    void play();
    void sleep();
}

class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog plays.");
    }

    @Override
    public void sleep() {

    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Dog barks.
        dog.play();      // Dog plays.
    }
}

