package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses
 * Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape
 */
public class Q6 {
    public static void main(String[] args) {

    }
}

abstract class Shape3D {
    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}