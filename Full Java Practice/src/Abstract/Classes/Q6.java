package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses
 * Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape
 */
public class Q6 {
    public static void main(String[] args) {

        Shape3D sphere =new Sphere(7);
        Shape3D cube =new Cube(6);

        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
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

class Cube extends Shape3D{
    private double sideLength;

    public Cube(double sideLength){
        this.sideLength=sideLength;
    }
    public double calculateVolume(){
        return Math.pow(sideLength, 3);
    }

    public double calculateSurfaceArea(){
        return 6 * Math.pow(sideLength, 2);
    }
}