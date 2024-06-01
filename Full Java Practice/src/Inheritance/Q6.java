package Inheritance;

/**
 * Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
 */
public class Q6 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.move();

        Cheetah c =new Cheetah();
        c.move();
    }
}
class Animal{
    public void move(){
        System.out.println("Animal move!");
    }
}
class Cheetah extends Animal{
    public void move(){
        System.out.println("Cheetah on move!");
    }
}