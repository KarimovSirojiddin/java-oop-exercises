package oop_1;

import java.util.Scanner;

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Symbol: ");
        this.symbol = sc.nextLine();
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Previous closing price: ");
        this.previousClosingPrice = sc.nextDouble();
        System.out.print("Current price: ");
        this.currentPrice = sc.nextDouble();
    }

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    void getChangePercent(){
        double s = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        System.out.printf("%.2f", Math.abs(s));
    }
}
