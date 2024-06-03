package Interface;

/**
 * Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
 * Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
 */
public class Q2 {
    public static void main(String[] args) {

        Dog d =new Dog();
        d.bark();

    }
}
class Dog implements Animal{
    @Override
    public void bark(){
        System.out.println("Dog barks");
    }
}