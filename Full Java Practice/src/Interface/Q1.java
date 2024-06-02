package Interface;

/**
 * Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle,
 * and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */
public class Q1{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,8);
        Circle c=new Circle(7);

        // Print the area of the Rectangle
        System.out.println("Area of the Rectangle: " + r.getArea());

        // Print the area of the Circle
        System.out.println("Area of the Circle: " + c.getArea());

    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}