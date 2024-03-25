public class Main {
    public static void main(String[] args) {

     /*   Employee e1=new Employee();

            System.out.println(e1.department); //null
            System.out.println(e1.name); //null
            System.out.println(e1.age); // 0
    */

        Employee e1 =new Employee();//Default  constructor
        System.out.println(e1.department+" "+e1.age+" "+e1.name );

        Employee e2 =new Employee("Nimal",30,"Cleaning");//Parameterize constructor
        System.out.println(e2.department+" "+e2.age+" "+e2.name );


    }
}
/*

** A constructor in Java is a special method that is used to initialize objects.
** The constructor is called when an object of a class is created.
 */
// THIS KEYWORD ---> if parameter name == our instance variable name(assing it self) we use "this" to call object related variable