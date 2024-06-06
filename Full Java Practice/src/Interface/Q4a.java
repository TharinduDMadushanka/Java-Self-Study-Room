package Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * from Q4
 */
public class Q4a {
    public static void main(String[] args) {

        People p = new People();
        Man m = new Man("Male","Tharindu");
        Man m1 = new Man("Male","Dilshan");
        p.addPeople(m1);
        p.addPeople(m);
        p.printInfo();

        Woman w = new Woman("Female","Dulani");
        p.addPeople(w);
        p.printInfo();


    }
}
interface Human{
    void addPeople(String gender,String name);
    void removePeople(String gender, String name);
    String showPeople();
}
class Man implements Human{
    private String gender;
    private String name;

    public Man(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }
    public void addPeople(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public void removePeople(String gender,String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String showPeople() {
        return gender + " " + name;
    }
}
class Woman implements Human{
    private String gender;
    private String name;

    public Woman(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public void addPeople(String gender,String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public void removePeople(String gender,String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String showPeople() {
        return "";
    }
}
class People{
    private List<Human> people;

    public People() {
        people = new ArrayList<Human>();
    }

    public void addPeople(Human human) {
        people.add(human);
    }
    public void removePeople(Human human) {
        people.remove(human);
    }
    public String showPeople() {
        return people.toString();
    }
    public void printInfo(){
        for(Human human : people){
            System.out.println("People: " + human.showPeople());
        }
    }
}
