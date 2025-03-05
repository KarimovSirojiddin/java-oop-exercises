package oop_2;

public class Circlee {
    double radius;
    Circlee(){
        radius = 1.0;
    }

    public Circlee(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getCircumference(){
        return 2 * Math.PI * radius;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circlee{" +
                "radius = " + radius +
                '}';
    }
}

