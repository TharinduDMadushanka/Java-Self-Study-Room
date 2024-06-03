package Polymorphism;

/**
 * Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
 * Override the speedUp() method in each subclass to increase the vehicle's speed differently.
 */
public class Q2 {
    public static void main(String[] args) {

        Car car =new Car();
        Bicycle b =new Bicycle();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + b.getSpeed());

        car.speedUp();
        b.speedUp();

        System.out.println();

        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + b.getSpeed());


    }
}
class Vehicle{
    private int speed;
    public void speedUp(){
        speed+=10;
    }
    public int getSpeed(){
        return speed;
    }
}
class Car extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units.");
    }
}
class Bicycle extends Vehicle{
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }
}
