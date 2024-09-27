package com.vishal.practical_assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private int m1,m2,m3;
    private int total;

    public Student() {}
    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = scanner.nextLine();
        System.out.println("Enter Marks for three subjects : ");
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();
        calculateTotal();
    }

    public void getData(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void putData() {
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", m1=" + m1 +
                ", m2=" + m2 +
                ", m3=" + m3 +
                ", total=" + total +
                '}');
    }

    public void calculateTotal() {
        total = m1 + m2 + m3;
    }

    public Student findMax(Student student){
        return (this.total>student.total)?this:student;
    }
    public static void main(String[] args) {
        Student student1 = new Student(1);
        student1.getData();
        student1.putData();
        Student student2 = new Student(2);
        student2.getData();
        student2.putData();
        Student max = null;
        max = student1.findMax(student2);
        System.out.println("Student with Maximum Total Marks : ");
        max.putData();

    }
}
