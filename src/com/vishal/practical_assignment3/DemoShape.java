package com.vishal.practical_assignment3;

class Shape{
    private int d1,d2,d3,vol;

    public Shape(){
        this.d1=this.d2=this.d3=0;
    }
    public Shape(int d1) {
        this.d1 = this.d2 = this.d3 = d1;
        volume();
    }
    public Shape(int d1, int d2, int d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        volume();
    }
    public void volume(){
        vol = d1*d2*d3;
    }

    @Override
    public boolean equals(Object obj) {
        Shape shape = (Shape) obj;
        return this.vol==shape.vol;
    }
}
public class DemoShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape(10);
        Shape shape2 = new Shape(10,20,30);
        System.out.println(shape1.equals(shape2));
        Shape shape3 = new Shape(20,10,30);
        System.out.println(shape2.equals(shape3));
    }
}
