//Java Abstract---> process of hiding implementation details from user
// we can do this in 2 ways, 1.abstract 2.interfaces

public class Main {
    public static void main(String[] args) {

        // Phone p1 =new Phone(); ---> we cannot make objects for abstract class
        Samsung s1 =new Samsung();
        s1.sleep();
        s1.call();
        s1.talk(); // can access non abstract methods in abstract class

    }
}