//we should override all abstract methods in abstract class
public class Samsung extends Phone{ // we cant extend abstract classes if we wanna do this we should override that class in here

    @Override
    public void call(){
        System.out.println("Inside samsung phone");
    }

    @Override
    public void sleep(){
        System.out.println("Inside samsung sleep");
    }
}
