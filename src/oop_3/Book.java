package oop_3;

import java.sql.SQLType;

public class Book {
    String name;
    Author author;
    double price;
    int qty;

    Book(String name, Author author, double  price){
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }
    Book(String name, Author author, double  price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
