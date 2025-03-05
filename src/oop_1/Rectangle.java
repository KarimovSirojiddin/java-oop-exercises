package oop_1;

class Rectangle {
    double width;
    double height;

    Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    double getArea(double width, double height){
        return width * height;
    }
    double getPerimeter(double width, double height){
        return 2 * (width + height);
    }

}
