// cannot create object from a abstract class
//Can have abstract and non abstract methods
public abstract class Phone {

    public abstract void call(); //Abstract method --->this cannot have a body
    public abstract void sleep();
    public void talk(){ // Non abstract method
        System.out.println("Give a call.");
    }
}
