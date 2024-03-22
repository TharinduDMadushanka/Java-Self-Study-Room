public class Main {
    public static void main(String[] args) {

        // Create c1 Object
        Car c1 =new Car();
        c1.color="Red"; //Initialize attributes
        c1.name="Toyota";
        c1.speed=150;
        c1.weight=45.5;
        c1.no=123;

        // Create c2 Object
        Car c2 =new Car();
        c2.color="Blue"; //Initialize attributes
        c2.name="Nissan";
        c2.speed=180;
        c2.weight=50.5;
        c2.no=567;

        c1.speed(); //call the method
        c1.color();

        c2.speed();
        c2.color();
    }
}