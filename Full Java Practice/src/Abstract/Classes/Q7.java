package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses
 * Car and  Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.
 */
public class Q7 {
    public static void main(String[] args) {

    }
}

abstract class Vehicle {
    public abstract void startEngine();

    public abstract void stopEngine();
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    public void stopEngine() {
        System.out.println("Car Engine Stopped");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Motorcycle Engine Started");
    }

    public void stopEngine() {
        System.out.println("Motorcycle Engine Stopped");
    }
}