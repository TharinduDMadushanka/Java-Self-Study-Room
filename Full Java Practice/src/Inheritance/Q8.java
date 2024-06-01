package Inheritance;

/**
 * Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that
 * overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
 */
public class Q8 {
    public static void main(String[] args) {

        Circle c1=new Circle(7);
        System.out.println("Perimeter: "+c1.getPerimeter());
        System.out.println("Area: "+c1.getArea());

        Circle c2=new Circle(3.2);
        System.out.println("Perimeter: "+c2.getPerimeter());
        System.out.println("Area: "+c2.getArea());
    }
}
class Shape{
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}
class Circle{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
