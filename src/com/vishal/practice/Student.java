package com.vishal.practice;

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

    public static Student findMaxOfAll(Student[] students){
        Student max = new Student();
        for(Student student : students){
            if(student.total>max.total)
                max = student;
        }
        return max;
    }

    public static Student findMaxTotalUsingStream(Student[] students){
        return Arrays.stream(students).max((s1, s2) -> Integer.compare(s1.total, s2.total)).orElse(null);
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i+1);
            students[i].getData();
            students[i].putData();
        }
//        Student max = Student.findMaxTotalUsingStream(students);
//        Student max = Student.findMaxOfAll(students);
        Student max = new Student();
        for(Student student: students){
            max  = max.findMax(student);
        }
//        if(max!=null){
//            max.putData();
//        }
        max.putData();
    }
}
