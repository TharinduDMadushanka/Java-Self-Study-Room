//Java Inheritance---> inherits attributes and methods from one class to another class(Set parents class features to children class)
// if parent class is final we can't inherit "public final class Parent"
//We cant multiple class inherit in Java

public class Main {
    public static void main(String[] args) {

        Child c1 =new Child();
        // c1. ---> in here we can access all features in parents class because we inherit it to children
        c1.sing();
        c1.write();
        System.out.println(c1.height);
    }


    

}