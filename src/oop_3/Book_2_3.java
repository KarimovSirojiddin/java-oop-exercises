package oop_3;

public class Book_2_3 {
    String isbn;
    String name;
    Author author;
    double price;
    int qty;

    Book_2_3(String isbn, String name, Author author, double  price){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    Book_2_3(String isbn, String name, Author author, double  price, int qty){
        this.isbn = isbn;
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

    public String getAuthorName(){
        return author.name;
    }

    public String getIsbn() {
        return isbn;
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
