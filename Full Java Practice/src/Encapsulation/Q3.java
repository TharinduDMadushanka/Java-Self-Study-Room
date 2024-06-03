package Encapsulation;

/**
 * Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public
 * getter and setter methods to access and modify these variables.
 */
public class Q3 {
    public static void main(String[] args) {

        Rectangle r =new Rectangle();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());
        System.out.println("Area: "+r.getArea());
    }
}
class Rectangle{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
}