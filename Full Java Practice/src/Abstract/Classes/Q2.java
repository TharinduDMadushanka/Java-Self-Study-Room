package Abstract.Classes;

/**
 * Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 * Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
 */
public class Q2 {
    public static void main(String[] args) {

    }
}
abstract class Shape{
    abstract double calcArea();
    abstract double calcPerimeter();
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double calcArea(){
        return Math.PI*radius*radius;
    }

    public double calcPerimeter(){
        return 2*Math.PI*radius;
    }
}
