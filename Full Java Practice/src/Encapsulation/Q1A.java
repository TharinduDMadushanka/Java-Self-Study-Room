package Encapsulation;

/**
 * From Q1
 */
public class Q1A {
    public static void main(String[] args) {

        Person p1 =new Person("Tharindu",21,"Sri Lanka");

        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getCountry());
    }
}
class Person{
    private String name;
    private int age;
    private String country;

    public Person(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
}
