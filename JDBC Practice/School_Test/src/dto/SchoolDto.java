package dto;

public class SchoolDto {

    private int id;
    private String name;
    private String address;
    private String city;
    private int contact;

    public SchoolDto() {

    }

    public SchoolDto(int id, String name, String address, String city, int contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "SchoolDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", contact=" + contact +
                '}';
    }
}
