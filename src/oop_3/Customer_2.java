package oop_3;

public class Customer_2 {
    int id;
    String name;
    char gender;

    Customer_2(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer_2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
