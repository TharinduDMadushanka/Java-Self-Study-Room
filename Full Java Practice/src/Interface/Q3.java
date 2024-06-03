package Interface;

/**
 * Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft,
 * Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.
 */
public class Q3 {
    public static void main(String[] args) {

        Flyable [] flyingObjects={new Spacecraft(), new Airplane(), new Helicopter()};

        for (Flyable obj: flyingObjects){
            obj.fly_Obj();
        }
    }
}
class Spacecraft implements Flyable{
    @Override
    public void fly_Obj() {
        System.out.println("Space craft is flying..");
    }
}
class Airplane implements Flyable{

    @Override
    public void fly_Obj() {
        System.out.println("Airplane is flying..");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_Obj() {
        System.out.println("Helicopter is flying..");
    }
}