package com.vishal.practical_assignment2.class_object;
import java.util.Scanner;
public class Test {
    private int a,b;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = scanner.nextInt();
        System.out.print("Enter b : ");
        b = scanner.nextInt();
    }
    public void add(){
        System.out.println("Addition = "+(a+b));
    }
    public void sub(){
        System.out.println("Subtraction = "+(a-b));
    }
    public void mul(){
        System.out.println("Multiplication = "+(a*b));
    }
    public void div(){
        if(b==0){
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println("Division = "+(a/(float)b));
    }
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.getData();
        test1.add();
        test1.sub();
        test1.mul();
        test1.div();
    }
}
