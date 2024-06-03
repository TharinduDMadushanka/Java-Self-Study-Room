package Polymorphism;

/**
 * Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses
 * Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
 */
public class Q1 {
    public static void main(String[] args) {

        Animal a =new Animal();
        Bird b =new Bird();
        Cat c =new Cat();

        a.makeSound();
        b.makeSound();
        c.makeSound();

    }
}
class Animal{
    public void makeSound(){
        System.out.println("Animal make sounds");
    }
}
class Bird extends  Animal{
    @Override
    public void makeSound(){
        System.out.println("Birds chirps");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meows");
    }
}