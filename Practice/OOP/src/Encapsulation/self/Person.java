package Encapsulation.self;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = "name";
        this.age = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        System.out.println("Name set to " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
