package oop_3;

public class Author_2_3 {
    String name;
    String email;

    Author_2_3(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author_2_3{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
