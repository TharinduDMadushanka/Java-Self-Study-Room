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
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double calcArea(){
        double s =(side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calcPerimeter(){
        return side1 + side2 + side3;
    }
}
