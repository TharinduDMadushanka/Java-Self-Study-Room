package Core;

public class Q1 {
    public static void main(String[] args) {

        User p1=new User("Thari",22);
        p1.printInfo();

    }
}
class User{
    private String name;
    private int age;

    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
    public  String getName(String name){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age=age;
    }

    public void printInfo(){
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }
}
