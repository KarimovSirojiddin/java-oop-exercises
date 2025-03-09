package oop_3;

public class MyPoint {
    private int x;
    private int y;

    MyPoint(){
        x = 0; y = 0;
    }
    MyPoint(int x, int y){
        this.x = x; this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }

    public void setXY(int x, int y){
        int[] setXY = new int[]{x,y};
    }

    public void toString_1(){
        System.out.printf("(%d,%y)", x, y);
    }
    public double distance(int x2, int y2){
        return Math.abs(Math.pow(x2 - x, 2) + Math.pow(y2 - y,2));
    }
    public double distance(MyPoint another){
        return Math.abs(Math.pow(another.x - x, 2) + Math.pow(another.y - y,2));
    }


}
