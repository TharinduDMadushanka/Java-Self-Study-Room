package Encapsulation;

public class Person{
    private String name;
    private int age;
    private String email;

    public Person(String name,int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Age cannot be negative.");
        }
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
