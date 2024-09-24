package com.vishal.practical_assignment2.class_object;
import java.util.Scanner;
public class Student {
    private int id;
    private String name;
    private int m1,m2,m3;
    private int total;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id : ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name : ");
        name = scanner.nextLine();
        System.out.println("Enter Marks for three subjects : ");
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();
    }
    public void putData(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Mark 1 : "+m1);
        System.out.println("Mark 2 : "+m2);
        System.out.println("Mark 3 : "+m3);
        System.out.println("Total : "+total);
    }
    void calculate(){
        total = m1+m2+m3;
    }
}
class StudentDemo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData();
        s1.calculate();
        s1.putData();
        Student s2 = new Student();
        s2.getData();
        s2.calculate();
        s2.putData();
    }
}
