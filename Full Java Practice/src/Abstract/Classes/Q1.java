package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion
 * and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
 */
public class Q1 {
    public static void main(String[] args) {

        Lion l = new Lion();
        l.sound();

        Tiger t = new Tiger();
        t.sound();

        Animal a=new Animal() { // if we create abstract class obj we should override all methods
            @Override
            public void sound() {
                System.out.println("Animal make sounds");
            }
        };
        a.sound();
    }
}

abstract class Animal {
    public abstract void sound();
    //public abstract void eat();
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roars!");
    }
}

class Tiger extends Animal {
    public void sound() {
        System.out.println("Tiger growls!");
    }
}