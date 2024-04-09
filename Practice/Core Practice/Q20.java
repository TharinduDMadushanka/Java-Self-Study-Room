class Student{
    String id;
    String name;
    int sub1;
    int sub2;
}

public class Q20 {
	 public static void main(String[] args) { 
        Student s1; //Create reference Variable for type "Student"
        s1 = new Student(); // Create an Object "Student" and initialize to s1

        System.out.println("id : " + s1.id);
        System.out.println("name : " + s1.name);
        System.out.println("sub1 : " + s1.sub1);
        System.out.println("sub2 : " + s1.sub2);
    }

	}
