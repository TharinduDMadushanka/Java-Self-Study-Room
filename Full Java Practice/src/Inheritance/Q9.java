package Inheritance;
/**
 * Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck,
 * Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type.
 * Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
 */
public class Q9 {
    public static void main(String[] args) {

    }
}
abstract class Vehicle{
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    public Vehicle(String make,String model,int year,String fuelType,double fuelEfficiency){
        this.make=make;
        this.model=model;
        this.year=year;
        this.fuelType=fuelType;
        this.fuelEfficiency=fuelEfficiency;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getFuelType(){
        return fuelType;
    }
    public double getFuelEfficiency(){
        return fuelEfficiency;
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTravelled();
    public abstract double getMaxSpeed();

}
class Truck extends Vehicle{
    private double cargoCapacity;
    public Truck(String make,String model,int year,String fuelType,double fuelEfficiency,double cargoCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity=cargoCapacity;
    }

    public double getCargoCapacity(){
        return cargoCapacity;
    }
    public double calculateFuelEfficiency(){
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }
    public  double calculateDistanceTravelled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public  double getMaxSpeed(){
        return 80.0;
    }
}

class Car extends Vehicle{
    private int numSeats;

    public Car(String make,String model,int year,String fuelType,double fuelEfficiency,int numSeats){
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats=numSeats;
    }

    public int getNumSeats(){
        return numSeats;
    }

    public  double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }
    public  double calculateDistanceTravelled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public  double getMaxSpeed(){
        return 120.0;
    }
}

class MotorCycle extends Vehicle{

}
