package Interface.basics;

public interface Animal {

     String name = "";
//     int x; cant
    
    void makeSound(); // Abstract method
    abstract void eat();
    String getSound(String a); //Abstract method

    default void sing() {

    }

    static void hi() {

    }

//    public Animal(){}  cant declare constructors
}
