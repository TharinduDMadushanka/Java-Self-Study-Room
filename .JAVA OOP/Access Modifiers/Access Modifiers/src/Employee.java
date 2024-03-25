// default ---> we can access anywhere in package we can't access outside  the package
public class Employee {
    public int nb1; //---> we can access anywhere even outside the package too
    private int nb2; //---> access only declared  class.if we want access outside we need use getters and setters
    protected int nb3; //---> we can access declared class and subclasses in the same package
}
