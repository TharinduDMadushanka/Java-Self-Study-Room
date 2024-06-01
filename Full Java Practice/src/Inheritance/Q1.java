package Inheritance;

/**
 *  Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
 */
public class Q1 {
    public static void main(String[] args) {

        Animal a1=new Animal();
        a1.makeSound(); // call Animal class method

        Cat c1=new Cat();
        c1.makeSound();// call Cat class method

        Animal a2=new Cat();
        a2.makeSound();// call Cat class method
        a1.makeSound();// call Animal class method

        /**
        Cat c2 =new Animal(); --> cant create object by super class
         */
    }
}
class Animal{
    public void makeSound(){
        System.out.println("Animal make sounds.");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("The cat quarrels.");
    }
}