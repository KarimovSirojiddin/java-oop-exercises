package oop_1;

public class RegularPolygon {
    int n = 3;
    double side = 1;
    double x = 0;
    double y = 0;

    RegularPolygon(){
    }
    RegularPolygon(int n, double side){
    }
    RegularPolygon(int n, double side, double x, double y){
    }

    double getPerimeter(){
        return n * side;
    }
    double getArea(){
        return (n * side * side) / (4 * (Math.PI / n));
    }

}
