package com.vishal.practice.thread_practice;

public class DemoThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1", 5);
        MyThread t2 = new MyThread("Thread-2", 6);
        MyThread t3 = new MyThread("Thread-3", 7);
        t1.start();
        t2.start();
        t3.start();
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
