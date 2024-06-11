//polymorphism --->poly-many, morph-form
//Object ekakata wiwida akaraye swarupa thibima
//1.runtime-> override krpu ekk run time ekedi call kirima
// 2.compile time->static type ekk overload kirima

public class Main {
    public static void main(String[] args) {

        Bike b =new yamaha(); // upcasting
        b.run();//Yamaha is run


    }
}
class Bike{
    void run(){
        //System.out.println("Bike is running");
    }
        }
class yamaha extends Bike{
    void run(){
        System.out.println("Yamaha is run");
    }
        }