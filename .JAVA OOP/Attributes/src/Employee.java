public class Employee {
    String name; // Instance variable
    int age;
    final String Department="Maintanance"; // in Final we can't override values

    public void ageFinder(){
        //age finder method
        String a="adult";  // Local Variable --> variables inside a method
        String c="Child";  // Can't call outside the method

        if (age >18){
            System.out.println("Adult");
        }else{
            System.out.println("Cild");
        }

    }
}
