package oop_2;

public class Circle {
    double radius;
    String color;

    Circle(){
        radius = 1.0;
        color = "red";
    }
    Circle(double radius){
        this.radius = radius;
        color  = "red";
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color  = color;
    }

    double getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                '}';
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}
