package com.vishal.practical_assignment4.interface_prg;

import java.util.Scanner;

interface GeoShape {
    double PI = 22.0/7.0;

    void getData();
    void putData();
    void findVolume();
}
class Cube implements GeoShape{

    private int d1,d2,d3,volume;

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter d1 : ");
        d1 = scanner.nextInt();
        System.out.print("Enter d2 : ");
        d2 = scanner.nextInt();
        System.out.print("Enter d3 : ");
        d3 = scanner.nextInt();
    }

    @Override
    public void putData() {
        System.out.println("Dimension 1 : "+d1);
        System.out.println("Dimension 2 : "+d2);
        System.out.println("Dimension 3 : "+d3);
    }

    @Override
    public void findVolume() {
        volume = d1*d2*d3;
        System.out.println("Volume of Cube : "+volume);
    }
}
class Sphere implements GeoShape{
    private double r,volume;

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r : ");
        r = scanner.nextDouble();
    }

    @Override
    public void putData() {
        System.out.println("Radius : "+r);
    }

    @Override
    public void findVolume() {
        volume=4.0/3.0*PI*r*r*r;
        System.out.println("Volume of Sphere : "+volume);
    }
}
class Cylinder implements GeoShape{
    private double r,h,volume;

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r : ");
        r = scanner.nextDouble();
        System.out.print("Enter h : ");
        h = scanner.nextDouble();
    }

    @Override
    public void putData() {
        System.out.println("Radius : "+r);
        System.out.println("Height : "+h);
    }

    @Override
    public void findVolume() {
        volume=PI*r*r*h;
        System.out.println("Volume of Cylinder : "+volume);
    }
}

public class Program8 {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.getData();
        cube.putData();
        cube.findVolume();
        Sphere sphere = new Sphere();
        sphere.getData();
        sphere.putData();
        sphere.findVolume();
        Cylinder cylinder = new Cylinder();
        cylinder.getData();
        cylinder.putData();
        cylinder.findVolume();
    }
}

