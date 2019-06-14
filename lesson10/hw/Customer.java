package lesson10.hw;

public class Customer {
    private String name;
    private String city;
    private String gender;

    public Customer(String name, String cty, String gender) {
        this.name = name;
        this.city = cty;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }
}
