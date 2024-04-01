//Final ----> we cant change after final

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.laps =12;
        //e1.race=10; --->we cant assign a value for final variable
        System.out.println(e1.laps);
        System.out.println(e1.race);

        Child c1 =new Child();
        c1.run(); // we can inherit fina method (we can call it)

    }
}