package oop_1;

public class QuadraticEquation {
    double a,b,c;
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscrimination(){
        return Math.abs((b * b) - 4 * (a * c));
    }
    double getRoot1(){
        if(getDiscrimination() >= 0){
            return (((-1 * b) + getDiscrimination()) / (2 * a));
        } else {
            return 0;
        }
    }
    double getRoot2(){
        if(getDiscrimination() >= 0){
            return (((-1 * b) - getDiscrimination()) / (2 * a));
        } else {
            return 0;
        }
    }
}
