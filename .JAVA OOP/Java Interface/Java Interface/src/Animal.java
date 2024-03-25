// we only give method bodies static and default
public interface Animal {
     void sleep();
     void eat();// these are abstract & final

    default void newMethod(){
        System.out.println("In default method");
    }

    static void staticMethod(){
        System.out.println("In static method");
    }
}
