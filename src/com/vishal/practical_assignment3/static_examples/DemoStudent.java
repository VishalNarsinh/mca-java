package com.vishal.practical_assignment3.static_examples;

import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int total;

    private static int count = 0;

    static {
        System.out.println("Student class is loaded 1");
    }
    static {
        System.out.println("Student class is loaded 2");
    }


    public Student(int id){
        this.id = id;
        count++;
    }
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = scanner.nextLine();
        System.out.print("Enter total marks : ");
        total = scanner.nextInt();
    }
    public void putData(){
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}');
    }
    public static void countStud(){
        System.out.println("Total students : "+count);
    }
}
public class DemoStudent {

    static {
        System.out.println("DemoStudent class is loaded 1");
    }
    static {
        System.out.println("DemoStudent class is loaded 2");
    }
    public static void main(String[] args) {
        System.out.println("Demo student main method started");
        Student student1 = new Student(1);
//        student1.getData();
//        student1.putData();
        Student student2 = new Student(2);
//        student2.getData();
//        student2.putData();
        Student.countStud();
        Student student3 = student1;
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
    }
}
