//super() --> inhere this is default we cant see it this the reason why parent con call first it must be the first line
public class Child extends Parent {

    public Child(){ //Default constructor
        super();
        System.out.println("In side the Default constructor of child class");

    }
    public Child(int a){
        super(a);
        System.out.println("In side the parameterized constructor of child class");

    }
}
