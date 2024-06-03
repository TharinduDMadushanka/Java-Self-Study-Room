package Polymorphism;

/**
 * Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle,
 * Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.
 */
public class Q3 {
    public static void main(String[] args) {

        Circle c=new Circle(7);
        c.calcArea();
        System.out.println();

        Rectangle r =new Rectangle(5);
        r.calcArea();

    }
}
class Base{
    public double calcArea(){
        return 0;
    }
}
class Circle extends Base{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    public double calcArea(){
        return 2*Math.PI*radius;
    }
}
class Rectangle extends Base{
    private int side;

    public Rectangle(int side) {
        this.side = side;
    }
    public double calcArea(){

        return side*4;
    }
}