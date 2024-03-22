public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();//Create e1 Object
        e1.age=15;
        e1.name="Tharindu";
        e1.ageFinder();
        e1.age=19;   //Value override
        e1.ageFinder();
        System.out.println(e1.Department);
    }
}