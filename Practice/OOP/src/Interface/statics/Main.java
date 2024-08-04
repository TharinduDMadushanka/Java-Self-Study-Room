package Interface.statics;

interface Animal {
    void makeSound(); // Abstract method

    static void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Dog barks.
        Animal.sleep();  // This animal sleeps.
    }
}
