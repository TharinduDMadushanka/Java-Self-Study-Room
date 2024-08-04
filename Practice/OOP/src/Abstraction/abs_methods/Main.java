package Abstraction.abs_methods;

abstract class Shape {

    int a;
    // Abstract method
    public abstract void draw();

    public static void eat() {
        System.out.println("ffffff");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw(); // Drawing a circle.

        Shape shape2 = new Rectangle();
        shape2.draw(); // Drawing a rectangle.

        Shape.eat();
    }
}
