public class Main {
    public static void main(String[] args) {

        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.name="Tharindu";
        e1.age=22;
        //e1.department="It"; ---> we can't call static method by its object name
        //Employee.department="It"; Correct way to call static object but no need to call it again and again we can call it in default constructor

        e2.name="Madushanka";
        e2.age=25;
        //e2.department="Cleaning";
        //Employee.department="It";

        e1.show();
        e2.show();
    }
}