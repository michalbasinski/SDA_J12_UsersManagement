package pl.sda;

public class User {
    private String name;
    private String lastName;
    private int age;
    private String city;
    private Position position;

    public User(String name, String lastName, int age, String city, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
