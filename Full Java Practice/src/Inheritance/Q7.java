package Inheritance;

/**
 * Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a
 * subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
 */
public class Q7 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(employee1.getfName() + " " + employee1.getLastName() + " (" + employee1.geteId() + ")");

    }
}
class Person{
    private String fName;
    private String lName;

    public Person(String fName,String lName){
        this.fName=fName;
        this.lName=lName;
    }

    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
}
class Employee extends Person{
    private int eId;
    private String job;

    public Employee(String fName,String lName,int eId,String job){
        super(fName,lName);
        this.eId=eId;
        this.job=job;
    }
    public int geteId(){
        return eId;
    }

    public String getLastName() {
        return super.getlName() + ", " + job;
    }
}
