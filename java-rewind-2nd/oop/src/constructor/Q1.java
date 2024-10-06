package constructor;

/**
 * Write a Java program to create a class called "Cat" with instance variables name and age.
 * Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
 */

public class Q1 {
}

class Cat{
    private String name;
    private int age;

    public Cat(){
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat's Name: "+cat.getName());
        System.out.println("Cat's Age: "+cat.getAge());
    }
}