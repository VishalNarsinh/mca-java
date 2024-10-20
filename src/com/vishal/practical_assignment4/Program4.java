package com.vishal.practical_assignment4;
import java.util.Scanner;

abstract class Person{
    protected String name;
    protected abstract void getData();
    protected abstract void display();
}
class Student extends Person{

    private int sId;
    private String branch;

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of Student : ");
        name = scanner.nextLine();
        System.out.print("Enter sid : ");
        sId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter branch : ");
        branch = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Student Name : "+name);
        System.out.println("Sid : "+sId);
        System.out.println("Branch : "+branch);
    }
}
class Result extends Student {
    private int total;

    @Override
    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total marks : ");
        total = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total marks : "+total);
    }
}
class Faculty extends Person{
    private int fId;
    private String dept;
    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of Faculty : ");
        name = scanner.nextLine();
        System.out.print("Enter fid : ");
        fId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter dept : ");
        dept = scanner.nextLine();
    }
    @Override
    public void display() {
        System.out.println("Faculty Name : "+name);
        System.out.println("Fid : "+fId);
        System.out.println("Dept : "+dept);
    }
}
public class Program4 {
    public static void main(String[] args) {
        Person student = new Result();
        student.getData();
        student.display();
        Person faculty = new Faculty();
        faculty.getData();
        faculty.display();
    }
}
