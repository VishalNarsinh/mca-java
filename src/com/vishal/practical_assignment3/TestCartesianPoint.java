package com.vishal.practical_assignment3;

class CartesianPoint{
    private int x,y;
    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public CartesianPoint(int value){
        this.x = this.y = value;
    }
    public void move(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println(x+" "+y);
    }
}
public class TestCartesianPoint {
    public static void main(String[] args) {
        CartesianPoint point1 = new CartesianPoint(10,20);
        point1.display();
        point1.move(30,40);
        point1.display();
        CartesianPoint point2 = new CartesianPoint(100);
        point2.display();
        point2.move(200,300);
        point2.display();
    }
}
