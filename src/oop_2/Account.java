package oop_2;

public class Account {
    String id;
    String name;
    int balance;

    Account(String id, String name){
        this.id = id;
        this.name = name;
        balance = 0;
    }

    Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    int credit(int amount){
        return amount + balance;
    }

    int debit(int amount){
        if(amount <= balance){
            return balance - amount;
        } else {
            System.out.println("Amount exceed balance");
            return balance;
        }
    }
    int transferTo(Account account, int amount){
        if(amount <= balance){
            balance -= amount;
            account.balance += amount;
            return account.balance;
        } else {
            System.out.println("Amount exceed balance");
            return account.balance;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
