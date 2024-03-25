public class Main {
    public static void main(String[] args) {

        Employee e1=new Employee("tharindu",22,"It");
        Employee e2 =new Employee("Madu",25);
        Employee e3=new Employee("dilshan");

        System.out.println(e1.name+" "+e1.age+" "+e1.department);
        System.out.println(e2.name+" "+e2.age+" "+e2.department);
        System.out.println(e3.name+" "+e3.age+" "+e3.department);
    }
}