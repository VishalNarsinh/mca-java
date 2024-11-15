package com.vishal.practice.thread_practice;

public class DemoThread {
    public static void main(String[] args) {

    }
}
class MyThread extends Thread{
    private int n;
    public MyThread(String name,int n) {
        this.setName(name);
        System.out.println("Thread : "+this.getName()+" is created");
        this.n = n;
    }

    @Override

    public void run() {
        System.out.println("Printing table of "+n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
