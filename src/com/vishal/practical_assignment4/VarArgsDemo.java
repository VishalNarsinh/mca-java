package com.vishal.practical_assignment4;

public class VarArgsDemo {
    public static void display(int ... n){
        for (int i : n){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display(1,2,3,4,5);
    }
}
