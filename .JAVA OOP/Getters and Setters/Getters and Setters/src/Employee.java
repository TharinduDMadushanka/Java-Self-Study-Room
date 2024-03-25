//Getters ---> to get a data ,should have return type
//Setters--->to set the data  , should send as a parameter
public class Employee {

    private int id;
    private String name;

    public void setId(int id){ // Setter id
        this.id=id;
    }

    public int getId(){ //Getter id
        return id;
    }

    public void setName(String name){ //Setter name
        this.name=name;
    }

    public String getName(){ //Getter name
        return name;
    }
}
