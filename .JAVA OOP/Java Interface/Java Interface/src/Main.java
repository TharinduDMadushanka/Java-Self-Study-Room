//Java Interface----> reference type in java
//Interfaces are final & abstract
//Cant decleare objects
//cant have constructors,instance
//Can't extend
//use implement keyword

public class Main {
    public static void main(String[] args) {

        Dog d1=new Dog();
        d1.eat();
        d1.sleep();
        d1.newMethod();
        Animal.staticMethod();

    }
}