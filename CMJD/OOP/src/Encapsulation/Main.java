package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p1=new Person("Thari",22,"thari@gmail.com"); // Create a new Person instance

        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        System.out.println("Email: "+p1.getEmail());

        // Set a new name and age
        p1.setName("Madu");
        p1.setAge(25);

        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        System.out.println("Email: "+p1.getEmail());

        p1.setAge(-5); // Try to set an invalid age
    }
}
