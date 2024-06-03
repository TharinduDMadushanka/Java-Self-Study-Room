package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion,
 * Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
 */
public class Q4 {
    public static void main(String[] args) {

    }
}
abstract class Animal1{
    public abstract void eat();
    public abstract void sleep();
}
class Lion1 extends Animal1{
    @Override
    public void eat(){
        System.out.println("Lion eat");
    }
    @Override
    public void sleep(){
        System.out.println("Lion sleep");
    }
}
class Tiger1 extends Animal1{


    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleep");
    }
}
class Dear extends Animal1{

    @Override
    public void eat() {
        System.out.println("Dear eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dear sleep");
    }
}
