package oop_1;

public class Account {
    int id;
    double balance;
    double annualInterestRate;

    Account(){
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    double getMonthlyInterestRate(){
        return annualInterestRate/100/12;
    }
    double getMonthlyInterest(){
        return (balance * (annualInterestRate/100)) / 12;
    }
    double withdraw(double sum){
        this.balance = this.balance - sum;
        return balance;
    }
    double deposit(double deposit){
        this.balance = deposit + this.balance;
        return balance;
    }
}
