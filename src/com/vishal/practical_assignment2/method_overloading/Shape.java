package com.vishal.practical_assignment2.method_overloading;

public class Shape {
    public double area(double radius){
        return Math.PI*(radius*radius);
    }

    public double area(float length,float breadth){
        return length*breadth;
    }

    public double area(float length){
        return length*length;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Circle = "+shape.area(5.5));
        System.out.println("Area of Square = "+shape.area(5.5f));
        System.out.println("Area of Rectangle = "+shape.area(5.5f,15.5f));
    }
}
