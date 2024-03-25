public class Main {
    public static void main(String[] args) {

        Rectangle r1 =new Rectangle();
            //System.out.println(r1.count);
            System.out.println(Rectangle.count);
        Rectangle r2=new Rectangle(5,4);
            //System.out.println(r2.count);
            System.out.println(Rectangle.count);
        Rectangle r3=new Rectangle(10,6);
            //System.out.println(r3.count);
            System.out.println(Rectangle.count);

        System.out.println("R1 --> Area: "+r1.getArea()+" Perimeter: "+r1.getPerimeter());
        System.out.println("R2 --> Area: "+r2.getArea()+" Perimeter: "+r2.getPerimeter());
        System.out.println("R3 --> Area: "+r3.getArea()+" Perimeter: "+r3.getPerimeter());

        r1.length=10;
        r1.width=15;

        System.out.println("R1 After --> Area: "+r1.getArea()+" Perimeter: "+r1.getPerimeter());

    }
}