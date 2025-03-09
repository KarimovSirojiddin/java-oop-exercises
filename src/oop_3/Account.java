package oop_3;

public class Account {
    int id;
    Customer_2 customer;
    double balance;

    Account(int id, Customer_2 customer){
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }
    Account(int id, Customer_2 customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer_2 getCustomer() {
        return customer;
    }
    public String getCustomerName(){
        return customer.name;
    }
    public Account deposit(double amount){
        balance += amount;
        return null;
    }
    public void withdraw(double amount){
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance");
        }
    }

    public void toString_1() {
        System.out.printf("name(%d); balance($%.2F)", id, balance);
    }
}
