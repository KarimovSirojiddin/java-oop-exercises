package oop_2;

public class Test {
    public static void main(String[] args) {
        Circlee c = new Circlee(2.2);
        System.out.println("c Radius: " + c.getRadius());
        System.out.println("c Area: " + c.getArea());
        System.out.println("c Circumference: " + c.getCircumference());

        Rectangle r = new Rectangle(5.6F,7.8F);
        System.out.println("\nlength: " + r.getLength());
        System.out.println("width: " + r.getWidth());
        System.out.println("area: " + r.getArea());
        System.out.println("perimter: " + r.getPerimeter());

        System.out.println();

        

    }
}
