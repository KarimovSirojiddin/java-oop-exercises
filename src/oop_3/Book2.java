package oop_3;

public class Book2 {
    String name;
    Author[] authors;
    double price;
    int qty;

    Book2(String name, Author author, double  price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }
    Book2(String name, Author author, double  price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthorss() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + authors +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
