package Polymorphism.run_time;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

//    public void hi(){
//        System.out.println("Dog his.");
//    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
    public void hi(){
        System.out.println("Dog his.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Calls the overridden method in Dog class

        ((Dog) dog).hi();

        Animal cat = new Cat();
        dog.makeSound(); // Calls the overridden method in Cat class

    }
}
