package oop_3;

public class Invoice {
    int id;
    Customer customer;
    double amount;

    Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }
    public int getCustomerId() {
        return customer.id;
    }

    public String getCustomerName() {
        return customer.name;
    }

    public int getCustomerDiscount() {
        return customer.discount;
    }

    public double getAmountAfterDiscount() {
        return amount - customer.discount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
