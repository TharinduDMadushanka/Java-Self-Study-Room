//Method overloading ---> use similar method with different ways . we can do it change data types,change parameter
public class Calculator {
    public  void add(int a,int b){
        System.out.println("Total is : "+ (a+b) );
    }

    public  void add(double a,double b){
        System.out.println("Total is : "+ (a+b) );
    }

    public  void add(int a,int b,int c){
        System.out.println("Total is : "+ (a+b) );
    }
}
