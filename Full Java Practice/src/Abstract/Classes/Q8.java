package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses
 * Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.
 */
public class Q8 {
    public static void main(String[] args) {

    }
}
abstract class Person {
    public abstract void eat();
    public abstract void exercise();
}
class Athlete extends Person {
    public void eat(){
        System.out.println("Athlete eat healthy.");
    }
    public void exercise(){
        System.out.println("Athlete exercise everyday.");
    }
}
