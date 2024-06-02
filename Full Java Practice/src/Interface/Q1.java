package Interface;

/**
 * Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle,
 * and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */

// This is an interface named 'Shape' that defines a contract for classes to implement.
public interface Shape{
    // Abstract method signature for getting the area of a shape.
    double getArea();
}
class Rectangle implements Shape{
    private double length;
    private double height;

    public Rectangle(double length,double height){
        this.length=length;
        this.height=height;
    }
}
