package com.vishal.practical_assignment4;

import java.util.Scanner;

abstract class GeoShape {
    protected int d1,d2,area;
    public final void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter d1 : ");
        d1 = scanner.nextInt();
        System.out.print("Enter d2 : ");
        d2 = scanner.nextInt();
    }
    abstract void area();

    public void putData(){
        System.out.println("Dimension 1 : "+d1);
        System.out.println("Dimension 2 : "+d2);
    }
}
class Rectangle extends GeoShape {

    @Override
    void area() {
        area=d1*d2;
        System.out.println("Area of Rectangle : "+area);
    }
}
class Triangle extends GeoShape {

    @Override
    void area() {
        area= (d1*d2)/2;
        System.out.println("Area of Triangle : "+area);
    }
}
public class Program6 {
    public static void main(String[] args) {
        GeoShape shape1 = new Rectangle();
        GeoShape shape2 = new Triangle();
        shape1.getData();
        shape1.putData();
        shape1.area();
        shape2.getData();
        shape2.putData();
        shape2.area();
    }
}
