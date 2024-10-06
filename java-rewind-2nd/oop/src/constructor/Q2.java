package constructor;

/**
 * Parameterized Constructor:
 * Write a Java program to create a class called  Dog with instance variables name and color.
 * Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
 * Print the values of the variables.
 */

public class Q2 {
}

class Dog{
    private String name;
    private String color;

    public Dog() {}

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Dog d = new Dog("Bob", "red");
        System.out.println("Name: " + d.getName());
        System.out.println("Color: " + d.getColor());
    }
}
