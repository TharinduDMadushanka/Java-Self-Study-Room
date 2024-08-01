package Encapsulation.self;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("aa");
        person.setAge(11);


        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
