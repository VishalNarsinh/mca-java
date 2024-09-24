package com.vishal.practical_assignment2.class_object;
import java.util.Scanner;
public class Circle {
    private int r;
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        r = scanner.nextInt();
    }
    public void getData(int r) {
        this.r = r;
    }
    public float area(){
        return (float) Math.PI * (r*r);
    }
    public void perimeter(){
        System.out.println("Perimeter of circle : "+ 2 * (float) Math.PI  * r);
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.getData();
        System.out.println("Area of Circle : "+circle1.area());
        circle1.perimeter();
        Circle circle2 = new Circle();
        System.out.print("Enter radius : ");
        circle2.getData(new Scanner(System.in).nextInt());
        System.out.println("Area of Circle : "+circle2.area());
        circle2.perimeter();
    }
}
