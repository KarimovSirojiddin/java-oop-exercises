package oop_2;

public class Rectangle {
    float length;
    float width;
    Rectangle(){
        length = 1.0F;
        width = 1.0F;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    double getArea(){
        return length * width;
    }
    double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                '}';
    }
}

