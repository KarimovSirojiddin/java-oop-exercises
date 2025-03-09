package oop_3;

public class MyLine {
    MyPoint begin;
    MyPoint end;

    MyLine(int x1, int y1, int x2, int y2){
        begin = new MyPoint(x1,y1);
        end = new MyPoint(x1,y1);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setX(y);
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setX(y);
    }

    public int[] getBeginXY(){
        return new int[]{begin.getX(),begin.getX()};
    }

    public void setbeginXY(int x, int y){
        int[] setXY = new int[]{x,y};
    }

    public int[] getEndXY(){
        return new int[]{end.getX(),end.getX()};
    }

    public void setEndXY(int x, int y){
        int[] setXY = new int[]{x,y};
    }

    public double getLength(){
        return Math.abs(Math.pow(begin.getX() - end.getX(), 2) + Math.pow(begin.getY() - end.getY(),2));
    }

    public double getGradient(){
        return Math.atan2(begin.getX() - end.getX(),begin.getY() - end.getY());
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
