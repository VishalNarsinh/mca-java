package com.vishal.practical_assignment4;

import java.util.Scanner;
abstract class Circle {
    protected double r;

    final public void getR() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius : ");
        r = scanner.nextDouble();
    }

    abstract void calculate();
}
class PerimeterCircle extends Circle{

    @Override
    void calculate() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of circle : " + perimeter);
    }
}

class AreaCircle extends Circle{

    @Override
    void calculate() {
        double area = Math.PI * r * r;
        System.out.println("Area of circle : " + area);
    }
}
final class Print{
    public void showLine(){
        System.out.println("-------------------------------------------------");
    }
}

public class Program7 {
    public static void main(String[] args) {
        Print print = new Print();
        Circle area = new AreaCircle();
        area.getR();
        area.calculate();
        print.showLine();
        Circle perimeter = new PerimeterCircle();
        perimeter.getR();
        perimeter.calculate();
        print.showLine();
    }
}
