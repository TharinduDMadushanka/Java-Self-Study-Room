package Encapsulation.private_fields;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Tharindu");
        person.setAge(22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
